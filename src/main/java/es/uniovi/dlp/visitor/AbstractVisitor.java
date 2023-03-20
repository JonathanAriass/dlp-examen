package es.uniovi.dlp.visitor;

import es.uniovi.dlp.ast.Program;
import es.uniovi.dlp.ast.definitions.FunctionDefinition;
import es.uniovi.dlp.ast.definitions.VarDefinition;
import es.uniovi.dlp.ast.expressions.*;
import es.uniovi.dlp.ast.statements.*;
import es.uniovi.dlp.ast.types.*;

public abstract class AbstractVisitor<ReturnType, ParamType>
    implements Visitor<ReturnType, ParamType> {

  @Override
  public ReturnType visit(Program program, ParamType param) {
    program.getDefinitions().forEach(definition -> definition.accept(this, param));
    return null;
  }

  @Override
  public ReturnType visit(Write in, ParamType param) {
    in.getExpression().accept(this, param);
    return null;
  }

  @Override
  public ReturnType visit(Assignment assign, ParamType param) {
    assign.getLeftExpression().accept(this, param);
    assign.getRightExpression().accept(this, param);
    return null;
  }

  @Override
  public ReturnType visit(Read read, ParamType param) {
    read.getExpression().accept(this, param);
    return null;
  }

  @Override
  public ReturnType visit(Conditional cond, ParamType param) {
    cond.getIfBody().forEach(statement -> statement.accept(this, param));
    cond.getElseBody().forEach(statement -> statement.accept(this, param));
    cond.getCondition().accept(this, param);
    return null;
  }

  @Override
  public ReturnType visit(While wh, ParamType param) {
    wh.getBody().forEach(statement -> statement.accept(this, param));
    wh.getCondition().accept(this, param);
    return null;
  }

  @Override
  public ReturnType visit(Return ret, ParamType param) {
    ret.getReturnExpression().accept(this, param);
    return null;
  }

  @Override
  public ReturnType visit(ArithmeticOperation op, ParamType param) {
    op.getLeftExpression().accept(this, param);
    op.getRightExpression().accept(this, param);
    return null;
  }

  @Override
  public ReturnType visit(ArrayAccess arrayAccess, ParamType param) {
    arrayAccess.getArray().accept(this, param);
    arrayAccess.getIndex().accept(this, param);
    return null;
  }

  @Override
  public ReturnType visit(Cast cast, ParamType param) {
    cast.getExp().accept(this, param);
    return null;
  }

  @Override
  public ReturnType visit(CharLiteral charLit, ParamType param) {
    return null;
  }

  @Override
  public ReturnType visit(ComparisonOperation comp, ParamType param) {
    comp.getLeftExpression().accept(this, param);
    comp.getRightExpression().accept(this, param);
    return null;
  }

  @Override
  public ReturnType visit(DoubleLiteral doubleLit, ParamType param) {
    return null;
  }

  @Override
  public ReturnType visit(FieldAccess fieldAccess, ParamType param) {
    fieldAccess.getExpression().accept(this, param);
    return null;
  }

  @Override
  public ReturnType visit(IntLiteral intLit, ParamType param) {
    return null;
  }

  @Override
  public ReturnType visit(Invocation invocation, ParamType param) {
    invocation.getArgs().forEach(expression -> expression.accept(this, param));
    invocation.getName().accept(this, param);
    return null;
  }

  @Override
  public ReturnType visit(LogicalOperation logOp, ParamType param) {
    logOp.getLeftExpression().accept(this, param);
    logOp.getRightExpression().accept(this, param);
    return null;
  }

  @Override
  public ReturnType visit(Negation negation, ParamType param) {
    negation.getExpression().accept(this, param);
    return null;
  }

  @Override
  public ReturnType visit(UnaryMinus unaryMinus, ParamType param) {
    unaryMinus.getExpression().accept(this, param);
    return null;
  }

  @Override
  public ReturnType visit(Variable variable, ParamType param) {
    //        variable.getDefinition().accept(this, param);
    return null;
  }

  @Override
  public ReturnType visit(Array array, ParamType param) {
    array.getType().accept(this, param);
    return null;
  }

  @Override
  public ReturnType visit(CharType charType, ParamType param) {
    return null;
  }

  @Override
  public ReturnType visit(DoubleType doubleType, ParamType param) {
    return null;
  }

  @Override
  public ReturnType visit(FunType funType, ParamType param) {
    funType.getReturnType().accept(this, param);
    funType.getParams().forEach(varDefinition -> varDefinition.accept(this, param));
    return null;
  }

  @Override
  public ReturnType visit(IntType intType, ParamType param) {
    return null;
  }

  @Override
  public ReturnType visit(Struct struct, ParamType param) {
    struct.getFields().forEach(structFields -> structFields.accept(this, param));
    return null;
  }

  @Override
  public ReturnType visit(StructFields structFields, ParamType param) {
    structFields.getType().accept(this, param);
    return null;
  }

  @Override
  public ReturnType visit(VoidType voidType, ParamType param) {
    return null;
  }

  @Override
  public ReturnType visit(FunctionDefinition functionDefinition, ParamType param) {
    functionDefinition.getType().accept(this, param);
    functionDefinition.getStatementsList().forEach(func -> func.accept(this, param));
    functionDefinition
        .getVarDefinitionList()
        .forEach(varDefinition -> varDefinition.accept(this, param));
    return null;
  }

  @Override
  public ReturnType visit(VarDefinition varDefinition, ParamType param) {
    varDefinition.getType().accept(this, param);
    return null;
  }
}
