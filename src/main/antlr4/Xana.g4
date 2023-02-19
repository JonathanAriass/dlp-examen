grammar Xana;


@header {
package es.uniovi.dlp.parser;
}

program: INT_CONSTANT;

// Con fragment podemos definir un nombre en antlr4 y asi dejar el codigo mas entendible
fragment
INT: [0-9]+;
INT_CONSTANT: INT;

fragment
REAL: [.][0-9]+ | [0-9]+[.][0-9-]+;
REAL_CONSTANT: REAL | REAL [E-][0-9]+ | [0-9]+[e+][0-9]+ | [0-9]+[e-][0-9]+;

ID: [a-zA-Z][0-9a-zA-Z_]*;

CHAR_CONSTANT: '\''.'\'' | '\'\\'(INT | [nt])'\'';

// Con el operador ? lo que trabajamos es con la version non-greedy del '*'
COMENTARIO_SIMPLE: '#' .*? '\n' -> skip;
COMENTARIO_MULTILINEA: '"""' .*? '"""' -> skip;
