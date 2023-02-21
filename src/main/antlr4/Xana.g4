grammar Xana;


@header {
package es.uniovi.dlp.parser;
}

// Gramatica
program: def_variables* def_functions* def_main;

def_variables: ID (',' ID)* '::' type; // esta deberia de usar el type no simpleType

type: simpleType
        | '[' INT_CONSTANT '::' type ']'
        | 'defstruct' 'do' structFields 'end';

structFields: def_variables;

def_functions: 'def' ID '(' paramList ')' '::' returnType 'do' def_variables* statement* 'end';

paramList: (param (',' param)*)?;

param: ID '::' simpleType;

simpleType: 'int' | 'double' | 'char';

returnType: 'void' | simpleType;

statement:  'if' expression 'do' statement* ('else' statement*)? 'end'
            | 'in' expression (',' expression)*
            | 'puts' expression (',' expression)*
            | expression '=' expression
            | 'while' expression 'do' statement* 'end'
            | ID '(' (statement(',' statement)*)? ')'
            | 'return' expression;

expression: ID
            | INT_CONSTANT
            | REAL_CONSTANT
            | CHAR_CONSTANT
            | '-'expression;

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
