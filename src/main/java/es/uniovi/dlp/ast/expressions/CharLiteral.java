package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.AbstractExpression;

public class CharLiteral extends AbstractExpression {

    private final char character;

    public CharLiteral(char character, int line, int column) {
        super(line, column);
        this.character = character;
    }

    public char getCharacter() { return this.character; }

}
