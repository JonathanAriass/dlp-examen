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
      COMENTARIO_MULTILINEA = 6,
      TRASH = 7;
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
      "COMENTARIO_MULTILINEA",
      "TRASH"
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
      "\u0004\u0000\u0007\u0091\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"
          + "\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"
          + "\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"
          + "\u0007\u0007\u0007\u0002\b\u0007\b\u0001\u0000\u0004\u0000\u0015\b\u0000"
          + "\u000b\u0000\f\u0000\u0016\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"
          + "\u0004\u0002\u001d\b\u0002\u000b\u0002\f\u0002\u001e\u0001\u0002\u0004"
          + "\u0002\"\b\u0002\u000b\u0002\f\u0002#\u0001\u0002\u0001\u0002\u0004\u0002"
          + "(\b\u0002\u000b\u0002\f\u0002)\u0001\u0002\u0004\u0002-\b\u0002\u000b"
          + "\u0002\f\u0002.\u0001\u0002\u0003\u00022\b\u0002\u0001\u0003\u0001\u0003"
          + "\u0001\u0003\u0001\u0003\u0003\u00038\b\u0003\u0001\u0003\u0004\u0003"
          + ";\b\u0003\u000b\u0003\f\u0003<\u0001\u0003\u0001\u0003\u0001\u0003\u0003"
          + "\u0003B\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0004\u0003G\b\u0003"
          + "\u000b\u0003\f\u0003H\u0001\u0003\u0001\u0003\u0004\u0003M\b\u0003\u000b"
          + "\u0003\f\u0003N\u0001\u0003\u0004\u0003R\b\u0003\u000b\u0003\f\u0003S"
          + "\u0001\u0003\u0001\u0003\u0004\u0003X\b\u0003\u000b\u0003\f\u0003Y\u0003"
          + "\u0003\\\b\u0003\u0001\u0004\u0001\u0004\u0005\u0004`\b\u0004\n\u0004"
          + "\f\u0004c\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"
          + "\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005m\b\u0005\u0001"
          + "\u0005\u0003\u0005p\b\u0005\u0001\u0006\u0001\u0006\u0005\u0006t\b\u0006"
          + "\n\u0006\f\u0006w\t\u0006\u0001\u0006\u0003\u0006z\b\u0006\u0001\u0006"
          + "\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"
          + "\u0005\u0007\u0083\b\u0007\n\u0007\f\u0007\u0086\t\u0007\u0001\u0007\u0001"
          + "\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b"
          + "\u0001\b\u0001\b\u0002u\u0084\u0000\t\u0001\u0000\u0003\u0001\u0005\u0000"
          + "\u0007\u0002\t\u0003\u000b\u0004\r\u0005\u000f\u0006\u0011\u0007\u0001"
          + "\u0000\u000b\u0001\u000009\u0001\u0000..\u0002\u0000--09\u0002\u0000+"
          + "+--\u0002\u0000++ee\u0002\u0000--ee\u0003\u0000AZ__az\u0004\u000009AZ"
          + "__az\u0002\u0000nntt\u0001\u0001\n\n\u0003\u0000\t\n\r\r  \u00a5\u0000"
          + "\u0003\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"
          + "\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"
          + "\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"
          + "\u0001\u0000\u0000\u0000\u0001\u0014\u0001\u0000\u0000\u0000\u0003\u0018"
          + "\u0001\u0000\u0000\u0000\u00051\u0001\u0000\u0000\u0000\u0007[\u0001\u0000"
          + "\u0000\u0000\t]\u0001\u0000\u0000\u0000\u000bo\u0001\u0000\u0000\u0000"
          + "\rq\u0001\u0000\u0000\u0000\u000f}\u0001\u0000\u0000\u0000\u0011\u008d"
          + "\u0001\u0000\u0000\u0000\u0013\u0015\u0007\u0000\u0000\u0000\u0014\u0013"
          + "\u0001\u0000\u0000\u0000\u0015\u0016\u0001\u0000\u0000\u0000\u0016\u0014"
          + "\u0001\u0000\u0000\u0000\u0016\u0017\u0001\u0000\u0000\u0000\u0017\u0002"
          + "\u0001\u0000\u0000\u0000\u0018\u0019\u0003\u0001\u0000\u0000\u0019\u0004"
          + "\u0001\u0000\u0000\u0000\u001a\u001c\u0007\u0001\u0000\u0000\u001b\u001d"
          + "\u0007\u0000\u0000\u0000\u001c\u001b\u0001\u0000\u0000\u0000\u001d\u001e"
          + "\u0001\u0000\u0000\u0000\u001e\u001c\u0001\u0000\u0000\u0000\u001e\u001f"
          + "\u0001\u0000\u0000\u0000\u001f2\u0001\u0000\u0000\u0000 \"\u0007\u0000"
          + "\u0000\u0000! \u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000\u0000#!\u0001"
          + "\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$%\u0001\u0000\u0000\u0000"
          + "%\'\u0007\u0001\u0000\u0000&(\u0007\u0002\u0000\u0000\'&\u0001\u0000\u0000"
          + "\u0000()\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000)*\u0001\u0000"
          + "\u0000\u0000*2\u0001\u0000\u0000\u0000+-\u0007\u0000\u0000\u0000,+\u0001"
          + "\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000"
          + "./\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u000002\u0007\u0001\u0000"
          + "\u00001\u001a\u0001\u0000\u0000\u00001!\u0001\u0000\u0000\u00001,\u0001"
          + "\u0000\u0000\u00002\u0006\u0001\u0000\u0000\u00003\\\u0003\u0005\u0002"
          + "\u000045\u0003\u0005\u0002\u000057\u0005E\u0000\u000068\u0007\u0003\u0000"
          + "\u000076\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u00008:\u0001\u0000"
          + "\u0000\u00009;\u0007\u0000\u0000\u0000:9\u0001\u0000\u0000\u0000;<\u0001"
          + "\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000"
          + "=\\\u0001\u0000\u0000\u0000>?\u0003\u0005\u0002\u0000?A\u0005E\u0000\u0000"
          + "@B\u0007\u0003\u0000\u0000A@\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000"
          + "\u0000BC\u0001\u0000\u0000\u0000CD\u0003\u0007\u0003\u0000D\\\u0001\u0000"
          + "\u0000\u0000EG\u0007\u0000\u0000\u0000FE\u0001\u0000\u0000\u0000GH\u0001"
          + "\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000"
          + "IJ\u0001\u0000\u0000\u0000JL\u0007\u0004\u0000\u0000KM\u0007\u0000\u0000"
          + "\u0000LK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NL\u0001\u0000"
          + "\u0000\u0000NO\u0001\u0000\u0000\u0000O\\\u0001\u0000\u0000\u0000PR\u0007"
          + "\u0000\u0000\u0000QP\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000"
          + "SQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000"
          + "\u0000UW\u0007\u0005\u0000\u0000VX\u0007\u0000\u0000\u0000WV\u0001\u0000"
          + "\u0000\u0000XY\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000YZ\u0001"
          + "\u0000\u0000\u0000Z\\\u0001\u0000\u0000\u0000[3\u0001\u0000\u0000\u0000"
          + "[4\u0001\u0000\u0000\u0000[>\u0001\u0000\u0000\u0000[F\u0001\u0000\u0000"
          + "\u0000[Q\u0001\u0000\u0000\u0000\\\b\u0001\u0000\u0000\u0000]a\u0007\u0006"
          + "\u0000\u0000^`\u0007\u0007\u0000\u0000_^\u0001\u0000\u0000\u0000`c\u0001"
          + "\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000"
          + "b\n\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000de\u0005\'\u0000"
          + "\u0000ef\t\u0000\u0000\u0000fp\u0005\'\u0000\u0000gh\u0005\'\u0000\u0000"
          + "hi\u0005\\\u0000\u0000il\u0001\u0000\u0000\u0000jm\u0003\u0001\u0000\u0000"
          + "km\u0007\b\u0000\u0000lj\u0001\u0000\u0000\u0000lk\u0001\u0000\u0000\u0000"
          + "mn\u0001\u0000\u0000\u0000np\u0005\'\u0000\u0000od\u0001\u0000\u0000\u0000"
          + "og\u0001\u0000\u0000\u0000p\f\u0001\u0000\u0000\u0000qu\u0005#\u0000\u0000"
          + "rt\t\u0000\u0000\u0000sr\u0001\u0000\u0000\u0000tw\u0001\u0000\u0000\u0000"
          + "uv\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000vy\u0001\u0000\u0000"
          + "\u0000wu\u0001\u0000\u0000\u0000xz\u0007\t\u0000\u0000yx\u0001\u0000\u0000"
          + "\u0000z{\u0001\u0000\u0000\u0000{|\u0006\u0006\u0000\u0000|\u000e\u0001"
          + "\u0000\u0000\u0000}~\u0005\"\u0000\u0000~\u007f\u0005\"\u0000\u0000\u007f"
          + "\u0080\u0005\"\u0000\u0000\u0080\u0084\u0001\u0000\u0000\u0000\u0081\u0083"
          + "\t\u0000\u0000\u0000\u0082\u0081\u0001\u0000\u0000\u0000\u0083\u0086\u0001"
          + "\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0084\u0082\u0001"
          + "\u0000\u0000\u0000\u0085\u0087\u0001\u0000\u0000\u0000\u0086\u0084\u0001"
          + "\u0000\u0000\u0000\u0087\u0088\u0005\"\u0000\u0000\u0088\u0089\u0005\""
          + "\u0000\u0000\u0089\u008a\u0005\"\u0000\u0000\u008a\u008b\u0001\u0000\u0000"
          + "\u0000\u008b\u008c\u0006\u0007\u0000\u0000\u008c\u0010\u0001\u0000\u0000"
          + "\u0000\u008d\u008e\u0007\n\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000"
          + "\u008f\u0090\u0006\b\u0000\u0000\u0090\u0012\u0001\u0000\u0000\u0000\u0015"
          + "\u0000\u0016\u001e#).17<AHNSY[alouy\u0084\u0001\u0006\u0000\u0000";
  public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());

  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}
