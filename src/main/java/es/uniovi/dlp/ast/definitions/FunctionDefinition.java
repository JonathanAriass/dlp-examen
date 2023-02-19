package es.uniovi.dlp.ast.definitions;

import es.uniovi.dlp.ast.AbstractDefinition;
import es.uniovi.dlp.ast.Type;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class FunctionDefinition extends AbstractDefinition {

  private List<VarDefinition> varDefinitionList;
  private List<Statement> statementsList;

  public FunctionDefinition(String name, Type type, int line, int column) {
    super(name, type, line, column);
    this.varDefinitionList = new ArrayList<VarDefinition>();
    this.statementsList = new ArrayList<Statement>();
  }
}
