// Generated from /home/daniil/uni/sem7/lpis/ern-compiler/src/main/antlr4/de/kovalski/erncompiler/ErnParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ErnParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FUNCTION=1, RETURN=2, IF=3, ELSE=4, WHILE=5, TRUE=6, FALSE=7, AS=8, RETURNS=9, 
		EXPECTS=10, FOR=11, DO=12, INTEGER_LITERAL=13, STRING_LITERAL=14, INTEGER_TYPE=15, 
		STRING_TYPE=16, VECTOR_TYPE=17, MATRIX_TYPE=18, BOOLEAN_TYPE=19, ASSIGN=20, 
		PLUS=21, MINUS=22, MUL=23, DIV=24, PIPE=25, GT=26, LT=27, EQ=28, AND=29, 
		OR=30, NOT=31, LPAREN=32, RPAREN=33, LBRACE=34, RBRACE=35, LBRACK=36, 
		RBRACK=37, COMMA=38, SEMI=39, ID=40, WS=41, COMMENT=42, LINE_COMMENT=43;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_ifStatement = 2, RULE_whileStatement = 3, 
		RULE_doWhileStatement = 4, RULE_forStatement = 5, RULE_expressionList = 6, 
		RULE_functionDef = 7, RULE_block = 8, RULE_paramList = 9, RULE_param = 10, 
		RULE_functionCall = 11, RULE_argList = 12, RULE_expression = 13, RULE_assignmentExpression = 14, 
		RULE_castingExpression = 15, RULE_orExpression = 16, RULE_andExpression = 17, 
		RULE_relationalExpression = 18, RULE_additiveExpression = 19, RULE_multiplicativeExpression = 20, 
		RULE_unaryExpression = 21, RULE_primaryExpression = 22, RULE_extractItem = 23, 
		RULE_typeExpression = 24, RULE_literal = 25, RULE_booleanLiteral = 26, 
		RULE_vectorLiteral = 27, RULE_matrixLiteral = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "ifStatement", "whileStatement", "doWhileStatement", 
			"forStatement", "expressionList", "functionDef", "block", "paramList", 
			"param", "functionCall", "argList", "expression", "assignmentExpression", 
			"castingExpression", "orExpression", "andExpression", "relationalExpression", 
			"additiveExpression", "multiplicativeExpression", "unaryExpression", 
			"primaryExpression", "extractItem", "typeExpression", "literal", "booleanLiteral", 
			"vectorLiteral", "matrixLiteral"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'function'", "'return'", "'if'", "'else'", "'while'", "'true'", 
			"'false'", "'as'", "'returns'", "'expects'", "'for'", "'do'", null, null, 
			"'Int'", "'String'", "'Vector'", "'Matrix'", "'Boolean'", "'='", "'+'", 
			"'-'", "'*'", "'/'", "'|'", "'>'", "'<'", "'=='", "'and'", "'or'", "'not'", 
			"'('", "')'", "'{'", "'}'", "'['", "']'", "','", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FUNCTION", "RETURN", "IF", "ELSE", "WHILE", "TRUE", "FALSE", "AS", 
			"RETURNS", "EXPECTS", "FOR", "DO", "INTEGER_LITERAL", "STRING_LITERAL", 
			"INTEGER_TYPE", "STRING_TYPE", "VECTOR_TYPE", "MATRIX_TYPE", "BOOLEAN_TYPE", 
			"ASSIGN", "PLUS", "MINUS", "MUL", "DIV", "PIPE", "GT", "LT", "EQ", "AND", 
			"OR", "NOT", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", 
			"COMMA", "SEMI", "ID", "WS", "COMMENT", "LINE_COMMENT"
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
	public String getGrammarFileName() { return "ErnParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ErnParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ErnParser.EOF, 0); }
		public List<FunctionDefContext> functionDef() {
			return getRuleContexts(FunctionDefContext.class);
		}
		public FunctionDefContext functionDef(int i) {
			return getRuleContext(FunctionDefContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(58);
				functionDef();
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1191891204328L) != 0)) {
				{
				{
				setState(64);
				statement();
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(70);
			match(EOF);
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
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public DoWhileStatementContext doWhileStatement() {
			return getRuleContext(DoWhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ErnParser.SEMI, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				ifStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				whileStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				doWhileStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(75);
				forStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(76);
				block();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(77);
				functionCall();
				setState(78);
				match(SEMI);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(80);
				expression();
				setState(81);
				match(SEMI);
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
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(ErnParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(ErnParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ErnParser.RPAREN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(ErnParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(IF);
			setState(86);
			match(LPAREN);
			setState(87);
			expression();
			setState(88);
			match(RPAREN);
			setState(89);
			statement();
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(90);
				match(ELSE);
				setState(91);
				statement();
				}
				break;
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
	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(ErnParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(ErnParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ErnParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(WHILE);
			setState(95);
			match(LPAREN);
			setState(96);
			expression();
			setState(97);
			match(RPAREN);
			setState(98);
			block();
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
	public static class DoWhileStatementContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(ErnParser.DO, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(ErnParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(ErnParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ErnParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(ErnParser.SEMI, 0); }
		public DoWhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileStatement; }
	}

	public final DoWhileStatementContext doWhileStatement() throws RecognitionException {
		DoWhileStatementContext _localctx = new DoWhileStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_doWhileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(DO);
			setState(101);
			block();
			setState(102);
			match(WHILE);
			setState(103);
			match(LPAREN);
			setState(104);
			expression();
			setState(105);
			match(RPAREN);
			setState(106);
			match(SEMI);
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
	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(ErnParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(ErnParser.LPAREN, 0); }
		public List<TerminalNode> SEMI() { return getTokens(ErnParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(ErnParser.SEMI, i);
		}
		public TerminalNode RPAREN() { return getToken(ErnParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<ExpressionListContext> expressionList() {
			return getRuleContexts(ExpressionListContext.class);
		}
		public ExpressionListContext expressionList(int i) {
			return getRuleContext(ExpressionListContext.class,i);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(FOR);
			setState(109);
			match(LPAREN);
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1174711328960L) != 0)) {
				{
				setState(110);
				expressionList();
				}
			}

			setState(113);
			match(SEMI);
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1174711328960L) != 0)) {
				{
				setState(114);
				expressionList();
				}
			}

			setState(117);
			match(SEMI);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1174711328960L) != 0)) {
				{
				setState(118);
				expressionList();
				}
			}

			setState(121);
			match(RPAREN);
			setState(122);
			block();
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
	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ErnParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ErnParser.COMMA, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			expression();
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(125);
				match(COMMA);
				setState(126);
				expression();
				}
				}
				setState(131);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDefContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(ErnParser.FUNCTION, 0); }
		public TerminalNode ID() { return getToken(ErnParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(ErnParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ErnParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public FunctionDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDef; }
	}

	public final FunctionDefContext functionDef() throws RecognitionException {
		FunctionDefContext _localctx = new FunctionDefContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_functionDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(FUNCTION);
			setState(133);
			match(ID);
			setState(134);
			match(LPAREN);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURNS || _la==EXPECTS) {
				{
				setState(135);
				paramList();
				}
			}

			setState(138);
			match(RPAREN);
			setState(139);
			block();
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
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(ErnParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ErnParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(LBRACE);
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1191891204328L) != 0)) {
				{
				{
				setState(142);
				statement();
				}
				}
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(148);
			match(RBRACE);
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
		public List<TerminalNode> COMMA() { return getTokens(ErnParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ErnParser.COMMA, i);
		}
		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramList; }
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			param();
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(151);
				match(COMMA);
				setState(152);
				param();
				}
				}
				setState(157);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParamContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ErnParser.ID, 0); }
		public TerminalNode RETURNS() { return getToken(ErnParser.RETURNS, 0); }
		public TerminalNode EXPECTS() { return getToken(ErnParser.EXPECTS, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_la = _input.LA(1);
			if ( !(_la==RETURNS || _la==EXPECTS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(159);
			match(ID);
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
	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ErnParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(ErnParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ErnParser.RPAREN, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(ID);
			setState(162);
			match(LPAREN);
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1174711328960L) != 0)) {
				{
				setState(163);
				argList();
				}
			}

			setState(166);
			match(RPAREN);
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
	public static class ArgListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ErnParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ErnParser.COMMA, i);
		}
		public ArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argList; }
	}

	public final ArgListContext argList() throws RecognitionException {
		ArgListContext _localctx = new ArgListContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_argList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			expression();
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(169);
				match(COMMA);
				setState(170);
				expression();
				}
				}
				setState(175);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			assignmentExpression();
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
	public static class AssignmentExpressionContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(ErnParser.ASSIGN, 0); }
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TerminalNode ID() { return getToken(ErnParser.ID, 0); }
		public ExtractItemContext extractItem() {
			return getRuleContext(ExtractItemContext.class,0);
		}
		public CastingExpressionContext castingExpression() {
			return getRuleContext(CastingExpressionContext.class,0);
		}
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_assignmentExpression);
		try {
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(178);
					match(ID);
					}
					break;
				case 2:
					{
					setState(179);
					extractItem();
					}
					break;
				}
				setState(182);
				match(ASSIGN);
				setState(183);
				assignmentExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				castingExpression();
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
	public static class CastingExpressionContext extends ParserRuleContext {
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(ErnParser.AS, 0); }
		public TypeExpressionContext typeExpression() {
			return getRuleContext(TypeExpressionContext.class,0);
		}
		public CastingExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castingExpression; }
	}

	public final CastingExpressionContext castingExpression() throws RecognitionException {
		CastingExpressionContext _localctx = new CastingExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_castingExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			orExpression();
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(188);
				match(AS);
				setState(189);
				typeExpression();
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
	public static class OrExpressionContext extends ParserRuleContext {
		public List<AndExpressionContext> andExpression() {
			return getRuleContexts(AndExpressionContext.class);
		}
		public AndExpressionContext andExpression(int i) {
			return getRuleContext(AndExpressionContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(ErnParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(ErnParser.OR, i);
		}
		public OrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orExpression; }
	}

	public final OrExpressionContext orExpression() throws RecognitionException {
		OrExpressionContext _localctx = new OrExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_orExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			andExpression();
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(193);
				match(OR);
				setState(194);
				andExpression();
				}
				}
				setState(199);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AndExpressionContext extends ParserRuleContext {
		public List<RelationalExpressionContext> relationalExpression() {
			return getRuleContexts(RelationalExpressionContext.class);
		}
		public RelationalExpressionContext relationalExpression(int i) {
			return getRuleContext(RelationalExpressionContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(ErnParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(ErnParser.AND, i);
		}
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_andExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			relationalExpression();
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(201);
				match(AND);
				setState(202);
				relationalExpression();
				}
				}
				setState(207);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RelationalExpressionContext extends ParserRuleContext {
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public List<TerminalNode> GT() { return getTokens(ErnParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(ErnParser.GT, i);
		}
		public List<TerminalNode> LT() { return getTokens(ErnParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(ErnParser.LT, i);
		}
		public List<TerminalNode> EQ() { return getTokens(ErnParser.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(ErnParser.EQ, i);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_relationalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			additiveExpression();
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 469762048L) != 0)) {
				{
				{
				setState(209);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 469762048L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(210);
				additiveExpression();
				}
				}
				setState(215);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AdditiveExpressionContext extends ParserRuleContext {
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(ErnParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(ErnParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(ErnParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(ErnParser.MINUS, i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			multiplicativeExpression();
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(217);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(218);
				multiplicativeExpression();
				}
				}
				setState(223);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public List<UnaryExpressionContext> unaryExpression() {
			return getRuleContexts(UnaryExpressionContext.class);
		}
		public UnaryExpressionContext unaryExpression(int i) {
			return getRuleContext(UnaryExpressionContext.class,i);
		}
		public List<TerminalNode> MUL() { return getTokens(ErnParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(ErnParser.MUL, i);
		}
		public List<TerminalNode> DIV() { return getTokens(ErnParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(ErnParser.DIV, i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			unaryExpression();
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MUL || _la==DIV) {
				{
				{
				setState(225);
				_la = _input.LA(1);
				if ( !(_la==MUL || _la==DIV) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(226);
				unaryExpression();
				}
				}
				setState(231);
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

	@SuppressWarnings("CheckReturnValue")
	public static class UnaryExpressionContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(ErnParser.NOT, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(ErnParser.MINUS, 0); }
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_unaryExpression);
		try {
			setState(237);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				match(NOT);
				setState(233);
				unaryExpression();
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
				match(MINUS);
				setState(235);
				unaryExpression();
				}
				break;
			case TRUE:
			case FALSE:
			case INTEGER_LITERAL:
			case STRING_LITERAL:
			case PIPE:
			case LPAREN:
			case LBRACK:
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(236);
				primaryExpression();
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
	public static class PrimaryExpressionContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode ID() { return getToken(ErnParser.ID, 0); }
		public ExtractItemContext extractItem() {
			return getRuleContext(ExtractItemContext.class,0);
		}
		public List<TerminalNode> PIPE() { return getTokens(ErnParser.PIPE); }
		public TerminalNode PIPE(int i) {
			return getToken(ErnParser.PIPE, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ErnParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ErnParser.RPAREN, 0); }
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_primaryExpression);
		try {
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(241);
				extractItem();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(242);
				match(PIPE);
				setState(243);
				expression();
				setState(244);
				match(PIPE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(246);
				match(LPAREN);
				setState(247);
				expression();
				setState(248);
				match(RPAREN);
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
	public static class ExtractItemContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ErnParser.ID, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(ErnParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(ErnParser.LBRACK, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(ErnParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(ErnParser.RBRACK, i);
		}
		public ExtractItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extractItem; }
	}

	public final ExtractItemContext extractItem() throws RecognitionException {
		ExtractItemContext _localctx = new ExtractItemContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_extractItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(ID);
			setState(257); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(253);
				match(LBRACK);
				setState(254);
				expression();
				setState(255);
				match(RBRACK);
				}
				}
				setState(259); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LBRACK );
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
	public static class TypeExpressionContext extends ParserRuleContext {
		public TerminalNode INTEGER_TYPE() { return getToken(ErnParser.INTEGER_TYPE, 0); }
		public TerminalNode STRING_TYPE() { return getToken(ErnParser.STRING_TYPE, 0); }
		public TerminalNode VECTOR_TYPE() { return getToken(ErnParser.VECTOR_TYPE, 0); }
		public TerminalNode MATRIX_TYPE() { return getToken(ErnParser.MATRIX_TYPE, 0); }
		public TerminalNode BOOLEAN_TYPE() { return getToken(ErnParser.BOOLEAN_TYPE, 0); }
		public TypeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeExpression; }
	}

	public final TypeExpressionContext typeExpression() throws RecognitionException {
		TypeExpressionContext _localctx = new TypeExpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_typeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1015808L) != 0)) ) {
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
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode INTEGER_LITERAL() { return getToken(ErnParser.INTEGER_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ErnParser.STRING_LITERAL, 0); }
		public VectorLiteralContext vectorLiteral() {
			return getRuleContext(VectorLiteralContext.class,0);
		}
		public MatrixLiteralContext matrixLiteral() {
			return getRuleContext(MatrixLiteralContext.class,0);
		}
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_literal);
		try {
			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(263);
				match(INTEGER_LITERAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				match(STRING_LITERAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(265);
				vectorLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(266);
				matrixLiteral();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(267);
				booleanLiteral();
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
	public static class BooleanLiteralContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(ErnParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(ErnParser.FALSE, 0); }
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_booleanLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
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
	public static class VectorLiteralContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(ErnParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(ErnParser.RBRACK, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public VectorLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vectorLiteral; }
	}

	public final VectorLiteralContext vectorLiteral() throws RecognitionException {
		VectorLiteralContext _localctx = new VectorLiteralContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_vectorLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(LBRACK);
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1174711328960L) != 0)) {
				{
				setState(273);
				argList();
				}
			}

			setState(276);
			match(RBRACK);
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
	public static class MatrixLiteralContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(ErnParser.LBRACK, 0); }
		public List<VectorLiteralContext> vectorLiteral() {
			return getRuleContexts(VectorLiteralContext.class);
		}
		public VectorLiteralContext vectorLiteral(int i) {
			return getRuleContext(VectorLiteralContext.class,i);
		}
		public TerminalNode RBRACK() { return getToken(ErnParser.RBRACK, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ErnParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ErnParser.COMMA, i);
		}
		public MatrixLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrixLiteral; }
	}

	public final MatrixLiteralContext matrixLiteral() throws RecognitionException {
		MatrixLiteralContext _localctx = new MatrixLiteralContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_matrixLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(LBRACK);
			setState(279);
			vectorLiteral();
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(280);
				match(COMMA);
				setState(281);
				vectorLiteral();
				}
				}
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(287);
			match(RBRACK);
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
		"\u0004\u0001+\u0122\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0001\u0000\u0005\u0000<\b\u0000\n\u0000\f\u0000"+
		"?\t\u0000\u0001\u0000\u0005\u0000B\b\u0000\n\u0000\f\u0000E\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001T\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002]\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005p\b"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005t\b\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005x\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u0080\b\u0006\n\u0006\f\u0006"+
		"\u0083\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u0089\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0005"+
		"\b\u0090\b\b\n\b\f\b\u0093\t\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t"+
		"\u0005\t\u009a\b\t\n\t\f\t\u009d\t\t\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0003\u000b\u00a5\b\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0005\f\u00ac\b\f\n\f\f\f\u00af\t\f\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0003\u000e\u00b5\b\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u00ba\b\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u00bf\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0005"+
		"\u0010\u00c4\b\u0010\n\u0010\f\u0010\u00c7\t\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0005\u0011\u00cc\b\u0011\n\u0011\f\u0011\u00cf\t\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u00d4\b\u0012\n\u0012\f\u0012"+
		"\u00d7\t\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u00dc\b"+
		"\u0013\n\u0013\f\u0013\u00df\t\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0005\u0014\u00e4\b\u0014\n\u0014\f\u0014\u00e7\t\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u00ee\b\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u00fb"+
		"\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0004"+
		"\u0017\u0102\b\u0017\u000b\u0017\f\u0017\u0103\u0001\u0018\u0001\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019"+
		"\u010d\b\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0003\u001b"+
		"\u0113\b\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0005\u001c\u011b\b\u001c\n\u001c\f\u001c\u011e\t\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0000\u0000\u001d\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"02468\u0000\u0006\u0001\u0000\t\n\u0001\u0000\u001a\u001c\u0001\u0000"+
		"\u0015\u0016\u0001\u0000\u0017\u0018\u0001\u0000\u000f\u0013\u0001\u0000"+
		"\u0006\u0007\u012b\u0000=\u0001\u0000\u0000\u0000\u0002S\u0001\u0000\u0000"+
		"\u0000\u0004U\u0001\u0000\u0000\u0000\u0006^\u0001\u0000\u0000\u0000\b"+
		"d\u0001\u0000\u0000\u0000\nl\u0001\u0000\u0000\u0000\f|\u0001\u0000\u0000"+
		"\u0000\u000e\u0084\u0001\u0000\u0000\u0000\u0010\u008d\u0001\u0000\u0000"+
		"\u0000\u0012\u0096\u0001\u0000\u0000\u0000\u0014\u009e\u0001\u0000\u0000"+
		"\u0000\u0016\u00a1\u0001\u0000\u0000\u0000\u0018\u00a8\u0001\u0000\u0000"+
		"\u0000\u001a\u00b0\u0001\u0000\u0000\u0000\u001c\u00b9\u0001\u0000\u0000"+
		"\u0000\u001e\u00bb\u0001\u0000\u0000\u0000 \u00c0\u0001\u0000\u0000\u0000"+
		"\"\u00c8\u0001\u0000\u0000\u0000$\u00d0\u0001\u0000\u0000\u0000&\u00d8"+
		"\u0001\u0000\u0000\u0000(\u00e0\u0001\u0000\u0000\u0000*\u00ed\u0001\u0000"+
		"\u0000\u0000,\u00fa\u0001\u0000\u0000\u0000.\u00fc\u0001\u0000\u0000\u0000"+
		"0\u0105\u0001\u0000\u0000\u00002\u010c\u0001\u0000\u0000\u00004\u010e"+
		"\u0001\u0000\u0000\u00006\u0110\u0001\u0000\u0000\u00008\u0116\u0001\u0000"+
		"\u0000\u0000:<\u0003\u000e\u0007\u0000;:\u0001\u0000\u0000\u0000<?\u0001"+
		"\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000"+
		">C\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000@B\u0003\u0002\u0001"+
		"\u0000A@\u0001\u0000\u0000\u0000BE\u0001\u0000\u0000\u0000CA\u0001\u0000"+
		"\u0000\u0000CD\u0001\u0000\u0000\u0000DF\u0001\u0000\u0000\u0000EC\u0001"+
		"\u0000\u0000\u0000FG\u0005\u0000\u0000\u0001G\u0001\u0001\u0000\u0000"+
		"\u0000HT\u0003\u0004\u0002\u0000IT\u0003\u0006\u0003\u0000JT\u0003\b\u0004"+
		"\u0000KT\u0003\n\u0005\u0000LT\u0003\u0010\b\u0000MN\u0003\u0016\u000b"+
		"\u0000NO\u0005\'\u0000\u0000OT\u0001\u0000\u0000\u0000PQ\u0003\u001a\r"+
		"\u0000QR\u0005\'\u0000\u0000RT\u0001\u0000\u0000\u0000SH\u0001\u0000\u0000"+
		"\u0000SI\u0001\u0000\u0000\u0000SJ\u0001\u0000\u0000\u0000SK\u0001\u0000"+
		"\u0000\u0000SL\u0001\u0000\u0000\u0000SM\u0001\u0000\u0000\u0000SP\u0001"+
		"\u0000\u0000\u0000T\u0003\u0001\u0000\u0000\u0000UV\u0005\u0003\u0000"+
		"\u0000VW\u0005 \u0000\u0000WX\u0003\u001a\r\u0000XY\u0005!\u0000\u0000"+
		"Y\\\u0003\u0002\u0001\u0000Z[\u0005\u0004\u0000\u0000[]\u0003\u0002\u0001"+
		"\u0000\\Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]\u0005\u0001"+
		"\u0000\u0000\u0000^_\u0005\u0005\u0000\u0000_`\u0005 \u0000\u0000`a\u0003"+
		"\u001a\r\u0000ab\u0005!\u0000\u0000bc\u0003\u0010\b\u0000c\u0007\u0001"+
		"\u0000\u0000\u0000de\u0005\f\u0000\u0000ef\u0003\u0010\b\u0000fg\u0005"+
		"\u0005\u0000\u0000gh\u0005 \u0000\u0000hi\u0003\u001a\r\u0000ij\u0005"+
		"!\u0000\u0000jk\u0005\'\u0000\u0000k\t\u0001\u0000\u0000\u0000lm\u0005"+
		"\u000b\u0000\u0000mo\u0005 \u0000\u0000np\u0003\f\u0006\u0000on\u0001"+
		"\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000"+
		"qs\u0005\'\u0000\u0000rt\u0003\f\u0006\u0000sr\u0001\u0000\u0000\u0000"+
		"st\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000uw\u0005\'\u0000\u0000"+
		"vx\u0003\f\u0006\u0000wv\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000"+
		"xy\u0001\u0000\u0000\u0000yz\u0005!\u0000\u0000z{\u0003\u0010\b\u0000"+
		"{\u000b\u0001\u0000\u0000\u0000|\u0081\u0003\u001a\r\u0000}~\u0005&\u0000"+
		"\u0000~\u0080\u0003\u001a\r\u0000\u007f}\u0001\u0000\u0000\u0000\u0080"+
		"\u0083\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0081"+
		"\u0082\u0001\u0000\u0000\u0000\u0082\r\u0001\u0000\u0000\u0000\u0083\u0081"+
		"\u0001\u0000\u0000\u0000\u0084\u0085\u0005\u0001\u0000\u0000\u0085\u0086"+
		"\u0005(\u0000\u0000\u0086\u0088\u0005 \u0000\u0000\u0087\u0089\u0003\u0012"+
		"\t\u0000\u0088\u0087\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000"+
		"\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u008b\u0005!\u0000\u0000"+
		"\u008b\u008c\u0003\u0010\b\u0000\u008c\u000f\u0001\u0000\u0000\u0000\u008d"+
		"\u0091\u0005\"\u0000\u0000\u008e\u0090\u0003\u0002\u0001\u0000\u008f\u008e"+
		"\u0001\u0000\u0000\u0000\u0090\u0093\u0001\u0000\u0000\u0000\u0091\u008f"+
		"\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0094"+
		"\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0094\u0095"+
		"\u0005#\u0000\u0000\u0095\u0011\u0001\u0000\u0000\u0000\u0096\u009b\u0003"+
		"\u0014\n\u0000\u0097\u0098\u0005&\u0000\u0000\u0098\u009a\u0003\u0014"+
		"\n\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u009a\u009d\u0001\u0000\u0000"+
		"\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000"+
		"\u0000\u009c\u0013\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000"+
		"\u0000\u009e\u009f\u0007\u0000\u0000\u0000\u009f\u00a0\u0005(\u0000\u0000"+
		"\u00a0\u0015\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005(\u0000\u0000\u00a2"+
		"\u00a4\u0005 \u0000\u0000\u00a3\u00a5\u0003\u0018\f\u0000\u00a4\u00a3"+
		"\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a6"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005!\u0000\u0000\u00a7\u0017\u0001"+
		"\u0000\u0000\u0000\u00a8\u00ad\u0003\u001a\r\u0000\u00a9\u00aa\u0005&"+
		"\u0000\u0000\u00aa\u00ac\u0003\u001a\r\u0000\u00ab\u00a9\u0001\u0000\u0000"+
		"\u0000\u00ac\u00af\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000"+
		"\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae\u0019\u0001\u0000\u0000"+
		"\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00b0\u00b1\u0003\u001c\u000e"+
		"\u0000\u00b1\u001b\u0001\u0000\u0000\u0000\u00b2\u00b5\u0005(\u0000\u0000"+
		"\u00b3\u00b5\u0003.\u0017\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b4"+
		"\u00b3\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6"+
		"\u00b7\u0005\u0014\u0000\u0000\u00b7\u00ba\u0003\u001c\u000e\u0000\u00b8"+
		"\u00ba\u0003\u001e\u000f\u0000\u00b9\u00b4\u0001\u0000\u0000\u0000\u00b9"+
		"\u00b8\u0001\u0000\u0000\u0000\u00ba\u001d\u0001\u0000\u0000\u0000\u00bb"+
		"\u00be\u0003 \u0010\u0000\u00bc\u00bd\u0005\b\u0000\u0000\u00bd\u00bf"+
		"\u00030\u0018\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00be\u00bf\u0001"+
		"\u0000\u0000\u0000\u00bf\u001f\u0001\u0000\u0000\u0000\u00c0\u00c5\u0003"+
		"\"\u0011\u0000\u00c1\u00c2\u0005\u001e\u0000\u0000\u00c2\u00c4\u0003\""+
		"\u0011\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c4\u00c7\u0001\u0000"+
		"\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000"+
		"\u0000\u0000\u00c6!\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000"+
		"\u0000\u00c8\u00cd\u0003$\u0012\u0000\u00c9\u00ca\u0005\u001d\u0000\u0000"+
		"\u00ca\u00cc\u0003$\u0012\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cc"+
		"\u00cf\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000\u00cd"+
		"\u00ce\u0001\u0000\u0000\u0000\u00ce#\u0001\u0000\u0000\u0000\u00cf\u00cd"+
		"\u0001\u0000\u0000\u0000\u00d0\u00d5\u0003&\u0013\u0000\u00d1\u00d2\u0007"+
		"\u0001\u0000\u0000\u00d2\u00d4\u0003&\u0013\u0000\u00d3\u00d1\u0001\u0000"+
		"\u0000\u0000\u00d4\u00d7\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001\u0000"+
		"\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6%\u0001\u0000\u0000"+
		"\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d8\u00dd\u0003(\u0014\u0000"+
		"\u00d9\u00da\u0007\u0002\u0000\u0000\u00da\u00dc\u0003(\u0014\u0000\u00db"+
		"\u00d9\u0001\u0000\u0000\u0000\u00dc\u00df\u0001\u0000\u0000\u0000\u00dd"+
		"\u00db\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000\u00de"+
		"\'\u0001\u0000\u0000\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00e0\u00e5"+
		"\u0003*\u0015\u0000\u00e1\u00e2\u0007\u0003\u0000\u0000\u00e2\u00e4\u0003"+
		"*\u0015\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e4\u00e7\u0001\u0000"+
		"\u0000\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000"+
		"\u0000\u0000\u00e6)\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000"+
		"\u0000\u00e8\u00e9\u0005\u001f\u0000\u0000\u00e9\u00ee\u0003*\u0015\u0000"+
		"\u00ea\u00eb\u0005\u0016\u0000\u0000\u00eb\u00ee\u0003*\u0015\u0000\u00ec"+
		"\u00ee\u0003,\u0016\u0000\u00ed\u00e8\u0001\u0000\u0000\u0000\u00ed\u00ea"+
		"\u0001\u0000\u0000\u0000\u00ed\u00ec\u0001\u0000\u0000\u0000\u00ee+\u0001"+
		"\u0000\u0000\u0000\u00ef\u00fb\u00032\u0019\u0000\u00f0\u00fb\u0005(\u0000"+
		"\u0000\u00f1\u00fb\u0003.\u0017\u0000\u00f2\u00f3\u0005\u0019\u0000\u0000"+
		"\u00f3\u00f4\u0003\u001a\r\u0000\u00f4\u00f5\u0005\u0019\u0000\u0000\u00f5"+
		"\u00fb\u0001\u0000\u0000\u0000\u00f6\u00f7\u0005 \u0000\u0000\u00f7\u00f8"+
		"\u0003\u001a\r\u0000\u00f8\u00f9\u0005!\u0000\u0000\u00f9\u00fb\u0001"+
		"\u0000\u0000\u0000\u00fa\u00ef\u0001\u0000\u0000\u0000\u00fa\u00f0\u0001"+
		"\u0000\u0000\u0000\u00fa\u00f1\u0001\u0000\u0000\u0000\u00fa\u00f2\u0001"+
		"\u0000\u0000\u0000\u00fa\u00f6\u0001\u0000\u0000\u0000\u00fb-\u0001\u0000"+
		"\u0000\u0000\u00fc\u0101\u0005(\u0000\u0000\u00fd\u00fe\u0005$\u0000\u0000"+
		"\u00fe\u00ff\u0003\u001a\r\u0000\u00ff\u0100\u0005%\u0000\u0000\u0100"+
		"\u0102\u0001\u0000\u0000\u0000\u0101\u00fd\u0001\u0000\u0000\u0000\u0102"+
		"\u0103\u0001\u0000\u0000\u0000\u0103\u0101\u0001\u0000\u0000\u0000\u0103"+
		"\u0104\u0001\u0000\u0000\u0000\u0104/\u0001\u0000\u0000\u0000\u0105\u0106"+
		"\u0007\u0004\u0000\u0000\u01061\u0001\u0000\u0000\u0000\u0107\u010d\u0005"+
		"\r\u0000\u0000\u0108\u010d\u0005\u000e\u0000\u0000\u0109\u010d\u00036"+
		"\u001b\u0000\u010a\u010d\u00038\u001c\u0000\u010b\u010d\u00034\u001a\u0000"+
		"\u010c\u0107\u0001\u0000\u0000\u0000\u010c\u0108\u0001\u0000\u0000\u0000"+
		"\u010c\u0109\u0001\u0000\u0000\u0000\u010c\u010a\u0001\u0000\u0000\u0000"+
		"\u010c\u010b\u0001\u0000\u0000\u0000\u010d3\u0001\u0000\u0000\u0000\u010e"+
		"\u010f\u0007\u0005\u0000\u0000\u010f5\u0001\u0000\u0000\u0000\u0110\u0112"+
		"\u0005$\u0000\u0000\u0111\u0113\u0003\u0018\f\u0000\u0112\u0111\u0001"+
		"\u0000\u0000\u0000\u0112\u0113\u0001\u0000\u0000\u0000\u0113\u0114\u0001"+
		"\u0000\u0000\u0000\u0114\u0115\u0005%\u0000\u0000\u01157\u0001\u0000\u0000"+
		"\u0000\u0116\u0117\u0005$\u0000\u0000\u0117\u011c\u00036\u001b\u0000\u0118"+
		"\u0119\u0005&\u0000\u0000\u0119\u011b\u00036\u001b\u0000\u011a\u0118\u0001"+
		"\u0000\u0000\u0000\u011b\u011e\u0001\u0000\u0000\u0000\u011c\u011a\u0001"+
		"\u0000\u0000\u0000\u011c\u011d\u0001\u0000\u0000\u0000\u011d\u011f\u0001"+
		"\u0000\u0000\u0000\u011e\u011c\u0001\u0000\u0000\u0000\u011f\u0120\u0005"+
		"%\u0000\u0000\u01209\u0001\u0000\u0000\u0000\u001b=CS\\osw\u0081\u0088"+
		"\u0091\u009b\u00a4\u00ad\u00b4\u00b9\u00be\u00c5\u00cd\u00d5\u00dd\u00e5"+
		"\u00ed\u00fa\u0103\u010c\u0112\u011c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}