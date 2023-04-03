// Generated from java-escape by ANTLR 4.11.1

package es.uniovi.dlp.parser;

import es.uniovi.dlp.ast.*;
import es.uniovi.dlp.ast.definitions.*;
import es.uniovi.dlp.ast.expressions.*;
import es.uniovi.dlp.ast.statements.*;
import es.uniovi.dlp.ast.types.*;

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
		RULE_program = 0, RULE_def_variables = 1, RULE_simpleType = 2, RULE_type = 3, 
		RULE_structFields = 4, RULE_def_functions = 5, RULE_paramList = 6, RULE_param = 7, 
		RULE_argument = 8, RULE_returnType = 9, RULE_statement = 10, RULE_expression = 11, 
		RULE_def_main = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "def_variables", "simpleType", "type", "structFields", "def_functions", 
			"paramList", "param", "argument", "returnType", "statement", "expression", 
			"def_main"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'::'", "'int'", "'double'", "'char'", "'['", "']'", "'defstruct'", 
			"'do'", "'end'", "'def'", "'('", "')'", "'void'", "'if'", "'else'", "'in'", 
			"'puts'", "'='", "'while'", "'return'", "'.'", "'as'", "'-'", "'!'", 
			"'*'", "'/'", "'%'", "'+'", "'>'", "'>='", "'<'", "'<='", "'!='", "'=='", 
			"'&&'", "'||'", "'main'"
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
		public Program ast;
		public Def_variablesContext def_variables;
		public List<Def_variablesContext> vars = new ArrayList<Def_variablesContext>();
		public Def_functionsContext def_functions;
		public List<Def_functionsContext> funcs = new ArrayList<Def_functionsContext>();
		public Def_mainContext def_main;
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
				((ProgramContext)_localctx).def_variables = def_variables();
				((ProgramContext)_localctx).vars.add(((ProgramContext)_localctx).def_variables);
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
					((ProgramContext)_localctx).def_functions = def_functions();
					((ProgramContext)_localctx).funcs.add(((ProgramContext)_localctx).def_functions);
					}
					} 
				}
				setState(37);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(38);
			((ProgramContext)_localctx).def_main = def_main();

			        List<Definition> defs = new ArrayList<Definition>();
			        for (var variable : ((ProgramContext)_localctx).vars) {
			            defs.addAll(variable.ast);
			        }
			        for (var function : ((ProgramContext)_localctx).funcs) {
			            defs.add(function.ast);
			        }
			        defs.add(((ProgramContext)_localctx).def_main.ast);
			        ((ProgramContext)_localctx).ast =  new Program(defs, _localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1);
			    
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
		public List<VarDefinition> ast = new ArrayList<>();
		public Token ID;
		public List<Token> ids = new ArrayList<Token>();
		public TypeContext type;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(XanaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(XanaParser.ID, i);
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
			setState(41);
			((Def_variablesContext)_localctx).ID = match(ID);
			((Def_variablesContext)_localctx).ids.add(((Def_variablesContext)_localctx).ID);
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(42);
				match(T__0);
				setState(43);
				((Def_variablesContext)_localctx).ID = match(ID);
				((Def_variablesContext)_localctx).ids.add(((Def_variablesContext)_localctx).ID);
				}
				}
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(49);
			match(T__1);
			setState(50);
			((Def_variablesContext)_localctx).type = type();

			        for (var id : ((Def_variablesContext)_localctx).ids) {
			            _localctx.ast.add(new VarDefinition(id.getText(), ((Def_variablesContext)_localctx).type.ast, id.getLine(), id.getCharPositionInLine() + 1));
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
	public static class SimpleTypeContext extends ParserRuleContext {
		public Type ast;
		public Token tp;
		public SimpleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleType; }
	}

	public final SimpleTypeContext simpleType() throws RecognitionException {
		SimpleTypeContext _localctx = new SimpleTypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_simpleType);
		try {
			setState(59);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				((SimpleTypeContext)_localctx).tp = match(T__2);
				((SimpleTypeContext)_localctx).ast =  new IntType(((SimpleTypeContext)_localctx).tp.getLine(), ((SimpleTypeContext)_localctx).tp.getCharPositionInLine() + 1);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				((SimpleTypeContext)_localctx).tp = match(T__3);
				((SimpleTypeContext)_localctx).ast =  new DoubleType(((SimpleTypeContext)_localctx).tp.getLine(), ((SimpleTypeContext)_localctx).tp.getCharPositionInLine() + 1);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(57);
				((SimpleTypeContext)_localctx).tp = match(T__4);
				((SimpleTypeContext)_localctx).ast =  new CharType(((SimpleTypeContext)_localctx).tp.getLine(), ((SimpleTypeContext)_localctx).tp.getCharPositionInLine() + 1);
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
	public static class TypeContext extends ParserRuleContext {
		public Type ast;
		public SimpleTypeContext simpleType;
		public Token size;
		public TypeContext type;
		public StructFieldsContext structFields;
		public List<StructFieldsContext> fields = new ArrayList<StructFieldsContext>();
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode INT_CONSTANT() { return getToken(XanaParser.INT_CONSTANT, 0); }
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
		enterRule(_localctx, 6, RULE_type);
		int _la;
		try {
			setState(81);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__3:
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				((TypeContext)_localctx).simpleType = simpleType();
				((TypeContext)_localctx).ast =  ((TypeContext)_localctx).simpleType.ast;
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				match(T__5);
				setState(65);
				((TypeContext)_localctx).size = match(INT_CONSTANT);
				setState(66);
				match(T__1);
				setState(67);
				((TypeContext)_localctx).type = type();
				setState(68);
				match(T__6);
				((TypeContext)_localctx).ast =  new Array(LexerHelper.lexemeToInt((((TypeContext)_localctx).size!=null?((TypeContext)_localctx).size.getText():null)), ((TypeContext)_localctx).type.ast, _localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(71);
				match(T__7);
				setState(72);
				match(T__8);
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(73);
					((TypeContext)_localctx).structFields = structFields();
					((TypeContext)_localctx).fields.add(((TypeContext)_localctx).structFields);
					}
					}
					setState(78);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(79);
				match(T__9);

				            List<StructFields> fields = new ArrayList<StructFields>();
				            for (var field : ((TypeContext)_localctx).fields) {
				                fields.addAll(field.ast);
				            }
				            ((TypeContext)_localctx).ast =  new Struct(fields, _localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1);
				        
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
		public List<StructFields> ast = new ArrayList<>();
		public Token ID;
		public List<Token> ids = new ArrayList<Token>();
		public TypeContext type;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(XanaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(XanaParser.ID, i);
		}
		public StructFieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structFields; }
	}

	public final StructFieldsContext structFields() throws RecognitionException {
		StructFieldsContext _localctx = new StructFieldsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_structFields);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			((StructFieldsContext)_localctx).ID = match(ID);
			((StructFieldsContext)_localctx).ids.add(((StructFieldsContext)_localctx).ID);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(84);
				match(T__0);
				setState(85);
				((StructFieldsContext)_localctx).ID = match(ID);
				((StructFieldsContext)_localctx).ids.add(((StructFieldsContext)_localctx).ID);
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(91);
			match(T__1);
			setState(92);
			((StructFieldsContext)_localctx).type = type();

			        for (var id : ((StructFieldsContext)_localctx).ids) {
			           _localctx.ast.add(new StructFields(id.getText(), ((StructFieldsContext)_localctx).type.ast, id.getLine(), id.getCharPositionInLine() + 1));
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
	public static class Def_functionsContext extends ParserRuleContext {
		public FunctionDefinition ast;
		public Token ident;
		public Token para;
		public ParamListContext paramList;
		public ReturnTypeContext returnType;
		public Def_variablesContext def_variables;
		public List<Def_variablesContext> vars = new ArrayList<Def_variablesContext>();
		public StatementContext statement;
		public List<StatementContext> stm = new ArrayList<StatementContext>();
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(XanaParser.ID, 0); }
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
		enterRule(_localctx, 10, RULE_def_functions);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(T__10);
			setState(96);
			((Def_functionsContext)_localctx).ident = match(ID);
			setState(97);
			((Def_functionsContext)_localctx).para = match(T__11);
			setState(98);
			((Def_functionsContext)_localctx).paramList = paramList();
			setState(99);
			match(T__12);
			setState(100);
			match(T__1);
			setState(101);
			((Def_functionsContext)_localctx).returnType = returnType();
			setState(102);
			match(T__8);
			setState(106);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(103);
					((Def_functionsContext)_localctx).def_variables = def_variables();
					((Def_functionsContext)_localctx).vars.add(((Def_functionsContext)_localctx).def_variables);
					}
					} 
				}
				setState(108);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 8246391115776L) != 0) {
				{
				{
				setState(109);
				((Def_functionsContext)_localctx).statement = statement();
				((Def_functionsContext)_localctx).stm.add(((Def_functionsContext)_localctx).statement);
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(115);
			match(T__9);

			        FunType funType = new FunType(((Def_functionsContext)_localctx).paramList.ast, ((Def_functionsContext)_localctx).returnType.ast, ((Def_functionsContext)_localctx).para.getLine(), ((Def_functionsContext)_localctx).para.getCharPositionInLine() + 1);
			        List<Statement> statements = new ArrayList<>();

			        for (var statement : ((Def_functionsContext)_localctx).stm) {
			            statements.addAll(statement.ast);
			        }

			        List<VarDefinition> varDefinitions = new ArrayList<>();
			        for (var varDefinition : ((Def_functionsContext)_localctx).vars) {
			            varDefinitions.addAll(varDefinition.ast);
			        }

			        ((Def_functionsContext)_localctx).ast =  new FunctionDefinition((((Def_functionsContext)_localctx).ident!=null?((Def_functionsContext)_localctx).ident.getText():null), funType, varDefinitions, statements, _localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1);
			    
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
		public List<VarDefinition> ast = new ArrayList<>();;
		public ParamContext param;
		public List<ParamContext> list = new ArrayList<ParamContext>();
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
		enterRule(_localctx, 12, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(118);
				((ParamListContext)_localctx).param = param();
				((ParamListContext)_localctx).list.add(((ParamListContext)_localctx).param);
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(119);
					match(T__0);
					setState(120);
					((ParamListContext)_localctx).param = param();
					((ParamListContext)_localctx).list.add(((ParamListContext)_localctx).param);
					}
					}
					setState(125);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}


			        for (var param : ((ParamListContext)_localctx).list) {
			            _localctx.ast.add(param.ast);
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
		public VarDefinition ast;
		public Token ident;
		public SimpleTypeContext simpleType;
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(XanaParser.ID, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			((ParamContext)_localctx).ident = match(ID);
			setState(131);
			match(T__1);
			setState(132);
			((ParamContext)_localctx).simpleType = simpleType();
			((ParamContext)_localctx).ast =  new VarDefinition((((ParamContext)_localctx).ident!=null?((ParamContext)_localctx).ident.getText():null), ((ParamContext)_localctx).simpleType.ast, _localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1);
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
	public static class ArgumentContext extends ParserRuleContext {
		public List<Expression> ast = new ArrayList<>();
		public ExpressionContext expression;
		public List<ExpressionContext> expr = new ArrayList<ExpressionContext>();
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 8246387544064L) != 0) {
				{
				setState(135);
				((ArgumentContext)_localctx).expression = expression(0);
				((ArgumentContext)_localctx).expr.add(((ArgumentContext)_localctx).expression);
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(136);
					match(T__0);
					setState(137);
					((ArgumentContext)_localctx).expression = expression(0);
					((ArgumentContext)_localctx).expr.add(((ArgumentContext)_localctx).expression);
					}
					}
					setState(142);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}


			        for (var expression : ((ArgumentContext)_localctx).expr) {
			           _localctx.ast.add(expression.ast);
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
		public Type ast;
		public SimpleTypeContext simpleType;
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
			setState(152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				match(T__13);
				((ReturnTypeContext)_localctx).ast =  new VoidType(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1);
				}
				break;
			case T__2:
			case T__3:
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				((ReturnTypeContext)_localctx).simpleType = simpleType();
				((ReturnTypeContext)_localctx).ast =  ((ReturnTypeContext)_localctx).simpleType.ast;
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
		public List<Statement> ast = new ArrayList<>();
		public Token ident;
		public ArgumentContext argument;
		public ExpressionContext expression;
		public StatementContext statement;
		public List<StatementContext> if_ = new ArrayList<StatementContext>();
		public List<StatementContext> else_ = new ArrayList<StatementContext>();
		public Token in;
		public List<ExpressionContext> exp = new ArrayList<ExpressionContext>();
		public ExpressionContext leftExp;
		public ExpressionContext rightExp;
		public List<StatementContext> stms = new ArrayList<StatementContext>();
		public ArgumentContext argument() {
			return getRuleContext(ArgumentContext.class,0);
		}
		public TerminalNode ID() { return getToken(XanaParser.ID, 0); }
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
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				((StatementContext)_localctx).ident = match(ID);
				setState(155);
				match(T__11);
				setState(156);
				((StatementContext)_localctx).argument = argument();
				setState(157);
				match(T__12);
				_localctx.ast.add(new Invocation(new Variable((((StatementContext)_localctx).ident!=null?((StatementContext)_localctx).ident.getText():null), ((StatementContext)_localctx).ident.getLine(), ((StatementContext)_localctx).ident.getCharPositionInLine()+1), ((StatementContext)_localctx).argument.ast, _localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				match(T__14);
				setState(161);
				((StatementContext)_localctx).expression = expression(0);
				setState(162);
				match(T__8);
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 8246391115776L) != 0) {
					{
					{
					setState(163);
					((StatementContext)_localctx).statement = statement();
					((StatementContext)_localctx).if_.add(((StatementContext)_localctx).statement);
					}
					}
					setState(168);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__15) {
					{
					setState(169);
					match(T__15);
					setState(173);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((_la) & ~0x3f) == 0 && ((1L << _la) & 8246391115776L) != 0) {
						{
						{
						setState(170);
						((StatementContext)_localctx).statement = statement();
						((StatementContext)_localctx).else_.add(((StatementContext)_localctx).statement);
						}
						}
						setState(175);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(178);
				match(T__9);

				        List<Statement> ifconds = new ArrayList<>();
				        for (var cond : ((StatementContext)_localctx).if_) {
				            ifconds.addAll(cond.ast);
				        }

				        List<Statement> elseconds = new ArrayList<>();
				        for (var cond : ((StatementContext)_localctx).else_) {
				            elseconds.addAll(cond.ast);
				        }

				        _localctx.ast.add(new Conditional(((StatementContext)_localctx).expression.ast, ifconds, elseconds, _localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1));
				    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(181);
				((StatementContext)_localctx).in = match(T__16);
				setState(182);
				((StatementContext)_localctx).expression = expression(0);
				((StatementContext)_localctx).exp.add(((StatementContext)_localctx).expression);
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(183);
					match(T__0);
					setState(184);
					((StatementContext)_localctx).expression = expression(0);
					((StatementContext)_localctx).exp.add(((StatementContext)_localctx).expression);
					}
					}
					setState(189);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}

				        for (var expression : ((StatementContext)_localctx).exp) {
				            _localctx.ast.add(new Read(expression.ast, ((StatementContext)_localctx).in.getLine(), ((StatementContext)_localctx).in.getCharPositionInLine() + 4));
				        }
				    
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(192);
				match(T__17);
				setState(193);
				((StatementContext)_localctx).expression = expression(0);
				((StatementContext)_localctx).exp.add(((StatementContext)_localctx).expression);
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(194);
					match(T__0);
					setState(195);
					((StatementContext)_localctx).expression = expression(0);
					((StatementContext)_localctx).exp.add(((StatementContext)_localctx).expression);
					}
					}
					setState(200);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}

				        for (var expression : ((StatementContext)_localctx).exp) {
				            _localctx.ast.add(new Write(expression.ast, expression.ast.getLine(), expression.ast.getColumn()));
				        }
				    
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(203);
				((StatementContext)_localctx).leftExp = expression(0);
				setState(204);
				match(T__18);
				setState(205);
				((StatementContext)_localctx).rightExp = expression(0);
				_localctx.ast.add(new Assignment(((StatementContext)_localctx).leftExp.ast, ((StatementContext)_localctx).rightExp.ast, _localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1));
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(208);
				match(T__19);
				setState(209);
				((StatementContext)_localctx).expression = expression(0);
				setState(210);
				match(T__8);
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 8246391115776L) != 0) {
					{
					{
					setState(211);
					((StatementContext)_localctx).statement = statement();
					((StatementContext)_localctx).stms.add(((StatementContext)_localctx).statement);
					}
					}
					setState(216);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(217);
				match(T__9);

				        List<Statement> statements = new ArrayList<>();
				        for(var stm : ((StatementContext)_localctx).stms) {
				            statements.addAll(stm.ast);
				        }
				        _localctx.ast.add(new While(((StatementContext)_localctx).expression.ast, statements, _localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1));
				    
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(220);
				match(T__20);
				setState(221);
				((StatementContext)_localctx).expression = expression(0);
				_localctx.ast.add(new Return(((StatementContext)_localctx).expression.ast, ((StatementContext)_localctx).expression.ast.getLine(), ((StatementContext)_localctx).expression.ast.getColumn()));
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
		public Expression ast;
		public ExpressionContext array;
		public ExpressionContext e;
		public ExpressionContext left;
		public Token ident;
		public ArgumentContext argument;
		public Token INT_CONSTANT;
		public Token REAL_CONSTANT;
		public Token CHAR_CONSTANT;
		public Token oper;
		public ExpressionContext right;
		public ExpressionContext index;
		public Token ID;
		public SimpleTypeContext simpleType;
		public ArgumentContext argument() {
			return getRuleContext(ArgumentContext.class,0);
		}
		public TerminalNode ID() { return getToken(XanaParser.ID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
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
			setState(254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(227);
				((ExpressionContext)_localctx).ident = match(ID);
				setState(228);
				match(T__11);
				setState(229);
				((ExpressionContext)_localctx).argument = argument();
				setState(230);
				match(T__12);
				((ExpressionContext)_localctx).ast =  new Invocation(new Variable((((ExpressionContext)_localctx).ident!=null?((ExpressionContext)_localctx).ident.getText():null), ((ExpressionContext)_localctx).ident.getLine(), ((ExpressionContext)_localctx).ident.getCharPositionInLine()+1), ((ExpressionContext)_localctx).argument.ast, _localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1);
				}
				break;
			case 2:
				{
				setState(233);
				match(T__11);
				setState(234);
				((ExpressionContext)_localctx).e = expression(0);
				setState(235);
				match(T__12);
				((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).e.ast;
				}
				break;
			case 3:
				{
				setState(238);
				match(T__23);
				setState(239);
				((ExpressionContext)_localctx).e = expression(10);
				((ExpressionContext)_localctx).ast =  new UnaryMinus(((ExpressionContext)_localctx).e.ast, _localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1);
				}
				break;
			case 4:
				{
				setState(242);
				match(T__24);
				setState(243);
				((ExpressionContext)_localctx).e = expression(9);
				((ExpressionContext)_localctx).ast =  new Negation(((ExpressionContext)_localctx).e.ast, _localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1);
				}
				break;
			case 5:
				{
				setState(246);
				((ExpressionContext)_localctx).ident = match(ID);
				((ExpressionContext)_localctx).ast =  new Variable((((ExpressionContext)_localctx).ident!=null?((ExpressionContext)_localctx).ident.getText():null), ((ExpressionContext)_localctx).ident.getLine(), ((ExpressionContext)_localctx).ident.getCharPositionInLine() + 1);
				}
				break;
			case 6:
				{
				setState(248);
				((ExpressionContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				((ExpressionContext)_localctx).ast =  new IntLiteral(LexerHelper.lexemeToInt((((ExpressionContext)_localctx).INT_CONSTANT!=null?((ExpressionContext)_localctx).INT_CONSTANT.getText():null)), _localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1);
				}
				break;
			case 7:
				{
				setState(250);
				((ExpressionContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);
				((ExpressionContext)_localctx).ast =  new DoubleLiteral(LexerHelper.lexemeToReal((((ExpressionContext)_localctx).REAL_CONSTANT!=null?((ExpressionContext)_localctx).REAL_CONSTANT.getText():null)), _localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1);
				}
				break;
			case 8:
				{
				setState(252);
				((ExpressionContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
				((ExpressionContext)_localctx).ast =  new CharLiteral(LexerHelper.lexemeToChar((((ExpressionContext)_localctx).CHAR_CONSTANT!=null?((ExpressionContext)_localctx).CHAR_CONSTANT.getText():null)), _localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(293);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(291);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(256);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(257);
						((ExpressionContext)_localctx).oper = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 469762048L) != 0) ) {
							((ExpressionContext)_localctx).oper = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(258);
						((ExpressionContext)_localctx).right = expression(9);
						((ExpressionContext)_localctx).ast =  new ArithmeticOperation((((ExpressionContext)_localctx).oper!=null?((ExpressionContext)_localctx).oper.getText():null), ((ExpressionContext)_localctx).left.ast, ((ExpressionContext)_localctx).right.ast, _localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(261);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(262);
						((ExpressionContext)_localctx).oper = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__23 || _la==T__28) ) {
							((ExpressionContext)_localctx).oper = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(263);
						((ExpressionContext)_localctx).right = expression(8);
						((ExpressionContext)_localctx).ast =  new ArithmeticOperation((((ExpressionContext)_localctx).oper!=null?((ExpressionContext)_localctx).oper.getText():null), ((ExpressionContext)_localctx).left.ast, ((ExpressionContext)_localctx).right.ast, ((ExpressionContext)_localctx).oper.getLine(), ((ExpressionContext)_localctx).oper.getCharPositionInLine() + 1);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(266);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(267);
						((ExpressionContext)_localctx).oper = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 67645734912L) != 0) ) {
							((ExpressionContext)_localctx).oper = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(268);
						((ExpressionContext)_localctx).right = expression(7);
						((ExpressionContext)_localctx).ast =  new ComparisonOperation((((ExpressionContext)_localctx).oper!=null?((ExpressionContext)_localctx).oper.getText():null), ((ExpressionContext)_localctx).left.ast, ((ExpressionContext)_localctx).right.ast, ((ExpressionContext)_localctx).oper.getLine(), ((ExpressionContext)_localctx).oper.getCharPositionInLine() + 1);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(271);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(272);
						((ExpressionContext)_localctx).oper = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__35 || _la==T__36) ) {
							((ExpressionContext)_localctx).oper = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(273);
						((ExpressionContext)_localctx).right = expression(6);
						((ExpressionContext)_localctx).ast =  new LogicalOperation((((ExpressionContext)_localctx).oper!=null?((ExpressionContext)_localctx).oper.getText():null), ((ExpressionContext)_localctx).left.ast, ((ExpressionContext)_localctx).right.ast, ((ExpressionContext)_localctx).oper.getLine(), ((ExpressionContext)_localctx).oper.getCharPositionInLine() + 1);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.array = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(276);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(277);
						match(T__5);
						setState(278);
						((ExpressionContext)_localctx).index = expression(0);
						setState(279);
						match(T__6);
						((ExpressionContext)_localctx).ast =  new ArrayAccess(((ExpressionContext)_localctx).array.ast, ((ExpressionContext)_localctx).index.ast, _localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(282);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(283);
						match(T__21);
						setState(284);
						((ExpressionContext)_localctx).ID = match(ID);
						((ExpressionContext)_localctx).ast =  new FieldAccess((((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null) ,((ExpressionContext)_localctx).e.ast, _localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(286);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(287);
						match(T__22);
						setState(288);
						((ExpressionContext)_localctx).simpleType = simpleType();
						((ExpressionContext)_localctx).ast =  new Cast(((ExpressionContext)_localctx).simpleType.ast, ((ExpressionContext)_localctx).e.ast, _localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1);
						}
						break;
					}
					} 
				}
				setState(295);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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
		public FunctionDefinition ast;
		public Token para;
		public Def_variablesContext def_variables;
		public List<Def_variablesContext> vars = new ArrayList<Def_variablesContext>();
		public StatementContext statement;
		public List<StatementContext> stmnts = new ArrayList<StatementContext>();
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
			setState(296);
			match(T__10);
			setState(297);
			match(T__37);
			setState(298);
			((Def_mainContext)_localctx).para = match(T__11);
			setState(299);
			match(T__12);
			setState(300);
			match(T__8);
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 8246391115776L) != 0) {
				{
				setState(303);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(301);
					((Def_mainContext)_localctx).def_variables = def_variables();
					((Def_mainContext)_localctx).vars.add(((Def_mainContext)_localctx).def_variables);
					}
					break;
				case 2:
					{
					setState(302);
					((Def_mainContext)_localctx).statement = statement();
					((Def_mainContext)_localctx).stmnts.add(((Def_mainContext)_localctx).statement);
					}
					break;
				}
				}
				setState(307);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(308);
			match(T__9);

			        FunType funType = new FunType(new ArrayList<>(), new VoidType(0, 0), ((Def_mainContext)_localctx).para.getLine(), ((Def_mainContext)_localctx).para.getCharPositionInLine() + 1);

			        List<VarDefinition> varDefinitions = new ArrayList<>();
			        for (var varDefinition : ((Def_mainContext)_localctx).vars) {
			            varDefinitions.addAll(varDefinition.ast);
			        }

			        List<Statement> statements = new ArrayList<>();
			        for (var statement : ((Def_mainContext)_localctx).stmnts) {
			            statements.addAll(statement.ast);
			        }

			        ((Def_mainContext)_localctx).ast =  new FunctionDefinition("main", funType, varDefinitions, statements, _localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1);
			    
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
		"\u0004\u0001-\u0138\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0001\u0000\u0005\u0000\u001c\b\u0000\n\u0000\f\u0000\u001f"+
		"\t\u0000\u0001\u0000\u0005\u0000\"\b\u0000\n\u0000\f\u0000%\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0005"+
		"\u0001-\b\u0001\n\u0001\f\u00010\t\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002<\b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003K\b"+
		"\u0003\n\u0003\f\u0003N\t\u0003\u0001\u0003\u0001\u0003\u0003\u0003R\b"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004W\b\u0004\n\u0004"+
		"\f\u0004Z\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0005\u0005i\b\u0005\n\u0005\f\u0005l\t"+
		"\u0005\u0001\u0005\u0005\u0005o\b\u0005\n\u0005\f\u0005r\t\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0005"+
		"\u0006z\b\u0006\n\u0006\f\u0006}\t\u0006\u0003\u0006\u007f\b\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0005\b\u008b\b\b\n\b\f\b\u008e\t\b\u0003"+
		"\b\u0090\b\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\u0099\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0005\n\u00a5\b\n\n\n\f\n\u00a8\t\n\u0001\n\u0001\n"+
		"\u0005\n\u00ac\b\n\n\n\f\n\u00af\t\n\u0003\n\u00b1\b\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00ba\b\n\n\n\f\n\u00bd"+
		"\t\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00c5\b\n"+
		"\n\n\f\n\u00c8\t\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00d5\b\n\n\n\f\n\u00d8\t\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00e1"+
		"\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00ff"+
		"\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005"+
		"\u000b\u0124\b\u000b\n\u000b\f\u000b\u0127\t\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u0130\b\f\n\f\f\f\u0133\t\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0000\u0001\u0016\r\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u0000\u0004\u0001\u0000"+
		"\u001a\u001c\u0002\u0000\u0018\u0018\u001d\u001d\u0001\u0000\u001e#\u0001"+
		"\u0000$%\u0156\u0000\u001d\u0001\u0000\u0000\u0000\u0002)\u0001\u0000"+
		"\u0000\u0000\u0004;\u0001\u0000\u0000\u0000\u0006Q\u0001\u0000\u0000\u0000"+
		"\bS\u0001\u0000\u0000\u0000\n_\u0001\u0000\u0000\u0000\f~\u0001\u0000"+
		"\u0000\u0000\u000e\u0082\u0001\u0000\u0000\u0000\u0010\u008f\u0001\u0000"+
		"\u0000\u0000\u0012\u0098\u0001\u0000\u0000\u0000\u0014\u00e0\u0001\u0000"+
		"\u0000\u0000\u0016\u00fe\u0001\u0000\u0000\u0000\u0018\u0128\u0001\u0000"+
		"\u0000\u0000\u001a\u001c\u0003\u0002\u0001\u0000\u001b\u001a\u0001\u0000"+
		"\u0000\u0000\u001c\u001f\u0001\u0000\u0000\u0000\u001d\u001b\u0001\u0000"+
		"\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e#\u0001\u0000\u0000"+
		"\u0000\u001f\u001d\u0001\u0000\u0000\u0000 \"\u0003\n\u0005\u0000! \u0001"+
		"\u0000\u0000\u0000\"%\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000"+
		"#$\u0001\u0000\u0000\u0000$&\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000"+
		"\u0000&\'\u0003\u0018\f\u0000\'(\u0006\u0000\uffff\uffff\u0000(\u0001"+
		"\u0001\u0000\u0000\u0000).\u0005)\u0000\u0000*+\u0005\u0001\u0000\u0000"+
		"+-\u0005)\u0000\u0000,*\u0001\u0000\u0000\u0000-0\u0001\u0000\u0000\u0000"+
		".,\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/1\u0001\u0000\u0000"+
		"\u00000.\u0001\u0000\u0000\u000012\u0005\u0002\u0000\u000023\u0003\u0006"+
		"\u0003\u000034\u0006\u0001\uffff\uffff\u00004\u0003\u0001\u0000\u0000"+
		"\u000056\u0005\u0003\u0000\u00006<\u0006\u0002\uffff\uffff\u000078\u0005"+
		"\u0004\u0000\u00008<\u0006\u0002\uffff\uffff\u00009:\u0005\u0005\u0000"+
		"\u0000:<\u0006\u0002\uffff\uffff\u0000;5\u0001\u0000\u0000\u0000;7\u0001"+
		"\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000<\u0005\u0001\u0000\u0000"+
		"\u0000=>\u0003\u0004\u0002\u0000>?\u0006\u0003\uffff\uffff\u0000?R\u0001"+
		"\u0000\u0000\u0000@A\u0005\u0006\u0000\u0000AB\u0005\'\u0000\u0000BC\u0005"+
		"\u0002\u0000\u0000CD\u0003\u0006\u0003\u0000DE\u0005\u0007\u0000\u0000"+
		"EF\u0006\u0003\uffff\uffff\u0000FR\u0001\u0000\u0000\u0000GH\u0005\b\u0000"+
		"\u0000HL\u0005\t\u0000\u0000IK\u0003\b\u0004\u0000JI\u0001\u0000\u0000"+
		"\u0000KN\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000LM\u0001\u0000"+
		"\u0000\u0000MO\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000OP\u0005"+
		"\n\u0000\u0000PR\u0006\u0003\uffff\uffff\u0000Q=\u0001\u0000\u0000\u0000"+
		"Q@\u0001\u0000\u0000\u0000QG\u0001\u0000\u0000\u0000R\u0007\u0001\u0000"+
		"\u0000\u0000SX\u0005)\u0000\u0000TU\u0005\u0001\u0000\u0000UW\u0005)\u0000"+
		"\u0000VT\u0001\u0000\u0000\u0000WZ\u0001\u0000\u0000\u0000XV\u0001\u0000"+
		"\u0000\u0000XY\u0001\u0000\u0000\u0000Y[\u0001\u0000\u0000\u0000ZX\u0001"+
		"\u0000\u0000\u0000[\\\u0005\u0002\u0000\u0000\\]\u0003\u0006\u0003\u0000"+
		"]^\u0006\u0004\uffff\uffff\u0000^\t\u0001\u0000\u0000\u0000_`\u0005\u000b"+
		"\u0000\u0000`a\u0005)\u0000\u0000ab\u0005\f\u0000\u0000bc\u0003\f\u0006"+
		"\u0000cd\u0005\r\u0000\u0000de\u0005\u0002\u0000\u0000ef\u0003\u0012\t"+
		"\u0000fj\u0005\t\u0000\u0000gi\u0003\u0002\u0001\u0000hg\u0001\u0000\u0000"+
		"\u0000il\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000jk\u0001\u0000"+
		"\u0000\u0000kp\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000mo\u0003"+
		"\u0014\n\u0000nm\u0001\u0000\u0000\u0000or\u0001\u0000\u0000\u0000pn\u0001"+
		"\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qs\u0001\u0000\u0000\u0000"+
		"rp\u0001\u0000\u0000\u0000st\u0005\n\u0000\u0000tu\u0006\u0005\uffff\uffff"+
		"\u0000u\u000b\u0001\u0000\u0000\u0000v{\u0003\u000e\u0007\u0000wx\u0005"+
		"\u0001\u0000\u0000xz\u0003\u000e\u0007\u0000yw\u0001\u0000\u0000\u0000"+
		"z}\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000"+
		"\u0000|\u007f\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000~v\u0001"+
		"\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000"+
		"\u0000\u0000\u0080\u0081\u0006\u0006\uffff\uffff\u0000\u0081\r\u0001\u0000"+
		"\u0000\u0000\u0082\u0083\u0005)\u0000\u0000\u0083\u0084\u0005\u0002\u0000"+
		"\u0000\u0084\u0085\u0003\u0004\u0002\u0000\u0085\u0086\u0006\u0007\uffff"+
		"\uffff\u0000\u0086\u000f\u0001\u0000\u0000\u0000\u0087\u008c\u0003\u0016"+
		"\u000b\u0000\u0088\u0089\u0005\u0001\u0000\u0000\u0089\u008b\u0003\u0016"+
		"\u000b\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008b\u008e\u0001\u0000"+
		"\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000"+
		"\u0000\u0000\u008d\u0090\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000"+
		"\u0000\u0000\u008f\u0087\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000"+
		"\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u0092\u0006\b\uffff"+
		"\uffff\u0000\u0092\u0011\u0001\u0000\u0000\u0000\u0093\u0094\u0005\u000e"+
		"\u0000\u0000\u0094\u0099\u0006\t\uffff\uffff\u0000\u0095\u0096\u0003\u0004"+
		"\u0002\u0000\u0096\u0097\u0006\t\uffff\uffff\u0000\u0097\u0099\u0001\u0000"+
		"\u0000\u0000\u0098\u0093\u0001\u0000\u0000\u0000\u0098\u0095\u0001\u0000"+
		"\u0000\u0000\u0099\u0013\u0001\u0000\u0000\u0000\u009a\u009b\u0005)\u0000"+
		"\u0000\u009b\u009c\u0005\f\u0000\u0000\u009c\u009d\u0003\u0010\b\u0000"+
		"\u009d\u009e\u0005\r\u0000\u0000\u009e\u009f\u0006\n\uffff\uffff\u0000"+
		"\u009f\u00e1\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005\u000f\u0000\u0000"+
		"\u00a1\u00a2\u0003\u0016\u000b\u0000\u00a2\u00a6\u0005\t\u0000\u0000\u00a3"+
		"\u00a5\u0003\u0014\n\u0000\u00a4\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a8"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a7"+
		"\u0001\u0000\u0000\u0000\u00a7\u00b0\u0001\u0000\u0000\u0000\u00a8\u00a6"+
		"\u0001\u0000\u0000\u0000\u00a9\u00ad\u0005\u0010\u0000\u0000\u00aa\u00ac"+
		"\u0003\u0014\n\u0000\u00ab\u00aa\u0001\u0000\u0000\u0000\u00ac\u00af\u0001"+
		"\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001"+
		"\u0000\u0000\u0000\u00ae\u00b1\u0001\u0000\u0000\u0000\u00af\u00ad\u0001"+
		"\u0000\u0000\u0000\u00b0\u00a9\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001"+
		"\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005"+
		"\n\u0000\u0000\u00b3\u00b4\u0006\n\uffff\uffff\u0000\u00b4\u00e1\u0001"+
		"\u0000\u0000\u0000\u00b5\u00b6\u0005\u0011\u0000\u0000\u00b6\u00bb\u0003"+
		"\u0016\u000b\u0000\u00b7\u00b8\u0005\u0001\u0000\u0000\u00b8\u00ba\u0003"+
		"\u0016\u000b\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00ba\u00bd\u0001"+
		"\u0000\u0000\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001"+
		"\u0000\u0000\u0000\u00bc\u00be\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001"+
		"\u0000\u0000\u0000\u00be\u00bf\u0006\n\uffff\uffff\u0000\u00bf\u00e1\u0001"+
		"\u0000\u0000\u0000\u00c0\u00c1\u0005\u0012\u0000\u0000\u00c1\u00c6\u0003"+
		"\u0016\u000b\u0000\u00c2\u00c3\u0005\u0001\u0000\u0000\u00c3\u00c5\u0003"+
		"\u0016\u000b\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c5\u00c8\u0001"+
		"\u0000\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001"+
		"\u0000\u0000\u0000\u00c7\u00c9\u0001\u0000\u0000\u0000\u00c8\u00c6\u0001"+
		"\u0000\u0000\u0000\u00c9\u00ca\u0006\n\uffff\uffff\u0000\u00ca\u00e1\u0001"+
		"\u0000\u0000\u0000\u00cb\u00cc\u0003\u0016\u000b\u0000\u00cc\u00cd\u0005"+
		"\u0013\u0000\u0000\u00cd\u00ce\u0003\u0016\u000b\u0000\u00ce\u00cf\u0006"+
		"\n\uffff\uffff\u0000\u00cf\u00e1\u0001\u0000\u0000\u0000\u00d0\u00d1\u0005"+
		"\u0014\u0000\u0000\u00d1\u00d2\u0003\u0016\u000b\u0000\u00d2\u00d6\u0005"+
		"\t\u0000\u0000\u00d3\u00d5\u0003\u0014\n\u0000\u00d4\u00d3\u0001\u0000"+
		"\u0000\u0000\u00d5\u00d8\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000"+
		"\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7\u00d9\u0001\u0000"+
		"\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d9\u00da\u0005\n\u0000"+
		"\u0000\u00da\u00db\u0006\n\uffff\uffff\u0000\u00db\u00e1\u0001\u0000\u0000"+
		"\u0000\u00dc\u00dd\u0005\u0015\u0000\u0000\u00dd\u00de\u0003\u0016\u000b"+
		"\u0000\u00de\u00df\u0006\n\uffff\uffff\u0000\u00df\u00e1\u0001\u0000\u0000"+
		"\u0000\u00e0\u009a\u0001\u0000\u0000\u0000\u00e0\u00a0\u0001\u0000\u0000"+
		"\u0000\u00e0\u00b5\u0001\u0000\u0000\u0000\u00e0\u00c0\u0001\u0000\u0000"+
		"\u0000\u00e0\u00cb\u0001\u0000\u0000\u0000\u00e0\u00d0\u0001\u0000\u0000"+
		"\u0000\u00e0\u00dc\u0001\u0000\u0000\u0000\u00e1\u0015\u0001\u0000\u0000"+
		"\u0000\u00e2\u00e3\u0006\u000b\uffff\uffff\u0000\u00e3\u00e4\u0005)\u0000"+
		"\u0000\u00e4\u00e5\u0005\f\u0000\u0000\u00e5\u00e6\u0003\u0010\b\u0000"+
		"\u00e6\u00e7\u0005\r\u0000\u0000\u00e7\u00e8\u0006\u000b\uffff\uffff\u0000"+
		"\u00e8\u00ff\u0001\u0000\u0000\u0000\u00e9\u00ea\u0005\f\u0000\u0000\u00ea"+
		"\u00eb\u0003\u0016\u000b\u0000\u00eb\u00ec\u0005\r\u0000\u0000\u00ec\u00ed"+
		"\u0006\u000b\uffff\uffff\u0000\u00ed\u00ff\u0001\u0000\u0000\u0000\u00ee"+
		"\u00ef\u0005\u0018\u0000\u0000\u00ef\u00f0\u0003\u0016\u000b\n\u00f0\u00f1"+
		"\u0006\u000b\uffff\uffff\u0000\u00f1\u00ff\u0001\u0000\u0000\u0000\u00f2"+
		"\u00f3\u0005\u0019\u0000\u0000\u00f3\u00f4\u0003\u0016\u000b\t\u00f4\u00f5"+
		"\u0006\u000b\uffff\uffff\u0000\u00f5\u00ff\u0001\u0000\u0000\u0000\u00f6"+
		"\u00f7\u0005)\u0000\u0000\u00f7\u00ff\u0006\u000b\uffff\uffff\u0000\u00f8"+
		"\u00f9\u0005\'\u0000\u0000\u00f9\u00ff\u0006\u000b\uffff\uffff\u0000\u00fa"+
		"\u00fb\u0005(\u0000\u0000\u00fb\u00ff\u0006\u000b\uffff\uffff\u0000\u00fc"+
		"\u00fd\u0005*\u0000\u0000\u00fd\u00ff\u0006\u000b\uffff\uffff\u0000\u00fe"+
		"\u00e2\u0001\u0000\u0000\u0000\u00fe\u00e9\u0001\u0000\u0000\u0000\u00fe"+
		"\u00ee\u0001\u0000\u0000\u0000\u00fe\u00f2\u0001\u0000\u0000\u0000\u00fe"+
		"\u00f6\u0001\u0000\u0000\u0000\u00fe\u00f8\u0001\u0000\u0000\u0000\u00fe"+
		"\u00fa\u0001\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000\u00ff"+
		"\u0125\u0001\u0000\u0000\u0000\u0100\u0101\n\b\u0000\u0000\u0101\u0102"+
		"\u0007\u0000\u0000\u0000\u0102\u0103\u0003\u0016\u000b\t\u0103\u0104\u0006"+
		"\u000b\uffff\uffff\u0000\u0104\u0124\u0001\u0000\u0000\u0000\u0105\u0106"+
		"\n\u0007\u0000\u0000\u0106\u0107\u0007\u0001\u0000\u0000\u0107\u0108\u0003"+
		"\u0016\u000b\b\u0108\u0109\u0006\u000b\uffff\uffff\u0000\u0109\u0124\u0001"+
		"\u0000\u0000\u0000\u010a\u010b\n\u0006\u0000\u0000\u010b\u010c\u0007\u0002"+
		"\u0000\u0000\u010c\u010d\u0003\u0016\u000b\u0007\u010d\u010e\u0006\u000b"+
		"\uffff\uffff\u0000\u010e\u0124\u0001\u0000\u0000\u0000\u010f\u0110\n\u0005"+
		"\u0000\u0000\u0110\u0111\u0007\u0003\u0000\u0000\u0111\u0112\u0003\u0016"+
		"\u000b\u0006\u0112\u0113\u0006\u000b\uffff\uffff\u0000\u0113\u0124\u0001"+
		"\u0000\u0000\u0000\u0114\u0115\n\r\u0000\u0000\u0115\u0116\u0005\u0006"+
		"\u0000\u0000\u0116\u0117\u0003\u0016\u000b\u0000\u0117\u0118\u0005\u0007"+
		"\u0000\u0000\u0118\u0119\u0006\u000b\uffff\uffff\u0000\u0119\u0124\u0001"+
		"\u0000\u0000\u0000\u011a\u011b\n\f\u0000\u0000\u011b\u011c\u0005\u0016"+
		"\u0000\u0000\u011c\u011d\u0005)\u0000\u0000\u011d\u0124\u0006\u000b\uffff"+
		"\uffff\u0000\u011e\u011f\n\u000b\u0000\u0000\u011f\u0120\u0005\u0017\u0000"+
		"\u0000\u0120\u0121\u0003\u0004\u0002\u0000\u0121\u0122\u0006\u000b\uffff"+
		"\uffff\u0000\u0122\u0124\u0001\u0000\u0000\u0000\u0123\u0100\u0001\u0000"+
		"\u0000\u0000\u0123\u0105\u0001\u0000\u0000\u0000\u0123\u010a\u0001\u0000"+
		"\u0000\u0000\u0123\u010f\u0001\u0000\u0000\u0000\u0123\u0114\u0001\u0000"+
		"\u0000\u0000\u0123\u011a\u0001\u0000\u0000\u0000\u0123\u011e\u0001\u0000"+
		"\u0000\u0000\u0124\u0127\u0001\u0000\u0000\u0000\u0125\u0123\u0001\u0000"+
		"\u0000\u0000\u0125\u0126\u0001\u0000\u0000\u0000\u0126\u0017\u0001\u0000"+
		"\u0000\u0000\u0127\u0125\u0001\u0000\u0000\u0000\u0128\u0129\u0005\u000b"+
		"\u0000\u0000\u0129\u012a\u0005&\u0000\u0000\u012a\u012b\u0005\f\u0000"+
		"\u0000\u012b\u012c\u0005\r\u0000\u0000\u012c\u0131\u0005\t\u0000\u0000"+
		"\u012d\u0130\u0003\u0002\u0001\u0000\u012e\u0130\u0003\u0014\n\u0000\u012f"+
		"\u012d\u0001\u0000\u0000\u0000\u012f\u012e\u0001\u0000\u0000\u0000\u0130"+
		"\u0133\u0001\u0000\u0000\u0000\u0131\u012f\u0001\u0000\u0000\u0000\u0131"+
		"\u0132\u0001\u0000\u0000\u0000\u0132\u0134\u0001\u0000\u0000\u0000\u0133"+
		"\u0131\u0001\u0000\u0000\u0000\u0134\u0135\u0005\n\u0000\u0000\u0135\u0136"+
		"\u0006\f\uffff\uffff\u0000\u0136\u0019\u0001\u0000\u0000\u0000\u001a\u001d"+
		"#.;LQXjp{~\u008c\u008f\u0098\u00a6\u00ad\u00b0\u00bb\u00c6\u00d6\u00e0"+
		"\u00fe\u0123\u0125\u012f\u0131";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}