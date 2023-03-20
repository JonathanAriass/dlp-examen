package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.AbstractType;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class DoubleType extends AbstractType {
  public DoubleType(int line, int column) {
    super(line, column);
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this, param);
  }
}
