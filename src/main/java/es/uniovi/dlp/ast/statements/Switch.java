package es.uniovi.dlp.ast.statements;

import es.uniovi.dlp.ast.AbstractStatement;
import es.uniovi.dlp.ast.Expression;
import es.uniovi.dlp.ast.Statement;
import es.uniovi.dlp.visitor.AbstractVisitor;
import java.util.ArrayList;
import java.util.List;

public class Switch extends AbstractStatement {

  private Expression expression;
  private List<Case> cases;

  private List<Statement> statement;

  public Switch(
      Expression expression, List<Case> cases, List<Statement> statement, int line, int column) {
    super(line, column);
    this.expression = expression;
    this.cases = cases;
    this.statement = statement;
  }

  public Expression getExpression() {
    return expression;
  }

  public List<Case> getCases() {
    return new ArrayList<>(cases);
  }

  public List<Statement> getStatement() {
    return statement;
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this, param);
  }
}
