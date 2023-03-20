package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.AbstractExpression;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class CharLiteral extends AbstractExpression {

  private final char character;

  public CharLiteral(char character, int line, int column) {
    super(line, column);
    this.character = character;
  }

  public char getCharacter() {
    return this.character;
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this, param);
  }
}
