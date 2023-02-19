package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.AbstractExpression;
import es.uniovi.dlp.ast.Expression;

public class ComparisonOperation extends AbstractExpression {

  private final String operation;
  private final Expression leftExpression;
  private final Expression rightExpression;

  public ComparisonOperation(
      String operation,
      Expression leftExpression,
      Expression rightExpression,
      int line,
      int column) {
    super(line, column);
    this.operation = operation;
    this.leftExpression = leftExpression;
    this.rightExpression = rightExpression;
  }

  public String getOperation() {
    return this.operation;
  }

  public Expression getLeftExpression() {
    return this.leftExpression;
  }

  public Expression getRightExpression() {
    return this.rightExpression;
  }
}
