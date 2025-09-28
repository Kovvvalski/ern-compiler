lexer grammar ErnLexer;

// === KEYWORDS ===
// Declared before ID as antlr must define keyword not as ID token
FUNCTION: 'function';
RETURN: 'return';
IF: 'if';
ELSE: 'else';
WHILE: 'while';
TRUE: 'true';
FALSE: 'false';
AS: 'as';
RETURNS: 'returns';
EXPECTS: 'expects';
FOR: 'for';
DO: 'do';
OF: 'of';

// === LITERALS ===

// INTEGER
INTEGER_LITERAL: DIGIT+;

// STRING
STRING_LITERAL: '"' ( ~[\\"\r\n] | '\\' . )* '"';

// === TYPES ===

INTEGER_TYPE: 'Int';
STRING_TYPE: 'String';
VECTOR_TYPE: 'Vector';
MATRIX_TYPE: 'Matrix';
BOOLEAN_TYPE: 'Boolean';

// === OPERATORS ===

ASSIGN: '=';
PLUS:   '+';
MINUS:  '-';
MUL:    '*';
DIV:    '/';

PIPE:   '|';

GT:     '>';
LT:     '<';
EQ:    '==';
AND:  'and';
OR:    'or';
NOT:  'not';


LPAREN: '(';
RPAREN: ')';
LBRACE: '{';
RBRACE: '}';
LBRACK: '[';
RBRACK: ']';
COMMA:  ',';
SEMI:   ';';


// === IDENTIFIERS ===

// function or varriable
ID: LETTER (LETTER | DIGIT)*;

// === COMMENTS AND SPACES ===

WS: [ \t\r\n\u000C]+ -> skip;

COMMENT: '/*' .*? '*/' -> channel(HIDDEN);

LINE_COMMENT: '//' ~[\r\n]* -> channel(HIDDEN);


// === FRAGMENTS ===
fragment LETTER: [a-zA-Z_];
fragment DIGIT: [0-9];
