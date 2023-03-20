package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.AbstractExpression;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class IntLiteral extends AbstractExpression {

  private final int value;

  public IntLiteral(int value, int line, int column) {
    super(line, column);
    this.value = value;
  }

  public int getValue() {
    return this.value;
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this, param);
  }
}
