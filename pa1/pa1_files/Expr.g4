grammar Expr;

// parser rules
prog : (expr ';' NEWLINE?)*;
expr :('min' | 'max' | 'pow' | 'sqrt') '(' num ','? num? ')'  # functionCall 
     | '(' expr ')'         # parensExpr
     | expr ('*'|'/') expr  # infixExpr
     | expr ('+'|'-') expr  # infixExpr
     | ID '=' num           # varDec
     | num                  # numberExpr
     | ID                     # idExpr
     ;
     
num  : INT
     | REAL
     ;

// lexer rules                    
NEWLINE: [\r\n]+ ;
INT: '0' | '-'?[1-9][0-9]* ;        // should handle negatives
REAL: '-'?[0-9]+'.'[0-9]* ; // should handle signs(+/-)
ID: [a-zA-Z]+ ;
FUNCT: 'min' | 'max' | 'pow' | 'sqrt' ;  // java.lang.Math functions
WS: [ \t\r\n]+ -> skip ;
