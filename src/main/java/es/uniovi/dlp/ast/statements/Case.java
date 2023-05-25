package es.uniovi.dlp.ast.statements;

import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.ast.Expression;
import es.uniovi.dlp.ast.Statement;
import es.uniovi.dlp.visitor.AbstractVisitor;
import java.util.ArrayList;
import java.util.List;

public class Case extends AbstractASTNode {

  private List<Statement> statements;
  private Expression expression;
  private int labelCase = 0;
  private int finalSwitchLabel = 0;

  public boolean breakPoint;

  public Case(
      List<Statement> statement, Expression expression, boolean breakPoint, int line, int column) {
    super(line, column);
    this.statements = statement;
    this.expression = expression;
    this.labelCase = 0;
    this.finalSwitchLabel = 0;
    this.breakPoint = breakPoint;
  }

  public int getLabelCase() {
    return labelCase;
  }

  public void setLabelCase(int labelCase) {
    this.labelCase = labelCase;
  }

  public int getFinalSwitchLabel() {
    return finalSwitchLabel;
  }

  public void setFinalSwitchLabel(int finalSwitchLabel) {
    this.finalSwitchLabel = finalSwitchLabel;
  }

  public List<Statement> getStatements() {
    return new ArrayList<>(statements);
  }

  public Expression getExpression() {
    return expression;
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this, param);
  }
}
