// Generated from Expr.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, NEWLINE=14, INT=15, REAL=16, ID=17, 
		FUNCT=18, WS=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "NEWLINE", "INT", "REAL", "ID", "FUNCT", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'min'", "'max'", "'pow'", "'sqrt'", "'('", "','", "')'", 
			"'*'", "'/'", "'+'", "'-'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "NEWLINE", "INT", "REAL", "ID", "FUNCT", "WS"
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


	public ExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\25\u0088\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\6\17N\n\17\r\17\16\17O\3\20\3\20"+
		"\5\20T\n\20\3\20\3\20\7\20X\n\20\f\20\16\20[\13\20\5\20]\n\20\3\21\5\21"+
		"`\n\21\3\21\6\21c\n\21\r\21\16\21d\3\21\3\21\7\21i\n\21\f\21\16\21l\13"+
		"\21\3\22\6\22o\n\22\r\22\16\22p\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\5\23\u0080\n\23\3\24\6\24\u0083\n\24\r\24\16"+
		"\24\u0084\3\24\3\24\2\2\25\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25\3\2\7\4\2\f\f\17\17\3"+
		"\2\63;\3\2\62;\4\2C\\c|\5\2\13\f\17\17\"\"\2\u0093\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\3)\3\2\2\2\5+\3\2\2\2\7/\3\2\2\2\t\63\3\2\2\2\13\67\3\2\2\2\r<"+
		"\3\2\2\2\17>\3\2\2\2\21@\3\2\2\2\23B\3\2\2\2\25D\3\2\2\2\27F\3\2\2\2\31"+
		"H\3\2\2\2\33J\3\2\2\2\35M\3\2\2\2\37\\\3\2\2\2!_\3\2\2\2#n\3\2\2\2%\177"+
		"\3\2\2\2\'\u0082\3\2\2\2)*\7=\2\2*\4\3\2\2\2+,\7o\2\2,-\7k\2\2-.\7p\2"+
		"\2.\6\3\2\2\2/\60\7o\2\2\60\61\7c\2\2\61\62\7z\2\2\62\b\3\2\2\2\63\64"+
		"\7r\2\2\64\65\7q\2\2\65\66\7y\2\2\66\n\3\2\2\2\678\7u\2\289\7s\2\29:\7"+
		"t\2\2:;\7v\2\2;\f\3\2\2\2<=\7*\2\2=\16\3\2\2\2>?\7.\2\2?\20\3\2\2\2@A"+
		"\7+\2\2A\22\3\2\2\2BC\7,\2\2C\24\3\2\2\2DE\7\61\2\2E\26\3\2\2\2FG\7-\2"+
		"\2G\30\3\2\2\2HI\7/\2\2I\32\3\2\2\2JK\7?\2\2K\34\3\2\2\2LN\t\2\2\2ML\3"+
		"\2\2\2NO\3\2\2\2OM\3\2\2\2OP\3\2\2\2P\36\3\2\2\2Q]\7\62\2\2RT\7/\2\2S"+
		"R\3\2\2\2ST\3\2\2\2TU\3\2\2\2UY\t\3\2\2VX\t\4\2\2WV\3\2\2\2X[\3\2\2\2"+
		"YW\3\2\2\2YZ\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2\\Q\3\2\2\2\\S\3\2\2\2] \3\2\2"+
		"\2^`\7/\2\2_^\3\2\2\2_`\3\2\2\2`b\3\2\2\2ac\t\4\2\2ba\3\2\2\2cd\3\2\2"+
		"\2db\3\2\2\2de\3\2\2\2ef\3\2\2\2fj\7\60\2\2gi\t\4\2\2hg\3\2\2\2il\3\2"+
		"\2\2jh\3\2\2\2jk\3\2\2\2k\"\3\2\2\2lj\3\2\2\2mo\t\5\2\2nm\3\2\2\2op\3"+
		"\2\2\2pn\3\2\2\2pq\3\2\2\2q$\3\2\2\2rs\7o\2\2st\7k\2\2t\u0080\7p\2\2u"+
		"v\7o\2\2vw\7c\2\2w\u0080\7z\2\2xy\7r\2\2yz\7q\2\2z\u0080\7y\2\2{|\7u\2"+
		"\2|}\7s\2\2}~\7t\2\2~\u0080\7v\2\2\177r\3\2\2\2\177u\3\2\2\2\177x\3\2"+
		"\2\2\177{\3\2\2\2\u0080&\3\2\2\2\u0081\u0083\t\6\2\2\u0082\u0081\3\2\2"+
		"\2\u0083\u0084\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086"+
		"\3\2\2\2\u0086\u0087\b\24\2\2\u0087(\3\2\2\2\r\2OSY\\_djp\177\u0084\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}