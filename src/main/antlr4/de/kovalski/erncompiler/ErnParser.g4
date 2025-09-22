parser grammar ErnParser;

// === OPTIONS ===
options { tokenVocab = ErnLexer; }

// === ENTRY POINT ===
program: functionDef* statement* EOF;

// === STATEMENTS ===
statement
    : ifStatement
    | whileStatement
    | doWhileStatement
    | forStatement
    | block
    | functionCall SEMI
    | expression SEMI
    ;

ifStatement:      IF LPAREN expression RPAREN statement (ELSE statement)?;
whileStatement:   WHILE LPAREN expression RPAREN block;
doWhileStatement: DO block WHILE LPAREN expression RPAREN SEMI;
forStatement:     FOR LPAREN expressionList? SEMI expressionList? SEMI expressionList? RPAREN block;
expressionList:   expression (COMMA expression)*;

// === FUNCTIONS ===

functionDef: FUNCTION ID LPAREN paramList? RPAREN block;

block: LBRACE statement* RBRACE;

paramList: param (COMMA param)*;

param: (RETURNS | EXPECTS) ID;

functionCall: ID LPAREN argList? RPAREN;

argList: expression (COMMA expression)*;

// === EXPRESSIONS (WITH PRECEDENCE) ===
expression
    : assignmentExpression
    ;

assignmentExpression
    : (ID | extractItem) ASSIGN assignmentExpression
    | castingExpression
    ;

castingExpression:      orExpression (AS typeExpression)?;
orExpression:           andExpression (OR andExpression)*;
andExpression:          relationalExpression (AND relationalExpression)*;
relationalExpression:   additiveExpression ((GT | LT | EQ) additiveExpression)*;
additiveExpression:     multiplicativeExpression ((PLUS | MINUS) multiplicativeExpression)*;
multiplicativeExpression: unaryExpression ((MUL | DIV) unaryExpression)*;

unaryExpression
    : NOT unaryExpression
    | MINUS unaryExpression
    | primaryExpression
    ;

primaryExpression
    : literal
    | ID
    | extractItem
    | PIPE expression PIPE
    | LPAREN expression RPAREN
    ;

extractItem: ID (LBRACK expression RBRACK)+;

typeExpression
    : INTEGER_TYPE
    | STRING_TYPE
    | VECTOR_TYPE
    | MATRIX_TYPE
    | BOOLEAN_TYPE
    ;

// === LITERALS AND OTHER ATOMIC RULES ===
literal
    : INTEGER_LITERAL
    | STRING_LITERAL
    | vectorLiteral
    | matrixLiteral
    | booleanLiteral
    ;

booleanLiteral: TRUE | FALSE;
vectorLiteral:  LBRACK argList? RBRACK;
matrixLiteral:  LBRACK vectorLiteral (COMMA vectorLiteral)* RBRACK;