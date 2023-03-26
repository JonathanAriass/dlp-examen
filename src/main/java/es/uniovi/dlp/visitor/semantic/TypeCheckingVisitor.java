package es.uniovi.dlp.visitor.semantic;

import es.uniovi.dlp.ast.Type;
import es.uniovi.dlp.ast.expressions.*;
import es.uniovi.dlp.ast.statements.*;
import es.uniovi.dlp.ast.types.*;
import es.uniovi.dlp.error.Error;
import es.uniovi.dlp.error.ErrorManager;
import es.uniovi.dlp.error.ErrorReason;
import es.uniovi.dlp.error.Location;
import es.uniovi.dlp.visitor.AbstractVisitor;
import javax.lang.model.type.ErrorType;

public class TypeCheckingVisitor extends AbstractVisitor<Type, Type> {

  @Override
  public Type visit(Assignment assign, Type param) {
    super.visit(assign, param);

    if (assign.getLeftExpression().getType() instanceof ErrorType
        || assign.getRightExpression().getType() instanceof ErrorType) return null;
    if (!assign.getLeftExpression().isLValue()) {
      ErrorManager.getInstance()
          .addError(
              new Error(
                  new Location(
                      assign.getLeftExpression().getLine(), assign.getLeftExpression().getColumn()),
                  ErrorReason.LVALUE_REQUIRED));
      return null;
    }
    return null;
  }

  @Override
  public Type visit(Read read, Type param) {
    super.visit(read, param);
    if (!read.getExpression().isLValue()) {
      ErrorManager.getInstance()
          .addError(
              new Error(
                  new Location(read.getLine(), read.getColumn()), ErrorReason.LVALUE_REQUIRED));
    }
    return null;
  }

  //  @Override
  //  public Type visit(Variable variable, Type param) {
  //    super.visit(variable, param);
  //    variable.setType(variable.getDefinition().getType());
  //    return null;
  //  }
  //
  //  @Override
  //  public Type visit(IntLiteral intLit, Type param) {
  //    super.visit(intLit, param);
  //    intLit.setType(new IntType(intLit.getLine(), intLit.getColumn()));
  //    return null;
  //  }
  //
  //  @Override
  //  public Type visit(CharLiteral charLit, Type param) {
  //    super.visit(charLit, param);
  //    charLit.setType(new CharType(charLit.getLine(), charLit.getColumn()));
  //    return null;
  //  }
  //
  //  @Override
  //  public Type visit(DoubleLiteral doubleLit, Type param) {
  //    super.visit(doubleLit, param);
  //    doubleLit.setType(new DoubleType(doubleLit.getLine(), doubleLit.getColumn()));
  //    return null;
  //  }
}
