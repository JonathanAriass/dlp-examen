package es.uniovi.dlp.ast.statements;

import es.uniovi.dlp.ast.AbstractStatement;
import es.uniovi.dlp.ast.Expression;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class Assignment extends AbstractStatement {

  private Expression leftExpression;
  private Expression rightExpression;

  public Assignment(Expression leftExpression, Expression rightExpression, int line, int column) {
    super(line, column);
    this.leftExpression = leftExpression;
    this.rightExpression = rightExpression;
  }

  public Expression getLeftExpression() {
    return this.leftExpression;
  }

  public Expression getRightExpression() {
    return this.rightExpression;
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this, param);
  }
}
