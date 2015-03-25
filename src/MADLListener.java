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
	/**
	 * Enter a parse tree produced by {@link MADLParser#sourceElements}.
	 * @param ctx the parse tree
	 */
	void enterSourceElements(@NotNull MADLParser.SourceElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MADLParser#sourceElements}.
	 * @param ctx the parse tree
	 */
	void exitSourceElements(@NotNull MADLParser.SourceElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MADLParser#sourceElement}.
	 * @param ctx the parse tree
	 */
	void enterSourceElement(@NotNull MADLParser.SourceElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MADLParser#sourceElement}.
	 * @param ctx the parse tree
	 */
	void exitSourceElement(@NotNull MADLParser.SourceElementContext ctx);
}