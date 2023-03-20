package es.uniovi.dlp.ast.statements;

import es.uniovi.dlp.ast.AbstractStatement;
import es.uniovi.dlp.ast.Expression;
import es.uniovi.dlp.ast.Statement;
import es.uniovi.dlp.visitor.AbstractVisitor;
import java.util.ArrayList;
import java.util.List;

public class While extends AbstractStatement {

  private Expression condition;
  private List<Statement> body;

  public While(Expression condition, List<Statement> body, int line, int column) {
    super(line, column);
    this.condition = condition;
    this.body = body;
  }

  public Expression getCondition() {
    return this.condition;
  }

  public List<Statement> getBody() {
    return new ArrayList<>(body);
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this, param);
  }
}
