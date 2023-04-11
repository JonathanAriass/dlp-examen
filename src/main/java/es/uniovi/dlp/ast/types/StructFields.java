package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.ast.Type;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class StructFields extends AbstractASTNode {

  private String name;
  private Type type;
  private int offset;

  public StructFields(String name, Type type, int line, int column) {
    super(line, column);
    this.name = name;
    this.type = type;
  }

  public String getName() {
    return this.name;
  }

  public Type getType() {
    return this.type;
  }

  public void setOffset(int offset) {
    this.offset = offset;
  }

  public int getOffset() {
    return this.offset;
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this, param);
  }
}
