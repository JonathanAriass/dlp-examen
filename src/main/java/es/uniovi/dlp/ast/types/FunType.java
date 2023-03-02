package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.AbstractType;
import es.uniovi.dlp.ast.Type;
import es.uniovi.dlp.ast.definitions.VarDefinition;
import java.util.ArrayList;
import java.util.List;

public class FunType extends AbstractType {

  private List<VarDefinition> params;
  private Type returnType;

  public FunType(List<VarDefinition> params, Type returnType, int line, int column) {
    super(line, column);
    this.params = params;
    this.returnType = returnType;
  }

  private List<VarDefinition> getParams() {
    return new ArrayList<>(this.params);
  }

  private Type getReturnType() {
    return this.returnType;
  }
}
