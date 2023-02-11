package es.uniovi.dlp.ast.statements;

import es.uniovi.dlp.ast.AbstractStatement;
import es.uniovi.dlp.ast.Statement;

import java.util.ArrayList;
import java.util.List;

public class Invocation extends AbstractStatement {

    private List<Statement> args;

    public Invocation(List<Statement> args, int line, int column) {
        super(line, column);
        this.args = args;
    }

    public List<Statement> getArgs() { return new ArrayList<>(args); }

}
