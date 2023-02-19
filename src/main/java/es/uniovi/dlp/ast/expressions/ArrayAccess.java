package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.AbstractExpression;
import es.uniovi.dlp.ast.Expression;

public class ArrayAccess extends AbstractExpression {

  // FAQ: what attributes should an ArrayAccess have?
  private Expression array;
  private Expression index;

  public ArrayAccess(Expression array, Expression index, int line, int column) {
    super(line, column);
    this.array = array;
    this.index = index;
  }

  public Expression getArray() {
    return this.array;
  }

  public Expression getIndex() {
    return this.index;
  }
}
