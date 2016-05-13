// Generated from XML2JSON.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link XML2JSONParser}.
 */
public interface XML2JSONListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link XML2JSONParser#r}.
	 * @param ctx the parse tree
	 */
	void enterR(XML2JSONParser.RContext ctx);
	/**
	 * Exit a parse tree produced by {@link XML2JSONParser#r}.
	 * @param ctx the parse tree
	 */
	void exitR(XML2JSONParser.RContext ctx);
	/**
	 * Enter a parse tree produced by {@link XML2JSONParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(XML2JSONParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link XML2JSONParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(XML2JSONParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link XML2JSONParser#el_start}.
	 * @param ctx the parse tree
	 */
	void enterEl_start(XML2JSONParser.El_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link XML2JSONParser#el_start}.
	 * @param ctx the parse tree
	 */
	void exitEl_start(XML2JSONParser.El_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link XML2JSONParser#el_end}.
	 * @param ctx the parse tree
	 */
	void enterEl_end(XML2JSONParser.El_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link XML2JSONParser#el_end}.
	 * @param ctx the parse tree
	 */
	void exitEl_end(XML2JSONParser.El_endContext ctx);
}