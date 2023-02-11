package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.AbstractExpression;
import es.uniovi.dlp.ast.Expression;

public class FieldAccess extends AbstractExpression {

    private String field;
    private Expression expression;

    public FieldAccess(String field, Expression expression, int line, int column) {
        super(line, column);
        this.field = field;
        this.expression = expression;
    }

    public String getField() { return field; }

    public Expression getExpression() { return expression; }
}
