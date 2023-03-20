package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.AbstractExpression;
import es.uniovi.dlp.ast.Expression;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class Negation extends AbstractExpression {

  private Expression expression;

  public Negation(Expression expression, int line, int column) {
    super(line, column);
    this.expression = expression;
  }

  public Expression getExpression() {
    return this.expression;
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this, param);
  }
}
