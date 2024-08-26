// Generated from ExpressionGrammar.g4 by ANTLR 4.13.2
package io.compiler.core;

	import java.util.Stack;
	import io.compiler.runtime.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExpressionGrammarParser}.
 */
public interface ExpressionGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExpressionGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ExpressionGrammarParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ExpressionGrammarParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionGrammarParser#exprl}.
	 * @param ctx the parse tree
	 */
	void enterExprl(ExpressionGrammarParser.ExprlContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionGrammarParser#exprl}.
	 * @param ctx the parse tree
	 */
	void exitExprl(ExpressionGrammarParser.ExprlContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionGrammarParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(ExpressionGrammarParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionGrammarParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(ExpressionGrammarParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionGrammarParser#termol}.
	 * @param ctx the parse tree
	 */
	void enterTermol(ExpressionGrammarParser.TermolContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionGrammarParser#termol}.
	 * @param ctx the parse tree
	 */
	void exitTermol(ExpressionGrammarParser.TermolContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionGrammarParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(ExpressionGrammarParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionGrammarParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(ExpressionGrammarParser.FatorContext ctx);
}