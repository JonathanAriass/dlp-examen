package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.AbstractExpression;

public class DoubleLiteral extends AbstractExpression {

    private final double value;

    public DoubleLiteral(double value, int line, int column) {
        super(line, column);
        this.value = value;
    }

    public double getValue() { return this.value; }
}
