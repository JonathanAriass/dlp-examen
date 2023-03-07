package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.AbstractType;
import es.uniovi.dlp.error.Error;
import es.uniovi.dlp.error.ErrorManager;
import es.uniovi.dlp.error.ErrorReason;
import java.util.*;

public class Struct extends AbstractType {

  private List<StructFields> fields;

  public Struct(List<StructFields> fields, int line, int column) {
    super(line, column);
    // check if there is duplicated values
    Set<String> aux = new HashSet<>();
    for (StructFields field : fields) {
      if (!aux.add(field.getName())) {
        ErrorManager errorManager = ErrorManager.getInstance();
        errorManager.addError(
            new Error(field.getLine(), field.getColumn(), ErrorReason.FIELD_ALREADY_DECLARED));
      }
    }
    this.fields = fields;
  }

  public List<StructFields> getFields() {
    return new ArrayList<StructFields>(fields);
  }
}
