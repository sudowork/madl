// Generated from MADL.g4 by ANTLR 4.4
package madl;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MADLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMPONENT=1, SKIP=2, ID=3;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'"
	};
	public static final String[] ruleNames = {
		"COMPONENT", "SKIP", "ID", "NameChar", "NameStartChar", "COMMENT", "WS", 
		"SPACES", "NEWLINE"
	};


	public MADLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MADL.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\5I\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\5\3\"\n\3\3\3\3\3\3\4\3\4\7\4"+
		"(\n\4\f\4\16\4+\13\4\3\5\3\5\5\5/\n\5\3\6\3\6\3\7\5\7\64\n\7\3\7\3\7\7"+
		"\78\n\7\f\7\16\7;\13\7\3\b\3\b\6\b?\n\b\r\b\16\b@\3\t\6\tD\n\t\r\t\16"+
		"\tE\3\n\3\n\2\2\13\3\3\5\4\7\5\t\2\13\2\r\2\17\2\21\2\23\2\3\2\6\4\2\62"+
		";aa\4\2C\\c|\4\2\f\f\17\17\4\2\13\13\"\"J\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\3\25\3\2\2\2\5!\3\2\2\2\7%\3\2\2\2\t.\3\2\2\2\13\60\3\2\2\2\r"+
		"\63\3\2\2\2\17>\3\2\2\2\21C\3\2\2\2\23G\3\2\2\2\25\26\7e\2\2\26\27\7q"+
		"\2\2\27\30\7o\2\2\30\31\7r\2\2\31\32\7q\2\2\32\33\7p\2\2\33\34\7g\2\2"+
		"\34\35\7p\2\2\35\36\7v\2\2\36\4\3\2\2\2\37\"\5\r\7\2 \"\5\17\b\2!\37\3"+
		"\2\2\2! \3\2\2\2\"#\3\2\2\2#$\b\3\2\2$\6\3\2\2\2%)\5\13\6\2&(\5\t\5\2"+
		"\'&\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*\b\3\2\2\2+)\3\2\2\2,/\5\13"+
		"\6\2-/\t\2\2\2.,\3\2\2\2.-\3\2\2\2/\n\3\2\2\2\60\61\t\3\2\2\61\f\3\2\2"+
		"\2\62\64\5\21\t\2\63\62\3\2\2\2\63\64\3\2\2\2\64\65\3\2\2\2\659\7%\2\2"+
		"\668\n\4\2\2\67\66\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:\16\3\2\2\2"+
		";9\3\2\2\2<?\5\21\t\2=?\5\23\n\2><\3\2\2\2>=\3\2\2\2?@\3\2\2\2@>\3\2\2"+
		"\2@A\3\2\2\2A\20\3\2\2\2BD\t\5\2\2CB\3\2\2\2DE\3\2\2\2EC\3\2\2\2EF\3\2"+
		"\2\2F\22\3\2\2\2GH\t\4\2\2H\24\3\2\2\2\13\2!).\639>@E\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}