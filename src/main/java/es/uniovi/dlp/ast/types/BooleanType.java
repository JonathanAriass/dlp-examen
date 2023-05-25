package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.AbstractType;
import es.uniovi.dlp.ast.Type;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class BooleanType extends AbstractType {

  public BooleanType(int line, int column) {
    super(line, column);
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this, param);
  }

  @Override
  public Type assignment(Type type) {
    if (type instanceof BooleanType) {
      return type;
    }
    return super.assignment(type);
  }

  @Override
  public Type cast(Type type) {
    if (type instanceof IntType
        || type instanceof CharType
        || type instanceof DoubleType
        || type instanceof BooleanType) {
      return type;
    }
    return super.cast(type);
  }

  @Override
  public Type logical(Type type) {
    if (type instanceof IntType || type instanceof BooleanType) {
      return type;
    }
    return super.logical(type);
  }

  @Override
  public Type comparison(Type type) {
    if (type instanceof IntType || type instanceof BooleanType) {
      return new IntType(type.getLine(), type.getColumn()); // 0: false, 1..*: true
    }
    return super.logical(type);
  }

  @Override
  public boolean isLogical() {
    return true;
  }

  @Override
  public int getNumberOfBytes() {
    return 2;
  }
}
