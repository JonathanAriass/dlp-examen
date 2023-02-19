package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.AbstractType;
import java.util.ArrayList;
import java.util.List;

public class Struct extends AbstractType {

  private List<StructFields> fields;

  public Struct(List<StructFields> fields, int line, int column) {
    super(line, column);
    this.fields = fields;
  }

  public List<StructFields> getFields() {
    return new ArrayList<StructFields>();
  }
}
