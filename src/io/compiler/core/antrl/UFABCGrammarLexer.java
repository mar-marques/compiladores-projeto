// Generated from UFABCGrammar.g4 by ANTLR 4.13.2
package io.compiler.core.antrl;

	import java.util.ArrayList;
	import java.util.Stack;
	import java.util.HashMap;
	import io.compiler.types.*;
	import io.compiler.core.exceptions.*;
	import io.compiler.core.ast.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class UFABCGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, OP=14, OP_AT=15, OPREL=16, ID=17, 
		NUM=18, VIRG=19, PV=20, AP=21, FP=22, DP=23, TEXTO=24, WS=25, OPL=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "OP", "OP_AT", "OPREL", "ID", "NUM", 
			"VIRG", "PV", "AP", "FP", "DP", "TEXTO", "WS", "OPL"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'programa'", "'inicio'", "'fim'", "'fimprog'", "'declare'", "'number'", 
			"'text'", "'se'", "'entao'", "'senao'", "'fimse'", "'leia'", "'escreva'", 
			null, "':='", null, null, null, "','", "';'", "'('", "')'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "OP", "OP_AT", "OPREL", "ID", "NUM", "VIRG", "PV", "AP", 
			"FP", "DP", "TEXTO", "WS", "OPL"
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


	    private HashMap<String,Var> symbolTable = new HashMap<String, Var>();
	    private ArrayList<Var> currentDecl = new ArrayList<Var>();
	    private Types currentType;
	    private Types leftType=null, rightType=null;
	    private Program program = new Program();
	    private String strExpr = "";
	    private IfCommand currentIfCommand;
	    
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


	public UFABCGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "UFABCGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u001a\u00c8\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u0097\b\u000f\u0001\u0010\u0001\u0010"+
		"\u0005\u0010\u009b\b\u0010\n\u0010\f\u0010\u009e\t\u0010\u0001\u0011\u0004"+
		"\u0011\u00a1\b\u0011\u000b\u0011\f\u0011\u00a2\u0001\u0011\u0001\u0011"+
		"\u0004\u0011\u00a7\b\u0011\u000b\u0011\f\u0011\u00a8\u0003\u0011\u00ab"+
		"\b\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001"+
		"\u0017\u0005\u0017\u00b9\b\u0017\n\u0017\f\u0017\u00bc\t\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0003\u0019\u00c7\b\u0019\u0000\u0000\u001a\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d"+
		"\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/"+
		"\u00181\u00193\u001a\u0001\u0000\u0007\u0003\u0000*+--//\u0002\u0000<"+
		"<>>\u0001\u0000az\u0003\u000009AZaz\u0001\u000009\u0005\u0000  ,.09AZ"+
		"az\u0003\u0000\t\n\r\r  \u00d1\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000"+
		"\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000"+
		"\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-"+
		"\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000"+
		"\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00015\u0001\u0000\u0000\u0000"+
		"\u0003>\u0001\u0000\u0000\u0000\u0005E\u0001\u0000\u0000\u0000\u0007I"+
		"\u0001\u0000\u0000\u0000\tQ\u0001\u0000\u0000\u0000\u000bY\u0001\u0000"+
		"\u0000\u0000\r`\u0001\u0000\u0000\u0000\u000fe\u0001\u0000\u0000\u0000"+
		"\u0011h\u0001\u0000\u0000\u0000\u0013n\u0001\u0000\u0000\u0000\u0015t"+
		"\u0001\u0000\u0000\u0000\u0017z\u0001\u0000\u0000\u0000\u0019\u007f\u0001"+
		"\u0000\u0000\u0000\u001b\u0087\u0001\u0000\u0000\u0000\u001d\u0089\u0001"+
		"\u0000\u0000\u0000\u001f\u0096\u0001\u0000\u0000\u0000!\u0098\u0001\u0000"+
		"\u0000\u0000#\u00a0\u0001\u0000\u0000\u0000%\u00ac\u0001\u0000\u0000\u0000"+
		"\'\u00ae\u0001\u0000\u0000\u0000)\u00b0\u0001\u0000\u0000\u0000+\u00b2"+
		"\u0001\u0000\u0000\u0000-\u00b4\u0001\u0000\u0000\u0000/\u00b6\u0001\u0000"+
		"\u0000\u00001\u00bf\u0001\u0000\u0000\u00003\u00c6\u0001\u0000\u0000\u0000"+
		"56\u0005p\u0000\u000067\u0005r\u0000\u000078\u0005o\u0000\u000089\u0005"+
		"g\u0000\u00009:\u0005r\u0000\u0000:;\u0005a\u0000\u0000;<\u0005m\u0000"+
		"\u0000<=\u0005a\u0000\u0000=\u0002\u0001\u0000\u0000\u0000>?\u0005i\u0000"+
		"\u0000?@\u0005n\u0000\u0000@A\u0005i\u0000\u0000AB\u0005c\u0000\u0000"+
		"BC\u0005i\u0000\u0000CD\u0005o\u0000\u0000D\u0004\u0001\u0000\u0000\u0000"+
		"EF\u0005f\u0000\u0000FG\u0005i\u0000\u0000GH\u0005m\u0000\u0000H\u0006"+
		"\u0001\u0000\u0000\u0000IJ\u0005f\u0000\u0000JK\u0005i\u0000\u0000KL\u0005"+
		"m\u0000\u0000LM\u0005p\u0000\u0000MN\u0005r\u0000\u0000NO\u0005o\u0000"+
		"\u0000OP\u0005g\u0000\u0000P\b\u0001\u0000\u0000\u0000QR\u0005d\u0000"+
		"\u0000RS\u0005e\u0000\u0000ST\u0005c\u0000\u0000TU\u0005l\u0000\u0000"+
		"UV\u0005a\u0000\u0000VW\u0005r\u0000\u0000WX\u0005e\u0000\u0000X\n\u0001"+
		"\u0000\u0000\u0000YZ\u0005n\u0000\u0000Z[\u0005u\u0000\u0000[\\\u0005"+
		"m\u0000\u0000\\]\u0005b\u0000\u0000]^\u0005e\u0000\u0000^_\u0005r\u0000"+
		"\u0000_\f\u0001\u0000\u0000\u0000`a\u0005t\u0000\u0000ab\u0005e\u0000"+
		"\u0000bc\u0005x\u0000\u0000cd\u0005t\u0000\u0000d\u000e\u0001\u0000\u0000"+
		"\u0000ef\u0005s\u0000\u0000fg\u0005e\u0000\u0000g\u0010\u0001\u0000\u0000"+
		"\u0000hi\u0005e\u0000\u0000ij\u0005n\u0000\u0000jk\u0005t\u0000\u0000"+
		"kl\u0005a\u0000\u0000lm\u0005o\u0000\u0000m\u0012\u0001\u0000\u0000\u0000"+
		"no\u0005s\u0000\u0000op\u0005e\u0000\u0000pq\u0005n\u0000\u0000qr\u0005"+
		"a\u0000\u0000rs\u0005o\u0000\u0000s\u0014\u0001\u0000\u0000\u0000tu\u0005"+
		"f\u0000\u0000uv\u0005i\u0000\u0000vw\u0005m\u0000\u0000wx\u0005s\u0000"+
		"\u0000xy\u0005e\u0000\u0000y\u0016\u0001\u0000\u0000\u0000z{\u0005l\u0000"+
		"\u0000{|\u0005e\u0000\u0000|}\u0005i\u0000\u0000}~\u0005a\u0000\u0000"+
		"~\u0018\u0001\u0000\u0000\u0000\u007f\u0080\u0005e\u0000\u0000\u0080\u0081"+
		"\u0005s\u0000\u0000\u0081\u0082\u0005c\u0000\u0000\u0082\u0083\u0005r"+
		"\u0000\u0000\u0083\u0084\u0005e\u0000\u0000\u0084\u0085\u0005v\u0000\u0000"+
		"\u0085\u0086\u0005a\u0000\u0000\u0086\u001a\u0001\u0000\u0000\u0000\u0087"+
		"\u0088\u0007\u0000\u0000\u0000\u0088\u001c\u0001\u0000\u0000\u0000\u0089"+
		"\u008a\u0005:\u0000\u0000\u008a\u008b\u0005=\u0000\u0000\u008b\u001e\u0001"+
		"\u0000\u0000\u0000\u008c\u0097\u0007\u0001\u0000\u0000\u008d\u008e\u0005"+
		">\u0000\u0000\u008e\u0097\u0005=\u0000\u0000\u008f\u0090\u0005<\u0000"+
		"\u0000\u0090\u0091\u0005=\u0000\u0000\u0091\u0097\u0005 \u0000\u0000\u0092"+
		"\u0093\u0005<\u0000\u0000\u0093\u0097\u0005>\u0000\u0000\u0094\u0095\u0005"+
		"=\u0000\u0000\u0095\u0097\u0005=\u0000\u0000\u0096\u008c\u0001\u0000\u0000"+
		"\u0000\u0096\u008d\u0001\u0000\u0000\u0000\u0096\u008f\u0001\u0000\u0000"+
		"\u0000\u0096\u0092\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000\u0000"+
		"\u0000\u0097 \u0001\u0000\u0000\u0000\u0098\u009c\u0007\u0002\u0000\u0000"+
		"\u0099\u009b\u0007\u0003\u0000\u0000\u009a\u0099\u0001\u0000\u0000\u0000"+
		"\u009b\u009e\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000"+
		"\u009c\u009d\u0001\u0000\u0000\u0000\u009d\"\u0001\u0000\u0000\u0000\u009e"+
		"\u009c\u0001\u0000\u0000\u0000\u009f\u00a1\u0007\u0004\u0000\u0000\u00a0"+
		"\u009f\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3"+
		"\u00aa\u0001\u0000\u0000\u0000\u00a4\u00a6\u0005.\u0000\u0000\u00a5\u00a7"+
		"\u0007\u0004\u0000\u0000\u00a6\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a8"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a9"+
		"\u0001\u0000\u0000\u0000\u00a9\u00ab\u0001\u0000\u0000\u0000\u00aa\u00a4"+
		"\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab$\u0001"+
		"\u0000\u0000\u0000\u00ac\u00ad\u0005,\u0000\u0000\u00ad&\u0001\u0000\u0000"+
		"\u0000\u00ae\u00af\u0005;\u0000\u0000\u00af(\u0001\u0000\u0000\u0000\u00b0"+
		"\u00b1\u0005(\u0000\u0000\u00b1*\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005"+
		")\u0000\u0000\u00b3,\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005:\u0000"+
		"\u0000\u00b5.\u0001\u0000\u0000\u0000\u00b6\u00ba\u0005\"\u0000\u0000"+
		"\u00b7\u00b9\u0007\u0005\u0000\u0000\u00b8\u00b7\u0001\u0000\u0000\u0000"+
		"\u00b9\u00bc\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000"+
		"\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb\u00bd\u0001\u0000\u0000\u0000"+
		"\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bd\u00be\u0005\"\u0000\u0000\u00be"+
		"0\u0001\u0000\u0000\u0000\u00bf\u00c0\u0007\u0006\u0000\u0000\u00c0\u00c1"+
		"\u0001\u0000\u0000\u0000\u00c1\u00c2\u0006\u0018\u0000\u0000\u00c22\u0001"+
		"\u0000\u0000\u0000\u00c3\u00c7\u0005E\u0000\u0000\u00c4\u00c5\u0005O\u0000"+
		"\u0000\u00c5\u00c7\u0005U\u0000\u0000\u00c6\u00c3\u0001\u0000\u0000\u0000"+
		"\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c74\u0001\u0000\u0000\u0000\n"+
		"\u0000\u0096\u009a\u009c\u00a2\u00a8\u00aa\u00b8\u00ba\u00c6\u0001\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}