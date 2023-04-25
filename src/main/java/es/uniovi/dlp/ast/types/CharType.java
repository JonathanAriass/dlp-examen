package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.AbstractType;
import es.uniovi.dlp.ast.Type;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class CharType extends AbstractType {
  public CharType(int line, int column) {
    super(line, column);
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this, param);
  }

  @Override
  public Type cast(Type type) {
    if (type instanceof IntType || type instanceof CharType || type instanceof DoubleType) {
      return type;
    }
    return super.cast(type);
  }

  @Override
  public Type arithmetic(Type type) {
    if (type instanceof CharType) {
      return new IntType(type.getLine(), type.getColumn());
    }
    if (type instanceof IntType) {
      return type;
    }
    if (type instanceof DoubleType) {
      return type;
    }
    return super.arithmetic(type);
  }

  @Override
  public Type comparison(Type type) {
    if (type instanceof IntType || type instanceof DoubleType || type instanceof CharType) {
      return new IntType(type.getLine(), type.getColumn()); // 0: false, 1..*: true
    }
    return super.comparison(type);
  }

  @Override
  public Type assignment(Type type) {
    if (type instanceof CharType) {
      return type;
    }
    return super.assignment(type);
  }

  @Override
  public boolean isArithmetic() {
    return true;
  }

  @Override
  public boolean promotableTo(Type to) {
    return to instanceof IntType || to instanceof DoubleType || super.promotableTo(to);
  }

  @Override
  public int getNumberOfBytes() {
    return 1;
  }

  @Override
  public String toString() {
    return "char";
  }
}
