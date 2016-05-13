import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class XML2JSON {
  public static void main( String[] args) throws Exception 
  {
    XML2JSONLexer lexer = new XML2JSONLexer( new ANTLRFileStream(args[0]));
    CommonTokenStream tokens = new CommonTokenStream( lexer );
    XML2JSONParser parser = new XML2JSONParser( tokens );
    ParseTree tree = parser.r();
    ParseTreeWalker walker = new ParseTreeWalker();
    walker.walk( new XML2JSONWalker(), tree );
  }
}