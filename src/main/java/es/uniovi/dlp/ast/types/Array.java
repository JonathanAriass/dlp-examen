package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.AbstractType;
import es.uniovi.dlp.ast.Type;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class Array extends AbstractType {

  private int size;
  private Type type;

  public Array(int size, Type type, int line, int column) {
    super(line, column);
    this.size = size;
    this.type = type;
  }

  public int getSize() {
    return this.size;
  }

  public Type getType() {
    return this.type;
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this, param);
  }

  @Override
  public Type indexing(Type type) {
    if (type instanceof IntType) {
      return this.type;
    }
    return super.indexing(type);
  }

  @Override
  public boolean isIndexable() {
    return true;
  }

  @Override
  public int getNumberOfBytes() {
    return type.getNumberOfBytes() * size;
  }

  @Override
  public String toString() {
    return "array";
  }
}
