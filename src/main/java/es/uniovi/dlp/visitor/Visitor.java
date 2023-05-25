package es.uniovi.dlp.visitor;

import es.uniovi.dlp.ast.Program;
import es.uniovi.dlp.ast.definitions.FunctionDefinition;
import es.uniovi.dlp.ast.definitions.VarDefinition;
import es.uniovi.dlp.ast.expressions.*;
import es.uniovi.dlp.ast.statements.*;
import es.uniovi.dlp.ast.types.*;

public interface Visitor<ReturnType, ParamType> {
  ReturnType visit(Program program, ParamType param);

  // VISITS PARA STATEMENTS
  ReturnType visit(Write in, ParamType param);

  ReturnType visit(Assignment assign, ParamType param);

  ReturnType visit(Read read, ParamType param);

  ReturnType visit(Conditional cond, ParamType param);

  ReturnType visit(While wh, ParamType param);

  ReturnType visit(Return ret, ParamType param);

  ReturnType visit(MasIgual mi, ParamType param);

  // VISITS PARA EXPRESIONES
  ReturnType visit(ArithmeticOperation op, ParamType param);

  ReturnType visit(ArrayAccess arrayAccess, ParamType param);

  ReturnType visit(Cast cast, ParamType param);

  ReturnType visit(CharLiteral charLit, ParamType param);

  ReturnType visit(ComparisonOperation comp, ParamType param);

  ReturnType visit(DoubleLiteral doubleLit, ParamType param);

  ReturnType visit(BooleanLiteral booleanLit, ParamType param);

  ReturnType visit(FieldAccess fieldAccess, ParamType param);

  ReturnType visit(IntLiteral intLit, ParamType param);

  ReturnType visit(Invocation invocation, ParamType param);

  ReturnType visit(LogicalOperation logOp, ParamType param);

  ReturnType visit(Negation negation, ParamType param);

  ReturnType visit(UnaryMinus unaryMinus, ParamType param);

  ReturnType visit(Variable variable, ParamType param);

  ReturnType visit(TernaryOperator ternary, ParamType param);

  // VISITS PARA TIPOS
  ReturnType visit(Array array, ParamType param);

  ReturnType visit(CharType charType, ParamType param);

  ReturnType visit(DoubleType doubleType, ParamType param);

  ReturnType visit(FunType funType, ParamType param);

  ReturnType visit(IntType intType, ParamType param);

  ReturnType visit(Struct struct, ParamType param);

  ReturnType visit(StructFields structFields, ParamType param);

  ReturnType visit(VoidType voidType, ParamType param);

  ReturnType visit(BooleanType booleanType, ParamType param);

  // VISITS PARA DEFINITIONS
  ReturnType visit(FunctionDefinition functionDefinition, ParamType param);

  ReturnType visit(VarDefinition varDefinition, ParamType param);

  ReturnType visit(Switch switchNode, ParamType param);

  ReturnType visit(Case caseNode, ParamType param);
}
