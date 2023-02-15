package es.uniovi.dlp.parser;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.antlr.v4.runtime.Token;

public record LexicalInfo(int line, int column, String lexeme, int tokenKey, Object semanticValue) {

  public void assertIsEqual(Token token) {
    LexicalInfo tokenLexicalInfo = toLexicalInfo(token);
    // First check the semantic value on its own, so that we have more visibility if the string
    // representation is the same, but the actual type is different
    assertEquals(semanticValue, tokenLexicalInfo.semanticValue());
    assertEquals(this, tokenLexicalInfo);
  }

  private static LexicalInfo toLexicalInfo(Token token) {
    return new LexicalInfo(
        token.getLine(),
        token.getCharPositionInLine() + 1,
        token.getText(),
        token.getType(),
        getSemanticValue(token));
  }

  private static Object getSemanticValue(Token token) {
    return switch (token.getType()) {
      case XanaLexer.INT_CONSTANT -> LexerHelper.lexemeToInt(token.getText());
      default -> token.getText();
    };
  }
}
