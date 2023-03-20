package es.uniovi.dlp.ast;

public abstract class AbstractExpression extends AbstractASTNode implements Expression {

  private Type type;

  public AbstractExpression(int line, int column) {
    super(line, column);
  }

  @Override
  public Type getType() {
    return type;
  }

  @Override
  public void setType() {
    this.type = type;
  }

  @Override
  public boolean isLValue() {
    return false;
  }
}
