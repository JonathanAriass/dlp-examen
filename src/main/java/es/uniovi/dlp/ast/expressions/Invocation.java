package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.AbstractExpression;
import es.uniovi.dlp.ast.Expression;
import java.util.ArrayList;
import java.util.List;

public class Invocation extends AbstractExpression {

  private List<Expression> args;

  public Invocation(List<Expression> args, int line, int column) {
    super(line, column);
    if (args == null) {
      // FAQ: Ask what should happen here
    }
    this.args = args;
  }

  // FAQ: should we return a copy of the expressions list to preserve the encapsulation?
  public List<Expression> getArgs() {
    return new ArrayList<>(args);
  }
}
