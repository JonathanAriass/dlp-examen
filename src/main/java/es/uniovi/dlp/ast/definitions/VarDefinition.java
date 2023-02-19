package es.uniovi.dlp.ast.definitions;

import es.uniovi.dlp.ast.AbstractDefinition;
import es.uniovi.dlp.ast.Type;

public class VarDefinition extends AbstractDefinition {

  public VarDefinition(String name, Type type, int line, int column) {
    super(name, type, line, column);
  }
}
