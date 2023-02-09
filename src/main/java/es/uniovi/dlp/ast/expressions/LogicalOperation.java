package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.AbstractExpression;
import es.uniovi.dlp.ast.Expression;

public class LogicalOperation extends AbstractExpression {

    private final String operation;
    private final Expression leftExpression;
    private final Expression rightExpression;

    public LogicalOperation(String operation, Expression expr1, Expression expr2, int line, int column) {
        super(line, column);
        this.operation = operation;
        this.leftExpression = expr1;
        this.rightExpression = expr2;
    }

    public String getOperation() { return this.operation; }

    public Expression getLeftExpression() { return this.leftExpression; }

    public Expression getRightExpression() { return this.rightExpression; }
}
