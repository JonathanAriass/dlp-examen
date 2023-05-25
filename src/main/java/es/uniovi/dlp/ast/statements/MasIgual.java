package es.uniovi.dlp.ast.statements;

import es.uniovi.dlp.ast.AbstractStatement;
import es.uniovi.dlp.ast.Expression;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class MasIgual extends AbstractStatement {

  private Expression leftExpression, rightExpression;

  public MasIgual(Expression left, Expression right, int line, int column) {
    super(line, column);
    this.leftExpression = left;
    this.rightExpression = right;
  }

  public Expression getLeftExpression() {
    return leftExpression;
  }

  public Expression getRightExpression() {
    return rightExpression;
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this, param);
  }
}
