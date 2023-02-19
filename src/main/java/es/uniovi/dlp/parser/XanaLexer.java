// Generated from java-escape by ANTLR 4.11.1

package es.uniovi.dlp.parser;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class XanaLexer extends Lexer {
  static {
    RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION);
  }

  protected static final DFA[] _decisionToDFA;
  protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
  public static final int INT_CONSTANT = 1,
      REAL_CONSTANT = 2,
      ID = 3,
      CHAR_CONSTANT = 4,
      COMENTARIO_SIMPLE = 5,
      COMENTARIO_MULTILINEA = 6;
  public static String[] channelNames = {"DEFAULT_TOKEN_CHANNEL", "HIDDEN"};

  public static String[] modeNames = {"DEFAULT_MODE"};

  private static String[] makeRuleNames() {
    return new String[] {
      "INT",
      "INT_CONSTANT",
      "REAL",
      "REAL_CONSTANT",
      "ID",
      "CHAR_CONSTANT",
      "COMENTARIO_SIMPLE",
      "COMENTARIO_MULTILINEA"
    };
  }

  public static final String[] ruleNames = makeRuleNames();

  private static String[] makeLiteralNames() {
    return new String[] {};
  }

  private static final String[] _LITERAL_NAMES = makeLiteralNames();

  private static String[] makeSymbolicNames() {
    return new String[] {
      null,
      "INT_CONSTANT",
      "REAL_CONSTANT",
      "ID",
      "CHAR_CONSTANT",
      "COMENTARIO_SIMPLE",
      "COMENTARIO_MULTILINEA"
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

  public XanaLexer(CharStream input) {
    super(input);
    _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
  }

  @Override
  public String getGrammarFileName() {
    return "Xana.g4";
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
  public String[] getChannelNames() {
    return channelNames;
  }

  @Override
  public String[] getModeNames() {
    return modeNames;
  }

  @Override
  public ATN getATN() {
    return _ATN;
  }

  public static final String _serializedATN =
      "\u0004\u0000\u0006z\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"
          + "\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"
          + "\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"
          + "\u0007\u0007\u0001\u0000\u0004\u0000\u0013\b\u0000\u000b\u0000\f\u0000"
          + "\u0014\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0004\u0002\u001b"
          + "\b\u0002\u000b\u0002\f\u0002\u001c\u0001\u0002\u0004\u0002 \b\u0002\u000b"
          + "\u0002\f\u0002!\u0001\u0002\u0001\u0002\u0004\u0002&\b\u0002\u000b\u0002"
          + "\f\u0002\'\u0003\u0002*\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"
          + "\u0003\u0004\u00030\b\u0003\u000b\u0003\f\u00031\u0001\u0003\u0004\u0003"
          + "5\b\u0003\u000b\u0003\f\u00036\u0001\u0003\u0001\u0003\u0004\u0003;\b"
          + "\u0003\u000b\u0003\f\u0003<\u0001\u0003\u0004\u0003@\b\u0003\u000b\u0003"
          + "\f\u0003A\u0001\u0003\u0001\u0003\u0004\u0003F\b\u0003\u000b\u0003\f\u0003"
          + "G\u0003\u0003J\b\u0003\u0001\u0004\u0001\u0004\u0005\u0004N\b\u0004\n"
          + "\u0004\f\u0004Q\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"
          + "\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005[\b\u0005"
          + "\u0001\u0005\u0003\u0005^\b\u0005\u0001\u0006\u0001\u0006\u0005\u0006"
          + "b\b\u0006\n\u0006\f\u0006e\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006"
          + "\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"
          + "\u0005\u0007p\b\u0007\n\u0007\f\u0007s\t\u0007\u0001\u0007\u0001\u0007"
          + "\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0002cq\u0000\b\u0001"
          + "\u0000\u0003\u0001\u0005\u0000\u0007\u0002\t\u0003\u000b\u0004\r\u0005"
          + "\u000f\u0006\u0001\u0000\t\u0001\u000009\u0001\u0000..\u0002\u0000--0"
          + "9\u0002\u0000--EE\u0002\u0000++ee\u0002\u0000--ee\u0002\u0000AZaz\u0004"
          + "\u000009AZ__az\u0002\u0000nntt\u0089\u0000\u0003\u0001\u0000\u0000\u0000"
          + "\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"
          + "\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"
          + "\u0001\u0000\u0000\u0000\u0001\u0012\u0001\u0000\u0000\u0000\u0003\u0016"
          + "\u0001\u0000\u0000\u0000\u0005)\u0001\u0000\u0000\u0000\u0007I\u0001\u0000"
          + "\u0000\u0000\tK\u0001\u0000\u0000\u0000\u000b]\u0001\u0000\u0000\u0000"
          + "\r_\u0001\u0000\u0000\u0000\u000fj\u0001\u0000\u0000\u0000\u0011\u0013"
          + "\u0007\u0000\u0000\u0000\u0012\u0011\u0001\u0000\u0000\u0000\u0013\u0014"
          + "\u0001\u0000\u0000\u0000\u0014\u0012\u0001\u0000\u0000\u0000\u0014\u0015"
          + "\u0001\u0000\u0000\u0000\u0015\u0002\u0001\u0000\u0000\u0000\u0016\u0017"
          + "\u0003\u0001\u0000\u0000\u0017\u0004\u0001\u0000\u0000\u0000\u0018\u001a"
          + "\u0007\u0001\u0000\u0000\u0019\u001b\u0007\u0000\u0000\u0000\u001a\u0019"
          + "\u0001\u0000\u0000\u0000\u001b\u001c\u0001\u0000\u0000\u0000\u001c\u001a"
          + "\u0001\u0000\u0000\u0000\u001c\u001d\u0001\u0000\u0000\u0000\u001d*\u0001"
          + "\u0000\u0000\u0000\u001e \u0007\u0000\u0000\u0000\u001f\u001e\u0001\u0000"
          + "\u0000\u0000 !\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000"
          + "!\"\u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000\u0000#%\u0007\u0001\u0000"
          + "\u0000$&\u0007\u0002\u0000\u0000%$\u0001\u0000\u0000\u0000&\'\u0001\u0000"
          + "\u0000\u0000\'%\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000(*\u0001"
          + "\u0000\u0000\u0000)\u0018\u0001\u0000\u0000\u0000)\u001f\u0001\u0000\u0000"
          + "\u0000*\u0006\u0001\u0000\u0000\u0000+J\u0003\u0005\u0002\u0000,-\u0003"
          + "\u0005\u0002\u0000-/\u0007\u0003\u0000\u0000.0\u0007\u0000\u0000\u0000"
          + "/.\u0001\u0000\u0000\u000001\u0001\u0000\u0000\u00001/\u0001\u0000\u0000"
          + "\u000012\u0001\u0000\u0000\u00002J\u0001\u0000\u0000\u000035\u0007\u0000"
          + "\u0000\u000043\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u000064\u0001"
          + "\u0000\u0000\u000067\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u0000"
          + "8:\u0007\u0004\u0000\u00009;\u0007\u0000\u0000\u0000:9\u0001\u0000\u0000"
          + "\u0000;<\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000<=\u0001\u0000"
          + "\u0000\u0000=J\u0001\u0000\u0000\u0000>@\u0007\u0000\u0000\u0000?>\u0001"
          + "\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000"
          + "AB\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000CE\u0007\u0005\u0000"
          + "\u0000DF\u0007\u0000\u0000\u0000ED\u0001\u0000\u0000\u0000FG\u0001\u0000"
          + "\u0000\u0000GE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000HJ\u0001"
          + "\u0000\u0000\u0000I+\u0001\u0000\u0000\u0000I,\u0001\u0000\u0000\u0000"
          + "I4\u0001\u0000\u0000\u0000I?\u0001\u0000\u0000\u0000J\b\u0001\u0000\u0000"
          + "\u0000KO\u0007\u0006\u0000\u0000LN\u0007\u0007\u0000\u0000ML\u0001\u0000"
          + "\u0000\u0000NQ\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000OP\u0001"
          + "\u0000\u0000\u0000P\n\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000"
          + "RS\u0005\'\u0000\u0000ST\t\u0000\u0000\u0000T^\u0005\'\u0000\u0000UV\u0005"
          + "\'\u0000\u0000VW\u0005\\\u0000\u0000WZ\u0001\u0000\u0000\u0000X[\u0003"
          + "\u0001\u0000\u0000Y[\u0007\b\u0000\u0000ZX\u0001\u0000\u0000\u0000ZY\u0001"
          + "\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\^\u0005\'\u0000\u0000]"
          + "R\u0001\u0000\u0000\u0000]U\u0001\u0000\u0000\u0000^\f\u0001\u0000\u0000"
          + "\u0000_c\u0005#\u0000\u0000`b\t\u0000\u0000\u0000a`\u0001\u0000\u0000"
          + "\u0000be\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000ca\u0001\u0000"
          + "\u0000\u0000df\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000fg\u0005"
          + "\n\u0000\u0000gh\u0001\u0000\u0000\u0000hi\u0006\u0006\u0000\u0000i\u000e"
          + "\u0001\u0000\u0000\u0000jk\u0005\"\u0000\u0000kl\u0005\"\u0000\u0000l"
          + "m\u0005\"\u0000\u0000mq\u0001\u0000\u0000\u0000np\t\u0000\u0000\u0000"
          + "on\u0001\u0000\u0000\u0000ps\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000"
          + "\u0000qo\u0001\u0000\u0000\u0000rt\u0001\u0000\u0000\u0000sq\u0001\u0000"
          + "\u0000\u0000tu\u0005\"\u0000\u0000uv\u0005\"\u0000\u0000vw\u0005\"\u0000"
          + "\u0000wx\u0001\u0000\u0000\u0000xy\u0006\u0007\u0000\u0000y\u0010\u0001"
          + "\u0000\u0000\u0000\u0011\u0000\u0014\u001c!\')16<AGIOZ]cq\u0001\u0006"
          + "\u0000\u0000";
  public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());

  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}
