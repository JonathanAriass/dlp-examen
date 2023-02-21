// Generated from java-escape by ANTLR 4.11.1

package es.uniovi.dlp.parser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class XanaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		INT_CONSTANT=39, REAL_CONSTANT=40, ID=41, CHAR_CONSTANT=42, COMENTARIO_SIMPLE=43, 
		COMENTARIO_MULTILINEA=44, TRASH=45;
	public static final int
		RULE_program = 0, RULE_def_variables = 1, RULE_type = 2, RULE_structFields = 3, 
		RULE_def_functions = 4, RULE_paramList = 5, RULE_param = 6, RULE_function_invocation = 7, 
		RULE_simpleType = 8, RULE_returnType = 9, RULE_statement = 10, RULE_expression = 11, 
		RULE_def_main = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "def_variables", "type", "structFields", "def_functions", 
			"paramList", "param", "function_invocation", "simpleType", "returnType", 
			"statement", "expression", "def_main"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'::'", "'['", "']'", "'defstruct'", "'do'", "'end'", "'def'", 
			"'('", "')'", "'int'", "'double'", "'char'", "'void'", "'if'", "'else'", 
			"'in'", "'puts'", "'='", "'while'", "'return'", "'.'", "'as'", "'-'", 
			"'!'", "'*'", "'/'", "'%'", "'+'", "'>'", "'>='", "'<'", "'<='", "'!='", 
			"'=='", "'&&'", "'||'", "'main'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "INT_CONSTANT", "REAL_CONSTANT", "ID", "CHAR_CONSTANT", 
			"COMENTARIO_SIMPLE", "COMENTARIO_MULTILINEA", "TRASH"
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public XanaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public Def_mainContext def_main() {
			return getRuleContext(Def_mainContext.class,0);
		}
		public List<Def_variablesContext> def_variables() {
			return getRuleContexts(Def_variablesContext.class);
		}
		public Def_variablesContext def_variables(int i) {
			return getRuleContext(Def_variablesContext.class,i);
		}
		public List<Def_functionsContext> def_functions() {
			return getRuleContexts(Def_functionsContext.class);
		}
		public Def_functionsContext def_functions(int i) {
			return getRuleContext(Def_functionsContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(26);
				def_variables();
				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(35);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(32);
					def_functions();
					}
					} 
				}
				setState(37);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(38);
			def_main();
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
	public static class Def_variablesContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(XanaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(XanaParser.ID, i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Def_variablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_variables; }
	}

	public final Def_variablesContext def_variables() throws RecognitionException {
		Def_variablesContext _localctx = new Def_variablesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_def_variables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(ID);
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(41);
				match(T__0);
				setState(42);
				match(ID);
				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(48);
			match(T__1);
			setState(49);
			type();
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
	public static class TypeContext extends ParserRuleContext {
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public TerminalNode INT_CONSTANT() { return getToken(XanaParser.INT_CONSTANT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<StructFieldsContext> structFields() {
			return getRuleContexts(StructFieldsContext.class);
		}
		public StructFieldsContext structFields(int i) {
			return getRuleContext(StructFieldsContext.class,i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_type);
		int _la;
		try {
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
			case T__11:
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				simpleType();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				match(T__2);
				setState(53);
				match(INT_CONSTANT);
				setState(54);
				match(T__1);
				setState(55);
				type();
				setState(56);
				match(T__3);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(58);
				match(T__4);
				setState(59);
				match(T__5);
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(60);
					structFields();
					}
					}
					setState(65);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(66);
				match(T__6);
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
	public static class StructFieldsContext extends ParserRuleContext {
		public Def_variablesContext def_variables() {
			return getRuleContext(Def_variablesContext.class,0);
		}
		public StructFieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structFields; }
	}

	public final StructFieldsContext structFields() throws RecognitionException {
		StructFieldsContext _localctx = new StructFieldsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_structFields);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			def_variables();
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
	public static class Def_functionsContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(XanaParser.ID, 0); }
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public List<Def_variablesContext> def_variables() {
			return getRuleContexts(Def_variablesContext.class);
		}
		public Def_variablesContext def_variables(int i) {
			return getRuleContext(Def_variablesContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Def_functionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_functions; }
	}

	public final Def_functionsContext def_functions() throws RecognitionException {
		Def_functionsContext _localctx = new Def_functionsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_def_functions);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(T__7);
			setState(72);
			match(ID);
			setState(73);
			match(T__8);
			setState(74);
			paramList();
			setState(75);
			match(T__9);
			setState(76);
			match(T__1);
			setState(77);
			returnType();
			setState(78);
			match(T__5);
			setState(82);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(79);
					def_variables();
					}
					} 
				}
				setState(84);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 8246391112192L) != 0) {
				{
				{
				setState(85);
				statement();
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(91);
			match(T__6);
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
	public static class ParamListContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramList; }
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(93);
				param();
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(94);
					match(T__0);
					setState(95);
					param();
					}
					}
					setState(100);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParamContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(XanaParser.ID, 0); }
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(ID);
			setState(104);
			match(T__1);
			setState(105);
			simpleType();
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
	public static class Function_invocationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(XanaParser.ID, 0); }
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public Function_invocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_invocation; }
	}

	public final Function_invocationContext function_invocation() throws RecognitionException {
		Function_invocationContext _localctx = new Function_invocationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_function_invocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(ID);
			setState(108);
			match(T__8);
			setState(109);
			paramList();
			setState(110);
			match(T__9);
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
	public static class SimpleTypeContext extends ParserRuleContext {
		public SimpleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleType; }
	}

	public final SimpleTypeContext simpleType() throws RecognitionException {
		SimpleTypeContext _localctx = new SimpleTypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_simpleType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 14336L) != 0) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnTypeContext extends ParserRuleContext {
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public ReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnType; }
	}

	public final ReturnTypeContext returnType() throws RecognitionException {
		ReturnTypeContext _localctx = new ReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_returnType);
		try {
			setState(116);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				match(T__13);
				}
				break;
			case T__10:
			case T__11:
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				simpleType();
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
	public static class StatementContext extends ParserRuleContext {
		public Function_invocationContext function_invocation() {
			return getRuleContext(Function_invocationContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ID() { return getToken(XanaParser.ID, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				function_invocation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				match(T__14);
				setState(120);
				expression(0);
				setState(121);
				match(T__5);
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 8246391112192L) != 0) {
					{
					{
					setState(122);
					statement();
					}
					}
					setState(127);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__15) {
					{
					setState(128);
					match(T__15);
					setState(132);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((_la) & ~0x3f) == 0 && ((1L << _la) & 8246391112192L) != 0) {
						{
						{
						setState(129);
						statement();
						}
						}
						setState(134);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(137);
				match(T__6);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(139);
				match(T__16);
				setState(140);
				expression(0);
				setState(145);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(141);
						match(T__0);
						setState(142);
						expression(0);
						}
						} 
					}
					setState(147);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(148);
				match(T__17);
				setState(149);
				expression(0);
				setState(154);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(150);
						match(T__0);
						setState(151);
						expression(0);
						}
						} 
					}
					setState(156);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(157);
				expression(0);
				setState(158);
				match(T__18);
				setState(159);
				expression(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(161);
				match(T__19);
				setState(162);
				expression(0);
				setState(163);
				match(T__5);
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 8246391112192L) != 0) {
					{
					{
					setState(164);
					statement();
					}
					}
					setState(169);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(170);
				match(T__6);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(172);
				match(ID);
				setState(173);
				match(T__8);
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 8246391112192L) != 0) {
					{
					setState(174);
					statement();
					setState(179);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__0) {
						{
						{
						setState(175);
						match(T__0);
						setState(176);
						statement();
						}
						}
						setState(181);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(184);
				match(T__9);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(185);
				match(T__20);
				setState(186);
				expression(0);
				}
				break;
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
	public static class ExpressionContext extends ParserRuleContext {
		public Function_invocationContext function_invocation() {
			return getRuleContext(Function_invocationContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ID() { return getToken(XanaParser.ID, 0); }
		public TerminalNode INT_CONSTANT() { return getToken(XanaParser.INT_CONSTANT, 0); }
		public TerminalNode REAL_CONSTANT() { return getToken(XanaParser.REAL_CONSTANT, 0); }
		public TerminalNode CHAR_CONSTANT() { return getToken(XanaParser.CHAR_CONSTANT, 0); }
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(190);
				function_invocation();
				}
				break;
			case 2:
				{
				setState(191);
				match(T__8);
				setState(192);
				expression(0);
				setState(193);
				match(T__9);
				}
				break;
			case 3:
				{
				setState(195);
				match(T__23);
				setState(196);
				expression(10);
				}
				break;
			case 4:
				{
				setState(197);
				match(T__24);
				setState(198);
				expression(9);
				}
				break;
			case 5:
				{
				setState(199);
				match(ID);
				}
				break;
			case 6:
				{
				setState(200);
				match(INT_CONSTANT);
				}
				break;
			case 7:
				{
				setState(201);
				match(REAL_CONSTANT);
				}
				break;
			case 8:
				{
				setState(202);
				match(CHAR_CONSTANT);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(230);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(228);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(205);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(206);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 469762048L) != 0) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(207);
						expression(9);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(208);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(209);
						_la = _input.LA(1);
						if ( !(_la==T__23 || _la==T__28) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(210);
						expression(8);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(211);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(212);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 67645734912L) != 0) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(213);
						expression(7);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(214);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(215);
						_la = _input.LA(1);
						if ( !(_la==T__35 || _la==T__36) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(216);
						expression(6);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(217);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(218);
						match(T__2);
						setState(219);
						expression(0);
						setState(220);
						match(T__3);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(222);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(223);
						match(T__21);
						setState(224);
						match(ID);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(225);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(226);
						match(T__22);
						setState(227);
						simpleType();
						}
						break;
					}
					} 
				}
				setState(232);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Def_mainContext extends ParserRuleContext {
		public List<Def_variablesContext> def_variables() {
			return getRuleContexts(Def_variablesContext.class);
		}
		public Def_variablesContext def_variables(int i) {
			return getRuleContext(Def_variablesContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Def_mainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_main; }
	}

	public final Def_mainContext def_main() throws RecognitionException {
		Def_mainContext _localctx = new Def_mainContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_def_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(T__7);
			setState(234);
			match(T__37);
			setState(235);
			match(T__8);
			setState(236);
			match(T__9);
			setState(237);
			match(T__5);
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 8246391112192L) != 0) {
				{
				setState(240);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(238);
					def_variables();
					}
					break;
				case 2:
					{
					setState(239);
					statement();
					}
					break;
				}
				}
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(245);
			match(T__6);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 13);
		case 5:
			return precpred(_ctx, 12);
		case 6:
			return precpred(_ctx, 11);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001-\u00f8\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0001\u0000\u0005\u0000\u001c\b\u0000\n\u0000\f\u0000\u001f"+
		"\t\u0000\u0001\u0000\u0005\u0000\"\b\u0000\n\u0000\f\u0000%\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001,\b"+
		"\u0001\n\u0001\f\u0001/\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002>\b\u0002\n\u0002"+
		"\f\u0002A\t\u0002\u0001\u0002\u0003\u0002D\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004Q\b\u0004\n\u0004\f\u0004"+
		"T\t\u0004\u0001\u0004\u0005\u0004W\b\u0004\n\u0004\f\u0004Z\t\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005a\b"+
		"\u0005\n\u0005\f\u0005d\t\u0005\u0003\u0005f\b\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0003\tu\b\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n|\b\n\n\n\f\n\u007f\t\n\u0001"+
		"\n\u0001\n\u0005\n\u0083\b\n\n\n\f\n\u0086\t\n\u0003\n\u0088\b\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u0090\b\n\n\n\f\n\u0093"+
		"\t\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u0099\b\n\n\n\f\n\u009c\t"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005"+
		"\n\u00a6\b\n\n\n\f\n\u00a9\t\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0005\n\u00b2\b\n\n\n\f\n\u00b5\t\n\u0003\n\u00b7\b\n"+
		"\u0001\n\u0001\n\u0001\n\u0003\n\u00bc\b\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000b\u00cc\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0005\u000b\u00e5\b\u000b\n\u000b\f\u000b\u00e8\t\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00f1\b\f\n\f"+
		"\f\f\u00f4\t\f\u0001\f\u0001\f\u0001\f\u0000\u0001\u0016\r\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u0000\u0005\u0001"+
		"\u0000\u000b\r\u0001\u0000\u001a\u001c\u0002\u0000\u0018\u0018\u001d\u001d"+
		"\u0001\u0000\u001e#\u0001\u0000$%\u0114\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0002(\u0001\u0000\u0000\u0000\u0004C\u0001\u0000\u0000\u0000\u0006"+
		"E\u0001\u0000\u0000\u0000\bG\u0001\u0000\u0000\u0000\ne\u0001\u0000\u0000"+
		"\u0000\fg\u0001\u0000\u0000\u0000\u000ek\u0001\u0000\u0000\u0000\u0010"+
		"p\u0001\u0000\u0000\u0000\u0012t\u0001\u0000\u0000\u0000\u0014\u00bb\u0001"+
		"\u0000\u0000\u0000\u0016\u00cb\u0001\u0000\u0000\u0000\u0018\u00e9\u0001"+
		"\u0000\u0000\u0000\u001a\u001c\u0003\u0002\u0001\u0000\u001b\u001a\u0001"+
		"\u0000\u0000\u0000\u001c\u001f\u0001\u0000\u0000\u0000\u001d\u001b\u0001"+
		"\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e#\u0001\u0000"+
		"\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000 \"\u0003\b\u0004\u0000"+
		"! \u0001\u0000\u0000\u0000\"%\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000"+
		"\u0000#$\u0001\u0000\u0000\u0000$&\u0001\u0000\u0000\u0000%#\u0001\u0000"+
		"\u0000\u0000&\'\u0003\u0018\f\u0000\'\u0001\u0001\u0000\u0000\u0000(-"+
		"\u0005)\u0000\u0000)*\u0005\u0001\u0000\u0000*,\u0005)\u0000\u0000+)\u0001"+
		"\u0000\u0000\u0000,/\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000"+
		"-.\u0001\u0000\u0000\u0000.0\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000"+
		"\u000001\u0005\u0002\u0000\u000012\u0003\u0004\u0002\u00002\u0003\u0001"+
		"\u0000\u0000\u00003D\u0003\u0010\b\u000045\u0005\u0003\u0000\u000056\u0005"+
		"\'\u0000\u000067\u0005\u0002\u0000\u000078\u0003\u0004\u0002\u000089\u0005"+
		"\u0004\u0000\u00009D\u0001\u0000\u0000\u0000:;\u0005\u0005\u0000\u0000"+
		";?\u0005\u0006\u0000\u0000<>\u0003\u0006\u0003\u0000=<\u0001\u0000\u0000"+
		"\u0000>A\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000?@\u0001\u0000"+
		"\u0000\u0000@B\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000BD\u0005"+
		"\u0007\u0000\u0000C3\u0001\u0000\u0000\u0000C4\u0001\u0000\u0000\u0000"+
		"C:\u0001\u0000\u0000\u0000D\u0005\u0001\u0000\u0000\u0000EF\u0003\u0002"+
		"\u0001\u0000F\u0007\u0001\u0000\u0000\u0000GH\u0005\b\u0000\u0000HI\u0005"+
		")\u0000\u0000IJ\u0005\t\u0000\u0000JK\u0003\n\u0005\u0000KL\u0005\n\u0000"+
		"\u0000LM\u0005\u0002\u0000\u0000MN\u0003\u0012\t\u0000NR\u0005\u0006\u0000"+
		"\u0000OQ\u0003\u0002\u0001\u0000PO\u0001\u0000\u0000\u0000QT\u0001\u0000"+
		"\u0000\u0000RP\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000SX\u0001"+
		"\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000UW\u0003\u0014\n\u0000VU\u0001"+
		"\u0000\u0000\u0000WZ\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000"+
		"XY\u0001\u0000\u0000\u0000Y[\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000"+
		"\u0000[\\\u0005\u0007\u0000\u0000\\\t\u0001\u0000\u0000\u0000]b\u0003"+
		"\f\u0006\u0000^_\u0005\u0001\u0000\u0000_a\u0003\f\u0006\u0000`^\u0001"+
		"\u0000\u0000\u0000ad\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000"+
		"bc\u0001\u0000\u0000\u0000cf\u0001\u0000\u0000\u0000db\u0001\u0000\u0000"+
		"\u0000e]\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000f\u000b\u0001"+
		"\u0000\u0000\u0000gh\u0005)\u0000\u0000hi\u0005\u0002\u0000\u0000ij\u0003"+
		"\u0010\b\u0000j\r\u0001\u0000\u0000\u0000kl\u0005)\u0000\u0000lm\u0005"+
		"\t\u0000\u0000mn\u0003\n\u0005\u0000no\u0005\n\u0000\u0000o\u000f\u0001"+
		"\u0000\u0000\u0000pq\u0007\u0000\u0000\u0000q\u0011\u0001\u0000\u0000"+
		"\u0000ru\u0005\u000e\u0000\u0000su\u0003\u0010\b\u0000tr\u0001\u0000\u0000"+
		"\u0000ts\u0001\u0000\u0000\u0000u\u0013\u0001\u0000\u0000\u0000v\u00bc"+
		"\u0003\u000e\u0007\u0000wx\u0005\u000f\u0000\u0000xy\u0003\u0016\u000b"+
		"\u0000y}\u0005\u0006\u0000\u0000z|\u0003\u0014\n\u0000{z\u0001\u0000\u0000"+
		"\u0000|\u007f\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000}~\u0001"+
		"\u0000\u0000\u0000~\u0087\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000"+
		"\u0000\u0080\u0084\u0005\u0010\u0000\u0000\u0081\u0083\u0003\u0014\n\u0000"+
		"\u0082\u0081\u0001\u0000\u0000\u0000\u0083\u0086\u0001\u0000\u0000\u0000"+
		"\u0084\u0082\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000"+
		"\u0085\u0088\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000"+
		"\u0087\u0080\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000"+
		"\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u008a\u0005\u0007\u0000\u0000"+
		"\u008a\u00bc\u0001\u0000\u0000\u0000\u008b\u008c\u0005\u0011\u0000\u0000"+
		"\u008c\u0091\u0003\u0016\u000b\u0000\u008d\u008e\u0005\u0001\u0000\u0000"+
		"\u008e\u0090\u0003\u0016\u000b\u0000\u008f\u008d\u0001\u0000\u0000\u0000"+
		"\u0090\u0093\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000"+
		"\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u00bc\u0001\u0000\u0000\u0000"+
		"\u0093\u0091\u0001\u0000\u0000\u0000\u0094\u0095\u0005\u0012\u0000\u0000"+
		"\u0095\u009a\u0003\u0016\u000b\u0000\u0096\u0097\u0005\u0001\u0000\u0000"+
		"\u0097\u0099\u0003\u0016\u000b\u0000\u0098\u0096\u0001\u0000\u0000\u0000"+
		"\u0099\u009c\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000\u0000"+
		"\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u00bc\u0001\u0000\u0000\u0000"+
		"\u009c\u009a\u0001\u0000\u0000\u0000\u009d\u009e\u0003\u0016\u000b\u0000"+
		"\u009e\u009f\u0005\u0013\u0000\u0000\u009f\u00a0\u0003\u0016\u000b\u0000"+
		"\u00a0\u00bc\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005\u0014\u0000\u0000"+
		"\u00a2\u00a3\u0003\u0016\u000b\u0000\u00a3\u00a7\u0005\u0006\u0000\u0000"+
		"\u00a4\u00a6\u0003\u0014\n\u0000\u00a5\u00a4\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a9\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a7"+
		"\u00a8\u0001\u0000\u0000\u0000\u00a8\u00aa\u0001\u0000\u0000\u0000\u00a9"+
		"\u00a7\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005\u0007\u0000\u0000\u00ab"+
		"\u00bc\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005)\u0000\u0000\u00ad\u00b6"+
		"\u0005\t\u0000\u0000\u00ae\u00b3\u0003\u0014\n\u0000\u00af\u00b0\u0005"+
		"\u0001\u0000\u0000\u00b0\u00b2\u0003\u0014\n\u0000\u00b1\u00af\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b5\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b7\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b6\u00ae\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000"+
		"\u0000\u0000\u00b8\u00bc\u0005\n\u0000\u0000\u00b9\u00ba\u0005\u0015\u0000"+
		"\u0000\u00ba\u00bc\u0003\u0016\u000b\u0000\u00bbv\u0001\u0000\u0000\u0000"+
		"\u00bbw\u0001\u0000\u0000\u0000\u00bb\u008b\u0001\u0000\u0000\u0000\u00bb"+
		"\u0094\u0001\u0000\u0000\u0000\u00bb\u009d\u0001\u0000\u0000\u0000\u00bb"+
		"\u00a1\u0001\u0000\u0000\u0000\u00bb\u00ac\u0001\u0000\u0000\u0000\u00bb"+
		"\u00b9\u0001\u0000\u0000\u0000\u00bc\u0015\u0001\u0000\u0000\u0000\u00bd"+
		"\u00be\u0006\u000b\uffff\uffff\u0000\u00be\u00cc\u0003\u000e\u0007\u0000"+
		"\u00bf\u00c0\u0005\t\u0000\u0000\u00c0\u00c1\u0003\u0016\u000b\u0000\u00c1"+
		"\u00c2\u0005\n\u0000\u0000\u00c2\u00cc\u0001\u0000\u0000\u0000\u00c3\u00c4"+
		"\u0005\u0018\u0000\u0000\u00c4\u00cc\u0003\u0016\u000b\n\u00c5\u00c6\u0005"+
		"\u0019\u0000\u0000\u00c6\u00cc\u0003\u0016\u000b\t\u00c7\u00cc\u0005)"+
		"\u0000\u0000\u00c8\u00cc\u0005\'\u0000\u0000\u00c9\u00cc\u0005(\u0000"+
		"\u0000\u00ca\u00cc\u0005*\u0000\u0000\u00cb\u00bd\u0001\u0000\u0000\u0000"+
		"\u00cb\u00bf\u0001\u0000\u0000\u0000\u00cb\u00c3\u0001\u0000\u0000\u0000"+
		"\u00cb\u00c5\u0001\u0000\u0000\u0000\u00cb\u00c7\u0001\u0000\u0000\u0000"+
		"\u00cb\u00c8\u0001\u0000\u0000\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000"+
		"\u00cb\u00ca\u0001\u0000\u0000\u0000\u00cc\u00e6\u0001\u0000\u0000\u0000"+
		"\u00cd\u00ce\n\b\u0000\u0000\u00ce\u00cf\u0007\u0001\u0000\u0000\u00cf"+
		"\u00e5\u0003\u0016\u000b\t\u00d0\u00d1\n\u0007\u0000\u0000\u00d1\u00d2"+
		"\u0007\u0002\u0000\u0000\u00d2\u00e5\u0003\u0016\u000b\b\u00d3\u00d4\n"+
		"\u0006\u0000\u0000\u00d4\u00d5\u0007\u0003\u0000\u0000\u00d5\u00e5\u0003"+
		"\u0016\u000b\u0007\u00d6\u00d7\n\u0005\u0000\u0000\u00d7\u00d8\u0007\u0004"+
		"\u0000\u0000\u00d8\u00e5\u0003\u0016\u000b\u0006\u00d9\u00da\n\r\u0000"+
		"\u0000\u00da\u00db\u0005\u0003\u0000\u0000\u00db\u00dc\u0003\u0016\u000b"+
		"\u0000\u00dc\u00dd\u0005\u0004\u0000\u0000\u00dd\u00e5\u0001\u0000\u0000"+
		"\u0000\u00de\u00df\n\f\u0000\u0000\u00df\u00e0\u0005\u0016\u0000\u0000"+
		"\u00e0\u00e5\u0005)\u0000\u0000\u00e1\u00e2\n\u000b\u0000\u0000\u00e2"+
		"\u00e3\u0005\u0017\u0000\u0000\u00e3\u00e5\u0003\u0010\b\u0000\u00e4\u00cd"+
		"\u0001\u0000\u0000\u0000\u00e4\u00d0\u0001\u0000\u0000\u0000\u00e4\u00d3"+
		"\u0001\u0000\u0000\u0000\u00e4\u00d6\u0001\u0000\u0000\u0000\u00e4\u00d9"+
		"\u0001\u0000\u0000\u0000\u00e4\u00de\u0001\u0000\u0000\u0000\u00e4\u00e1"+
		"\u0001\u0000\u0000\u0000\u00e5\u00e8\u0001\u0000\u0000\u0000\u00e6\u00e4"+
		"\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7\u0017"+
		"\u0001\u0000\u0000\u0000\u00e8\u00e6\u0001\u0000\u0000\u0000\u00e9\u00ea"+
		"\u0005\b\u0000\u0000\u00ea\u00eb\u0005&\u0000\u0000\u00eb\u00ec\u0005"+
		"\t\u0000\u0000\u00ec\u00ed\u0005\n\u0000\u0000\u00ed\u00f2\u0005\u0006"+
		"\u0000\u0000\u00ee\u00f1\u0003\u0002\u0001\u0000\u00ef\u00f1\u0003\u0014"+
		"\n\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f0\u00ef\u0001\u0000\u0000"+
		"\u0000\u00f1\u00f4\u0001\u0000\u0000\u0000\u00f2\u00f0\u0001\u0000\u0000"+
		"\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000\u00f3\u00f5\u0001\u0000\u0000"+
		"\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f5\u00f6\u0005\u0007\u0000"+
		"\u0000\u00f6\u0019\u0001\u0000\u0000\u0000\u0018\u001d#-?CRXbet}\u0084"+
		"\u0087\u0091\u009a\u00a7\u00b3\u00b6\u00bb\u00cb\u00e4\u00e6\u00f0\u00f2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}