package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.AbstractExpression;
import es.uniovi.dlp.ast.Expression;
import es.uniovi.dlp.ast.Statement;
import java.util.ArrayList;
import java.util.List;

public class Invocation extends AbstractExpression implements Statement {

  private Variable name;
  private List<Expression> args;

  public Invocation(Variable name, List<Expression> args, int line, int column) {
    super(line, column);
    if (args == null) {
      // FAQ: Ask what should happen here
    }
    this.name = name;
    this.args = args;
  }

  // FAQ: should we return a copy of the expressions list to preserve the encapsulation?
  public List<Expression> getArgs() {
    return new ArrayList<>(args);
  }
}
