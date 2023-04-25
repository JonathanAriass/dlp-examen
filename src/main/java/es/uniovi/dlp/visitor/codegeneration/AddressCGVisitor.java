package es.uniovi.dlp.visitor.codegeneration;

import es.uniovi.dlp.ast.Type;
import es.uniovi.dlp.ast.definitions.VarDefinition;
import es.uniovi.dlp.ast.expressions.ArrayAccess;
import es.uniovi.dlp.ast.expressions.Variable;
import es.uniovi.dlp.ast.types.IntType;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class AddressCGVisitor extends AbstractVisitor<Type, Type> {

  private CodeGenerator generator;
  private ValueCGVisitor valueVisitor;

  public AddressCGVisitor(CodeGenerator generator) {
    this.generator = generator;
  }

  public void setValueCGV(ValueCGVisitor value) {
    this.valueVisitor = value;
  }

  @Override
  public Type visit(Variable variable, Type param) {
    super.visit(variable, param);
    if (variable.getDefinition() instanceof VarDefinition varDef)
      if (variable.getDefinition().getScope() == 0) generator.pusha(varDef.getOffset());
      else {
        generator.pushbp();
        generator.push(new IntType(varDef.getLine(), varDef.getColumn()), varDef.getOffset());
        generator.add();
      }
    return null;
  }

  @Override
  public Type visit(ArrayAccess arrayAccess, Type param) {

    arrayAccess.getArray().accept(this, param);
    arrayAccess.getIndex().accept(valueVisitor, param);
    generator.push(
        new IntType(arrayAccess.getLine(), arrayAccess.getColumn()),
        arrayAccess.getType().getNumberOfBytes());
    generator.mul();
    generator.add();
    return null;
  }
}
