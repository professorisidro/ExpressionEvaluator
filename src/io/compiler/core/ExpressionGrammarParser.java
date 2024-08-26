// Generated from ExpressionGrammar.g4 by ANTLR 4.13.2
package io.compiler.core;

	import java.util.Stack;
	import io.compiler.runtime.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ExpressionGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PV=1, OP_SUM=2, OP_SUB=3, OP_MUL=4, OP_DIV=5, NUM=6, WS=7;
	public static final int
		RULE_expr = 0, RULE_exprl = 1, RULE_termo = 2, RULE_termol = 3, RULE_fator = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"expr", "exprl", "termo", "termol", "fator"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'+'", "'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PV", "OP_SUM", "OP_SUB", "OP_MUL", "OP_DIV", "NUM", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ExpressionGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    private Stack<AbstractExpression> stack = new Stack<AbstractExpression>();
		private AbstractExpression topo = null;
		
	    public double generateValue(){
	       if (topo == null){
	          topo = stack.pop();
	       }
	       return topo.evaluate();
	    }
	    
	    public String generateJSON(){
	    	if (topo == null){
	          topo = stack.pop();
	       }
	       return topo.toJson();
	    }

	public ExpressionGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public ExprlContext exprl() {
			return getRuleContext(ExprlContext.class,0);
		}
		public TerminalNode PV() { return getToken(ExpressionGrammarParser.PV, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			termo();
			setState(11);
			exprl();
			setState(12);
			match(PV);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprlContext extends ParserRuleContext {
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public List<TerminalNode> OP_SUM() { return getTokens(ExpressionGrammarParser.OP_SUM); }
		public TerminalNode OP_SUM(int i) {
			return getToken(ExpressionGrammarParser.OP_SUM, i);
		}
		public List<TerminalNode> OP_SUB() { return getTokens(ExpressionGrammarParser.OP_SUB); }
		public TerminalNode OP_SUB(int i) {
			return getToken(ExpressionGrammarParser.OP_SUB, i);
		}
		public ExprlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterExprl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitExprl(this);
		}
	}

	public final ExprlContext exprl() throws RecognitionException {
		ExprlContext _localctx = new ExprlContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_exprl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_SUM || _la==OP_SUB) {
				{
				{
				setState(14);
				_la = _input.LA(1);
				if ( !(_la==OP_SUM || _la==OP_SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}

				               BinaryExpression bin = new BinaryExpression(_input.LT(-1).getText().charAt(0));
				               bin.setLeft(stack.pop());
				               stack.push(bin);
				           
				setState(16);
				termo();

				         	AbstractExpression topo = stack.pop(); // desempilhei o termo
				         	BinaryExpression root = (BinaryExpression) stack.pop(); // preciso do componente binário
				         	root.setRight(topo);
				         	stack.push(root);
				         
				         
				         
				}
				}
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TermoContext extends ParserRuleContext {
		public FatorContext fator() {
			return getRuleContext(FatorContext.class,0);
		}
		public TermolContext termol() {
			return getRuleContext(TermolContext.class,0);
		}
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitTermo(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_termo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			fator();
			setState(25);
			termol();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TermolContext extends ParserRuleContext {
		public List<FatorContext> fator() {
			return getRuleContexts(FatorContext.class);
		}
		public FatorContext fator(int i) {
			return getRuleContext(FatorContext.class,i);
		}
		public List<TerminalNode> OP_MUL() { return getTokens(ExpressionGrammarParser.OP_MUL); }
		public TerminalNode OP_MUL(int i) {
			return getToken(ExpressionGrammarParser.OP_MUL, i);
		}
		public List<TerminalNode> OP_DIV() { return getTokens(ExpressionGrammarParser.OP_DIV); }
		public TerminalNode OP_DIV(int i) {
			return getToken(ExpressionGrammarParser.OP_DIV, i);
		}
		public TermolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterTermol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitTermol(this);
		}
	}

	public final TermolContext termol() throws RecognitionException {
		TermolContext _localctx = new TermolContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_termol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_MUL || _la==OP_DIV) {
				{
				{
				setState(27);
				_la = _input.LA(1);
				if ( !(_la==OP_MUL || _la==OP_DIV) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}

							 BinaryExpression bin = new BinaryExpression(_input.LT(-1).getText().charAt(0));
							 if (stack.peek() instanceof UnaryExpression) { // o que tem no topo é um operador "simples"
							 	bin.setLeft(stack.pop()); // desempilho já tornando ele filho da multiplicacao
							 }
							 else{
							    BinaryExpression father = (BinaryExpression)stack.pop();
							    if (father.getOperation() == '-' || father.getOperation() == '+'){
							    	bin.setLeft(father.getRight());
							    	father.setRight(bin);
							    }
							    else{
							        bin.setLeft(father);
							        stack.push(bin);
							       
							    }
							 }        
				          
				setState(29);
				fator();

				             bin.setRight(stack.pop());
				             stack.push(bin);
				             System.out.println("DEBUG - :" + bin.toJson());
				          		
				          
				}
				}
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FatorContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(ExpressionGrammarParser.NUM, 0); }
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterFator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitFator(this);
		}
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_fator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(NUM);

			                 UnaryExpression element = new UnaryExpression(Double.parseDouble(_input.LT(-1).getText()));
			                 stack.push(element);
			              
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0007)\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u0014\b\u0001\n\u0001\f\u0001"+
		"\u0017\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003!\b\u0003\n\u0003\f\u0003"+
		"$\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0000\u0000"+
		"\u0005\u0000\u0002\u0004\u0006\b\u0000\u0002\u0001\u0000\u0002\u0003\u0001"+
		"\u0000\u0004\u0005%\u0000\n\u0001\u0000\u0000\u0000\u0002\u0015\u0001"+
		"\u0000\u0000\u0000\u0004\u0018\u0001\u0000\u0000\u0000\u0006\"\u0001\u0000"+
		"\u0000\u0000\b%\u0001\u0000\u0000\u0000\n\u000b\u0003\u0004\u0002\u0000"+
		"\u000b\f\u0003\u0002\u0001\u0000\f\r\u0005\u0001\u0000\u0000\r\u0001\u0001"+
		"\u0000\u0000\u0000\u000e\u000f\u0007\u0000\u0000\u0000\u000f\u0010\u0006"+
		"\u0001\uffff\uffff\u0000\u0010\u0011\u0003\u0004\u0002\u0000\u0011\u0012"+
		"\u0006\u0001\uffff\uffff\u0000\u0012\u0014\u0001\u0000\u0000\u0000\u0013"+
		"\u000e\u0001\u0000\u0000\u0000\u0014\u0017\u0001\u0000\u0000\u0000\u0015"+
		"\u0013\u0001\u0000\u0000\u0000\u0015\u0016\u0001\u0000\u0000\u0000\u0016"+
		"\u0003\u0001\u0000\u0000\u0000\u0017\u0015\u0001\u0000\u0000\u0000\u0018"+
		"\u0019\u0003\b\u0004\u0000\u0019\u001a\u0003\u0006\u0003\u0000\u001a\u0005"+
		"\u0001\u0000\u0000\u0000\u001b\u001c\u0007\u0001\u0000\u0000\u001c\u001d"+
		"\u0006\u0003\uffff\uffff\u0000\u001d\u001e\u0003\b\u0004\u0000\u001e\u001f"+
		"\u0006\u0003\uffff\uffff\u0000\u001f!\u0001\u0000\u0000\u0000 \u001b\u0001"+
		"\u0000\u0000\u0000!$\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000\u0000"+
		"\"#\u0001\u0000\u0000\u0000#\u0007\u0001\u0000\u0000\u0000$\"\u0001\u0000"+
		"\u0000\u0000%&\u0005\u0006\u0000\u0000&\'\u0006\u0004\uffff\uffff\u0000"+
		"\'\t\u0001\u0000\u0000\u0000\u0002\u0015\"";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}