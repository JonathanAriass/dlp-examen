package es.uniovi.dlp.visitor.semantic;

import es.uniovi.dlp.ast.Type;
import es.uniovi.dlp.ast.definitions.FunctionDefinition;
import es.uniovi.dlp.ast.definitions.VarDefinition;
import es.uniovi.dlp.ast.types.FunType;
import es.uniovi.dlp.ast.types.Struct;
import es.uniovi.dlp.ast.types.StructFields;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class OffsetVisitor extends AbstractVisitor<Type, Type> {

  private int globOffset; // Global offset

  @Override
  public Type visit(VarDefinition varDefinition, Type param) {
    super.visit(varDefinition, param);
    if (varDefinition.getScope() == 0) {
      varDefinition.setOffset(globOffset);
      globOffset += varDefinition.getType().getNumberOfBytes();
    }
    return null;
  }

  @Override
  public Type visit(FunctionDefinition functionDefinition, Type param) {
    super.visit(functionDefinition, param);
    int locOffset = 0;
    for (VarDefinition var : functionDefinition.getVarDefinitionList()) {
      locOffset -= var.getType().getNumberOfBytes();
      var.setOffset(locOffset);
    }
    return null;
  }

  @Override
  public Type visit(FunType funType, Type param) {
    super.visit(funType, param);
    int locOffest = 4; // 4 because the BP and ret addr
    for (int i = funType.getParams().size() - 1; i >= 0; i--) {
      funType.getParams().get(i).setOffset(locOffest);
      locOffest += funType.getParams().get(i).getType().getNumberOfBytes();
    }
    return null;
  }

  @Override
  public Type visit(Struct struct, Type param) {
    super.visit(struct, param);
    int structOffset = 0; // in this case we don't have to control BP and ret addr
    for (StructFields field : struct.getFields()) {
      field.setOffset(structOffset);
      structOffset += field.getType().getNumberOfBytes();
    }
    return null;
  }
}
