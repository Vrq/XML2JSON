# xml2json
XML to JSON translator

The project consists of a set of Java classes which are necessary to run the whole process of translating the code in XML format, given in the test.txt input to the code in JSON.

ANTLR4 was used as the main support tool for generating lexer, parser and listener files. For more info look on: http://www.antlr.org/ - Terence Parr is doing a great job there.

<strong>Install manual:</strong>
1) Download all files

2) Command line:
doskey antlr4=java org.antlr.v4.Tool $*
doskey grun =java org.antlr.v4.runtime.misc.TestRig $*

antlr4 XML2JSON.g4

javac XML2JSON*.java
java XML2JSON test.txt

You need ANTLR4 in order to run the project: https://github.com/antlr/antlr4/blob/master/doc/getting-started.md
