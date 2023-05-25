package es.uniovi.dlp.visitor.semantic;

import es.uniovi.dlp.ast.Definition;
import es.uniovi.dlp.ast.Type;
import es.uniovi.dlp.ast.definitions.FunctionDefinition;
import es.uniovi.dlp.ast.definitions.VarDefinition;
import es.uniovi.dlp.ast.expressions.Invocation;
import es.uniovi.dlp.ast.expressions.Variable;
import es.uniovi.dlp.ast.types.ErrorType;
import es.uniovi.dlp.ast.types.Struct;
import es.uniovi.dlp.error.Error;
import es.uniovi.dlp.error.ErrorManager;
import es.uniovi.dlp.error.ErrorReason;
import es.uniovi.dlp.error.Location;
import es.uniovi.dlp.visitor.AbstractVisitor;
import java.util.HashSet;
import java.util.Set;

public class IdentificationVisitor extends AbstractVisitor<Type, Type> {

  SymbolTable st = new SymbolTable();

  @Override
  public Type visit(Struct struct, Type param) {
    struct.getFields().forEach(field -> field.accept(this, param));

    Set<String> fields = new HashSet<>();
    struct.getFields().stream()
        .forEach(
            field -> {
              if (!fields.contains(field.getName())) {
                fields.add(field.getName());
              } else {
                ErrorManager.getInstance()
                    .addError(
                        new Error(
                            new Location(field.getLine(), field.getColumn()),
                            ErrorReason.FIELD_ALREADY_DECLARED));
              }
            });
    return null;
  }

  @Override
  public Type visit(VarDefinition varDefinition, Type param) {
    if (st.findInCurrentScope(varDefinition.getName()) == null) {
      st.insert(varDefinition);
      System.out.println("ENTRA");
    } else {
      ErrorManager.getInstance()
          .addError(
              new Error(
                  new Location(varDefinition.getLine(), varDefinition.getColumn()),
                  ErrorReason.VARIABLE_ALREADY_DECLARED));
    }

    super.visit(varDefinition, param);
    return null;
  }

  @Override
  public Type visit(FunctionDefinition functionDefinition, Type param) {
    if (st.find(functionDefinition.getName()) == null) {
      st.insert(functionDefinition);
    } else {
      ErrorManager.getInstance()
          .addError(
              new Error(
                  new Location(functionDefinition.getLine(), functionDefinition.getColumn()),
                  ErrorReason.FUNCTION_ALREADY_DECLARED));
    }

    st.set(); // Nuevo scope para la funcion
    super.visit(functionDefinition, param);
    st.reset(); // Reseteamos el scope al salir de la funcion
    return null;
  }

  @Override
  public Type visit(Invocation invocation, Type param) {
    if (st.find(invocation.getName().getName()) == null)
      ErrorManager.getInstance()
          .addError(
              new Error(
                  new Location(invocation.getLine(), invocation.getColumn()),
                  ErrorReason.FUNCTION_NOT_DECLARED));
    else super.visit(invocation, param);
    return null;
  }

  @Override
  public Type visit(Variable variable, Type param) {
    Definition find = st.find(variable.getName());
    if (find == null) {

      ErrorManager.getInstance()
          .addError(
              new Error(
                  new Location(variable.getLine(), variable.getColumn()),
                  ErrorReason.VARIABLE_NOT_DECLARED));
      variable.setDefinition(
          new VarDefinition(
              "Error",
              new ErrorType(variable.getLine(), variable.getColumn()),
              variable.getLine(),
              variable.getColumn()));
    } else {
      variable.setDefinition(find);
    }

    super.visit(variable, param);
    return null;
  }
}
