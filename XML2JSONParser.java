// Generated from XML2JSON.g4 by ANTLR 4.5
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XML2JSONParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, ID=5, WS=6;
	public static final int
		RULE_r = 0, RULE_element = 1, RULE_el_start = 2, RULE_el_end = 3;
	public static final String[] ruleNames = {
		"r", "element", "el_start", "el_end"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'xml2json'", "'<'", "'>'", "'</'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "ID", "WS"
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
	public String getGrammarFileName() { return "XML2JSON.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public XML2JSONParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class RContext extends ParserRuleContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public RContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XML2JSONListener ) ((XML2JSONListener)listener).enterR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XML2JSONListener ) ((XML2JSONListener)listener).exitR(this);
		}
	}

	public final RContext r() throws RecognitionException {
		RContext _localctx = new RContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_r);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			match(T__0);
			setState(9);
			element();
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

	public static class ElementContext extends ParserRuleContext {
		public El_startContext el_start() {
			return getRuleContext(El_startContext.class,0);
		}
		public El_endContext el_end() {
			return getRuleContext(El_endContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XML2JSONListener ) ((XML2JSONListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XML2JSONListener ) ((XML2JSONListener)listener).exitElement(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11);
			el_start();
			setState(12);
			el_end();
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

	public static class El_startContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(XML2JSONParser.ID, 0); }
		public El_startContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_el_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XML2JSONListener ) ((XML2JSONListener)listener).enterEl_start(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XML2JSONListener ) ((XML2JSONListener)listener).exitEl_start(this);
		}
	}

	public final El_startContext el_start() throws RecognitionException {
		El_startContext _localctx = new El_startContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_el_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			match(T__1);
			setState(15);
			match(ID);
			setState(16);
			match(T__2);
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

	public static class El_endContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(XML2JSONParser.ID, 0); }
		public El_endContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_el_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XML2JSONListener ) ((XML2JSONListener)listener).enterEl_end(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XML2JSONListener ) ((XML2JSONListener)listener).exitEl_end(this);
		}
	}

	public final El_endContext el_end() throws RecognitionException {
		El_endContext _localctx = new El_endContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_el_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			match(T__3);
			setState(19);
			match(ID);
			setState(20);
			match(T__2);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\b\31\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\2\2\6\2\4\6\b\2\2\24\2\n\3\2\2\2\4\r\3\2\2\2\6\20\3\2\2\2\b"+
		"\24\3\2\2\2\n\13\7\3\2\2\13\f\5\4\3\2\f\3\3\2\2\2\r\16\5\6\4\2\16\17\5"+
		"\b\5\2\17\5\3\2\2\2\20\21\7\4\2\2\21\22\7\7\2\2\22\23\7\5\2\2\23\7\3\2"+
		"\2\2\24\25\7\6\2\2\25\26\7\7\2\2\26\27\7\5\2\2\27\t\3\2\2\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}