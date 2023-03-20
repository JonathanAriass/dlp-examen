package es.uniovi.dlp.ast;

import es.uniovi.dlp.visitor.AbstractVisitor;
import java.util.ArrayList;
import java.util.List;

public class Program extends AbstractASTNode {

  private List<Definition> definitions;

  public Program(List<Definition> definitions, int line, int column) {
    super(line, column);
    this.definitions = definitions;
  }

  public List<Definition> getDefinitions() {
    return new ArrayList<>(definitions);
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return null;
  }
}
