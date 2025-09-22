// Generated from /home/daniil/uni/sem7/lpis/ern-compiler/src/main/antlr4/de/kovalski/erncompiler/ErnParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ErnParser}.
 */
public interface ErnParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ErnParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ErnParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErnParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ErnParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErnParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ErnParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErnParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ErnParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErnParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(ErnParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErnParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(ErnParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErnParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(ErnParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErnParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(ErnParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErnParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(ErnParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErnParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(ErnParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErnParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStatement(ErnParser.DoWhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErnParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStatement(ErnParser.DoWhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErnParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(ErnParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErnParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(ErnParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErnParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(ErnParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErnParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(ErnParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErnParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(ErnParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErnParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(ErnParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErnParser#functionDef}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDef(ErnParser.FunctionDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErnParser#functionDef}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDef(ErnParser.FunctionDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErnParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(ErnParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErnParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(ErnParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErnParser#paramList}.
	 * @param ctx the parse tree
	 */
	void enterParamList(ErnParser.ParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErnParser#paramList}.
	 * @param ctx the parse tree
	 */
	void exitParamList(ErnParser.ParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErnParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ErnParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErnParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ErnParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErnParser#castingExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastingExpression(ErnParser.CastingExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErnParser#castingExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastingExpression(ErnParser.CastingExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErnParser#orExpression}.
	 * @param ctx the parse tree
	 */
	void enterOrExpression(ErnParser.OrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErnParser#orExpression}.
	 * @param ctx the parse tree
	 */
	void exitOrExpression(ErnParser.OrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErnParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(ErnParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErnParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(ErnParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErnParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(ErnParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErnParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(ErnParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErnParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(ErnParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErnParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(ErnParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErnParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(ErnParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErnParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(ErnParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErnParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(ErnParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErnParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(ErnParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErnParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(ErnParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErnParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(ErnParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErnParser#extractItem}.
	 * @param ctx the parse tree
	 */
	void enterExtractItem(ErnParser.ExtractItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErnParser#extractItem}.
	 * @param ctx the parse tree
	 */
	void exitExtractItem(ErnParser.ExtractItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErnParser#typeExpression}.
	 * @param ctx the parse tree
	 */
	void enterTypeExpression(ErnParser.TypeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErnParser#typeExpression}.
	 * @param ctx the parse tree
	 */
	void exitTypeExpression(ErnParser.TypeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErnParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(ErnParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErnParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(ErnParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErnParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(ErnParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErnParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(ErnParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErnParser#vectorLiteral}.
	 * @param ctx the parse tree
	 */
	void enterVectorLiteral(ErnParser.VectorLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErnParser#vectorLiteral}.
	 * @param ctx the parse tree
	 */
	void exitVectorLiteral(ErnParser.VectorLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErnParser#matrixLiteral}.
	 * @param ctx the parse tree
	 */
	void enterMatrixLiteral(ErnParser.MatrixLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErnParser#matrixLiteral}.
	 * @param ctx the parse tree
	 */
	void exitMatrixLiteral(ErnParser.MatrixLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErnParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(ErnParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErnParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(ErnParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErnParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(ErnParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErnParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(ErnParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErnParser#argList}.
	 * @param ctx the parse tree
	 */
	void enterArgList(ErnParser.ArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErnParser#argList}.
	 * @param ctx the parse tree
	 */
	void exitArgList(ErnParser.ArgListContext ctx);
}