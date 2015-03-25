// Generated from MADL.g4 by ANTLR 4.4
package madl;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MADLParser}.
 */
public interface MADLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MADLParser#component}.
	 * @param ctx the parse tree
	 */
	void enterComponent(@NotNull MADLParser.ComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MADLParser#component}.
	 * @param ctx the parse tree
	 */
	void exitComponent(@NotNull MADLParser.ComponentContext ctx);
}