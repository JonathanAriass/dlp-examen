grammar Xana;

// Definimos el import para poder hacer el return y la instancia de las diferentes clases
@header {
package es.uniovi.dlp.parser;

import es.uniovi.dlp.ast.*;
import es.uniovi.dlp.ast.definitions.*;
import es.uniovi.dlp.ast.expressions.*;
import es.uniovi.dlp.ast.statements.*;
import es.uniovi.dlp.ast.types.*;
}

// Gramatica
program returns[Programa ast]:
    vars+=def_variables* funcs+=def_functions* def_main {
        List<Definition> defs = new ArrayList<Definition>();
        for (var variable : $vars) {
            defs.addAll(variable.ast);
        }
        for (var function : $funcs) {
            defs.addAll(function.ast);
        }
        defs.add($def_main.ast);
        $ast = new Programa(defs, $start.getLine(), $start.getCharPositionInLine() + 1);
    };

def_variables returns[List<VarDefinition> ast = new ArrayList<>()]:
    ids+=ID (',' ids+=ID)* '::' type {
        for (var id : $ids) {
            $ast.add(new VarDefinition(id.getText(), $type.ast, id.getLine(), id.getCharPositionInLine() + 1));
        }
    };

type returns[Type ast]:
        simpleType {$ast = $simpleType.ast;}
        | '[' size=INT_CONSTANT '::' type ']' {$ast = new Array($size.text, $type.ast, $start.getLine(), $start.getCharPositionInLine() + 1);}
        | 'defstruct' 'do' fields+=structFields* 'end' {
            List<StructFields> fields = new ArrayList<StructFields>();
            for (var field : $fields) {
                fields.addAll(field.ast);
            }
            $ast = new Struct(fields, $start.getLine(), $start.getCharPositionInLine() + 1);
        };

structFields returns[List<StructFields> ast = new ArrayList<>()]:
    ids+=ID (',' ids+=ID)* '::' type {
        for (var id : $ids) {
           $ast.add(new StructFields(id.getName(), $type.ast, $start.getLine(), $start.getCharPositionInLine() + 1));
        }
    };

def_functions returns[FunctionDefinition ast]:
    'def' ident=ID '(' paramList ')' '::' returnType 'do' vars+=def_variables* statement* 'end'
    {
        FunType funType = new FunType($paramList.ast, $returnType.ast, $start.getLine(), $start.getCharPositionInLine() + 1);
        List<Statement> statements = new ArrayList<>();
        // Los statements sera mejor crearlos como una lista por eso accedemos al statement.ast
        for (var statement : $statement.ast) {
            statements.addAll(statement.ast);
        }

        List<VarDefinition> varDefinitions = new ArrayList<>();
        for (var varDefinition : $vars) {
            varDefinitions.addAll(varDefinition.ast);
        }

        $ast = new FunctionDefinition($ident.text, funType, varDefinitions, statements, $start.getLine(), $start.getCharPositionInLine() + 1);
    };

paramList returns[List<VarDefinition> ast = new ArrayList<>();]:
    (list+=param (',' list+=param)*)? {
        for (var param : $list) {
            $ast.add(param.ast);
        }
    };

param returns[VarDefinition ast]:
    ident=ID '::' simpleType {$ast = new VarDefinition($ident.text, $simpleType.ast, $start.getLine(), $start.getCharPositionInLine() + 1);};

function_invocation returns[Expression ast]:
    ID '(' argument ')' {$ast = new Invocation($argument.ast, $start.getLine(), $start.getCharPositionInLine() + 1);};

argument returns[List<Expression> ast]:
    (expr+=expression(',' expr+=expression)*)?
    {
        for (var expression : $expr) {
           $ast.addAll(expression.ast);
        }
    };

simpleType returns[Type ast]:
    'int' {$ast = new IntType($start.getLine(), $start.getCharPositionInLine() + 1);}
    | 'double' {$ast = new DoubleType($start.getLine(), $start.getCharPositionInLine() + 1);}
    | 'char' {$ast = new CharType($start.getLine(), $start.getCharPositionInLine() + 1);};

returnType returns[Type ast]:
    'void' {$ast = new VoidType($start.getLine(), $start.getCharPositionInLine() + 1);}
    | simpleType {$ast = $simpleType.ast};

