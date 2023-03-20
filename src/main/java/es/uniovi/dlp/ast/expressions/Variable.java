package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.AbstractExpression;
import es.uniovi.dlp.ast.Definition;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class Variable extends AbstractExpression {

  private String name;
  private Definition definition;

  public Variable(String name, int line, int column) {
    super(line, column);
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setDefinition(Definition def) {
    if (def != null) this.definition = def;
  }

  public Definition getDefinition() {
    return this.definition;
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this, param);
  }

  @Override
  public boolean isLValue() {
    return true;
  }
}
