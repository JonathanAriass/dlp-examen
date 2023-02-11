package es.uniovi.dlp.ast.statements;

import es.uniovi.dlp.ast.AbstractStatement;
import es.uniovi.dlp.ast.Expression;
import es.uniovi.dlp.ast.Statement;

import java.util.ArrayList;
import java.util.List;

public class Conditional extends AbstractStatement {

    private Expression condition;
    private List<Statement> ifBody;
    private List<Statement> elseBody;

    public Conditional(Expression condition, List<Statement> ifBody, List<Statement> elseBody, int line, int column) {
        super(line, column);
        this.condition = condition;
        this.ifBody = ifBody;
        this.elseBody = elseBody;
    }

    public Expression getCondition() { return condition; }

    public List<Statement> getIfBody() { return new ArrayList<>(ifBody); }

    public List<Statement> getElseBody() { return new ArrayList<>(elseBody); }

}
