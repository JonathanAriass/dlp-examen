package es.uniovi.dlp.parser;

public class LexerHelper {
  public static int lexemeToInt(String lexeme) {
    try {
      return Integer.parseInt(lexeme);
    } catch (NumberFormatException e) {
      e.printStackTrace();
    }
    return -1;
  }

  public static double lexemeToReal(String lexeme) {
    try {
      return Double.parseDouble(lexeme);
    } catch (NumberFormatException e) {
      e.printStackTrace();
    }
    return -1;
  }

  public static char lexemeToChar(String lexeme) {
    if (lexeme.charAt(1) == '\\') {
      if (lexeme.charAt(2) == 't') {
        return '\t';
      }
      if (lexeme.charAt(2) == 'n') {
        return '\n';
      }
      // Caso de que sea codigo ascii
      return (char) Integer.parseInt(lexeme.substring(2, lexeme.length() - 1));
    } else {
      return lexeme.charAt(1);
    }
  }
}
