package es.uniovi.dlp.error;

public record Error(Location location, ErrorReason reason, String extraMessage)
    implements Comparable<Error> {
  public Error(Location location, ErrorReason reason) {
    this(location, reason, "");
  }

  @Override
  public boolean equals(Object obj) {
    Error incoming = (Error) obj;
    if (incoming.location.equals(this.location) && incoming.reason.equals(this.reason)) {
      return true;
    }

    return false;
  }

  public Error(int line, int column, ErrorReason reason) {
    this(new Location(line, column), reason, "");
  }

  public Error(int line, int column, ErrorReason reason, String extraMessage) {
    this(new Location(line, column), reason, extraMessage);
  }

  @Override
  public int compareTo(Error error) {
    return location.compareTo(error.location);
  }

  @Override
  public String toString() {
    return "An error exists at "
        + location
        + ". Cause of the error: "
        + reason.getMessage()
        + ". "
        + extraMessage;
  }
}
