// Generated from java-escape by ANTLR 4.11.1

package es.uniovi.dlp.parser;

import es.uniovi.dlp.ast.*;
import es.uniovi.dlp.ast.definitions.*;
import es.uniovi.dlp.ast.expressions.*;
import es.uniovi.dlp.ast.statements.*;
import es.uniovi.dlp.ast.types.*;
import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class XanaParser extends Parser {
  static {
    RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION);
  }

  protected static final DFA[] _decisionToDFA;
  protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
  public static final int T__0 = 1,
      T__1 = 2,
      T__2 = 3,
      T__3 = 4,
      T__4 = 5,
      T__5 = 6,
      T__6 = 7,
      T__7 = 8,
      T__8 = 9,
      T__9 = 10,
      T__10 = 11,
      T__11 = 12,
      T__12 = 13,
      T__13 = 14,
      T__14 = 15,
      T__15 = 16,
      T__16 = 17,
      T__17 = 18,
      T__18 = 19,
      T__19 = 20,
      T__20 = 21,
      T__21 = 22,
      T__22 = 23,
      T__23 = 24,
      T__24 = 25,
      T__25 = 26,
      T__26 = 27,
      T__27 = 28,
      T__28 = 29,
      T__29 = 30,
      T__30 = 31,
      T__31 = 32,
      T__32 = 33,
      T__33 = 34,
      T__34 = 35,
      T__35 = 36,
      T__36 = 37,
      T__37 = 38,
      T__38 = 39,
      T__39 = 40,
      T__40 = 41,
      T__41 = 42,
      T__42 = 43,
      T__43 = 44,
      T__44 = 45,
      T__45 = 46,
      T__46 = 47,
      T__47 = 48,
      T__48 = 49,
      T__49 = 50,
      INT_CONSTANT = 51,
      REAL_CONSTANT = 52,
      ID = 53,
      CHAR_CONSTANT = 54,
      BOLEAN_CONST = 55,
      COMENTARIO_SIMPLE = 56,
      COMENTARIO_MULTILINEA = 57,
      TRASH = 58;
  public static final int RULE_program = 0,
      RULE_def_variables = 1,
      RULE_simpleType = 2,
      RULE_type = 3,
      RULE_structFields = 4,
      RULE_def_functions = 5,
      RULE_paramList = 6,
      RULE_param = 7,
      RULE_argument = 8,
      RULE_returnType = 9,
      RULE_statement = 10,
      RULE_case = 11,
      RULE_expression = 12,
      RULE_def_main = 13;

  private static String[] makeRuleNames() {
    return new String[] {
      "program", "def_variables", "simpleType", "type", "structFields", "def_functions",
      "paramList", "param", "argument", "returnType", "statement", "case",
      "expression", "def_main"
    };
  }

  public static final String[] ruleNames = makeRuleNames();

  private static String[] makeLiteralNames() {
    return new String[] {
      null,
      "','",
      "'::'",
      "'int'",
      "'double'",
      "'char'",
      "'boolean'",
      "'['",
      "']'",
      "'defstruct'",
      "'do'",
      "'end'",
      "'def'",
      "'('",
      "')'",
      "'void'",
      "'if'",
      "'else'",
      "'in'",
      "'puts'",
      "'+='",
      "'='",
      "'switch'",
      "'{'",
      "'default'",
      "':'",
      "'}'",
      "'while'",
      "'return'",
      "'case'",
      "'break'",
      "'.'",
      "'as'",
      "'-'",
      "'!'",
      "'?'",
      "'*'",
      "'/'",
      "'%'",
      "'+'",
      "'>'",
      "'>='",
      "'<'",
      "'<='",
      "'!='",
      "'=='",
      "'&&'",
      "'||'",
      "'true'",
      "'false'",
      "'main'"
    };
  }

  private static final String[] _LITERAL_NAMES = makeLiteralNames();

  private static String[] makeSymbolicNames() {
    return new String[] {
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      "INT_CONSTANT",
      "REAL_CONSTANT",
      "ID",
      "CHAR_CONSTANT",
      "BOLEAN_CONST",
      "COMENTARIO_SIMPLE",
      "COMENTARIO_MULTILINEA",
      "TRASH"
    };
  }

  private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
  public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

  /**
   * @deprecated Use {@link #VOCABULARY} instead.
   */
  @Deprecated public static final String[] tokenNames;

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
  public String getGrammarFileName() {
    return "java-escape";
  }

  @Override
  public String[] getRuleNames() {
    return ruleNames;
  }

  @Override
  public String getSerializedATN() {
    return _serializedATN;
  }

  @Override
  public ATN getATN() {
    return _ATN;
  }

  public XanaParser(TokenStream input) {
    super(input);
    _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
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
      return getRuleContext(Def_mainContext.class, 0);
    }

    public List<Def_variablesContext> def_variables() {
      return getRuleContexts(Def_variablesContext.class);
    }

    public Def_variablesContext def_variables(int i) {
      return getRuleContext(Def_variablesContext.class, i);
    }

    public List<Def_functionsContext> def_functions() {
      return getRuleContexts(Def_functionsContext.class);
    }

    public Def_functionsContext def_functions(int i) {
      return getRuleContext(Def_functionsContext.class, i);
    }

    public ProgramContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_program;
    }
  }

  public final ProgramContext program() throws RecognitionException {
    ProgramContext _localctx = new ProgramContext(_ctx, getState());
    enterRule(_localctx, 0, RULE_program);
    int _la;
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
        setState(31);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (_la == ID) {
          {
            {
              setState(28);
              ((ProgramContext) _localctx).def_variables = def_variables();
              ((ProgramContext) _localctx).vars.add(((ProgramContext) _localctx).def_variables);
            }
          }
          setState(33);
          _errHandler.sync(this);
          _la = _input.LA(1);
        }
        setState(37);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input, 1, _ctx);
        while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
          if (_alt == 1) {
            {
              {
                setState(34);
                ((ProgramContext) _localctx).def_functions = def_functions();
                ((ProgramContext) _localctx).funcs.add(((ProgramContext) _localctx).def_functions);
              }
            }
          }
          setState(39);
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input, 1, _ctx);
        }
        setState(40);
        ((ProgramContext) _localctx).def_main = def_main();

        List<Definition> defs = new ArrayList<Definition>();
        for (var variable : ((ProgramContext) _localctx).vars) {
          defs.addAll(variable.ast);
        }
        for (var function : ((ProgramContext) _localctx).funcs) {
          defs.add(function.ast);
        }
        defs.add(((ProgramContext) _localctx).def_main.ast);
        ((ProgramContext) _localctx).ast =
            new Program(
                defs, _localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
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
      return getRuleContext(TypeContext.class, 0);
    }

    public List<TerminalNode> ID() {
      return getTokens(XanaParser.ID);
    }

    public TerminalNode ID(int i) {
      return getToken(XanaParser.ID, i);
    }

    public Def_variablesContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_def_variables;
    }
  }

  public final Def_variablesContext def_variables() throws RecognitionException {
    Def_variablesContext _localctx = new Def_variablesContext(_ctx, getState());
    enterRule(_localctx, 2, RULE_def_variables);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(43);
        ((Def_variablesContext) _localctx).ID = match(ID);
        ((Def_variablesContext) _localctx).ids.add(((Def_variablesContext) _localctx).ID);
        setState(48);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (_la == T__0) {
          {
            {
              setState(44);
              match(T__0);
              setState(45);
              ((Def_variablesContext) _localctx).ID = match(ID);
              ((Def_variablesContext) _localctx).ids.add(((Def_variablesContext) _localctx).ID);
            }
          }
          setState(50);
          _errHandler.sync(this);
          _la = _input.LA(1);
        }
        setState(51);
        match(T__1);
        setState(52);
        ((Def_variablesContext) _localctx).type = type();

        for (var id : ((Def_variablesContext) _localctx).ids) {
          _localctx.ast.add(
              new VarDefinition(
                  id.getText(),
                  ((Def_variablesContext) _localctx).type.ast,
                  id.getLine(),
                  id.getCharPositionInLine() + 1));
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
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

    @Override
    public int getRuleIndex() {
      return RULE_simpleType;
    }
  }

  public final SimpleTypeContext simpleType() throws RecognitionException {
    SimpleTypeContext _localctx = new SimpleTypeContext(_ctx, getState());
    enterRule(_localctx, 4, RULE_simpleType);
    try {
      setState(63);
      _errHandler.sync(this);
      switch (_input.LA(1)) {
        case T__2:
          enterOuterAlt(_localctx, 1);
          {
            setState(55);
            ((SimpleTypeContext) _localctx).tp = match(T__2);
            ((SimpleTypeContext) _localctx).ast =
                new IntType(
                    ((SimpleTypeContext) _localctx).tp.getLine(),
                    ((SimpleTypeContext) _localctx).tp.getCharPositionInLine() + 1);
          }
          break;
        case T__3:
          enterOuterAlt(_localctx, 2);
          {
            setState(57);
            ((SimpleTypeContext) _localctx).tp = match(T__3);
            ((SimpleTypeContext) _localctx).ast =
                new DoubleType(
                    ((SimpleTypeContext) _localctx).tp.getLine(),
                    ((SimpleTypeContext) _localctx).tp.getCharPositionInLine() + 1);
          }
          break;
        case T__4:
          enterOuterAlt(_localctx, 3);
          {
            setState(59);
            ((SimpleTypeContext) _localctx).tp = match(T__4);
            ((SimpleTypeContext) _localctx).ast =
                new CharType(
                    ((SimpleTypeContext) _localctx).tp.getLine(),
                    ((SimpleTypeContext) _localctx).tp.getCharPositionInLine() + 1);
          }
          break;
        case T__5:
          enterOuterAlt(_localctx, 4);
          {
            setState(61);
            ((SimpleTypeContext) _localctx).tp = match(T__5);
            ((SimpleTypeContext) _localctx).ast =
                new BooleanType(
                    ((SimpleTypeContext) _localctx).tp.getLine(),
                    ((SimpleTypeContext) _localctx).tp.getCharPositionInLine() + 1);
          }
          break;
        default:
          throw new NoViableAltException(this);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
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
      return getRuleContext(SimpleTypeContext.class, 0);
    }

    public TypeContext type() {
      return getRuleContext(TypeContext.class, 0);
    }

    public TerminalNode INT_CONSTANT() {
      return getToken(XanaParser.INT_CONSTANT, 0);
    }

    public List<StructFieldsContext> structFields() {
      return getRuleContexts(StructFieldsContext.class);
    }

    public StructFieldsContext structFields(int i) {
      return getRuleContext(StructFieldsContext.class, i);
    }

    public TypeContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_type;
    }
  }

  public final TypeContext type() throws RecognitionException {
    TypeContext _localctx = new TypeContext(_ctx, getState());
    enterRule(_localctx, 6, RULE_type);
    int _la;
    try {
      setState(85);
      _errHandler.sync(this);
      switch (_input.LA(1)) {
        case T__2:
        case T__3:
        case T__4:
        case T__5:
          enterOuterAlt(_localctx, 1);
          {
            setState(65);
            ((TypeContext) _localctx).simpleType = simpleType();
            ((TypeContext) _localctx).ast = ((TypeContext) _localctx).simpleType.ast;
          }
          break;
        case T__6:
          enterOuterAlt(_localctx, 2);
          {
            setState(68);
            match(T__6);
            setState(69);
            ((TypeContext) _localctx).size = match(INT_CONSTANT);
            setState(70);
            match(T__1);
            setState(71);
            ((TypeContext) _localctx).type = type();
            setState(72);
            match(T__7);
            ((TypeContext) _localctx).ast =
                new Array(
                    LexerHelper.lexemeToInt(
                        (((TypeContext) _localctx).size != null
                            ? ((TypeContext) _localctx).size.getText()
                            : null)),
                    ((TypeContext) _localctx).type.ast,
                    _localctx.start.getLine(),
                    _localctx.start.getCharPositionInLine() + 1);
          }
          break;
        case T__8:
          enterOuterAlt(_localctx, 3);
          {
            setState(75);
            match(T__8);
            setState(76);
            match(T__9);
            setState(80);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == ID) {
              {
                {
                  setState(77);
                  ((TypeContext) _localctx).structFields = structFields();
                  ((TypeContext) _localctx).fields.add(((TypeContext) _localctx).structFields);
                }
              }
              setState(82);
              _errHandler.sync(this);
              _la = _input.LA(1);
            }
            setState(83);
            match(T__10);

            List<StructFields> fields = new ArrayList<StructFields>();
            for (var field : ((TypeContext) _localctx).fields) {
              fields.addAll(field.ast);
            }
            ((TypeContext) _localctx).ast =
                new Struct(
                    fields, _localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1);
          }
          break;
        default:
          throw new NoViableAltException(this);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
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
      return getRuleContext(TypeContext.class, 0);
    }

    public List<TerminalNode> ID() {
      return getTokens(XanaParser.ID);
    }

    public TerminalNode ID(int i) {
      return getToken(XanaParser.ID, i);
    }

    public StructFieldsContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_structFields;
    }
  }

  public final StructFieldsContext structFields() throws RecognitionException {
    StructFieldsContext _localctx = new StructFieldsContext(_ctx, getState());
    enterRule(_localctx, 8, RULE_structFields);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(87);
        ((StructFieldsContext) _localctx).ID = match(ID);
        ((StructFieldsContext) _localctx).ids.add(((StructFieldsContext) _localctx).ID);
        setState(92);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (_la == T__0) {
          {
            {
              setState(88);
              match(T__0);
              setState(89);
              ((StructFieldsContext) _localctx).ID = match(ID);
              ((StructFieldsContext) _localctx).ids.add(((StructFieldsContext) _localctx).ID);
            }
          }
          setState(94);
          _errHandler.sync(this);
          _la = _input.LA(1);
        }
        setState(95);
        match(T__1);
        setState(96);
        ((StructFieldsContext) _localctx).type = type();

        for (var id : ((StructFieldsContext) _localctx).ids) {
          _localctx.ast.add(
              new StructFields(
                  id.getText(),
                  ((StructFieldsContext) _localctx).type.ast,
                  id.getLine(),
                  id.getCharPositionInLine() + 1));
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
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
      return getRuleContext(ParamListContext.class, 0);
    }

    public ReturnTypeContext returnType() {
      return getRuleContext(ReturnTypeContext.class, 0);
    }

    public TerminalNode ID() {
      return getToken(XanaParser.ID, 0);
    }

    public List<Def_variablesContext> def_variables() {
      return getRuleContexts(Def_variablesContext.class);
    }

    public Def_variablesContext def_variables(int i) {
      return getRuleContext(Def_variablesContext.class, i);
    }

    public List<StatementContext> statement() {
      return getRuleContexts(StatementContext.class);
    }

    public StatementContext statement(int i) {
      return getRuleContext(StatementContext.class, i);
    }

    public Def_functionsContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_def_functions;
    }
  }

  public final Def_functionsContext def_functions() throws RecognitionException {
    Def_functionsContext _localctx = new Def_functionsContext(_ctx, getState());
    enterRule(_localctx, 10, RULE_def_functions);
    int _la;
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
        setState(99);
        match(T__11);
        setState(100);
        ((Def_functionsContext) _localctx).ident = match(ID);
        setState(101);
        ((Def_functionsContext) _localctx).para = match(T__12);
        setState(102);
        ((Def_functionsContext) _localctx).paramList = paramList();
        setState(103);
        match(T__13);
        setState(104);
        match(T__1);
        setState(105);
        ((Def_functionsContext) _localctx).returnType = returnType();
        setState(106);
        match(T__9);
        setState(110);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input, 7, _ctx);
        while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
          if (_alt == 1) {
            {
              {
                setState(107);
                ((Def_functionsContext) _localctx).def_variables = def_variables();
                ((Def_functionsContext) _localctx)
                    .vars.add(((Def_functionsContext) _localctx).def_variables);
              }
            }
          }
          setState(112);
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input, 7, _ctx);
        }
        setState(116);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (((_la) & ~0x3f) == 0 && ((1L << _la) & 34621448312922112L) != 0) {
          {
            {
              setState(113);
              ((Def_functionsContext) _localctx).statement = statement();
              ((Def_functionsContext) _localctx)
                  .stm.add(((Def_functionsContext) _localctx).statement);
            }
          }
          setState(118);
          _errHandler.sync(this);
          _la = _input.LA(1);
        }
        setState(119);
        match(T__10);

        FunType funType =
            new FunType(
                ((Def_functionsContext) _localctx).paramList.ast,
                ((Def_functionsContext) _localctx).returnType.ast,
                ((Def_functionsContext) _localctx).para.getLine(),
                ((Def_functionsContext) _localctx).para.getCharPositionInLine() + 1);
        List<Statement> statements = new ArrayList<>();

        for (var statement : ((Def_functionsContext) _localctx).stm) {
          statements.addAll(statement.ast);
        }

        List<VarDefinition> varDefinitions = new ArrayList<>();
        for (var varDefinition : ((Def_functionsContext) _localctx).vars) {
          varDefinitions.addAll(varDefinition.ast);
        }

        ((Def_functionsContext) _localctx).ast =
            new FunctionDefinition(
                (((Def_functionsContext) _localctx).ident != null
                    ? ((Def_functionsContext) _localctx).ident.getText()
                    : null),
                funType,
                varDefinitions,
                statements,
                _localctx.start.getLine(),
                _localctx.start.getCharPositionInLine() + 1);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class ParamListContext extends ParserRuleContext {
    public List<VarDefinition> ast = new ArrayList<>();
    ;
    public ParamContext param;
    public List<ParamContext> list = new ArrayList<ParamContext>();

    public List<ParamContext> param() {
      return getRuleContexts(ParamContext.class);
    }

    public ParamContext param(int i) {
      return getRuleContext(ParamContext.class, i);
    }

    public ParamListContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_paramList;
    }
  }

  public final ParamListContext paramList() throws RecognitionException {
    ParamListContext _localctx = new ParamListContext(_ctx, getState());
    enterRule(_localctx, 12, RULE_paramList);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(130);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == ID) {
          {
            setState(122);
            ((ParamListContext) _localctx).param = param();
            ((ParamListContext) _localctx).list.add(((ParamListContext) _localctx).param);
            setState(127);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == T__0) {
              {
                {
                  setState(123);
                  match(T__0);
                  setState(124);
                  ((ParamListContext) _localctx).param = param();
                  ((ParamListContext) _localctx).list.add(((ParamListContext) _localctx).param);
                }
              }
              setState(129);
              _errHandler.sync(this);
              _la = _input.LA(1);
            }
          }
        }

        for (var param : ((ParamListContext) _localctx).list) {
          _localctx.ast.add(param.ast);
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
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
      return getRuleContext(SimpleTypeContext.class, 0);
    }

    public TerminalNode ID() {
      return getToken(XanaParser.ID, 0);
    }

    public ParamContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_param;
    }
  }

  public final ParamContext param() throws RecognitionException {
    ParamContext _localctx = new ParamContext(_ctx, getState());
    enterRule(_localctx, 14, RULE_param);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(134);
        ((ParamContext) _localctx).ident = match(ID);
        setState(135);
        match(T__1);
        setState(136);
        ((ParamContext) _localctx).simpleType = simpleType();
        ((ParamContext) _localctx).ast =
            new VarDefinition(
                (((ParamContext) _localctx).ident != null
                    ? ((ParamContext) _localctx).ident.getText()
                    : null),
                ((ParamContext) _localctx).simpleType.ast,
                _localctx.start.getLine(),
                _localctx.start.getCharPositionInLine() + 1);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
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
      return getRuleContext(ExpressionContext.class, i);
    }

    public ArgumentContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_argument;
    }
  }

  public final ArgumentContext argument() throws RecognitionException {
    ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
    enterRule(_localctx, 16, RULE_argument);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(147);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (((_la) & ~0x3f) == 0 && ((1L << _la) & 34621447905222656L) != 0) {
          {
            setState(139);
            ((ArgumentContext) _localctx).expression = expression(0);
            ((ArgumentContext) _localctx).expr.add(((ArgumentContext) _localctx).expression);
            setState(144);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == T__0) {
              {
                {
                  setState(140);
                  match(T__0);
                  setState(141);
                  ((ArgumentContext) _localctx).expression = expression(0);
                  ((ArgumentContext) _localctx).expr.add(((ArgumentContext) _localctx).expression);
                }
              }
              setState(146);
              _errHandler.sync(this);
              _la = _input.LA(1);
            }
          }
        }

        for (var expression : ((ArgumentContext) _localctx).expr) {
          _localctx.ast.add(expression.ast);
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class ReturnTypeContext extends ParserRuleContext {
    public Type ast;
    public SimpleTypeContext simpleType;

    public SimpleTypeContext simpleType() {
      return getRuleContext(SimpleTypeContext.class, 0);
    }

    public ReturnTypeContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_returnType;
    }
  }

  public final ReturnTypeContext returnType() throws RecognitionException {
    ReturnTypeContext _localctx = new ReturnTypeContext(_ctx, getState());
    enterRule(_localctx, 18, RULE_returnType);
    try {
      setState(156);
      _errHandler.sync(this);
      switch (_input.LA(1)) {
        case T__14:
          enterOuterAlt(_localctx, 1);
          {
            setState(151);
            match(T__14);
            ((ReturnTypeContext) _localctx).ast =
                new VoidType(
                    _localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1);
          }
          break;
        case T__2:
        case T__3:
        case T__4:
        case T__5:
          enterOuterAlt(_localctx, 2);
          {
            setState(153);
            ((ReturnTypeContext) _localctx).simpleType = simpleType();
            ((ReturnTypeContext) _localctx).ast = ((ReturnTypeContext) _localctx).simpleType.ast;
          }
          break;
        default:
          throw new NoViableAltException(this);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
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
    public CaseContext case_;
    public List<CaseContext> cs = new ArrayList<CaseContext>();
    public List<StatementContext> stms = new ArrayList<StatementContext>();

    public ArgumentContext argument() {
      return getRuleContext(ArgumentContext.class, 0);
    }

    public TerminalNode ID() {
      return getToken(XanaParser.ID, 0);
    }

    public List<ExpressionContext> expression() {
      return getRuleContexts(ExpressionContext.class);
    }

    public ExpressionContext expression(int i) {
      return getRuleContext(ExpressionContext.class, i);
    }

    public List<StatementContext> statement() {
      return getRuleContexts(StatementContext.class);
    }

    public StatementContext statement(int i) {
      return getRuleContext(StatementContext.class, i);
    }

    public List<CaseContext> case_() {
      return getRuleContexts(CaseContext.class);
    }

    public CaseContext case_(int i) {
      return getRuleContext(CaseContext.class, i);
    }

    public StatementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_statement;
    }
  }

  public final StatementContext statement() throws RecognitionException {
    StatementContext _localctx = new StatementContext(_ctx, getState());
    enterRule(_localctx, 20, RULE_statement);
    int _la;
    try {
      setState(251);
      _errHandler.sync(this);
      switch (getInterpreter().adaptivePredict(_input, 21, _ctx)) {
        case 1:
          enterOuterAlt(_localctx, 1);
          {
            setState(158);
            ((StatementContext) _localctx).ident = match(ID);
            setState(159);
            match(T__12);
            setState(160);
            ((StatementContext) _localctx).argument = argument();
            setState(161);
            match(T__13);
            _localctx.ast.add(
                new Invocation(
                    new Variable(
                        (((StatementContext) _localctx).ident != null
                            ? ((StatementContext) _localctx).ident.getText()
                            : null),
                        ((StatementContext) _localctx).ident.getLine(),
                        ((StatementContext) _localctx).ident.getCharPositionInLine() + 1),
                    ((StatementContext) _localctx).argument.ast,
                    _localctx.start.getLine(),
                    _localctx.start.getCharPositionInLine() + 1));
          }
          break;
        case 2:
          enterOuterAlt(_localctx, 2);
          {
            setState(164);
            match(T__15);
            setState(165);
            ((StatementContext) _localctx).expression = expression(0);
            setState(166);
            match(T__9);
            setState(170);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (((_la) & ~0x3f) == 0 && ((1L << _la) & 34621448312922112L) != 0) {
              {
                {
                  setState(167);
                  ((StatementContext) _localctx).statement = statement();
                  ((StatementContext) _localctx).if_.add(((StatementContext) _localctx).statement);
                }
              }
              setState(172);
              _errHandler.sync(this);
              _la = _input.LA(1);
            }
            setState(180);
            _errHandler.sync(this);
            _la = _input.LA(1);
            if (_la == T__16) {
              {
                setState(173);
                match(T__16);
                setState(177);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (((_la) & ~0x3f) == 0 && ((1L << _la) & 34621448312922112L) != 0) {
                  {
                    {
                      setState(174);
                      ((StatementContext) _localctx).statement = statement();
                      ((StatementContext) _localctx)
                          .else_.add(((StatementContext) _localctx).statement);
                    }
                  }
                  setState(179);
                  _errHandler.sync(this);
                  _la = _input.LA(1);
                }
              }
            }

            setState(182);
            match(T__10);

            List<Statement> ifconds = new ArrayList<>();
            for (var cond : ((StatementContext) _localctx).if_) {
              ifconds.addAll(cond.ast);
            }

            List<Statement> elseconds = new ArrayList<>();
            for (var cond : ((StatementContext) _localctx).else_) {
              elseconds.addAll(cond.ast);
            }

            _localctx.ast.add(
                new Conditional(
                    ((StatementContext) _localctx).expression.ast,
                    ifconds,
                    elseconds,
                    _localctx.start.getLine(),
                    _localctx.start.getCharPositionInLine() + 1));
          }
          break;
        case 3:
          enterOuterAlt(_localctx, 3);
          {
            setState(185);
            ((StatementContext) _localctx).in = match(T__17);
            setState(186);
            ((StatementContext) _localctx).expression = expression(0);
            ((StatementContext) _localctx).exp.add(((StatementContext) _localctx).expression);
            setState(191);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == T__0) {
              {
                {
                  setState(187);
                  match(T__0);
                  setState(188);
                  ((StatementContext) _localctx).expression = expression(0);
                  ((StatementContext) _localctx).exp.add(((StatementContext) _localctx).expression);
                }
              }
              setState(193);
              _errHandler.sync(this);
              _la = _input.LA(1);
            }

            for (var expression : ((StatementContext) _localctx).exp) {
              _localctx.ast.add(
                  new Read(
                      expression.ast,
                      ((StatementContext) _localctx).in.getLine(),
                      ((StatementContext) _localctx).in.getCharPositionInLine() + 4));
            }
          }
          break;
        case 4:
          enterOuterAlt(_localctx, 4);
          {
            setState(196);
            match(T__18);
            setState(197);
            ((StatementContext) _localctx).expression = expression(0);
            ((StatementContext) _localctx).exp.add(((StatementContext) _localctx).expression);
            setState(202);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == T__0) {
              {
                {
                  setState(198);
                  match(T__0);
                  setState(199);
                  ((StatementContext) _localctx).expression = expression(0);
                  ((StatementContext) _localctx).exp.add(((StatementContext) _localctx).expression);
                }
              }
              setState(204);
              _errHandler.sync(this);
              _la = _input.LA(1);
            }

            for (var expression : ((StatementContext) _localctx).exp) {
              _localctx.ast.add(
                  new Write(expression.ast, expression.ast.getLine(), expression.ast.getColumn()));
            }
          }
          break;
        case 5:
          enterOuterAlt(_localctx, 5);
          {
            setState(207);
            ((StatementContext) _localctx).leftExp = expression(0);
            setState(208);
            match(T__19);
            setState(209);
            ((StatementContext) _localctx).rightExp = expression(0);
            _localctx.ast.add(
                new MasIgual(
                    ((StatementContext) _localctx).leftExp.ast,
                    ((StatementContext) _localctx).rightExp.ast,
                    _localctx.start.getLine(),
                    _localctx.start.getCharPositionInLine() + 1));
          }
          break;
        case 6:
          enterOuterAlt(_localctx, 6);
          {
            setState(212);
            ((StatementContext) _localctx).leftExp = expression(0);
            setState(213);
            match(T__20);
            setState(214);
            ((StatementContext) _localctx).rightExp = expression(0);
            _localctx.ast.add(
                new Assignment(
                    ((StatementContext) _localctx).leftExp.ast,
                    ((StatementContext) _localctx).rightExp.ast,
                    _localctx.start.getLine(),
                    _localctx.start.getCharPositionInLine() + 1));
          }
          break;
        case 7:
          enterOuterAlt(_localctx, 7);
          {
            setState(217);
            match(T__21);
            setState(218);
            match(T__12);
            setState(219);
            ((StatementContext) _localctx).expression = expression(0);
            setState(220);
            match(T__13);
            setState(221);
            match(T__22);
            setState(225);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == T__28) {
              {
                {
                  setState(222);
                  ((StatementContext) _localctx).case_ = case_();
                  ((StatementContext) _localctx).cs.add(((StatementContext) _localctx).case_);
                }
              }
              setState(227);
              _errHandler.sync(this);
              _la = _input.LA(1);
            }
            {
              setState(228);
              match(T__23);
              setState(229);
              match(T__24);
              setState(230);
              ((StatementContext) _localctx).statement = statement();
            }
            setState(232);
            match(T__25);

            List<Case> cases = new ArrayList<>();
            for (var caseNode : ((StatementContext) _localctx).cs) {
              cases.add(caseNode.ast);
            }

            _localctx.ast.add(
                new Switch(
                    ((StatementContext) _localctx).expression.ast,
                    cases,
                    ((StatementContext) _localctx).statement.ast,
                    _localctx.start.getLine(),
                    _localctx.start.getCharPositionInLine() + 1));
          }
          break;
        case 8:
          enterOuterAlt(_localctx, 8);
          {
            setState(235);
            match(T__26);
            setState(236);
            ((StatementContext) _localctx).expression = expression(0);
            setState(237);
            match(T__9);
            setState(241);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (((_la) & ~0x3f) == 0 && ((1L << _la) & 34621448312922112L) != 0) {
              {
                {
                  setState(238);
                  ((StatementContext) _localctx).statement = statement();
                  ((StatementContext) _localctx).stms.add(((StatementContext) _localctx).statement);
                }
              }
              setState(243);
              _errHandler.sync(this);
              _la = _input.LA(1);
            }
            setState(244);
            match(T__10);

            List<Statement> statements = new ArrayList<>();
            for (var stm : ((StatementContext) _localctx).stms) {
              statements.addAll(stm.ast);
            }
            _localctx.ast.add(
                new While(
                    ((StatementContext) _localctx).expression.ast,
                    statements,
                    _localctx.start.getLine(),
                    _localctx.start.getCharPositionInLine() + 1));
          }
          break;
        case 9:
          enterOuterAlt(_localctx, 9);
          {
            setState(247);
            match(T__27);
            setState(248);
            ((StatementContext) _localctx).expression = expression(0);
            _localctx.ast.add(
                new Return(
                    ((StatementContext) _localctx).expression.ast,
                    ((StatementContext) _localctx).expression.ast.getLine(),
                    ((StatementContext) _localctx).expression.ast.getColumn()));
          }
          break;
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class CaseContext extends ParserRuleContext {
    public Case ast;
    public Token CHAR_CONSTANT;
    public Token INT_CONSTANT;
    public Token REAL_CONSTANT;
    public StatementContext statement;

    public StatementContext statement() {
      return getRuleContext(StatementContext.class, 0);
    }

    public TerminalNode CHAR_CONSTANT() {
      return getToken(XanaParser.CHAR_CONSTANT, 0);
    }

    public TerminalNode INT_CONSTANT() {
      return getToken(XanaParser.INT_CONSTANT, 0);
    }

    public TerminalNode REAL_CONSTANT() {
      return getToken(XanaParser.REAL_CONSTANT, 0);
    }

    public CaseContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_case;
    }
  }

  public final CaseContext case_() throws RecognitionException {
    CaseContext _localctx = new CaseContext(_ctx, getState());
    enterRule(_localctx, 22, RULE_case);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        Expression exp;
        setState(254);
        match(T__28);
        setState(261);
        _errHandler.sync(this);
        switch (_input.LA(1)) {
          case CHAR_CONSTANT:
            {
              setState(255);
              ((CaseContext) _localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
              exp =
                  new CharLiteral(
                      LexerHelper.lexemeToChar(
                          (((CaseContext) _localctx).CHAR_CONSTANT != null
                              ? ((CaseContext) _localctx).CHAR_CONSTANT.getText()
                              : null)),
                      _localctx.start.getLine(),
                      _localctx.start.getCharPositionInLine() + 1);
            }
            break;
          case INT_CONSTANT:
            {
              setState(257);
              ((CaseContext) _localctx).INT_CONSTANT = match(INT_CONSTANT);
              exp =
                  new IntLiteral(
                      LexerHelper.lexemeToInt(
                          (((CaseContext) _localctx).INT_CONSTANT != null
                              ? ((CaseContext) _localctx).INT_CONSTANT.getText()
                              : null)),
                      _localctx.start.getLine(),
                      _localctx.start.getCharPositionInLine() + 1);
            }
            break;
          case REAL_CONSTANT:
            {
              setState(259);
              ((CaseContext) _localctx).REAL_CONSTANT = match(REAL_CONSTANT);
              exp =
                  new DoubleLiteral(
                      LexerHelper.lexemeToReal(
                          (((CaseContext) _localctx).REAL_CONSTANT != null
                              ? ((CaseContext) _localctx).REAL_CONSTANT.getText()
                              : null)),
                      _localctx.start.getLine(),
                      _localctx.start.getCharPositionInLine() + 1);
            }
            break;
          default:
            throw new NoViableAltException(this);
        }
        setState(263);
        match(T__24);
        setState(264);
        ((CaseContext) _localctx).statement = statement();
        ((CaseContext) _localctx).ast =
            new Case(
                ((CaseContext) _localctx).statement.ast,
                exp,
                false,
                exp.getLine(),
                exp.getColumn());
        setState(268);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == T__29) {
          {
            setState(266);
            match(T__29);
            _localctx.ast.breakPoint = true;
          }
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
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
    public ExpressionContext e1;
    public ExpressionContext e2;
    public ExpressionContext e3;
    public Token value;
    public Token INT_CONSTANT;
    public Token REAL_CONSTANT;
    public Token CHAR_CONSTANT;
    public Token oper;
    public ExpressionContext right;
    public ExpressionContext index;
    public Token ID;
    public SimpleTypeContext simpleType;

    public ArgumentContext argument() {
      return getRuleContext(ArgumentContext.class, 0);
    }

    public TerminalNode ID() {
      return getToken(XanaParser.ID, 0);
    }

    public List<ExpressionContext> expression() {
      return getRuleContexts(ExpressionContext.class);
    }

    public ExpressionContext expression(int i) {
      return getRuleContext(ExpressionContext.class, i);
    }

    public TerminalNode INT_CONSTANT() {
      return getToken(XanaParser.INT_CONSTANT, 0);
    }

    public TerminalNode REAL_CONSTANT() {
      return getToken(XanaParser.REAL_CONSTANT, 0);
    }

    public TerminalNode CHAR_CONSTANT() {
      return getToken(XanaParser.CHAR_CONSTANT, 0);
    }

    public SimpleTypeContext simpleType() {
      return getRuleContext(SimpleTypeContext.class, 0);
    }

    public ExpressionContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_expression;
    }
  }

  public final ExpressionContext expression() throws RecognitionException {
    return expression(0);
  }

  private ExpressionContext expression(int _p) throws RecognitionException {
    ParserRuleContext _parentctx = _ctx;
    int _parentState = getState();
    ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
    ExpressionContext _prevctx = _localctx;
    int _startState = 24;
    enterRecursionRule(_localctx, 24, RULE_expression, _p);
    int _la;
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
        setState(311);
        _errHandler.sync(this);
        switch (getInterpreter().adaptivePredict(_input, 24, _ctx)) {
          case 1:
            {
              setState(271);
              ((ExpressionContext) _localctx).ident = match(ID);
              setState(272);
              match(T__12);
              setState(273);
              ((ExpressionContext) _localctx).argument = argument();
              setState(274);
              match(T__13);
              ((ExpressionContext) _localctx).ast =
                  new Invocation(
                      new Variable(
                          (((ExpressionContext) _localctx).ident != null
                              ? ((ExpressionContext) _localctx).ident.getText()
                              : null),
                          ((ExpressionContext) _localctx).ident.getLine(),
                          ((ExpressionContext) _localctx).ident.getCharPositionInLine() + 1),
                      ((ExpressionContext) _localctx).argument.ast,
                      _localctx.start.getLine(),
                      _localctx.start.getCharPositionInLine() + 1);
            }
            break;
          case 2:
            {
              setState(277);
              match(T__12);
              setState(278);
              ((ExpressionContext) _localctx).e = expression(0);
              setState(279);
              match(T__13);
              ((ExpressionContext) _localctx).ast = ((ExpressionContext) _localctx).e.ast;
            }
            break;
          case 3:
            {
              setState(282);
              match(T__32);
              setState(283);
              ((ExpressionContext) _localctx).e = expression(13);
              ((ExpressionContext) _localctx).ast =
                  new UnaryMinus(
                      ((ExpressionContext) _localctx).e.ast,
                      _localctx.start.getLine(),
                      _localctx.start.getCharPositionInLine() + 1);
            }
            break;
          case 4:
            {
              setState(286);
              match(T__33);
              setState(287);
              ((ExpressionContext) _localctx).e = expression(12);
              ((ExpressionContext) _localctx).ast =
                  new Negation(
                      ((ExpressionContext) _localctx).e.ast,
                      _localctx.start.getLine(),
                      _localctx.start.getCharPositionInLine() + 1);
            }
            break;
          case 5:
            {
              setState(290);
              match(T__12);
              setState(291);
              ((ExpressionContext) _localctx).e1 = expression(0);
              setState(292);
              match(T__13);
              setState(293);
              match(T__34);
              setState(294);
              ((ExpressionContext) _localctx).e2 = expression(0);
              setState(295);
              match(T__24);
              setState(296);
              ((ExpressionContext) _localctx).e3 = expression(11);
              ((ExpressionContext) _localctx).ast =
                  new TernaryOperator(
                      ((ExpressionContext) _localctx).e1.ast,
                      ((ExpressionContext) _localctx).e2.ast,
                      ((ExpressionContext) _localctx).e3.ast,
                      _localctx.start.getLine(),
                      _localctx.start.getCharPositionInLine() + 1);
            }
            break;
          case 6:
            {
              setState(299);
              ((ExpressionContext) _localctx).ident = match(ID);
              ((ExpressionContext) _localctx).ast =
                  new Variable(
                      (((ExpressionContext) _localctx).ident != null
                          ? ((ExpressionContext) _localctx).ident.getText()
                          : null),
                      ((ExpressionContext) _localctx).ident.getLine(),
                      ((ExpressionContext) _localctx).ident.getCharPositionInLine() + 1);
            }
            break;
          case 7:
            {
              setState(301);
              ((ExpressionContext) _localctx).value = match(T__47);
              ((ExpressionContext) _localctx).ast =
                  new BooleanLiteral(
                      true,
                      ((ExpressionContext) _localctx).value.getLine(),
                      ((ExpressionContext) _localctx).value.getCharPositionInLine() + 1);
            }
            break;
          case 8:
            {
              setState(303);
              ((ExpressionContext) _localctx).value = match(T__48);
              ((ExpressionContext) _localctx).ast =
                  new BooleanLiteral(
                      false,
                      ((ExpressionContext) _localctx).value.getLine(),
                      ((ExpressionContext) _localctx).value.getCharPositionInLine() + 1);
            }
            break;
          case 9:
            {
              setState(305);
              ((ExpressionContext) _localctx).INT_CONSTANT = match(INT_CONSTANT);
              ((ExpressionContext) _localctx).ast =
                  new IntLiteral(
                      LexerHelper.lexemeToInt(
                          (((ExpressionContext) _localctx).INT_CONSTANT != null
                              ? ((ExpressionContext) _localctx).INT_CONSTANT.getText()
                              : null)),
                      _localctx.start.getLine(),
                      _localctx.start.getCharPositionInLine() + 1);
            }
            break;
          case 10:
            {
              setState(307);
              ((ExpressionContext) _localctx).REAL_CONSTANT = match(REAL_CONSTANT);
              ((ExpressionContext) _localctx).ast =
                  new DoubleLiteral(
                      LexerHelper.lexemeToReal(
                          (((ExpressionContext) _localctx).REAL_CONSTANT != null
                              ? ((ExpressionContext) _localctx).REAL_CONSTANT.getText()
                              : null)),
                      _localctx.start.getLine(),
                      _localctx.start.getCharPositionInLine() + 1);
            }
            break;
          case 11:
            {
              setState(309);
              ((ExpressionContext) _localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
              ((ExpressionContext) _localctx).ast =
                  new CharLiteral(
                      LexerHelper.lexemeToChar(
                          (((ExpressionContext) _localctx).CHAR_CONSTANT != null
                              ? ((ExpressionContext) _localctx).CHAR_CONSTANT.getText()
                              : null)),
                      _localctx.start.getLine(),
                      _localctx.start.getCharPositionInLine() + 1);
            }
            break;
        }
        _ctx.stop = _input.LT(-1);
        setState(350);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input, 26, _ctx);
        while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
          if (_alt == 1) {
            if (_parseListeners != null) triggerExitRuleEvent();
            _prevctx = _localctx;
            {
              setState(348);
              _errHandler.sync(this);
              switch (getInterpreter().adaptivePredict(_input, 25, _ctx)) {
                case 1:
                  {
                    _localctx = new ExpressionContext(_parentctx, _parentState);
                    _localctx.left = _prevctx;
                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                    setState(313);
                    if (!(precpred(_ctx, 10)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 10)");
                    setState(314);
                    ((ExpressionContext) _localctx).oper = _input.LT(1);
                    _la = _input.LA(1);
                    if (!(((_la) & ~0x3f) == 0 && ((1L << _la) & 481036337152L) != 0)) {
                      ((ExpressionContext) _localctx).oper =
                          (Token) _errHandler.recoverInline(this);
                    } else {
                      if (_input.LA(1) == Token.EOF) matchedEOF = true;
                      _errHandler.reportMatch(this);
                      consume();
                    }
                    setState(315);
                    ((ExpressionContext) _localctx).right = expression(11);
                    ((ExpressionContext) _localctx).ast =
                        new ArithmeticOperation(
                            (((ExpressionContext) _localctx).oper != null
                                ? ((ExpressionContext) _localctx).oper.getText()
                                : null),
                            ((ExpressionContext) _localctx).left.ast,
                            ((ExpressionContext) _localctx).right.ast,
                            _localctx.start.getLine(),
                            _localctx.start.getCharPositionInLine() + 1);
                  }
                  break;
                case 2:
                  {
                    _localctx = new ExpressionContext(_parentctx, _parentState);
                    _localctx.left = _prevctx;
                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                    setState(318);
                    if (!(precpred(_ctx, 9)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 9)");
                    setState(319);
                    ((ExpressionContext) _localctx).oper = _input.LT(1);
                    _la = _input.LA(1);
                    if (!(_la == T__32 || _la == T__38)) {
                      ((ExpressionContext) _localctx).oper =
                          (Token) _errHandler.recoverInline(this);
                    } else {
                      if (_input.LA(1) == Token.EOF) matchedEOF = true;
                      _errHandler.reportMatch(this);
                      consume();
                    }
                    setState(320);
                    ((ExpressionContext) _localctx).right = expression(10);
                    ((ExpressionContext) _localctx).ast =
                        new ArithmeticOperation(
                            (((ExpressionContext) _localctx).oper != null
                                ? ((ExpressionContext) _localctx).oper.getText()
                                : null),
                            ((ExpressionContext) _localctx).left.ast,
                            ((ExpressionContext) _localctx).right.ast,
                            ((ExpressionContext) _localctx).oper.getLine(),
                            ((ExpressionContext) _localctx).oper.getCharPositionInLine() + 1);
                  }
                  break;
                case 3:
                  {
                    _localctx = new ExpressionContext(_parentctx, _parentState);
                    _localctx.left = _prevctx;
                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                    setState(323);
                    if (!(precpred(_ctx, 8)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 8)");
                    setState(324);
                    ((ExpressionContext) _localctx).oper = _input.LT(1);
                    _la = _input.LA(1);
                    if (!(((_la) & ~0x3f) == 0 && ((1L << _la) & 69269232549888L) != 0)) {
                      ((ExpressionContext) _localctx).oper =
                          (Token) _errHandler.recoverInline(this);
                    } else {
                      if (_input.LA(1) == Token.EOF) matchedEOF = true;
                      _errHandler.reportMatch(this);
                      consume();
                    }
                    setState(325);
                    ((ExpressionContext) _localctx).right = expression(9);
                    ((ExpressionContext) _localctx).ast =
                        new ComparisonOperation(
                            (((ExpressionContext) _localctx).oper != null
                                ? ((ExpressionContext) _localctx).oper.getText()
                                : null),
                            ((ExpressionContext) _localctx).left.ast,
                            ((ExpressionContext) _localctx).right.ast,
                            ((ExpressionContext) _localctx).oper.getLine(),
                            ((ExpressionContext) _localctx).oper.getCharPositionInLine() + 1);
                  }
                  break;
                case 4:
                  {
                    _localctx = new ExpressionContext(_parentctx, _parentState);
                    _localctx.left = _prevctx;
                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                    setState(328);
                    if (!(precpred(_ctx, 7)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 7)");
                    setState(329);
                    ((ExpressionContext) _localctx).oper = _input.LT(1);
                    _la = _input.LA(1);
                    if (!(_la == T__45 || _la == T__46)) {
                      ((ExpressionContext) _localctx).oper =
                          (Token) _errHandler.recoverInline(this);
                    } else {
                      if (_input.LA(1) == Token.EOF) matchedEOF = true;
                      _errHandler.reportMatch(this);
                      consume();
                    }
                    setState(330);
                    ((ExpressionContext) _localctx).right = expression(8);
                    ((ExpressionContext) _localctx).ast =
                        new LogicalOperation(
                            (((ExpressionContext) _localctx).oper != null
                                ? ((ExpressionContext) _localctx).oper.getText()
                                : null),
                            ((ExpressionContext) _localctx).left.ast,
                            ((ExpressionContext) _localctx).right.ast,
                            ((ExpressionContext) _localctx).oper.getLine(),
                            ((ExpressionContext) _localctx).oper.getCharPositionInLine() + 1);
                  }
                  break;
                case 5:
                  {
                    _localctx = new ExpressionContext(_parentctx, _parentState);
                    _localctx.array = _prevctx;
                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                    setState(333);
                    if (!(precpred(_ctx, 16)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 16)");
                    setState(334);
                    match(T__6);
                    setState(335);
                    ((ExpressionContext) _localctx).index = expression(0);
                    setState(336);
                    match(T__7);
                    ((ExpressionContext) _localctx).ast =
                        new ArrayAccess(
                            ((ExpressionContext) _localctx).array.ast,
                            ((ExpressionContext) _localctx).index.ast,
                            _localctx.start.getLine(),
                            _localctx.start.getCharPositionInLine() + 1);
                  }
                  break;
                case 6:
                  {
                    _localctx = new ExpressionContext(_parentctx, _parentState);
                    _localctx.e = _prevctx;
                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                    setState(339);
                    if (!(precpred(_ctx, 15)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 15)");
                    setState(340);
                    match(T__30);
                    setState(341);
                    ((ExpressionContext) _localctx).ID = match(ID);
                    ((ExpressionContext) _localctx).ast =
                        new FieldAccess(
                            (((ExpressionContext) _localctx).ID != null
                                ? ((ExpressionContext) _localctx).ID.getText()
                                : null),
                            ((ExpressionContext) _localctx).e.ast,
                            _localctx.start.getLine(),
                            _localctx.start.getCharPositionInLine() + 1);
                  }
                  break;
                case 7:
                  {
                    _localctx = new ExpressionContext(_parentctx, _parentState);
                    _localctx.e = _prevctx;
                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                    setState(343);
                    if (!(precpred(_ctx, 14)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 14)");
                    setState(344);
                    match(T__31);
                    setState(345);
                    ((ExpressionContext) _localctx).simpleType = simpleType();
                    ((ExpressionContext) _localctx).ast =
                        new Cast(
                            ((ExpressionContext) _localctx).simpleType.ast,
                            ((ExpressionContext) _localctx).e.ast,
                            _localctx.start.getLine(),
                            _localctx.start.getCharPositionInLine() + 1);
                  }
                  break;
              }
            }
          }
          setState(352);
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input, 26, _ctx);
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
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
      return getRuleContext(Def_variablesContext.class, i);
    }

    public List<StatementContext> statement() {
      return getRuleContexts(StatementContext.class);
    }

    public StatementContext statement(int i) {
      return getRuleContext(StatementContext.class, i);
    }

    public Def_mainContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_def_main;
    }
  }

  public final Def_mainContext def_main() throws RecognitionException {
    Def_mainContext _localctx = new Def_mainContext(_ctx, getState());
    enterRule(_localctx, 26, RULE_def_main);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(353);
        match(T__11);
        setState(354);
        match(T__49);
        setState(355);
        ((Def_mainContext) _localctx).para = match(T__12);
        setState(356);
        match(T__13);
        setState(357);
        match(T__9);
        setState(362);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (((_la) & ~0x3f) == 0 && ((1L << _la) & 34621448312922112L) != 0) {
          {
            setState(360);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 27, _ctx)) {
              case 1:
                {
                  setState(358);
                  ((Def_mainContext) _localctx).def_variables = def_variables();
                  ((Def_mainContext) _localctx)
                      .vars.add(((Def_mainContext) _localctx).def_variables);
                }
                break;
              case 2:
                {
                  setState(359);
                  ((Def_mainContext) _localctx).statement = statement();
                  ((Def_mainContext) _localctx).stmnts.add(((Def_mainContext) _localctx).statement);
                }
                break;
            }
          }
          setState(364);
          _errHandler.sync(this);
          _la = _input.LA(1);
        }
        setState(365);
        match(T__10);

        FunType funType =
            new FunType(
                new ArrayList<>(),
                new VoidType(0, 0),
                ((Def_mainContext) _localctx).para.getLine(),
                ((Def_mainContext) _localctx).para.getCharPositionInLine() + 1);

        List<VarDefinition> varDefinitions = new ArrayList<>();
        for (var varDefinition : ((Def_mainContext) _localctx).vars) {
          varDefinitions.addAll(varDefinition.ast);
        }

        List<Statement> statements = new ArrayList<>();
        for (var statement : ((Def_mainContext) _localctx).stmnts) {
          statements.addAll(statement.ast);
        }

        ((Def_mainContext) _localctx).ast =
            new FunctionDefinition(
                "main",
                funType,
                varDefinitions,
                statements,
                _localctx.start.getLine(),
                _localctx.start.getCharPositionInLine() + 1);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
    switch (ruleIndex) {
      case 12:
        return expression_sempred((ExpressionContext) _localctx, predIndex);
    }
    return true;
  }

  private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
    switch (predIndex) {
      case 0:
        return precpred(_ctx, 10);
      case 1:
        return precpred(_ctx, 9);
      case 2:
        return precpred(_ctx, 8);
      case 3:
        return precpred(_ctx, 7);
      case 4:
        return precpred(_ctx, 16);
      case 5:
        return precpred(_ctx, 15);
      case 6:
        return precpred(_ctx, 14);
    }
    return true;
  }

  public static final String _serializedATN =
      "\u0004\u0001:\u0171\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"
          + "\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"
          + "\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"
          + "\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"
          + "\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0005\u0000\u001e\b\u0000\n\u0000"
          + "\f\u0000!\t\u0000\u0001\u0000\u0005\u0000$\b\u0000\n\u0000\f\u0000\'\t"
          + "\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"
          + "\u0001\u0005\u0001/\b\u0001\n\u0001\f\u00012\t\u0001\u0001\u0001\u0001"
          + "\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"
          + "\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002@\b"
          + "\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"
          + "\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"
          + "\u0003\u0001\u0003\u0005\u0003O\b\u0003\n\u0003\f\u0003R\t\u0003\u0001"
          + "\u0003\u0001\u0003\u0003\u0003V\b\u0003\u0001\u0004\u0001\u0004\u0001"
          + "\u0004\u0005\u0004[\b\u0004\n\u0004\f\u0004^\t\u0004\u0001\u0004\u0001"
          + "\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"
          + "\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005"
          + "\u0005m\b\u0005\n\u0005\f\u0005p\t\u0005\u0001\u0005\u0005\u0005s\b\u0005"
          + "\n\u0005\f\u0005v\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"
          + "\u0001\u0006\u0001\u0006\u0005\u0006~\b\u0006\n\u0006\f\u0006\u0081\t"
          + "\u0006\u0003\u0006\u0083\b\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"
          + "\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0005"
          + "\b\u008f\b\b\n\b\f\b\u0092\t\b\u0003\b\u0094\b\b\u0001\b\u0001\b\u0001"
          + "\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u009d\b\t\u0001\n\u0001\n\u0001"
          + "\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00a9"
          + "\b\n\n\n\f\n\u00ac\t\n\u0001\n\u0001\n\u0005\n\u00b0\b\n\n\n\f\n\u00b3"
          + "\t\n\u0003\n\u00b5\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n"
          + "\u0001\n\u0005\n\u00be\b\n\n\n\f\n\u00c1\t\n\u0001\n\u0001\n\u0001\n\u0001"
          + "\n\u0001\n\u0001\n\u0005\n\u00c9\b\n\n\n\f\n\u00cc\t\n\u0001\n\u0001\n"
          + "\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"
          + "\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00e0"
          + "\b\n\n\n\f\n\u00e3\t\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n"
          + "\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00f0\b\n\n\n\f\n\u00f3"
          + "\t\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00fc"
          + "\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"
          + "\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0106\b\u000b\u0001\u000b\u0001"
          + "\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u010d\b\u000b\u0001"
          + "\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"
          + "\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"
          + "\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"
          + "\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"
          + "\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u0138\b\f\u0001\f\u0001\f\u0001"
          + "\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"
          + "\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"
          + "\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"
          + "\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u015d\b\f\n\f\f\f\u0160"
          + "\t\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u0169"
          + "\b\r\n\r\f\r\u016c\t\r\u0001\r\u0001\r\u0001\r\u0001\r\u0000\u0001\u0018"
          + "\u000e\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"
          + "\u001a\u0000\u0004\u0001\u0000$&\u0002\u0000!!\'\'\u0001\u0000(-\u0001"
          + "\u0000./\u0198\u0000\u001f\u0001\u0000\u0000\u0000\u0002+\u0001\u0000"
          + "\u0000\u0000\u0004?\u0001\u0000\u0000\u0000\u0006U\u0001\u0000\u0000\u0000"
          + "\bW\u0001\u0000\u0000\u0000\nc\u0001\u0000\u0000\u0000\f\u0082\u0001\u0000"
          + "\u0000\u0000\u000e\u0086\u0001\u0000\u0000\u0000\u0010\u0093\u0001\u0000"
          + "\u0000\u0000\u0012\u009c\u0001\u0000\u0000\u0000\u0014\u00fb\u0001\u0000"
          + "\u0000\u0000\u0016\u00fd\u0001\u0000\u0000\u0000\u0018\u0137\u0001\u0000"
          + "\u0000\u0000\u001a\u0161\u0001\u0000\u0000\u0000\u001c\u001e\u0003\u0002"
          + "\u0001\u0000\u001d\u001c\u0001\u0000\u0000\u0000\u001e!\u0001\u0000\u0000"
          + "\u0000\u001f\u001d\u0001\u0000\u0000\u0000\u001f \u0001\u0000\u0000\u0000"
          + " %\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000\"$\u0003\n\u0005"
          + "\u0000#\"\u0001\u0000\u0000\u0000$\'\u0001\u0000\u0000\u0000%#\u0001\u0000"
          + "\u0000\u0000%&\u0001\u0000\u0000\u0000&(\u0001\u0000\u0000\u0000\'%\u0001"
          + "\u0000\u0000\u0000()\u0003\u001a\r\u0000)*\u0006\u0000\uffff\uffff\u0000"
          + "*\u0001\u0001\u0000\u0000\u0000+0\u00055\u0000\u0000,-\u0005\u0001\u0000"
          + "\u0000-/\u00055\u0000\u0000.,\u0001\u0000\u0000\u0000/2\u0001\u0000\u0000"
          + "\u00000.\u0001\u0000\u0000\u000001\u0001\u0000\u0000\u000013\u0001\u0000"
          + "\u0000\u000020\u0001\u0000\u0000\u000034\u0005\u0002\u0000\u000045\u0003"
          + "\u0006\u0003\u000056\u0006\u0001\uffff\uffff\u00006\u0003\u0001\u0000"
          + "\u0000\u000078\u0005\u0003\u0000\u00008@\u0006\u0002\uffff\uffff\u0000"
          + "9:\u0005\u0004\u0000\u0000:@\u0006\u0002\uffff\uffff\u0000;<\u0005\u0005"
          + "\u0000\u0000<@\u0006\u0002\uffff\uffff\u0000=>\u0005\u0006\u0000\u0000"
          + ">@\u0006\u0002\uffff\uffff\u0000?7\u0001\u0000\u0000\u0000?9\u0001\u0000"
          + "\u0000\u0000?;\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000@\u0005"
          + "\u0001\u0000\u0000\u0000AB\u0003\u0004\u0002\u0000BC\u0006\u0003\uffff"
          + "\uffff\u0000CV\u0001\u0000\u0000\u0000DE\u0005\u0007\u0000\u0000EF\u0005"
          + "3\u0000\u0000FG\u0005\u0002\u0000\u0000GH\u0003\u0006\u0003\u0000HI\u0005"
          + "\b\u0000\u0000IJ\u0006\u0003\uffff\uffff\u0000JV\u0001\u0000\u0000\u0000"
          + "KL\u0005\t\u0000\u0000LP\u0005\n\u0000\u0000MO\u0003\b\u0004\u0000NM\u0001"
          + "\u0000\u0000\u0000OR\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000"
          + "PQ\u0001\u0000\u0000\u0000QS\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000"
          + "\u0000ST\u0005\u000b\u0000\u0000TV\u0006\u0003\uffff\uffff\u0000UA\u0001"
          + "\u0000\u0000\u0000UD\u0001\u0000\u0000\u0000UK\u0001\u0000\u0000\u0000"
          + "V\u0007\u0001\u0000\u0000\u0000W\\\u00055\u0000\u0000XY\u0005\u0001\u0000"
          + "\u0000Y[\u00055\u0000\u0000ZX\u0001\u0000\u0000\u0000[^\u0001\u0000\u0000"
          + "\u0000\\Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]_\u0001\u0000"
          + "\u0000\u0000^\\\u0001\u0000\u0000\u0000_`\u0005\u0002\u0000\u0000`a\u0003"
          + "\u0006\u0003\u0000ab\u0006\u0004\uffff\uffff\u0000b\t\u0001\u0000\u0000"
          + "\u0000cd\u0005\f\u0000\u0000de\u00055\u0000\u0000ef\u0005\r\u0000\u0000"
          + "fg\u0003\f\u0006\u0000gh\u0005\u000e\u0000\u0000hi\u0005\u0002\u0000\u0000"
          + "ij\u0003\u0012\t\u0000jn\u0005\n\u0000\u0000km\u0003\u0002\u0001\u0000"
          + "lk\u0001\u0000\u0000\u0000mp\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000"
          + "\u0000no\u0001\u0000\u0000\u0000ot\u0001\u0000\u0000\u0000pn\u0001\u0000"
          + "\u0000\u0000qs\u0003\u0014\n\u0000rq\u0001\u0000\u0000\u0000sv\u0001\u0000"
          + "\u0000\u0000tr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000uw\u0001"
          + "\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000wx\u0005\u000b\u0000\u0000"
          + "xy\u0006\u0005\uffff\uffff\u0000y\u000b\u0001\u0000\u0000\u0000z\u007f"
          + "\u0003\u000e\u0007\u0000{|\u0005\u0001\u0000\u0000|~\u0003\u000e\u0007"
          + "\u0000}{\u0001\u0000\u0000\u0000~\u0081\u0001\u0000\u0000\u0000\u007f"
          + "}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u0083"
          + "\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0082z\u0001"
          + "\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0084\u0001"
          + "\u0000\u0000\u0000\u0084\u0085\u0006\u0006\uffff\uffff\u0000\u0085\r\u0001"
          + "\u0000\u0000\u0000\u0086\u0087\u00055\u0000\u0000\u0087\u0088\u0005\u0002"
          + "\u0000\u0000\u0088\u0089\u0003\u0004\u0002\u0000\u0089\u008a\u0006\u0007"
          + "\uffff\uffff\u0000\u008a\u000f\u0001\u0000\u0000\u0000\u008b\u0090\u0003"
          + "\u0018\f\u0000\u008c\u008d\u0005\u0001\u0000\u0000\u008d\u008f\u0003\u0018"
          + "\f\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008f\u0092\u0001\u0000\u0000"
          + "\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000"
          + "\u0000\u0091\u0094\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000"
          + "\u0000\u0093\u008b\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000"
          + "\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0096\u0006\b\uffff\uffff"
          + "\u0000\u0096\u0011\u0001\u0000\u0000\u0000\u0097\u0098\u0005\u000f\u0000"
          + "\u0000\u0098\u009d\u0006\t\uffff\uffff\u0000\u0099\u009a\u0003\u0004\u0002"
          + "\u0000\u009a\u009b\u0006\t\uffff\uffff\u0000\u009b\u009d\u0001\u0000\u0000"
          + "\u0000\u009c\u0097\u0001\u0000\u0000\u0000\u009c\u0099\u0001\u0000\u0000"
          + "\u0000\u009d\u0013\u0001\u0000\u0000\u0000\u009e\u009f\u00055\u0000\u0000"
          + "\u009f\u00a0\u0005\r\u0000\u0000\u00a0\u00a1\u0003\u0010\b\u0000\u00a1"
          + "\u00a2\u0005\u000e\u0000\u0000\u00a2\u00a3\u0006\n\uffff\uffff\u0000\u00a3"
          + "\u00fc\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005\u0010\u0000\u0000\u00a5"
          + "\u00a6\u0003\u0018\f\u0000\u00a6\u00aa\u0005\n\u0000\u0000\u00a7\u00a9"
          + "\u0003\u0014\n\u0000\u00a8\u00a7\u0001\u0000\u0000\u0000\u00a9\u00ac\u0001"
          + "\u0000\u0000\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001"
          + "\u0000\u0000\u0000\u00ab\u00b4\u0001\u0000\u0000\u0000\u00ac\u00aa\u0001"
          + "\u0000\u0000\u0000\u00ad\u00b1\u0005\u0011\u0000\u0000\u00ae\u00b0\u0003"
          + "\u0014\n\u0000\u00af\u00ae\u0001\u0000\u0000\u0000\u00b0\u00b3\u0001\u0000"
          + "\u0000\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000"
          + "\u0000\u0000\u00b2\u00b5\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000"
          + "\u0000\u0000\u00b4\u00ad\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000"
          + "\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005\u000b"
          + "\u0000\u0000\u00b7\u00b8\u0006\n\uffff\uffff\u0000\u00b8\u00fc\u0001\u0000"
          + "\u0000\u0000\u00b9\u00ba\u0005\u0012\u0000\u0000\u00ba\u00bf\u0003\u0018"
          + "\f\u0000\u00bb\u00bc\u0005\u0001\u0000\u0000\u00bc\u00be\u0003\u0018\f"
          + "\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00be\u00c1\u0001\u0000\u0000"
          + "\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000"
          + "\u0000\u00c0\u00c2\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000"
          + "\u0000\u00c2\u00c3\u0006\n\uffff\uffff\u0000\u00c3\u00fc\u0001\u0000\u0000"
          + "\u0000\u00c4\u00c5\u0005\u0013\u0000\u0000\u00c5\u00ca\u0003\u0018\f\u0000"
          + "\u00c6\u00c7\u0005\u0001\u0000\u0000\u00c7\u00c9\u0003\u0018\f\u0000\u00c8"
          + "\u00c6\u0001\u0000\u0000\u0000\u00c9\u00cc\u0001\u0000\u0000\u0000\u00ca"
          + "\u00c8\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb"
          + "\u00cd\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cd"
          + "\u00ce\u0006\n\uffff\uffff\u0000\u00ce\u00fc\u0001\u0000\u0000\u0000\u00cf"
          + "\u00d0\u0003\u0018\f\u0000\u00d0\u00d1\u0005\u0014\u0000\u0000\u00d1\u00d2"
          + "\u0003\u0018\f\u0000\u00d2\u00d3\u0006\n\uffff\uffff\u0000\u00d3\u00fc"
          + "\u0001\u0000\u0000\u0000\u00d4\u00d5\u0003\u0018\f\u0000\u00d5\u00d6\u0005"
          + "\u0015\u0000\u0000\u00d6\u00d7\u0003\u0018\f\u0000\u00d7\u00d8\u0006\n"
          + "\uffff\uffff\u0000\u00d8\u00fc\u0001\u0000\u0000\u0000\u00d9\u00da\u0005"
          + "\u0016\u0000\u0000\u00da\u00db\u0005\r\u0000\u0000\u00db\u00dc\u0003\u0018"
          + "\f\u0000\u00dc\u00dd\u0005\u000e\u0000\u0000\u00dd\u00e1\u0005\u0017\u0000"
          + "\u0000\u00de\u00e0\u0003\u0016\u000b\u0000\u00df\u00de\u0001\u0000\u0000"
          + "\u0000\u00e0\u00e3\u0001\u0000\u0000\u0000\u00e1\u00df\u0001\u0000\u0000"
          + "\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2\u00e4\u0001\u0000\u0000"
          + "\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e4\u00e5\u0005\u0018\u0000"
          + "\u0000\u00e5\u00e6\u0005\u0019\u0000\u0000\u00e6\u00e7\u0003\u0014\n\u0000"
          + "\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8\u00e9\u0005\u001a\u0000\u0000"
          + "\u00e9\u00ea\u0006\n\uffff\uffff\u0000\u00ea\u00fc\u0001\u0000\u0000\u0000"
          + "\u00eb\u00ec\u0005\u001b\u0000\u0000\u00ec\u00ed\u0003\u0018\f\u0000\u00ed"
          + "\u00f1\u0005\n\u0000\u0000\u00ee\u00f0\u0003\u0014\n\u0000\u00ef\u00ee"
          + "\u0001\u0000\u0000\u0000\u00f0\u00f3\u0001\u0000\u0000\u0000\u00f1\u00ef"
          + "\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000\u0000\u00f2\u00f4"
          + "\u0001\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f4\u00f5"
          + "\u0005\u000b\u0000\u0000\u00f5\u00f6\u0006\n\uffff\uffff\u0000\u00f6\u00fc"
          + "\u0001\u0000\u0000\u0000\u00f7\u00f8\u0005\u001c\u0000\u0000\u00f8\u00f9"
          + "\u0003\u0018\f\u0000\u00f9\u00fa\u0006\n\uffff\uffff\u0000\u00fa\u00fc"
          + "\u0001\u0000\u0000\u0000\u00fb\u009e\u0001\u0000\u0000\u0000\u00fb\u00a4"
          + "\u0001\u0000\u0000\u0000\u00fb\u00b9\u0001\u0000\u0000\u0000\u00fb\u00c4"
          + "\u0001\u0000\u0000\u0000\u00fb\u00cf\u0001\u0000\u0000\u0000\u00fb\u00d4"
          + "\u0001\u0000\u0000\u0000\u00fb\u00d9\u0001\u0000\u0000\u0000\u00fb\u00eb"
          + "\u0001\u0000\u0000\u0000\u00fb\u00f7\u0001\u0000\u0000\u0000\u00fc\u0015"
          + "\u0001\u0000\u0000\u0000\u00fd\u00fe\u0006\u000b\uffff\uffff\u0000\u00fe"
          + "\u0105\u0005\u001d\u0000\u0000\u00ff\u0100\u00056\u0000\u0000\u0100\u0106"
          + "\u0006\u000b\uffff\uffff\u0000\u0101\u0102\u00053\u0000\u0000\u0102\u0106"
          + "\u0006\u000b\uffff\uffff\u0000\u0103\u0104\u00054\u0000\u0000\u0104\u0106"
          + "\u0006\u000b\uffff\uffff\u0000\u0105\u00ff\u0001\u0000\u0000\u0000\u0105"
          + "\u0101\u0001\u0000\u0000\u0000\u0105\u0103\u0001\u0000\u0000\u0000\u0106"
          + "\u0107\u0001\u0000\u0000\u0000\u0107\u0108\u0005\u0019\u0000\u0000\u0108"
          + "\u0109\u0003\u0014\n\u0000\u0109\u010c\u0006\u000b\uffff\uffff\u0000\u010a"
          + "\u010b\u0005\u001e\u0000\u0000\u010b\u010d\u0006\u000b\uffff\uffff\u0000"
          + "\u010c\u010a\u0001\u0000\u0000\u0000\u010c\u010d\u0001\u0000\u0000\u0000"
          + "\u010d\u0017\u0001\u0000\u0000\u0000\u010e\u010f\u0006\f\uffff\uffff\u0000"
          + "\u010f\u0110\u00055\u0000\u0000\u0110\u0111\u0005\r\u0000\u0000\u0111"
          + "\u0112\u0003\u0010\b\u0000\u0112\u0113\u0005\u000e\u0000\u0000\u0113\u0114"
          + "\u0006\f\uffff\uffff\u0000\u0114\u0138\u0001\u0000\u0000\u0000\u0115\u0116"
          + "\u0005\r\u0000\u0000\u0116\u0117\u0003\u0018\f\u0000\u0117\u0118\u0005"
          + "\u000e\u0000\u0000\u0118\u0119\u0006\f\uffff\uffff\u0000\u0119\u0138\u0001"
          + "\u0000\u0000\u0000\u011a\u011b\u0005!\u0000\u0000\u011b\u011c\u0003\u0018"
          + "\f\r\u011c\u011d\u0006\f\uffff\uffff\u0000\u011d\u0138\u0001\u0000\u0000"
          + "\u0000\u011e\u011f\u0005\"\u0000\u0000\u011f\u0120\u0003\u0018\f\f\u0120"
          + "\u0121\u0006\f\uffff\uffff\u0000\u0121\u0138\u0001\u0000\u0000\u0000\u0122"
          + "\u0123\u0005\r\u0000\u0000\u0123\u0124\u0003\u0018\f\u0000\u0124\u0125"
          + "\u0005\u000e\u0000\u0000\u0125\u0126\u0005#\u0000\u0000\u0126\u0127\u0003"
          + "\u0018\f\u0000\u0127\u0128\u0005\u0019\u0000\u0000\u0128\u0129\u0003\u0018"
          + "\f\u000b\u0129\u012a\u0006\f\uffff\uffff\u0000\u012a\u0138\u0001\u0000"
          + "\u0000\u0000\u012b\u012c\u00055\u0000\u0000\u012c\u0138\u0006\f\uffff"
          + "\uffff\u0000\u012d\u012e\u00050\u0000\u0000\u012e\u0138\u0006\f\uffff"
          + "\uffff\u0000\u012f\u0130\u00051\u0000\u0000\u0130\u0138\u0006\f\uffff"
          + "\uffff\u0000\u0131\u0132\u00053\u0000\u0000\u0132\u0138\u0006\f\uffff"
          + "\uffff\u0000\u0133\u0134\u00054\u0000\u0000\u0134\u0138\u0006\f\uffff"
          + "\uffff\u0000\u0135\u0136\u00056\u0000\u0000\u0136\u0138\u0006\f\uffff"
          + "\uffff\u0000\u0137\u010e\u0001\u0000\u0000\u0000\u0137\u0115\u0001\u0000"
          + "\u0000\u0000\u0137\u011a\u0001\u0000\u0000\u0000\u0137\u011e\u0001\u0000"
          + "\u0000\u0000\u0137\u0122\u0001\u0000\u0000\u0000\u0137\u012b\u0001\u0000"
          + "\u0000\u0000\u0137\u012d\u0001\u0000\u0000\u0000\u0137\u012f\u0001\u0000"
          + "\u0000\u0000\u0137\u0131\u0001\u0000\u0000\u0000\u0137\u0133\u0001\u0000"
          + "\u0000\u0000\u0137\u0135\u0001\u0000\u0000\u0000\u0138\u015e\u0001\u0000"
          + "\u0000\u0000\u0139\u013a\n\n\u0000\u0000\u013a\u013b\u0007\u0000\u0000"
          + "\u0000\u013b\u013c\u0003\u0018\f\u000b\u013c\u013d\u0006\f\uffff\uffff"
          + "\u0000\u013d\u015d\u0001\u0000\u0000\u0000\u013e\u013f\n\t\u0000\u0000"
          + "\u013f\u0140\u0007\u0001\u0000\u0000\u0140\u0141\u0003\u0018\f\n\u0141"
          + "\u0142\u0006\f\uffff\uffff\u0000\u0142\u015d\u0001\u0000\u0000\u0000\u0143"
          + "\u0144\n\b\u0000\u0000\u0144\u0145\u0007\u0002\u0000\u0000\u0145\u0146"
          + "\u0003\u0018\f\t\u0146\u0147\u0006\f\uffff\uffff\u0000\u0147\u015d\u0001"
          + "\u0000\u0000\u0000\u0148\u0149\n\u0007\u0000\u0000\u0149\u014a\u0007\u0003"
          + "\u0000\u0000\u014a\u014b\u0003\u0018\f\b\u014b\u014c\u0006\f\uffff\uffff"
          + "\u0000\u014c\u015d\u0001\u0000\u0000\u0000\u014d\u014e\n\u0010\u0000\u0000"
          + "\u014e\u014f\u0005\u0007\u0000\u0000\u014f\u0150\u0003\u0018\f\u0000\u0150"
          + "\u0151\u0005\b\u0000\u0000\u0151\u0152\u0006\f\uffff\uffff\u0000\u0152"
          + "\u015d\u0001\u0000\u0000\u0000\u0153\u0154\n\u000f\u0000\u0000\u0154\u0155"
          + "\u0005\u001f\u0000\u0000\u0155\u0156\u00055\u0000\u0000\u0156\u015d\u0006"
          + "\f\uffff\uffff\u0000\u0157\u0158\n\u000e\u0000\u0000\u0158\u0159\u0005"
          + " \u0000\u0000\u0159\u015a\u0003\u0004\u0002\u0000\u015a\u015b\u0006\f"
          + "\uffff\uffff\u0000\u015b\u015d\u0001\u0000\u0000\u0000\u015c\u0139\u0001"
          + "\u0000\u0000\u0000\u015c\u013e\u0001\u0000\u0000\u0000\u015c\u0143\u0001"
          + "\u0000\u0000\u0000\u015c\u0148\u0001\u0000\u0000\u0000\u015c\u014d\u0001"
          + "\u0000\u0000\u0000\u015c\u0153\u0001\u0000\u0000\u0000\u015c\u0157\u0001"
          + "\u0000\u0000\u0000\u015d\u0160\u0001\u0000\u0000\u0000\u015e\u015c\u0001"
          + "\u0000\u0000\u0000\u015e\u015f\u0001\u0000\u0000\u0000\u015f\u0019\u0001"
          + "\u0000\u0000\u0000\u0160\u015e\u0001\u0000\u0000\u0000\u0161\u0162\u0005"
          + "\f\u0000\u0000\u0162\u0163\u00052\u0000\u0000\u0163\u0164\u0005\r\u0000"
          + "\u0000\u0164\u0165\u0005\u000e\u0000\u0000\u0165\u016a\u0005\n\u0000\u0000"
          + "\u0166\u0169\u0003\u0002\u0001\u0000\u0167\u0169\u0003\u0014\n\u0000\u0168"
          + "\u0166\u0001\u0000\u0000\u0000\u0168\u0167\u0001\u0000\u0000\u0000\u0169"
          + "\u016c\u0001\u0000\u0000\u0000\u016a\u0168\u0001\u0000\u0000\u0000\u016a"
          + "\u016b\u0001\u0000\u0000\u0000\u016b\u016d\u0001\u0000\u0000\u0000\u016c"
          + "\u016a\u0001\u0000\u0000\u0000\u016d\u016e\u0005\u000b\u0000\u0000\u016e"
          + "\u016f\u0006\r\uffff\uffff\u0000\u016f\u001b\u0001\u0000\u0000\u0000\u001d"
          + "\u001f%0?PU\\nt\u007f\u0082\u0090\u0093\u009c\u00aa\u00b1\u00b4\u00bf"
          + "\u00ca\u00e1\u00f1\u00fb\u0105\u010c\u0137\u015c\u015e\u0168\u016a";
  public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());

  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}
