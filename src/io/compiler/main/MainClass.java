package io.compiler.main;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.CharStreams;

import io.compiler.core.ExpressionGrammarLexer;
import io.compiler.core.ExpressionGrammarParser;

public class MainClass {
	public static void main(String[] args) {
		try {
			ExpressionGrammarLexer  lexer;
			ExpressionGrammarParser parser;
			
			lexer = new ExpressionGrammarLexer(CharStreams.fromFileName("input.in"));
			CommonTokenStream tokenStream = new CommonTokenStream(lexer);
			parser = new ExpressionGrammarParser(tokenStream);
			
			
			System.out.println("Starting Expression Analysis");
			parser.expr();
			System.out.println("Analysis Finished!");
			System.out.println("Expression value "+parser.generateValue());
			System.out.println(parser.generateJSON());
			
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
