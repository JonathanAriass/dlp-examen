package es.uniovi.dlp.ast;

public interface Expression extends ASTNode {

  public Type getType();

  public void setType(Type type);

  boolean isLValue();
}
