package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.AbstractExpression;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class BooleanLiteral extends AbstractExpression {

  private int value;

  public BooleanLiteral(boolean value, int line, int column) {
    super(line, column);
    this.value = value ? 1 : 0;
  }

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this, param);
  }
}
