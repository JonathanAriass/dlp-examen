package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.AbstractExpression;
import es.uniovi.dlp.ast.Expression;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class TernaryOperator extends AbstractExpression {

  private Expression expr1, expr2, expr3;

  public TernaryOperator(
      Expression expr1, Expression expr2, Expression expr3, int line, int column) {
    super(line, column);
    this.expr1 = expr1;
    this.expr2 = expr2;
    this.expr3 = expr3;
  }

  public Expression getExpr1() {
    return expr1;
  }

  public Expression getExpr2() {
    return expr2;
  }

  public Expression getExpr3() {
    return expr3;
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this, param);
  }
}
