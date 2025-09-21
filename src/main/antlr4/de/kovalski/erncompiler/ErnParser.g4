// Parser grammar for the ERN language
parser grammar ErnParser;

// === OPTIONS ===
options { tokenVocab = ErnLexer; }

// === ENTRY POINT ===
program: functionDef* statement* EOF;

// === STATEMENTS ===
statement
    : assignment
    | ifStatement
    | whileStatement
    // A function call can be a standalone statement if followed by a semicolon
    | functionCall SEMI
    | returnStatement
    // A block can also be a statement (e.g., inside an if without its own block)
    | block
    ;

assignment: ID ASSIGN expression SEMI;

ifStatement: IF LPAREN expression RPAREN statement (ELSE statement)?;

whileStatement: WHILE LPAREN expression RPAREN statement;

returnStatement: RETURN expression SEMI;

// === FUNCTIONS ===
functionDef: FUNCTION ID LPAREN paramList? RPAREN block;

block: LBRACE statement* RBRACE;

paramList: ID (COMMA ID)*;

// === EXPRESSIONS (REBUILT WITH PRECEDENCE) ===

// The main entry point for an expression, starting with the lowest precedence.
expression
    : castingExpression
    ;

// Precedence level 0: type casting

castingExpression
    : orExpression (AS typeExpression)?;

// Precedence level 1: logical OR
orExpression
    : andExpression (OR andExpression)*
    ;

// Precedence Level 2: logical AND
andExpression
    : relationalExpression (AND relationalExpression)*
    ;

// Precedence Level 3: relational operators
relationalExpression
    : additiveExpression ((GT | LT | EQ) additiveExpression)*
    ;

// Precedence Level 4: addition and subtraction
additiveExpression
    : multiplicativeExpression ((PLUS | MINUS) multiplicativeExpression)*
    ;

// Precedence Level 5: multiplication and division
multiplicativeExpression
    : unaryExpression ((MUL | DIV) unaryExpression)*
    ;

// Precedence Level 6: Prefix Unary operators
unaryExpression
    : NOT unaryExpression
    | primaryExpression
    ;

// Precedence Level 7: Primary expressions (highest precedence)
// These are the "atoms" of the language.
primaryExpression
    : literal
    | ID
    | functionCall
    | extractItem
    | PIPE expression PIPE     // e.g., |x|
    | LPAREN expression RPAREN // Parentheses to override precedence
    ;

extractItem: ID (LBRACK expression RBRACK)+; // e.g., my_vector[index]

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

vectorLiteral: LBRACK argList? RBRACK;

matrixLiteral: LBRACK vectorLiteral (COMMA vectorLiteral)* RBRACK;

type: INTEGER_TYPE | STRING_TYPE | VECTOR_TYPE | MATRIX_TYPE | BOOLEAN_TYPE;

functionCall: ID LPAREN argList? RPAREN;

argList: expression (COMMA expression)*;