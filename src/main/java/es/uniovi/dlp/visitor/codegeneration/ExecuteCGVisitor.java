package es.uniovi.dlp.visitor.codegeneration;

import es.uniovi.dlp.ast.Definition;
import es.uniovi.dlp.ast.Program;
import es.uniovi.dlp.ast.Type;
import es.uniovi.dlp.ast.definitions.FunctionDefinition;
import es.uniovi.dlp.ast.definitions.VarDefinition;
import es.uniovi.dlp.ast.expressions.Invocation;
import es.uniovi.dlp.ast.statements.*;
import es.uniovi.dlp.ast.types.FunType;
import es.uniovi.dlp.ast.types.VoidType;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class ExecuteCGVisitor extends AbstractVisitor<Type, Definition> {

  private CodeGenerator generator;
  private ValueCGVisitor valueVisitor;
  private AddressCGVisitor addressVisitor;

  public ExecuteCGVisitor(CodeGenerator generator) {
    this.generator = generator;
    valueVisitor = new ValueCGVisitor(generator);
    addressVisitor = new AddressCGVisitor(generator);
    valueVisitor.setAddressCGV(addressVisitor);
    addressVisitor.setValueCGV(valueVisitor);
  }

  @Override
  public Type visit(Program program, Definition param) {
    generator.source();
    program
        .getDefinitions()
        .forEach(
            definition -> {
              if (definition instanceof VarDefinition varDef) {
                varDef.accept(this, param);
              }
            });
    generator.callMain();
    program
        .getDefinitions()
        .forEach(
            definition -> {
              if (definition instanceof FunctionDefinition funcDef) {
                funcDef.accept(this, param);
              }
            });
    return null;
  }

  @Override
  public Type visit(VarDefinition varDef, Definition param) {

    super.visit(varDef, param);
    generator.comments(
        varDef.getName()
            + " :: "
            + varDef.getType().toString()
            + " (offset "
            + varDef.getOffset()
            + ")");

    return null;
  }

  @Override
  public Type visit(FunctionDefinition funcDef, Definition param) {
    generator.line(funcDef.getLine());
    generator.label(funcDef.getName());

    generator.comments("Parameters");
    FunType funcType = ((FunType) funcDef.getType());
    funcType.getParams().forEach(fParam -> fParam.accept(this, param));
    int paramsSize =
        funcType.getParams().stream()
            .map(fParam -> fParam.getType().getNumberOfBytes())
            .reduce(0, (total, paramSize) -> total + paramSize);

    generator.comments("Local variables");
    funcDef.getVarDefinitionList().forEach(localVar -> localVar.accept(this, param));
    int localVarsSize =
        funcDef.getVarDefinitionList().stream()
            .map(localVar -> localVar.getType().getNumberOfBytes())
            .reduce(0, (total, localVarSize) -> total + localVarSize);

    generator.enter(localVarsSize);
    funcDef.getStatementsList().forEach(statement -> statement.accept(this, funcDef));
    generator.ret(funcType.getReturnType().getNumberOfBytes(), localVarsSize, paramsSize);

    return null;
  }

  @Override
  public Type visit(Invocation functionInvocation, Definition param) {
    generator.line(functionInvocation.getLine());
    functionInvocation.accept(valueVisitor, null);
    if (functionInvocation.getType() instanceof FunType functionType) {
      if (!(functionType.getReturnType() instanceof VoidType)) {
        generator.pop(functionType.getReturnType());
      }
    }
    return null;
  }

  @Override
  public Type visit(Assignment assignment, Definition param) {
    super.visit(assignment, param);

    generator.line(assignment.getLine());
    assignment.getLeftExpression().accept(addressVisitor, null);
    assignment.getRightExpression().accept(valueVisitor, null);
    //    generator.promoteTo(
    //        assignment.getLeftExpression().getType(), assignment.getRightExpression().getType());

    generator.promoteTo(
        assignment.getRightExpression().getType(), assignment.getLeftExpression().getType());

    generator.store(assignment.getLeftExpression().getType());
    //    System.out.println("PRUEBA: " + assignment.getLeftExpression().getType());
    //    System.out.println("PRUEBA2: " + assignment.getRightExpression().getType());
    return null;
  }

  @Override
  public Type visit(Read in, Definition param) {
    generator.line(in.getLine());
    generator.comments("Read example");
    in.getExpression().accept(addressVisitor, null);
    generator.read(in.getExpression().getType());
    generator.store(in.getExpression().getType());
    return null;
  }

  @Override
  public Type visit(Write puts, Definition param) {
    generator.line(puts.getLine());
    generator.comments("Write");
    puts.getExpression().accept(valueVisitor, null);
    generator.out(puts.getExpression().getType());
    return null;
  }

  @Override
  public Type visit(While aWhile, Definition param) {
    generator.line(aWhile.getLine());
    generator.comments("While statement");
    int whileLabel = generator.getLabel();
    int whileEndLabel = generator.getLabel();
    generator.label(whileLabel);
    aWhile.getCondition().accept(valueVisitor, null);
    generator.jz(whileEndLabel);
    generator.comments("Body of the while statement");
    aWhile.getBody().forEach(statement -> statement.accept(this, param));
    generator.jmp(whileLabel);
    generator.label(whileEndLabel);
    return null;
  }

  @Override
  public Type visit(Conditional conditional, Definition param) {
    generator.line(conditional.getLine());
    generator.comments("If statement");
    conditional.getCondition().accept(valueVisitor, null);
    int elseLabel = generator.getLabel();
    int ifEndLabel = generator.getLabel();
    generator.jz(elseLabel);
    generator.comments("Body of the if branch");
    conditional.getIfBody().forEach(statement -> statement.accept(this, param));
    generator.jmp(ifEndLabel);
    generator.label(elseLabel);
    generator.comments("Body of the else branch");
    conditional.getElseBody().forEach(statement -> statement.accept(this, param));
    generator.label(ifEndLabel);
    return null;
  }
}
