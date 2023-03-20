package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.AbstractExpression;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class DoubleLiteral extends AbstractExpression {

  private final double value;

  public DoubleLiteral(double value, int line, int column) {
    super(line, column);
    this.value = value;
  }

  public double getValue() {
    return this.value;
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this, param);
  }
}
