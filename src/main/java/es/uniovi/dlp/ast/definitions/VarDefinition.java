package es.uniovi.dlp.ast.definitions;

import es.uniovi.dlp.ast.AbstractDefinition;
import es.uniovi.dlp.ast.Type;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class VarDefinition extends AbstractDefinition {

  public VarDefinition(String name, Type type, int line, int column) {
    super(name, type, line, column);
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this, param);
  }
}
