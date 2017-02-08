// Generated from LSystemDescriptor.g4 by ANTLR 4.6
package model.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LSystemDescriptorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENT=1, WS=2, ALPHABET_SYMBOL=3, UPPER_CHAR=4, DIGIT=5, INTEGER=6, 
		REAL=7, SPECIAL_CHAR=8, OP_ALPHABET=9, OP_AXIOM=10, OP_RULES=11, OP_ANGLE=12, 
		OP_FORWARD_SIZE=13, OP_SEPARATOR=14, OP_COMMAND=15, OP_RULE=16, OP_SIGNAL=17, 
		OP_FLOAT_SEPARATOR=18, OP_SYMBOL=19, OP_FORWARD=20, OP_FORWARD_NODRAW=21, 
		OP_ROTATE_CCW=22, OP_ROTATE_CW=23, OP_RESET=24, OP_PUSH=25, OP_POP=26, 
		OP_FORGET=27, OTHER_CHAR=28;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"COMMENT", "WS", "ALPHABET_SYMBOL", "UPPER_CHAR", "DIGIT", "INTEGER", 
		"REAL", "SPECIAL_CHAR", "OP_ALPHABET", "OP_AXIOM", "OP_RULES", "OP_ANGLE", 
		"OP_FORWARD_SIZE", "OP_SEPARATOR", "OP_COMMAND", "OP_RULE", "OP_SIGNAL", 
		"OP_FLOAT_SEPARATOR", "OP_SYMBOL", "OP_FORWARD", "OP_FORWARD_NODRAW", 
		"OP_ROTATE_CCW", "OP_ROTATE_CW", "OP_RESET", "OP_PUSH", "OP_POP", "OP_FORGET", 
		"OTHER_CHAR"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, "'alphabet:'", "'axiom:'", 
		"'rules:'", "'angle:'", "'size:'", "','", "':'", "'->'", "'-'", "'.'", 
		"'''", null, null, null, "'RIGHT'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "COMMENT", "WS", "ALPHABET_SYMBOL", "UPPER_CHAR", "DIGIT", "INTEGER", 
		"REAL", "SPECIAL_CHAR", "OP_ALPHABET", "OP_AXIOM", "OP_RULES", "OP_ANGLE", 
		"OP_FORWARD_SIZE", "OP_SEPARATOR", "OP_COMMAND", "OP_RULE", "OP_SIGNAL", 
		"OP_FLOAT_SEPARATOR", "OP_SYMBOL", "OP_FORWARD", "OP_FORWARD_NODRAW", 
		"OP_ROTATE_CCW", "OP_ROTATE_CW", "OP_RESET", "OP_PUSH", "OP_POP", "OP_FORGET", 
		"OTHER_CHAR"
	};
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


	public LSystemDescriptorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LSystemDescriptor.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\36\u011f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\2\7\2@\n\2"+
		"\f\2\16\2C\13\2\3\2\3\2\3\3\6\3H\n\3\r\3\16\3I\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\5\4W\n\4\3\5\3\5\3\6\3\6\3\7\5\7^\n\7\3\7\6\7a\n"+
		"\7\r\7\16\7b\3\b\3\b\3\b\6\bh\n\b\r\b\16\bi\5\bl\n\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t~\n\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3"+
		"\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00bd"+
		"\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00ca"+
		"\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00d6\n\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\5\31\u00e7\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u00f9\n\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0108\n\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0119"+
		"\n\34\3\35\6\35\u011c\n\35\r\35\16\35\u011d\3\u011d\2\36\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36\3\2\4\4\2\f\f\17"+
		"\17\5\2\13\f\17\17\"\"\u0133\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\3;\3\2\2\2\5G\3\2\2\2\7V\3\2\2\2\tX\3\2\2\2\13"+
		"Z\3\2\2\2\r]\3\2\2\2\17d\3\2\2\2\21}\3\2\2\2\23\177\3\2\2\2\25\u0089\3"+
		"\2\2\2\27\u0090\3\2\2\2\31\u0097\3\2\2\2\33\u009e\3\2\2\2\35\u00a4\3\2"+
		"\2\2\37\u00a6\3\2\2\2!\u00a8\3\2\2\2#\u00ab\3\2\2\2%\u00ad\3\2\2\2\'\u00af"+
		"\3\2\2\2)\u00bc\3\2\2\2+\u00c9\3\2\2\2-\u00d5\3\2\2\2/\u00d7\3\2\2\2\61"+
		"\u00e6\3\2\2\2\63\u00f8\3\2\2\2\65\u0107\3\2\2\2\67\u0118\3\2\2\29\u011b"+
		"\3\2\2\2;<\7\61\2\2<=\7\61\2\2=A\3\2\2\2>@\n\2\2\2?>\3\2\2\2@C\3\2\2\2"+
		"A?\3\2\2\2AB\3\2\2\2BD\3\2\2\2CA\3\2\2\2DE\b\2\2\2E\4\3\2\2\2FH\t\3\2"+
		"\2GF\3\2\2\2HI\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JK\3\2\2\2KL\b\3\2\2L\6\3\2"+
		"\2\2MN\5\'\24\2NO\5\t\5\2OP\5\'\24\2PW\3\2\2\2QR\5\'\24\2RS\5\13\6\2S"+
		"T\5\'\24\2TW\3\2\2\2UW\5\21\t\2VM\3\2\2\2VQ\3\2\2\2VU\3\2\2\2W\b\3\2\2"+
		"\2XY\4C\\\2Y\n\3\2\2\2Z[\4\62;\2[\f\3\2\2\2\\^\5#\22\2]\\\3\2\2\2]^\3"+
		"\2\2\2^`\3\2\2\2_a\5\13\6\2`_\3\2\2\2ab\3\2\2\2b`\3\2\2\2bc\3\2\2\2c\16"+
		"\3\2\2\2dk\5\r\7\2eg\5%\23\2fh\5\13\6\2gf\3\2\2\2hi\3\2\2\2ig\3\2\2\2"+
		"ij\3\2\2\2jl\3\2\2\2ke\3\2\2\2kl\3\2\2\2l\20\3\2\2\2mn\5\'\24\2no\7-\2"+
		"\2op\5\'\24\2p~\3\2\2\2qr\5\'\24\2rs\7/\2\2st\5\'\24\2t~\3\2\2\2uv\5\'"+
		"\24\2vw\7]\2\2wx\5\'\24\2x~\3\2\2\2yz\5\'\24\2z{\7_\2\2{|\5\'\24\2|~\3"+
		"\2\2\2}m\3\2\2\2}q\3\2\2\2}u\3\2\2\2}y\3\2\2\2~\22\3\2\2\2\177\u0080\7"+
		"c\2\2\u0080\u0081\7n\2\2\u0081\u0082\7r\2\2\u0082\u0083\7j\2\2\u0083\u0084"+
		"\7c\2\2\u0084\u0085\7d\2\2\u0085\u0086\7g\2\2\u0086\u0087\7v\2\2\u0087"+
		"\u0088\7<\2\2\u0088\24\3\2\2\2\u0089\u008a\7c\2\2\u008a\u008b\7z\2\2\u008b"+
		"\u008c\7k\2\2\u008c\u008d\7q\2\2\u008d\u008e\7o\2\2\u008e\u008f\7<\2\2"+
		"\u008f\26\3\2\2\2\u0090\u0091\7t\2\2\u0091\u0092\7w\2\2\u0092\u0093\7"+
		"n\2\2\u0093\u0094\7g\2\2\u0094\u0095\7u\2\2\u0095\u0096\7<\2\2\u0096\30"+
		"\3\2\2\2\u0097\u0098\7c\2\2\u0098\u0099\7p\2\2\u0099\u009a\7i\2\2\u009a"+
		"\u009b\7n\2\2\u009b\u009c\7g\2\2\u009c\u009d\7<\2\2\u009d\32\3\2\2\2\u009e"+
		"\u009f\7u\2\2\u009f\u00a0\7k\2\2\u00a0\u00a1\7|\2\2\u00a1\u00a2\7g\2\2"+
		"\u00a2\u00a3\7<\2\2\u00a3\34\3\2\2\2\u00a4\u00a5\7.\2\2\u00a5\36\3\2\2"+
		"\2\u00a6\u00a7\7<\2\2\u00a7 \3\2\2\2\u00a8\u00a9\7/\2\2\u00a9\u00aa\7"+
		"@\2\2\u00aa\"\3\2\2\2\u00ab\u00ac\7/\2\2\u00ac$\3\2\2\2\u00ad\u00ae\7"+
		"\60\2\2\u00ae&\3\2\2\2\u00af\u00b0\7)\2\2\u00b0(\3\2\2\2\u00b1\u00b2\7"+
		"O\2\2\u00b2\u00b3\7Q\2\2\u00b3\u00b4\7X\2\2\u00b4\u00bd\7G\2\2\u00b5\u00b6"+
		"\7H\2\2\u00b6\u00b7\7Q\2\2\u00b7\u00b8\7T\2\2\u00b8\u00b9\7Y\2\2\u00b9"+
		"\u00ba\7C\2\2\u00ba\u00bb\7T\2\2\u00bb\u00bd\7F\2\2\u00bc\u00b1\3\2\2"+
		"\2\u00bc\u00b5\3\2\2\2\u00bd*\3\2\2\2\u00be\u00bf\7o\2\2\u00bf\u00c0\7"+
		"q\2\2\u00c0\u00c1\7x\2\2\u00c1\u00ca\7g\2\2\u00c2\u00c3\7h\2\2\u00c3\u00c4"+
		"\7q\2\2\u00c4\u00c5\7t\2\2\u00c5\u00c6\7y\2\2\u00c6\u00c7\7c\2\2\u00c7"+
		"\u00c8\7t\2\2\u00c8\u00ca\7f\2\2\u00c9\u00be\3\2\2\2\u00c9\u00c2\3\2\2"+
		"\2\u00ca,\3\2\2\2\u00cb\u00cc\7T\2\2\u00cc\u00cd\7Q\2\2\u00cd\u00ce\7"+
		"V\2\2\u00ce\u00cf\7C\2\2\u00cf\u00d0\7V\2\2\u00d0\u00d6\7G\2\2\u00d1\u00d2"+
		"\7N\2\2\u00d2\u00d3\7G\2\2\u00d3\u00d4\7H\2\2\u00d4\u00d6\7V\2\2\u00d5"+
		"\u00cb\3\2\2\2\u00d5\u00d1\3\2\2\2\u00d6.\3\2\2\2\u00d7\u00d8\7T\2\2\u00d8"+
		"\u00d9\7K\2\2\u00d9\u00da\7I\2\2\u00da\u00db\7J\2\2\u00db\u00dc\7V\2\2"+
		"\u00dc\60\3\2\2\2\u00dd\u00de\7T\2\2\u00de\u00df\7G\2\2\u00df\u00e0\7"+
		"U\2\2\u00e0\u00e1\7G\2\2\u00e1\u00e7\7V\2\2\u00e2\u00e3\7J\2\2\u00e3\u00e4"+
		"\7Q\2\2\u00e4\u00e5\7O\2\2\u00e5\u00e7\7G\2\2\u00e6\u00dd\3\2\2\2\u00e6"+
		"\u00e2\3\2\2\2\u00e7\62\3\2\2\2\u00e8\u00e9\7R\2\2\u00e9\u00ea\7W\2\2"+
		"\u00ea\u00eb\7U\2\2\u00eb\u00f9\7J\2\2\u00ec\u00ed\7U\2\2\u00ed\u00ee"+
		"\7C\2\2\u00ee\u00ef\7X\2\2\u00ef\u00f9\7G\2\2\u00f0\u00f1\7T\2\2\u00f1"+
		"\u00f2\7G\2\2\u00f2\u00f3\7O\2\2\u00f3\u00f4\7G\2\2\u00f4\u00f5\7O\2\2"+
		"\u00f5\u00f6\7D\2\2\u00f6\u00f7\7G\2\2\u00f7\u00f9\7T\2\2\u00f8\u00e8"+
		"\3\2\2\2\u00f8\u00ec\3\2\2\2\u00f8\u00f0\3\2\2\2\u00f9\64\3\2\2\2\u00fa"+
		"\u00fb\7R\2\2\u00fb\u00fc\7Q\2\2\u00fc\u0108\7R\2\2\u00fd\u00fe\7N\2\2"+
		"\u00fe\u00ff\7Q\2\2\u00ff\u0100\7C\2\2\u0100\u0108\7F\2\2\u0101\u0102"+
		"\7I\2\2\u0102\u0103\7Q\2\2\u0103\u0104\7D\2\2\u0104\u0105\7C\2\2\u0105"+
		"\u0106\7E\2\2\u0106\u0108\7M\2\2\u0107\u00fa\3\2\2\2\u0107\u00fd\3\2\2"+
		"\2\u0107\u0101\3\2\2\2\u0108\66\3\2\2\2\u0109\u010a\7H\2\2\u010a\u010b"+
		"\7Q\2\2\u010b\u010c\7T\2\2\u010c\u010d\7I\2\2\u010d\u010e\7G\2\2\u010e"+
		"\u0119\7V\2\2\u010f\u0110\7R\2\2\u0110\u0111\7Q\2\2\u0111\u0112\7R\2\2"+
		"\u0112\u0113\7P\2\2\u0113\u0114\7Q\2\2\u0114\u0115\7O\2\2\u0115\u0116"+
		"\7Q\2\2\u0116\u0117\7X\2\2\u0117\u0119\7G\2\2\u0118\u0109\3\2\2\2\u0118"+
		"\u010f\3\2\2\2\u01198\3\2\2\2\u011a\u011c\13\2\2\2\u011b\u011a\3\2\2\2"+
		"\u011c\u011d\3\2\2\2\u011d\u011e\3\2\2\2\u011d\u011b\3\2\2\2\u011e:\3"+
		"\2\2\2\23\2AIV]bik}\u00bc\u00c9\u00d5\u00e6\u00f8\u0107\u0118\u011d\3"+
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