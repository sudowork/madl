grammar MADL;

/**
 * PARSER RULES
 */

sourceElements
  : sourceElement+
  ;

sourceElement
  : component
  ;

component
  : COMPONENT ID
  ;

/**
 * KEYWORDS
 */

COMPONENT: 'component';

/**
 * TOKENS
 */

// Skip comments and whitespace
SKIP
  : ( COMMENT | WS ) -> skip
  ;

// Identifiers must start with an alphanumeric character
ID
  : NameStartChar NameChar*
  // | LPAREN NameStartChar NameChar* RPAREN
  ;

fragment NameChar
  : NameStartChar
  | '0'..'9'
  | '_'
  ;

fragment NameStartChar
  : 'A'..'Z'
  | 'a'..'z'
  ;

// Commments start with #
fragment COMMENT
  : SPACES? '#' ~[\r\n]*
  ;

// Whitespace consists of spaces, tabs, newlines, or carriage returns
fragment WS
  : ( SPACES | NEWLINE )+
  ;

fragment SPACES
  : [ \t]+
  ;

fragment NEWLINE
  : [\n\r]
  ;
