package es.uniovi.dlp.error;

public enum ErrorReason {
  FIELD_ALREADY_DECLARED("Field already declared in struct"),
  LVALUE_REQUIRED("LValue component is required"),
  VARIABLE_ALREADY_DECLARED ("Variable already declared in scope"),
  FUNCTION_ALREADY_DECLARED ("Function already declared in scope"),
  VARIABLE_NOT_DECLARED ("Variable is not declared for visible scope"),
  FUNCTION_NOT_DECLARED ("Function is not declared for visible scope");
  private final String message;

  ErrorReason(String message) {
    this.message = message;
  }

  public String getMessage() {
    return message;
  }
}
