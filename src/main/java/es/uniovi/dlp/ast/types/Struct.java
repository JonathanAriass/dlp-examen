package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.AbstractType;
import es.uniovi.dlp.ast.Type;
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

  @Override
  public Type dot(String fieldName) {
    for (StructFields field : fields) if (field.getName().equals(fieldName)) return field.getType();
    return super.dot(fieldName);
  }

  @Override
  public boolean allowDot(String fieldName) {
    for (StructFields field : fields) if (field.getName().equals(fieldName)) return true;
    return false;
  }

  @Override
  public int getNumberOfBytes() {
    int bytes = 0;
    for (StructFields field : fields) bytes += field.getType().getNumberOfBytes();
    return bytes;
  }
}
