package es.uniovi.dlp.ast.statements;

import es.uniovi.dlp.ast.AbstractStatement;
import es.uniovi.dlp.ast.Expression;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class Return extends AbstractStatement {

  private Expression returnExpression;

  public Return(Expression ret, int line, int column) {
    super(line, column);
    this.returnExpression = ret;
  }

  public Expression getReturnExpression() {
    return this.returnExpression;
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this, param);
  }
}
