package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.AbstractExpression;
import es.uniovi.dlp.ast.Expression;
import es.uniovi.dlp.ast.Type;

public class Cast extends AbstractExpression {

  private Type castType;
  private Expression exp;

  public Cast(Type castType, Expression exp, int line, int column) {
    super(line, column);
    this.castType = castType;
    this.exp = exp;
  }

  public Type getCastType() {
    return this.castType;
  }

  public Expression getExp() {
    return this.exp;
  }
}
