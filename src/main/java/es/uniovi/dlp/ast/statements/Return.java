package es.uniovi.dlp.ast.statements;

import es.uniovi.dlp.ast.AbstractStatement;
import es.uniovi.dlp.ast.Expression;

public class Return extends AbstractStatement {

  private Expression returnExpression;

  public Return(Expression ret, int line, int column) {
    super(line, column);
    this.returnExpression = ret;
  }

  public Expression getReturnExpression() {
    return this.returnExpression;
  }
}
