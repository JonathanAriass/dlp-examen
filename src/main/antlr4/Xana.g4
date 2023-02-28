grammar Xana;

// Definimos el import para poder hacer el return y la instancia de las diferentes clases
@header {
package es.uniovi.dlp.parser;

import es.uniovi.dlp.ast.*;
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
        for (var id : $ids.ast) {
           $ast.add(new StructFields(id.getName(), $type.ast, $start.getLine(), $start.getCharPositionInLine() + 1));
        }
    };

def_functions returns[FunctionDefinition ast]:
    'def' ident=ID '(' paramList ')' '::' returnType 'do' def_variables* statement* 'end';
//    {
//        List<Statement> statements = new ArrayList<>();
//        // Los statements sera mejor crearlos como una lista por eso accedemos al statement.ast
//        for (var statement : $statements.ast) {
//            statements.addAll(statement.ast);
//        }
//
//        $ast = new FunctionDefinition($ident.text, );
//    };

paramList: (param (',' param)*)?;

param returns[VarDefinition ast]:
    ident=ID '::' simpleType {$ast = new VarDefinition($ident.text, $simpleType.ast, $start.getLine(), $start.getCharPositionInLine() + 1);};

function_invocation: ID '(' argument ')';

argument: (expression(',' expression)*)?;

simpleType returns[Type ast]:
    'int' {$ast = new IntType($start.getLine(), $start.getCharPositionInLine() + 1);}
    | 'double' {$ast = new DoubleType($start.getLine(), $start.getCharPositionInLine() + 1);}
    | 'char' {$ast = new CharType($start.getLine(), $start.getCharPositionInLine() + 1);};

returnType returns[Type ast]:
    'void' {$ast = new VoidType($start.getLine(), $start.getCharPositionInLine() + 1);}
    | simpleType {$ast = $simpleType.ast};

statement:  function_invocation
            |'if' expression 'do' statement* ('else' statement*)? 'end'
            | 'in' expression (',' expression)*
            | 'puts' expression (',' expression)*
            | expression '=' expression
            | 'while' expression 'do' statement* 'end'
            | ID '(' (statement(',' statement)*)? ')'
            | 'return' expression;

expression: function_invocation
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

def_main: 'def' 'main' '(' ')' 'do' (def_variables | statement)* 'end';

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
