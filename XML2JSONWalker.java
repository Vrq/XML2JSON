public class XML2JSONWalker extends XML2JSONBaseListener {
  public void enterR(XML2JSONParser.RContext ctx ) {
    System.out.print( "{ " );
  }

  public void exitR(XML2JSONParser.RContext ctx ) {
    System.out.print( " }" );
  }
  
  public void enterEl_start(XML2JSONParser.El_startContext ctx) { 
	System.out.print("\"" + ctx.ID() + "\"");
  }
}