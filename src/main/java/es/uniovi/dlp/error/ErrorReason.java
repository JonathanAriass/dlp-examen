package es.uniovi.dlp.error;

public enum ErrorReason {
  FIELD_ALREADY_DECLARED("Field already declared in struct"),

  LVALUE_REQUIRED("LValue component is required");

  private final String message;

  ErrorReason(String message) {
    this.message = message;
  }

  public String getMessage() {
    return message;
  }
}
