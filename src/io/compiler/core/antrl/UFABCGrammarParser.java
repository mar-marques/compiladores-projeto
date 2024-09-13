// Generated from UFABCGrammar.g4 by ANTLR 4.13.2
package io.compiler.core.antrl;

	import java.util.ArrayList;
	import java.util.Stack;
	import java.util.HashMap;
	import io.compiler.types.*;
	import io.compiler.core.exceptions.*;
	import io.compiler.core.ast.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class UFABCGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		OP=18, OP_AT=19, OPREL=20, ID=21, NUM=22, VIRG=23, PV=24, AP=25, FP=26, 
		DP=27, TEXTO=28, WS=29, OPL=30;
	public static final int
		RULE_programa = 0, RULE_declaravar = 1, RULE_comando = 2, RULE_cmdFor = 3, 
		RULE_cmdWhile = 4, RULE_cmdIF = 5, RULE_cmdAttrib = 6, RULE_cmdLeitura = 7, 
		RULE_cmdEscrita = 8, RULE_expr = 9, RULE_termo = 10, RULE_exprl = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "declaravar", "comando", "cmdFor", "cmdWhile", "cmdIF", "cmdAttrib", 
			"cmdLeitura", "cmdEscrita", "expr", "termo", "exprl"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'programa'", "'inicio'", "'fim'", "'fimprog'", "'declare'", "'number'", 
			"'text'", "'fazer'", "'enquantof'", "'enquanto'", "'fimenquanto'", "'se'", 
			"'entao'", "'senao'", "'fimse'", "'leia'", "'escreva'", null, "':='", 
			null, null, null, "','", "';'", "'('", "')'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "OP", "OP_AT", "OPREL", "ID", "NUM", 
			"VIRG", "PV", "AP", "FP", "DP", "TEXTO", "WS", "OPL"
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
	public String getGrammarFileName() { return "UFABCGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    private HashMap<String,Var> symbolTable = new HashMap<String, Var>();
	    private ArrayList<Var> currentDecl = new ArrayList<Var>();
	    private Types currentType;
	    private Types leftType=null, rightType=null;
	    private Program program = new Program();
	    private String strExpr = "";
	    private String strAux = "";
	    private String strAt = "";
	    private IfCommand currentIfCommand;
	    private WhileCommand currentWhileCommand;
	    private DoWhileCommand currentDoWhileCommand;
	    
	    private Stack<ArrayList<Command>> stack = new Stack<ArrayList<Command>>();
	    
	    
	    public void updateType(){
	    	for(Var v: currentDecl){
	    	   v.setType(currentType);
	    	   symbolTable.put(v.getId(), v);
	    	}
	    }
	    public void exibirVar(){
	        for (String id: symbolTable.keySet()){
	        	System.out.println(symbolTable.get(id));
	        }
	    }
	    
	    public Program getProgram(){
	    	return this.program;
	    	}
	    
	    public boolean isDeclared(String id){
	    	return symbolTable.get(id) != null;
	    }

	public UFABCGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(UFABCGrammarParser.ID, 0); }
		public List<DeclaravarContext> declaravar() {
			return getRuleContexts(DeclaravarContext.class);
		}
		public DeclaravarContext declaravar(int i) {
			return getRuleContext(DeclaravarContext.class,i);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UFABCGrammarListener ) ((UFABCGrammarListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UFABCGrammarListener ) ((UFABCGrammarListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(T__0);
			setState(25);
			match(ID);
			 program.setName(_input.LT(-1).getText());
			                               stack.push(new ArrayList<Command>()); 
			                             
			setState(28); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(27);
				declaravar();
				}
				}
				setState(30); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__4 );
			setState(32);
			match(T__1);
			setState(34); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(33);
				comando();
				}
				}
				setState(36); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2299136L) != 0) );
			setState(38);
			match(T__2);
			setState(39);
			match(T__3);

			                  program.setSymbolTable(symbolTable);
			                  program.setCommandList(stack.pop());
			               
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
	public static class DeclaravarContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(UFABCGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(UFABCGrammarParser.ID, i);
		}
		public TerminalNode DP() { return getToken(UFABCGrammarParser.DP, 0); }
		public TerminalNode PV() { return getToken(UFABCGrammarParser.PV, 0); }
		public List<TerminalNode> VIRG() { return getTokens(UFABCGrammarParser.VIRG); }
		public TerminalNode VIRG(int i) {
			return getToken(UFABCGrammarParser.VIRG, i);
		}
		public DeclaravarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaravar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UFABCGrammarListener ) ((UFABCGrammarListener)listener).enterDeclaravar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UFABCGrammarListener ) ((UFABCGrammarListener)listener).exitDeclaravar(this);
		}
	}

	public final DeclaravarContext declaravar() throws RecognitionException {
		DeclaravarContext _localctx = new DeclaravarContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaravar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(T__4);
			 currentDecl.clear(); 
			setState(44);
			match(ID);
			 currentDecl.add(new Var(_input.LT(-1).getText()));
			               strAux= _input.LT(-1).getText();
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRG) {
				{
				{
				setState(46);
				match(VIRG);
				setState(47);
				match(ID);
				 currentDecl.add(new Var(_input.LT(-1).getText()));
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(54);
			match(DP);
			setState(59);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				setState(55);
				match(T__5);
				currentType = Types.NUMBER;
				}
				break;
			case T__6:
				{
				setState(57);
				match(T__6);
				currentType = Types.TEXT;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			 updateType(); 
			setState(62);
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
	public static class ComandoContext extends ParserRuleContext {
		public CmdAttribContext cmdAttrib() {
			return getRuleContext(CmdAttribContext.class,0);
		}
		public CmdLeituraContext cmdLeitura() {
			return getRuleContext(CmdLeituraContext.class,0);
		}
		public CmdEscritaContext cmdEscrita() {
			return getRuleContext(CmdEscritaContext.class,0);
		}
		public CmdIFContext cmdIF() {
			return getRuleContext(CmdIFContext.class,0);
		}
		public CmdWhileContext cmdWhile() {
			return getRuleContext(CmdWhileContext.class,0);
		}
		public CmdForContext cmdFor() {
			return getRuleContext(CmdForContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UFABCGrammarListener ) ((UFABCGrammarListener)listener).enterComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UFABCGrammarListener ) ((UFABCGrammarListener)listener).exitComando(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_comando);
		try {
			setState(70);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				cmdAttrib();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				cmdLeitura();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 3);
				{
				setState(66);
				cmdEscrita();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 4);
				{
				setState(67);
				cmdIF();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 5);
				{
				setState(68);
				cmdWhile();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 6);
				{
				setState(69);
				cmdFor();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class CmdForContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(UFABCGrammarParser.AP, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> OPREL() { return getTokens(UFABCGrammarParser.OPREL); }
		public TerminalNode OPREL(int i) {
			return getToken(UFABCGrammarParser.OPREL, i);
		}
		public TerminalNode FP() { return getToken(UFABCGrammarParser.FP, 0); }
		public TerminalNode PV() { return getToken(UFABCGrammarParser.PV, 0); }
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public List<TerminalNode> OPL() { return getTokens(UFABCGrammarParser.OPL); }
		public TerminalNode OPL(int i) {
			return getToken(UFABCGrammarParser.OPL, i);
		}
		public CmdForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UFABCGrammarListener ) ((UFABCGrammarListener)listener).enterCmdFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UFABCGrammarListener ) ((UFABCGrammarListener)listener).exitCmdFor(this);
		}
	}

	public final CmdForContext cmdFor() throws RecognitionException {
		CmdForContext _localctx = new CmdForContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_cmdFor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(T__7);
			 
									   currentDoWhileCommand = new DoWhileCommand();
			                           strExpr = "";
			                           stack.push(new ArrayList<Command>());
								     
			setState(75); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(74);
				comando();
				}
				}
				setState(77); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2299136L) != 0) );
			 currentDoWhileCommand.setList(stack.pop()); 
			setState(80);
			match(T__8);
			setState(81);
			match(AP);
			setState(82);
			expr();
			setState(83);
			match(OPREL);
			 strExpr += _input.LT(-1).getText(); 
			setState(85);
			expr();
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPL) {
				{
				setState(93); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(86);
					match(OPL);
					 if(_input.LT(-1).getText().equals("E")) strExpr += " && "; else strExpr += " || "; 
					setState(88);
					expr();
					setState(89);
					match(OPREL);
					 strExpr += _input.LT(-1).getText(); 
					setState(91);
					expr();
					}
					}
					setState(95); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==OPL );
				}
			}

			setState(99);
			match(FP);
			setState(100);
			match(PV);

			               		currentDoWhileCommand.setExpression(strExpr);
			               		stack.peek().add(currentDoWhileCommand);
			               
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
	public static class CmdWhileContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(UFABCGrammarParser.AP, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> OPREL() { return getTokens(UFABCGrammarParser.OPREL); }
		public TerminalNode OPREL(int i) {
			return getToken(UFABCGrammarParser.OPREL, i);
		}
		public TerminalNode FP() { return getToken(UFABCGrammarParser.FP, 0); }
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public List<TerminalNode> OPL() { return getTokens(UFABCGrammarParser.OPL); }
		public TerminalNode OPL(int i) {
			return getToken(UFABCGrammarParser.OPL, i);
		}
		public CmdWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdWhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UFABCGrammarListener ) ((UFABCGrammarListener)listener).enterCmdWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UFABCGrammarListener ) ((UFABCGrammarListener)listener).exitCmdWhile(this);
		}
	}

	public final CmdWhileContext cmdWhile() throws RecognitionException {
		CmdWhileContext _localctx = new CmdWhileContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_cmdWhile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(T__9);
			 
									   currentWhileCommand = new WhileCommand();
			                           strExpr = "";
			                           stack.push(new ArrayList<Command>());
								     
			setState(105);
			match(AP);
			setState(106);
			expr();
			setState(107);
			match(OPREL);
			 strExpr += _input.LT(-1).getText(); 
			setState(109);
			expr();
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPL) {
				{
				setState(117); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(110);
					match(OPL);
					 if(_input.LT(-1).getText().equals("E")) strExpr += " && "; else strExpr += " || "; 
					setState(112);
					expr();
					setState(113);
					match(OPREL);
					 strExpr += _input.LT(-1).getText(); 
					setState(115);
					expr();
					}
					}
					setState(119); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==OPL );
				}
			}

			setState(123);
			match(FP);
			 currentWhileCommand.setExpression(strExpr);
			setState(126); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(125);
				comando();
				}
				}
				setState(128); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2299136L) != 0) );
			 currentWhileCommand.setList(stack.pop()); 
			setState(131);
			match(T__10);

			               		stack.peek().add(currentWhileCommand);
			               
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
	public static class CmdIFContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(UFABCGrammarParser.AP, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> OPREL() { return getTokens(UFABCGrammarParser.OPREL); }
		public TerminalNode OPREL(int i) {
			return getToken(UFABCGrammarParser.OPREL, i);
		}
		public TerminalNode FP() { return getToken(UFABCGrammarParser.FP, 0); }
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public List<TerminalNode> OPL() { return getTokens(UFABCGrammarParser.OPL); }
		public TerminalNode OPL(int i) {
			return getToken(UFABCGrammarParser.OPL, i);
		}
		public CmdIFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdIF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UFABCGrammarListener ) ((UFABCGrammarListener)listener).enterCmdIF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UFABCGrammarListener ) ((UFABCGrammarListener)listener).exitCmdIF(this);
		}
	}

	public final CmdIFContext cmdIF() throws RecognitionException {
		CmdIFContext _localctx = new CmdIFContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cmdIF);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(T__11);
			 stack.push(new ArrayList<Command>());
			                      strExpr = "";
			                      currentIfCommand = new IfCommand();
			                    
			setState(136);
			match(AP);
			setState(137);
			expr();
			setState(138);
			match(OPREL);
			 strExpr += _input.LT(-1).getText(); 
			setState(140);
			expr();
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPL) {
				{
				setState(148); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(141);
					match(OPL);
					 if(_input.LT(-1).getText().equals("E")) strExpr += " && "; else strExpr += " || "; 
					setState(143);
					expr();
					setState(144);
					match(OPREL);
					 strExpr += _input.LT(-1).getText(); 
					setState(146);
					expr();
					}
					}
					setState(150); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==OPL );
				}
			}

			setState(154);
			match(FP);
			 currentIfCommand.setExpression(strExpr); 
			setState(156);
			match(T__12);
			setState(158); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(157);
				comando();
				}
				}
				setState(160); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2299136L) != 0) );
			 
			                  currentIfCommand.setTrueList(stack.pop());                            
			               
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(163);
				match(T__13);
				 stack.push(new ArrayList<Command>()); 
				setState(166); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(165);
					comando();
					}
					}
					setState(168); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2299136L) != 0) );

				                   currentIfCommand.setFalseList(stack.pop());
				                 
				}
			}

			setState(174);
			match(T__14);

			               	   stack.peek().add(currentIfCommand);
			               
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
	public static class CmdAttribContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(UFABCGrammarParser.ID, 0); }
		public TerminalNode OP_AT() { return getToken(UFABCGrammarParser.OP_AT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PV() { return getToken(UFABCGrammarParser.PV, 0); }
		public CmdAttribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdAttrib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UFABCGrammarListener ) ((UFABCGrammarListener)listener).enterCmdAttrib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UFABCGrammarListener ) ((UFABCGrammarListener)listener).exitCmdAttrib(this);
		}
	}

	public final CmdAttribContext cmdAttrib() throws RecognitionException {
		CmdAttribContext _localctx = new CmdAttribContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cmdAttrib);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(ID);
			 if (!isDeclared(_input.LT(-1).getText())) {
			                       throw new UFABCSemanticException("Undeclared Variable: "+_input.LT(-1).getText());
			                   }
			                   strExpr = "";
			                   strAux = _input.LT(-1).getText();
			                   symbolTable.get(_input.LT(-1).getText()).setInitialized(true);
			                   leftType = symbolTable.get(_input.LT(-1).getText()).getType();
			                   rightType=null;
			                 
			setState(179);
			match(OP_AT);
			setState(180);
			expr();
			setState(181);
			match(PV);

			                 System.out.println("Left  Side Expression Type = "+leftType);
			                 System.out.println("Right Side Expression Type = "+rightType);
			                 if (leftType.getValue() < rightType.getValue()){
			                    throw new UFABCSemanticException("Type Mismatchig on Assignment");
			                 }
			              	 AttribCommand cmdAtrrib = new AttribCommand(symbolTable.get(strAux), strExpr);
			              	 stack.peek().add(cmdAtrrib);
			              
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
	public static class CmdLeituraContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(UFABCGrammarParser.AP, 0); }
		public TerminalNode ID() { return getToken(UFABCGrammarParser.ID, 0); }
		public TerminalNode FP() { return getToken(UFABCGrammarParser.FP, 0); }
		public TerminalNode PV() { return getToken(UFABCGrammarParser.PV, 0); }
		public CmdLeituraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdLeitura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UFABCGrammarListener ) ((UFABCGrammarListener)listener).enterCmdLeitura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UFABCGrammarListener ) ((UFABCGrammarListener)listener).exitCmdLeitura(this);
		}
	}

	public final CmdLeituraContext cmdLeitura() throws RecognitionException {
		CmdLeituraContext _localctx = new CmdLeituraContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cmdLeitura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(T__15);
			setState(185);
			match(AP);
			setState(186);
			match(ID);
			 if (!isDeclared(_input.LT(-1).getText())) {
			                       throw new UFABCSemanticException("Undeclared Variable: "+_input.LT(-1).getText());
			                    }
			                    symbolTable.get(_input.LT(-1).getText()).setInitialized(true);
			                    Command cmdRead = new ReadCommand(symbolTable.get(_input.LT(-1).getText()));
			                    stack.peek().add(cmdRead);
			                  
			setState(188);
			match(FP);
			setState(189);
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
	public static class CmdEscritaContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(UFABCGrammarParser.AP, 0); }
		public TerminalNode FP() { return getToken(UFABCGrammarParser.FP, 0); }
		public TerminalNode PV() { return getToken(UFABCGrammarParser.PV, 0); }
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public CmdEscritaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdEscrita; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UFABCGrammarListener ) ((UFABCGrammarListener)listener).enterCmdEscrita(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UFABCGrammarListener ) ((UFABCGrammarListener)listener).exitCmdEscrita(this);
		}
	}

	public final CmdEscritaContext cmdEscrita() throws RecognitionException {
		CmdEscritaContext _localctx = new CmdEscritaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cmdEscrita);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(T__16);
			setState(192);
			match(AP);
			{
			setState(193);
			termo();
			 Command cmdWrite = new WriteCommand(_input.LT(-1).getText());
			                         stack.peek().add(cmdWrite);
			                       
			}
			setState(196);
			match(FP);
			setState(197);
			match(PV);
			 rightType = null;
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
	public static class ExprContext extends ParserRuleContext {
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public ExprlContext exprl() {
			return getRuleContext(ExprlContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UFABCGrammarListener ) ((UFABCGrammarListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UFABCGrammarListener ) ((UFABCGrammarListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			termo();
			 strExpr += _input.LT(-1).getText(); 
			setState(202);
			exprl();
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
		public TerminalNode ID() { return getToken(UFABCGrammarParser.ID, 0); }
		public TerminalNode NUM() { return getToken(UFABCGrammarParser.NUM, 0); }
		public TerminalNode TEXTO() { return getToken(UFABCGrammarParser.TEXTO, 0); }
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UFABCGrammarListener ) ((UFABCGrammarListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UFABCGrammarListener ) ((UFABCGrammarListener)listener).exitTermo(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_termo);
		try {
			setState(210);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				match(ID);
				 if (!isDeclared(_input.LT(-1).getText())) {
				                       throw new UFABCSemanticException("Undeclared Variable: "+_input.LT(-1).getText());
				                    }
				                    if (!symbolTable.get(_input.LT(-1).getText()).isInitialized()){
				                       throw new UFABCSemanticException("Variable "+_input.LT(-1).getText()+" has no value assigned");
				                    }
				                    if (rightType == null){
				                       rightType = symbolTable.get(_input.LT(-1).getText()).getType();
				                       //System.out.println("Encontrei pela 1a vez uma variavel = "+rightType);
				                    }   
				                    else{
				                       if (symbolTable.get(_input.LT(-1).getText()).getType().getValue() > rightType.getValue()){
				                          rightType = symbolTable.get(_input.LT(-1).getText()).getType();
				                          //System.out.println("Ja havia tipo declarado e mudou para = "+rightType);
				                          
				                       }
				                    }
				                  
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				match(NUM);
				  if (rightType == null) {
							 				rightType = Types.NUMBER;
							 				//System.out.println("Encontrei um numero pela 1a vez "+rightType);
							            }
							            else{
							                if (rightType.getValue() < Types.NUMBER.getValue()){			                    			                   
							                	rightType = Types.NUMBER;
							                	//System.out.println("Mudei o tipo para Number = "+rightType);
							                }
							            }
							         
				}
				break;
			case TEXTO:
				enterOuterAlt(_localctx, 3);
				{
				setState(208);
				match(TEXTO);
				  if (rightType == null) {
							 				rightType = Types.TEXT;
							 				//System.out.println("Encontrei pela 1a vez um texto ="+ rightType);
							            }
							            else{
							                if (rightType.getValue() < Types.TEXT.getValue()){			                    
							                	rightType = Types.TEXT;
							                	//System.out.println("Mudei o tipo para TEXT = "+rightType);
							                	
							                }
							            }
							         
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		public List<TerminalNode> OP() { return getTokens(UFABCGrammarParser.OP); }
		public TerminalNode OP(int i) {
			return getToken(UFABCGrammarParser.OP, i);
		}
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public ExprlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UFABCGrammarListener ) ((UFABCGrammarListener)listener).enterExprl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UFABCGrammarListener ) ((UFABCGrammarListener)listener).exitExprl(this);
		}
	}

	public final ExprlContext exprl() throws RecognitionException {
		ExprlContext _localctx = new ExprlContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_exprl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP) {
				{
				{
				setState(212);
				match(OP);
				 strExpr += _input.LT(-1).getText(); 
				setState(214);
				termo();
				 strExpr += _input.LT(-1).getText(); 
				}
				}
				setState(221);
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

	public static final String _serializedATN =
		"\u0004\u0001\u001e\u00df\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0004\u0000\u001d\b\u0000"+
		"\u000b\u0000\f\u0000\u001e\u0001\u0000\u0001\u0000\u0004\u0000#\b\u0000"+
		"\u000b\u0000\f\u0000$\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0005\u00012\b\u0001\n\u0001\f\u00015\t\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001<\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002G\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0004\u0003L\b\u0003\u000b\u0003\f\u0003M\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0004\u0003^\b\u0003\u000b\u0003\f\u0003_\u0003\u0003"+
		"b\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0004\u0004v\b\u0004\u000b\u0004\f\u0004w\u0003\u0004z\b"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0004\u0004\u007f\b\u0004\u000b"+
		"\u0004\f\u0004\u0080\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0004\u0005\u0095\b\u0005\u000b\u0005\f\u0005\u0096"+
		"\u0003\u0005\u0099\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0004\u0005\u009f\b\u0005\u000b\u0005\f\u0005\u00a0\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0004\u0005\u00a7\b\u0005\u000b\u0005\f"+
		"\u0005\u00a8\u0001\u0005\u0001\u0005\u0003\u0005\u00ad\b\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00d3"+
		"\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005"+
		"\u000b\u00da\b\u000b\n\u000b\f\u000b\u00dd\t\u000b\u0001\u000b\u0000\u0000"+
		"\f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0000\u0000"+
		"\u00e9\u0000\u0018\u0001\u0000\u0000\u0000\u0002*\u0001\u0000\u0000\u0000"+
		"\u0004F\u0001\u0000\u0000\u0000\u0006H\u0001\u0000\u0000\u0000\bg\u0001"+
		"\u0000\u0000\u0000\n\u0086\u0001\u0000\u0000\u0000\f\u00b1\u0001\u0000"+
		"\u0000\u0000\u000e\u00b8\u0001\u0000\u0000\u0000\u0010\u00bf\u0001\u0000"+
		"\u0000\u0000\u0012\u00c8\u0001\u0000\u0000\u0000\u0014\u00d2\u0001\u0000"+
		"\u0000\u0000\u0016\u00db\u0001\u0000\u0000\u0000\u0018\u0019\u0005\u0001"+
		"\u0000\u0000\u0019\u001a\u0005\u0015\u0000\u0000\u001a\u001c\u0006\u0000"+
		"\uffff\uffff\u0000\u001b\u001d\u0003\u0002\u0001\u0000\u001c\u001b\u0001"+
		"\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e\u001c\u0001"+
		"\u0000\u0000\u0000\u001e\u001f\u0001\u0000\u0000\u0000\u001f \u0001\u0000"+
		"\u0000\u0000 \"\u0005\u0002\u0000\u0000!#\u0003\u0004\u0002\u0000\"!\u0001"+
		"\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$\"\u0001\u0000\u0000\u0000"+
		"$%\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000&\'\u0005\u0003\u0000"+
		"\u0000\'(\u0005\u0004\u0000\u0000()\u0006\u0000\uffff\uffff\u0000)\u0001"+
		"\u0001\u0000\u0000\u0000*+\u0005\u0005\u0000\u0000+,\u0006\u0001\uffff"+
		"\uffff\u0000,-\u0005\u0015\u0000\u0000-3\u0006\u0001\uffff\uffff\u0000"+
		"./\u0005\u0017\u0000\u0000/0\u0005\u0015\u0000\u000002\u0006\u0001\uffff"+
		"\uffff\u00001.\u0001\u0000\u0000\u000025\u0001\u0000\u0000\u000031\u0001"+
		"\u0000\u0000\u000034\u0001\u0000\u0000\u000046\u0001\u0000\u0000\u0000"+
		"53\u0001\u0000\u0000\u00006;\u0005\u001b\u0000\u000078\u0005\u0006\u0000"+
		"\u00008<\u0006\u0001\uffff\uffff\u00009:\u0005\u0007\u0000\u0000:<\u0006"+
		"\u0001\uffff\uffff\u0000;7\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000"+
		"\u0000<=\u0001\u0000\u0000\u0000=>\u0006\u0001\uffff\uffff\u0000>?\u0005"+
		"\u0018\u0000\u0000?\u0003\u0001\u0000\u0000\u0000@G\u0003\f\u0006\u0000"+
		"AG\u0003\u000e\u0007\u0000BG\u0003\u0010\b\u0000CG\u0003\n\u0005\u0000"+
		"DG\u0003\b\u0004\u0000EG\u0003\u0006\u0003\u0000F@\u0001\u0000\u0000\u0000"+
		"FA\u0001\u0000\u0000\u0000FB\u0001\u0000\u0000\u0000FC\u0001\u0000\u0000"+
		"\u0000FD\u0001\u0000\u0000\u0000FE\u0001\u0000\u0000\u0000G\u0005\u0001"+
		"\u0000\u0000\u0000HI\u0005\b\u0000\u0000IK\u0006\u0003\uffff\uffff\u0000"+
		"JL\u0003\u0004\u0002\u0000KJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000"+
		"\u0000MK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NO\u0001\u0000"+
		"\u0000\u0000OP\u0006\u0003\uffff\uffff\u0000PQ\u0005\t\u0000\u0000QR\u0005"+
		"\u0019\u0000\u0000RS\u0003\u0012\t\u0000ST\u0005\u0014\u0000\u0000TU\u0006"+
		"\u0003\uffff\uffff\u0000Ua\u0003\u0012\t\u0000VW\u0005\u001e\u0000\u0000"+
		"WX\u0006\u0003\uffff\uffff\u0000XY\u0003\u0012\t\u0000YZ\u0005\u0014\u0000"+
		"\u0000Z[\u0006\u0003\uffff\uffff\u0000[\\\u0003\u0012\t\u0000\\^\u0001"+
		"\u0000\u0000\u0000]V\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000"+
		"_]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`b\u0001\u0000\u0000"+
		"\u0000a]\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000bc\u0001\u0000"+
		"\u0000\u0000cd\u0005\u001a\u0000\u0000de\u0005\u0018\u0000\u0000ef\u0006"+
		"\u0003\uffff\uffff\u0000f\u0007\u0001\u0000\u0000\u0000gh\u0005\n\u0000"+
		"\u0000hi\u0006\u0004\uffff\uffff\u0000ij\u0005\u0019\u0000\u0000jk\u0003"+
		"\u0012\t\u0000kl\u0005\u0014\u0000\u0000lm\u0006\u0004\uffff\uffff\u0000"+
		"my\u0003\u0012\t\u0000no\u0005\u001e\u0000\u0000op\u0006\u0004\uffff\uffff"+
		"\u0000pq\u0003\u0012\t\u0000qr\u0005\u0014\u0000\u0000rs\u0006\u0004\uffff"+
		"\uffff\u0000st\u0003\u0012\t\u0000tv\u0001\u0000\u0000\u0000un\u0001\u0000"+
		"\u0000\u0000vw\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000wx\u0001"+
		"\u0000\u0000\u0000xz\u0001\u0000\u0000\u0000yu\u0001\u0000\u0000\u0000"+
		"yz\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{|\u0005\u001a\u0000"+
		"\u0000|~\u0006\u0004\uffff\uffff\u0000}\u007f\u0003\u0004\u0002\u0000"+
		"~}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080~"+
		"\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0082"+
		"\u0001\u0000\u0000\u0000\u0082\u0083\u0006\u0004\uffff\uffff\u0000\u0083"+
		"\u0084\u0005\u000b\u0000\u0000\u0084\u0085\u0006\u0004\uffff\uffff\u0000"+
		"\u0085\t\u0001\u0000\u0000\u0000\u0086\u0087\u0005\f\u0000\u0000\u0087"+
		"\u0088\u0006\u0005\uffff\uffff\u0000\u0088\u0089\u0005\u0019\u0000\u0000"+
		"\u0089\u008a\u0003\u0012\t\u0000\u008a\u008b\u0005\u0014\u0000\u0000\u008b"+
		"\u008c\u0006\u0005\uffff\uffff\u0000\u008c\u0098\u0003\u0012\t\u0000\u008d"+
		"\u008e\u0005\u001e\u0000\u0000\u008e\u008f\u0006\u0005\uffff\uffff\u0000"+
		"\u008f\u0090\u0003\u0012\t\u0000\u0090\u0091\u0005\u0014\u0000\u0000\u0091"+
		"\u0092\u0006\u0005\uffff\uffff\u0000\u0092\u0093\u0003\u0012\t\u0000\u0093"+
		"\u0095\u0001\u0000\u0000\u0000\u0094\u008d\u0001\u0000\u0000\u0000\u0095"+
		"\u0096\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0096"+
		"\u0097\u0001\u0000\u0000\u0000\u0097\u0099\u0001\u0000\u0000\u0000\u0098"+
		"\u0094\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099"+
		"\u009a\u0001\u0000\u0000\u0000\u009a\u009b\u0005\u001a\u0000\u0000\u009b"+
		"\u009c\u0006\u0005\uffff\uffff\u0000\u009c\u009e\u0005\r\u0000\u0000\u009d"+
		"\u009f\u0003\u0004\u0002\u0000\u009e\u009d\u0001\u0000\u0000\u0000\u009f"+
		"\u00a0\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a0"+
		"\u00a1\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2"+
		"\u00ac\u0006\u0005\uffff\uffff\u0000\u00a3\u00a4\u0005\u000e\u0000\u0000"+
		"\u00a4\u00a6\u0006\u0005\uffff\uffff\u0000\u00a5\u00a7\u0003\u0004\u0002"+
		"\u0000\u00a6\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000"+
		"\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000"+
		"\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u00ab\u0006\u0005\uffff"+
		"\uffff\u0000\u00ab\u00ad\u0001\u0000\u0000\u0000\u00ac\u00a3\u0001\u0000"+
		"\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000"+
		"\u0000\u0000\u00ae\u00af\u0005\u000f\u0000\u0000\u00af\u00b0\u0006\u0005"+
		"\uffff\uffff\u0000\u00b0\u000b\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005"+
		"\u0015\u0000\u0000\u00b2\u00b3\u0006\u0006\uffff\uffff\u0000\u00b3\u00b4"+
		"\u0005\u0013\u0000\u0000\u00b4\u00b5\u0003\u0012\t\u0000\u00b5\u00b6\u0005"+
		"\u0018\u0000\u0000\u00b6\u00b7\u0006\u0006\uffff\uffff\u0000\u00b7\r\u0001"+
		"\u0000\u0000\u0000\u00b8\u00b9\u0005\u0010\u0000\u0000\u00b9\u00ba\u0005"+
		"\u0019\u0000\u0000\u00ba\u00bb\u0005\u0015\u0000\u0000\u00bb\u00bc\u0006"+
		"\u0007\uffff\uffff\u0000\u00bc\u00bd\u0005\u001a\u0000\u0000\u00bd\u00be"+
		"\u0005\u0018\u0000\u0000\u00be\u000f\u0001\u0000\u0000\u0000\u00bf\u00c0"+
		"\u0005\u0011\u0000\u0000\u00c0\u00c1\u0005\u0019\u0000\u0000\u00c1\u00c2"+
		"\u0003\u0014\n\u0000\u00c2\u00c3\u0006\b\uffff\uffff\u0000\u00c3\u00c4"+
		"\u0001\u0000\u0000\u0000\u00c4\u00c5\u0005\u001a\u0000\u0000\u00c5\u00c6"+
		"\u0005\u0018\u0000\u0000\u00c6\u00c7\u0006\b\uffff\uffff\u0000\u00c7\u0011"+
		"\u0001\u0000\u0000\u0000\u00c8\u00c9\u0003\u0014\n\u0000\u00c9\u00ca\u0006"+
		"\t\uffff\uffff\u0000\u00ca\u00cb\u0003\u0016\u000b\u0000\u00cb\u0013\u0001"+
		"\u0000\u0000\u0000\u00cc\u00cd\u0005\u0015\u0000\u0000\u00cd\u00d3\u0006"+
		"\n\uffff\uffff\u0000\u00ce\u00cf\u0005\u0016\u0000\u0000\u00cf\u00d3\u0006"+
		"\n\uffff\uffff\u0000\u00d0\u00d1\u0005\u001c\u0000\u0000\u00d1\u00d3\u0006"+
		"\n\uffff\uffff\u0000\u00d2\u00cc\u0001\u0000\u0000\u0000\u00d2\u00ce\u0001"+
		"\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d3\u0015\u0001"+
		"\u0000\u0000\u0000\u00d4\u00d5\u0005\u0012\u0000\u0000\u00d5\u00d6\u0006"+
		"\u000b\uffff\uffff\u0000\u00d6\u00d7\u0003\u0014\n\u0000\u00d7\u00d8\u0006"+
		"\u000b\uffff\uffff\u0000\u00d8\u00da\u0001\u0000\u0000\u0000\u00d9\u00d4"+
		"\u0001\u0000\u0000\u0000\u00da\u00dd\u0001\u0000\u0000\u0000\u00db\u00d9"+
		"\u0001\u0000\u0000\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc\u0017"+
		"\u0001\u0000\u0000\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u0012\u001e"+
		"$3;FM_awy\u0080\u0096\u0098\u00a0\u00a8\u00ac\u00d2\u00db";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}