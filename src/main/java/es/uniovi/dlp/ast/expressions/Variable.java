package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.AbstractExpression;
import es.uniovi.dlp.ast.Definition;

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
}
