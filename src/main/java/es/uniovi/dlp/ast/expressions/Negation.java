package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.AbstractExpression;
import es.uniovi.dlp.ast.Expression;

public class Negation extends AbstractExpression {

  private Expression expression;

  public Negation(Expression expression, int line, int column) {
    super(line, column);
    this.expression = expression;
  }

  public Expression getExpression() {
    return this.expression;
  }
}
