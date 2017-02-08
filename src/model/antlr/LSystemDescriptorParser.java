// Generated from LSystemDescriptor.g4 by ANTLR 4.6
package model.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LSystemDescriptorParser extends Parser {
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
	public static final int
		RULE_description = 0, RULE_alphabet = 1, RULE_symbolWithCommand = 2, RULE_command = 3, 
		RULE_axiom = 4, RULE_rules = 5, RULE_singleRule = 6, RULE_settings = 7, 
		RULE_angle = 8, RULE_size = 9;
	public static final String[] ruleNames = {
		"description", "alphabet", "symbolWithCommand", "command", "axiom", "rules", 
		"singleRule", "settings", "angle", "size"
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

	@Override
	public String getGrammarFileName() { return "LSystemDescriptor.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LSystemDescriptorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class DescriptionContext extends ParserRuleContext {
		public AlphabetContext alphabet() {
			return getRuleContext(AlphabetContext.class,0);
		}
		public AxiomContext axiom() {
			return getRuleContext(AxiomContext.class,0);
		}
		public RulesContext rules() {
			return getRuleContext(RulesContext.class,0);
		}
		public SettingsContext settings() {
			return getRuleContext(SettingsContext.class,0);
		}
		public DescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_description; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSystemDescriptorListener ) ((LSystemDescriptorListener)listener).enterDescription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSystemDescriptorListener ) ((LSystemDescriptorListener)listener).exitDescription(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSystemDescriptorVisitor ) return ((LSystemDescriptorVisitor<? extends T>)visitor).visitDescription(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescriptionContext description() throws RecognitionException {
		DescriptionContext _localctx = new DescriptionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_description);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			alphabet();
			setState(21);
			axiom();
			setState(22);
			rules();
			setState(23);
			settings();
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

	public static class AlphabetContext extends ParserRuleContext {
		public TerminalNode OP_ALPHABET() { return getToken(LSystemDescriptorParser.OP_ALPHABET, 0); }
		public List<SymbolWithCommandContext> symbolWithCommand() {
			return getRuleContexts(SymbolWithCommandContext.class);
		}
		public SymbolWithCommandContext symbolWithCommand(int i) {
			return getRuleContext(SymbolWithCommandContext.class,i);
		}
		public List<TerminalNode> OP_SEPARATOR() { return getTokens(LSystemDescriptorParser.OP_SEPARATOR); }
		public TerminalNode OP_SEPARATOR(int i) {
			return getToken(LSystemDescriptorParser.OP_SEPARATOR, i);
		}
		public AlphabetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alphabet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSystemDescriptorListener ) ((LSystemDescriptorListener)listener).enterAlphabet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSystemDescriptorListener ) ((LSystemDescriptorListener)listener).exitAlphabet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSystemDescriptorVisitor ) return ((LSystemDescriptorVisitor<? extends T>)visitor).visitAlphabet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlphabetContext alphabet() throws RecognitionException {
		AlphabetContext _localctx = new AlphabetContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_alphabet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			match(OP_ALPHABET);
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALPHABET_SYMBOL) {
				{
				setState(26);
				symbolWithCommand();
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OP_SEPARATOR) {
					{
					{
					setState(27);
					match(OP_SEPARATOR);
					setState(28);
					symbolWithCommand();
					}
					}
					setState(33);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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

	public static class SymbolWithCommandContext extends ParserRuleContext {
		public TerminalNode ALPHABET_SYMBOL() { return getToken(LSystemDescriptorParser.ALPHABET_SYMBOL, 0); }
		public TerminalNode OP_COMMAND() { return getToken(LSystemDescriptorParser.OP_COMMAND, 0); }
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public SymbolWithCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbolWithCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSystemDescriptorListener ) ((LSystemDescriptorListener)listener).enterSymbolWithCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSystemDescriptorListener ) ((LSystemDescriptorListener)listener).exitSymbolWithCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSystemDescriptorVisitor ) return ((LSystemDescriptorVisitor<? extends T>)visitor).visitSymbolWithCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SymbolWithCommandContext symbolWithCommand() throws RecognitionException {
		SymbolWithCommandContext _localctx = new SymbolWithCommandContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_symbolWithCommand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(ALPHABET_SYMBOL);
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_COMMAND) {
				{
				setState(37);
				match(OP_COMMAND);
				setState(38);
				command();
				}
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

	public static class CommandContext extends ParserRuleContext {
		public TerminalNode OP_FORWARD() { return getToken(LSystemDescriptorParser.OP_FORWARD, 0); }
		public TerminalNode OP_FORWARD_NODRAW() { return getToken(LSystemDescriptorParser.OP_FORWARD_NODRAW, 0); }
		public TerminalNode OP_ROTATE_CCW() { return getToken(LSystemDescriptorParser.OP_ROTATE_CCW, 0); }
		public TerminalNode OP_ROTATE_CW() { return getToken(LSystemDescriptorParser.OP_ROTATE_CW, 0); }
		public TerminalNode OP_RESET() { return getToken(LSystemDescriptorParser.OP_RESET, 0); }
		public TerminalNode OP_PUSH() { return getToken(LSystemDescriptorParser.OP_PUSH, 0); }
		public TerminalNode OP_POP() { return getToken(LSystemDescriptorParser.OP_POP, 0); }
		public TerminalNode OP_FORGET() { return getToken(LSystemDescriptorParser.OP_FORGET, 0); }
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSystemDescriptorListener ) ((LSystemDescriptorListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSystemDescriptorListener ) ((LSystemDescriptorListener)listener).exitCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSystemDescriptorVisitor ) return ((LSystemDescriptorVisitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_command);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_FORWARD) | (1L << OP_FORWARD_NODRAW) | (1L << OP_ROTATE_CCW) | (1L << OP_ROTATE_CW) | (1L << OP_RESET) | (1L << OP_PUSH) | (1L << OP_POP) | (1L << OP_FORGET))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class AxiomContext extends ParserRuleContext {
		public TerminalNode OP_AXIOM() { return getToken(LSystemDescriptorParser.OP_AXIOM, 0); }
		public List<TerminalNode> ALPHABET_SYMBOL() { return getTokens(LSystemDescriptorParser.ALPHABET_SYMBOL); }
		public TerminalNode ALPHABET_SYMBOL(int i) {
			return getToken(LSystemDescriptorParser.ALPHABET_SYMBOL, i);
		}
		public AxiomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_axiom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSystemDescriptorListener ) ((LSystemDescriptorListener)listener).enterAxiom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSystemDescriptorListener ) ((LSystemDescriptorListener)listener).exitAxiom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSystemDescriptorVisitor ) return ((LSystemDescriptorVisitor<? extends T>)visitor).visitAxiom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AxiomContext axiom() throws RecognitionException {
		AxiomContext _localctx = new AxiomContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_axiom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(OP_AXIOM);
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ALPHABET_SYMBOL) {
				{
				{
				setState(44);
				match(ALPHABET_SYMBOL);
				}
				}
				setState(49);
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

	public static class RulesContext extends ParserRuleContext {
		public TerminalNode OP_RULES() { return getToken(LSystemDescriptorParser.OP_RULES, 0); }
		public List<SingleRuleContext> singleRule() {
			return getRuleContexts(SingleRuleContext.class);
		}
		public SingleRuleContext singleRule(int i) {
			return getRuleContext(SingleRuleContext.class,i);
		}
		public List<TerminalNode> OP_SEPARATOR() { return getTokens(LSystemDescriptorParser.OP_SEPARATOR); }
		public TerminalNode OP_SEPARATOR(int i) {
			return getToken(LSystemDescriptorParser.OP_SEPARATOR, i);
		}
		public RulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSystemDescriptorListener ) ((LSystemDescriptorListener)listener).enterRules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSystemDescriptorListener ) ((LSystemDescriptorListener)listener).exitRules(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSystemDescriptorVisitor ) return ((LSystemDescriptorVisitor<? extends T>)visitor).visitRules(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RulesContext rules() throws RecognitionException {
		RulesContext _localctx = new RulesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_rules);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(OP_RULES);
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALPHABET_SYMBOL) {
				{
				setState(51);
				singleRule();
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OP_SEPARATOR) {
					{
					{
					setState(52);
					match(OP_SEPARATOR);
					setState(53);
					singleRule();
					}
					}
					setState(58);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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

	public static class SingleRuleContext extends ParserRuleContext {
		public List<TerminalNode> ALPHABET_SYMBOL() { return getTokens(LSystemDescriptorParser.ALPHABET_SYMBOL); }
		public TerminalNode ALPHABET_SYMBOL(int i) {
			return getToken(LSystemDescriptorParser.ALPHABET_SYMBOL, i);
		}
		public TerminalNode OP_RULE() { return getToken(LSystemDescriptorParser.OP_RULE, 0); }
		public SingleRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSystemDescriptorListener ) ((LSystemDescriptorListener)listener).enterSingleRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSystemDescriptorListener ) ((LSystemDescriptorListener)listener).exitSingleRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSystemDescriptorVisitor ) return ((LSystemDescriptorVisitor<? extends T>)visitor).visitSingleRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleRuleContext singleRule() throws RecognitionException {
		SingleRuleContext _localctx = new SingleRuleContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_singleRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(ALPHABET_SYMBOL);
			setState(62);
			match(OP_RULE);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ALPHABET_SYMBOL) {
				{
				{
				setState(63);
				match(ALPHABET_SYMBOL);
				}
				}
				setState(68);
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

	public static class SettingsContext extends ParserRuleContext {
		public AngleContext angle() {
			return getRuleContext(AngleContext.class,0);
		}
		public SizeContext size() {
			return getRuleContext(SizeContext.class,0);
		}
		public SettingsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_settings; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSystemDescriptorListener ) ((LSystemDescriptorListener)listener).enterSettings(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSystemDescriptorListener ) ((LSystemDescriptorListener)listener).exitSettings(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSystemDescriptorVisitor ) return ((LSystemDescriptorVisitor<? extends T>)visitor).visitSettings(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SettingsContext settings() throws RecognitionException {
		SettingsContext _localctx = new SettingsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_settings);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_ANGLE) {
				{
				setState(69);
				angle();
				}
			}

			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_FORWARD_SIZE) {
				{
				setState(72);
				size();
				}
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

	public static class AngleContext extends ParserRuleContext {
		public TerminalNode OP_ANGLE() { return getToken(LSystemDescriptorParser.OP_ANGLE, 0); }
		public TerminalNode INTEGER() { return getToken(LSystemDescriptorParser.INTEGER, 0); }
		public TerminalNode REAL() { return getToken(LSystemDescriptorParser.REAL, 0); }
		public AngleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_angle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSystemDescriptorListener ) ((LSystemDescriptorListener)listener).enterAngle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSystemDescriptorListener ) ((LSystemDescriptorListener)listener).exitAngle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSystemDescriptorVisitor ) return ((LSystemDescriptorVisitor<? extends T>)visitor).visitAngle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AngleContext angle() throws RecognitionException {
		AngleContext _localctx = new AngleContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_angle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(OP_ANGLE);
			setState(76);
			_la = _input.LA(1);
			if ( !(_la==INTEGER || _la==REAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class SizeContext extends ParserRuleContext {
		public TerminalNode OP_FORWARD_SIZE() { return getToken(LSystemDescriptorParser.OP_FORWARD_SIZE, 0); }
		public TerminalNode INTEGER() { return getToken(LSystemDescriptorParser.INTEGER, 0); }
		public TerminalNode REAL() { return getToken(LSystemDescriptorParser.REAL, 0); }
		public SizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_size; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LSystemDescriptorListener ) ((LSystemDescriptorListener)listener).enterSize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LSystemDescriptorListener ) ((LSystemDescriptorListener)listener).exitSize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LSystemDescriptorVisitor ) return ((LSystemDescriptorVisitor<? extends T>)visitor).visitSize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SizeContext size() throws RecognitionException {
		SizeContext _localctx = new SizeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_size);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(OP_FORWARD_SIZE);
			setState(79);
			_la = _input.LA(1);
			if ( !(_la==INTEGER || _la==REAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\36T\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3 \n\3\f\3\16\3#\13\3\5\3%\n\3\3"+
		"\4\3\4\3\4\5\4*\n\4\3\5\3\5\3\6\3\6\7\6\60\n\6\f\6\16\6\63\13\6\3\7\3"+
		"\7\3\7\3\7\7\79\n\7\f\7\16\7<\13\7\5\7>\n\7\3\b\3\b\3\b\7\bC\n\b\f\b\16"+
		"\bF\13\b\3\t\5\tI\n\t\3\t\5\tL\n\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\2\2"+
		"\f\2\4\6\b\n\f\16\20\22\24\2\4\3\2\26\35\3\2\b\tR\2\26\3\2\2\2\4\33\3"+
		"\2\2\2\6&\3\2\2\2\b+\3\2\2\2\n-\3\2\2\2\f\64\3\2\2\2\16?\3\2\2\2\20H\3"+
		"\2\2\2\22M\3\2\2\2\24P\3\2\2\2\26\27\5\4\3\2\27\30\5\n\6\2\30\31\5\f\7"+
		"\2\31\32\5\20\t\2\32\3\3\2\2\2\33$\7\13\2\2\34!\5\6\4\2\35\36\7\20\2\2"+
		"\36 \5\6\4\2\37\35\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"%\3\2\2\2"+
		"#!\3\2\2\2$\34\3\2\2\2$%\3\2\2\2%\5\3\2\2\2&)\7\5\2\2\'(\7\21\2\2(*\5"+
		"\b\5\2)\'\3\2\2\2)*\3\2\2\2*\7\3\2\2\2+,\t\2\2\2,\t\3\2\2\2-\61\7\f\2"+
		"\2.\60\7\5\2\2/.\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\13"+
		"\3\2\2\2\63\61\3\2\2\2\64=\7\r\2\2\65:\5\16\b\2\66\67\7\20\2\2\679\5\16"+
		"\b\28\66\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;>\3\2\2\2<:\3\2\2\2=\65"+
		"\3\2\2\2=>\3\2\2\2>\r\3\2\2\2?@\7\5\2\2@D\7\22\2\2AC\7\5\2\2BA\3\2\2\2"+
		"CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2E\17\3\2\2\2FD\3\2\2\2GI\5\22\n\2HG\3\2"+
		"\2\2HI\3\2\2\2IK\3\2\2\2JL\5\24\13\2KJ\3\2\2\2KL\3\2\2\2L\21\3\2\2\2M"+
		"N\7\16\2\2NO\t\3\2\2O\23\3\2\2\2PQ\7\17\2\2QR\t\3\2\2R\25\3\2\2\2\13!"+
		"$)\61:=DHK";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}