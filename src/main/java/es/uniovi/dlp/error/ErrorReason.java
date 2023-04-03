package es.uniovi.dlp.error;

public enum ErrorReason {
  FIELD_ALREADY_DECLARED("Field already declared in struct"),
  LVALUE_REQUIRED("LValue component is required"),
  VARIABLE_ALREADY_DECLARED("Variable already declared in scope"),
  FUNCTION_ALREADY_DECLARED("Function already declared in scope"),
  VARIABLE_NOT_DECLARED("Variable is not declared for visible scope"),
  FUNCTION_NOT_DECLARED("Function is not declared for visible scope"),
  INVALID_INDEX_EXPRESSION("Invalid index expression"),
  INVALID_INDEXING("Invalid indexing"),
  INVALID_CAST("Invalid cast"),
  INVALID_ARITHMETIC("Invalid arithmetic"),
  NOT_LOGICAL("Not logical"),
  INVALID_LOGICAL("Invalid logical"),
  INVALID_COMPARISON("Invalid comparison"),
  NO_SUCH_FIELD("No such field"),
  INVALID_DOT("Invalid dot"),
  INCOMPATIBLE_TYPES("Incompatible types"),
  INVALID_RETURN_TYPE("Invalid return type"),
  INVALID_ARGS("Invalid args"),
  INVALID_INVOCATION("Invalid invocation");
  private final String message;

  ErrorReason(String message) {
    this.message = message;
  }

  public String getMessage() {
    return message;
  }
}