statement returns[List<Statement> ast = new ArrayList<>()]:
    function_invocation {$ast.add($function_invocation.ast);}
    |'if' expression 'do' if+=statement* ('else' else+=statement*)? 'end' {
        List<Statement> ifconds = new ArrayList<>();
        for (var cond : $if) {
            ifconds.addAll(cond.ast);
        }

        List<Statement> elseconds = new ArrayList<>();
        for (var cond : $else) {
            elseconds.addAll(cond.ast);
        }

        $ast.add(new Conditional($expression.ast, ifconds, elseconds, $start.getLine(), $start.getCharPositionInLine() + 1));
    }
    | 'in' exp+=expression (',' exp+=expression)* {
        for (var expression : $exp) {
            $ast.add(new Read(expression, expression.getLine(), expression.getColumn()));
        }
    }
    | 'puts' exp+=expression (',' exp+=expression)* {
        for (var expression : $exp) {
            $ast.add(new Write(expression, expression.getLine(), expression.getColumn()));
        }
    }
    | leftExp=expression '=' rightExp=expression {$ast.add(new Assignment($leftExp.ast, $rightExp.ast, $start.getLine(), $start.getCharPositionInLine() + 1);}
    | 'while' expression 'do' stms+=statement* 'end' {
        List<Statement> statements = new ArrayList<>();
        for(var stm : $stms) {
            statements.addAll(stm.ast);
        }
        $ast.add(new While($expression.ast, statements, $start.getLine(), $start.getCharPositionInLine() + 1));
    }
    | ID '(' (stms+=statement(',' stms+=statement)*)? ')' {
        List<Statement> statements =  new ArrayList<>();
        for (var statement : $stms) {
            statements.add(statement);
        }

        $ast.add(new Invocation(statements, $start.getLine(), $start.getCharPositionInLine() + 1));
    }
    | 'return' expression {$ast.add(new Return($expression.ast, $start.getLine(), $start.getCharPositionInLine() + 1))};

expression returns[Expression ast]:
    function_invocation
    | '(' expression ')'
    | expression '[' expression ']'
    | expression '.' ID
    | expression 'as' simpleType
    | '-' expression
    | '!' expression
    | expression ('*' | '/' | '%') expression
    | expression ('+' | '-') expression
    | expression ('>' | '>=' | '<' | '<=' | '!=' | '==') expression
    | expression ('&&' | '||') expression
    | ID
    | INT_CONSTANT
    | REAL_CONSTANT
    | CHAR_CONSTANT;

def_main returns[FunctionDefinition ast]:
    'def' 'main' '(' ')' 'do' (vars+=def_variables | stmnts+=statement)* 'end'
    {
        FunType funType = new FunType(new ArrayList<>(), new VoidType(0, 0), $start.getLine(), $start.getCharPositionInLine() + 1);

        List<VarDefinition> varDefinitions = new ArrayList<>();
        for (var varDefinition : $vars) {
            varDefinition.addAll(varDefinition.ast);
        }

        List<Statement> statements = new ArrayList<>();
        for (var statement : $stmnts) {
            statements.addAll(statement.ast);
        }

        $ast = new FunctionDefinition("main", varDefinitions, statements, $start.getLine(), $start.getCharPositionInLine() + 1);
    };

// Pagina para visualizar el arbol lexer: http://lab.antlr.org/

// Con fragment podemos definir un nombre en antlr4 y asi dejar el codigo mas entendible
fragment
INT: [0-9]+;
INT_CONSTANT: INT;

fragment
REAL: [.][0-9]+ | [0-9]+[.][0-9-]+ | [0-9]+[.];
REAL_CONSTANT: REAL | REAL'E'('+'|'-')?[0-9]+ | REAL'E'('+'|'-')?REAL_CONSTANT | [0-9]+[e+][0-9]+ | [0-9]+[e-][0-9]+;

ID: [a-zA-Z_][0-9a-zA-Z_]*;

CHAR_CONSTANT: '\''.'\'' | '\'\\'(INT | [nt])'\'';

// Con el operador ? lo que trabajamos es con la version non-greedy del '*'
COMENTARIO_SIMPLE: ('#' .*? ('\n' | EOF)) -> skip;
COMENTARIO_MULTILINEA: '"""' .*? '"""' -> skip;

TRASH: [ \t\r\n] -> skip;
