package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.AbstractType;
import es.uniovi.dlp.visitor.AbstractVisitor;
import java.util.*;

public class Struct extends AbstractType {

  private List<StructFields> fields;

  public Struct(List<StructFields> fields, int line, int column) {
    super(line, column);
    // check if there is duplicated values

    this.fields = fields;
  }

  public List<StructFields> getFields() {
    return new ArrayList<StructFields>(fields);
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this, param);
  }
}
