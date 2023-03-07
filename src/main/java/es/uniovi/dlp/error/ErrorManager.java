package es.uniovi.dlp.error;

import java.util.ArrayList;
import java.util.List;

public class ErrorManager {
  private static final ErrorManager instance = new ErrorManager();

  private final List<Error> errors = new ArrayList<>();

  private ErrorManager() {}

  public static ErrorManager getInstance() {
    return instance;
  }

  public void clearErrors() {
    errors.clear();
  }

  public void addError(Error error) {
    errors.add(error);
  }

  public List<Error> getErrors() {
    return new ArrayList<>(errors);
  }

  public boolean hasErrors() {
    return !errors.isEmpty();
  }
}
