package es.uniovi.dlp.ast.statements;

import es.uniovi.dlp.ast.AbstractStatement;
import es.uniovi.dlp.ast.Expression;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class Write extends AbstractStatement {

  private Expression expression;

  public Write(Expression expression, int line, int column) {
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
