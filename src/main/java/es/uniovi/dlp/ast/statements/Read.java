package es.uniovi.dlp.ast.statements;

import es.uniovi.dlp.ast.AbstractStatement;
import es.uniovi.dlp.ast.Expression;

public class Read extends AbstractStatement {

  private Expression expression;

  public Read(Expression expression, int line, int column) {
    super(line, column);
    this.expression = expression;
  }

  public Expression getExpression() {
    return this.expression;
  }
}
