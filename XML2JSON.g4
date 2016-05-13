
grammar XML2JSON;

r: 'xml2json' element ;

//parser:
element: el_start el_end ;
el_start: '<' ID '>' ;
el_end: '</' ID '>' ;

//lekser:
ID : [a-z]+ ;             // match lower-case identifiers
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines