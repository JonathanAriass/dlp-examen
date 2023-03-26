package es.uniovi.dlp.ast;

public interface Definition extends ASTNode {

  public String getName();

  public Type getType();

  void setScope(int scope);

  int getScope();
}
