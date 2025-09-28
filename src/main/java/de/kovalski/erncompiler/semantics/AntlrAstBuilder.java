package de.kovalski.erncompiler.semantics;

import de.kovalski.erncompiler.ErnParser;
import de.kovalski.erncompiler.ErnParserBaseVisitor;
import de.kovalski.erncompiler.semantics.expression.Expression;
import de.kovalski.erncompiler.semantics.statement.*;
import de.kovalski.erncompiler.semantics.expression.Variable;
import de.kovalski.erncompiler.semantics.expression.operator.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class AntlrAstBuilder extends ErnParserBaseVisitor<AstNode> implements AstBuilder {

    private final ParseTree parseTree;
    private final SymbolTable symbolTable = new SymbolTable();

    public AntlrAstBuilder(ParseTree parseTree) {
        this.parseTree = parseTree;
    }

    @Override
    public AstNode build() {
        return visit(parseTree);
    }

    @Override
    public AstNode visitProgram(ErnParser.ProgramContext ctx) {
        List<FunctionDef> functionDefs = new ArrayList<>(ctx.functionDef().size());
        for (ErnParser.FunctionDefContext def : ctx.functionDef()) {
            functionDefs.add((FunctionDef) visitFunctionDef(def));
        }
        List<Statement> statements = new ArrayList<>(ctx.statement().size());
        for (ErnParser.StatementContext stmt : ctx.statement()) {
            statements.add((Statement) visitStatement(stmt));
        }
        Program program = new Program(functionDefs, statements);
        return program;
    }

    @Override
    public AstNode visitStatement(ErnParser.StatementContext ctx) {
        if (ctx.ifStatement() != null) {
            return visitIfStatement(ctx.ifStatement());
        } else if (ctx.whileStatement() != null) {
            return visitWhileStatement(ctx.whileStatement());
        } else if (ctx.doWhileStatement() != null) {
            return visitDoWhileStatement(ctx.doWhileStatement());
        } else if (ctx.forStatement() != null) {
            return visitForStatement(ctx.forStatement());
        } else if (ctx.block() != null) {
            return visitBlock(ctx.block());
        } else if (ctx.functionCall() != null) {
            return visitFunctionCall(ctx.functionCall());
        } else if (ctx.expression() != null) {
            return visitExpression(ctx.expression());
        }
        throw new SemanticError("Unknown statement type", ctx);
    }

    @Override
    public AstNode visitIfStatement(ErnParser.IfStatementContext ctx) {
        Expression condition = (Expression) visit(ctx.expression());
        Statement thenStatement = (Statement) visit(ctx.statement(0));
        Statement elseStatement = null;
        if (ctx.statement().size() > 1) {
            elseStatement = (Statement) visit(ctx.statement(1));
        }
        return new IfElseStatement(condition, thenStatement, elseStatement);
    }

    @Override
    public AstNode visitWhileStatement(ErnParser.WhileStatementContext ctx) {
        Expression condition = (Expression) visit(ctx.expression());
        BlockStatement body = (BlockStatement) visit(ctx.block());
        return new WhileLoopStatement(condition, body);
    }

    @Override
    public AstNode visitDoWhileStatement(ErnParser.DoWhileStatementContext ctx) {
        BlockStatement block = (BlockStatement) visit(ctx.block());
        Expression condition = (Expression) visit(ctx.expression());
        return new DoWhileLoopStatement(block, condition);
    }

    @Override
    public AstNode visitForStatement(ErnParser.ForStatementContext ctx) {
        List<Expression> init = new ArrayList<>();
        if (ctx.expressionList(0) != null) {
            init = (List<Expression>) visitExpressionList(ctx.expressionList(0));
        }
        Expression condition = null;
        if (ctx.expression() != null) {
            condition = (Expression) visit(ctx.expression());
        }
        List<Expression> afterIteration = new ArrayList<>();
        if (ctx.expressionList(1) != null) {
            afterIteration = (List<Expression>) visitExpressionList(ctx.expressionList(1));
        }
        BlockStatement block = (BlockStatement) visit(ctx.block());
        return new ForLoopStatement(init, condition, afterIteration, block);
    }

    @Override
    public AstNode visitExpressionList(ErnParser.ExpressionListContext ctx) {
        List<Expression> expressions = new ArrayList<>();
        for (ErnParser.ExpressionContext exprCtx : ctx.expression()) {
            expressions.add((Expression) visit(exprCtx));
        }
        return new ArrayListWrapper<>(expressions);
    }

    @Override
    public AstNode visitFunctionDef(ErnParser.FunctionDefContext ctx) {
        String identifier = ctx.ID().getText();
        List<FunctionArgument> arguments = new ArrayList<>();
        if (ctx.paramList() != null) {
            arguments = (List<FunctionArgument>) visit(ctx.paramList());
        }
        BlockStatement body = (BlockStatement) visit(ctx.block());
        return new FunctionDef(identifier, arguments, body);
    }

    @Override
    public AstNode visitParamList(ErnParser.ParamListContext ctx) {
        List<FunctionArgument> arguments = new ArrayList<>();
        for (ErnParser.ParamContext paramCtx : ctx.param()) {
            arguments.add((FunctionArgument) visit(paramCtx));
        }
        return new ArrayListWrapper<>(arguments);
    }

    @Override
    public AstNode visitParam(ErnParser.ParamContext ctx) {
        String identifier = ctx.ID().getText();
        FunctionArgumentType type;
        if (ctx.RETURNS() != null) {
            type = FunctionArgumentType.OUT;
        } else if (ctx.EXPECTS() != null) {
            type = FunctionArgumentType.IN;
        } else {
            throw new SemanticError("Unknown function argument type", ctx);
        }
        Expression expression = (Expression) visit(ctx.expressionType());
        return new FunctionArgument(identifier, type, expression);
    }

    @Override
    public AstNode visitBlock(ErnParser.BlockContext ctx) {
        List<Statement> statements = new ArrayList<>();
        for (ErnParser.StatementContext stmtCtx : ctx.statement()) {
            statements.add((Statement) visit(stmtCtx));
        }
        return new BlockStatement(statements);
    }

    @Override
    public AstNode visitFunctionCall(ErnParser.FunctionCallContext ctx) {
        String functionName = ctx.ID().getText();
        // TODO: Implement actual function lookup using a symbol table
        throw new SemanticError("Function '" + functionName + "' not found.", ctx);
        // List<Expression> arguments = new ArrayList<>();
        // if (ctx.argList() != null) {
        // arguments = (List<Expression>) visit(ctx.argList());
        // }
        // return new FunctionCallStatement(functionDef, arguments);
    }

    @Override
    public AstNode visitArgList(ErnParser.ArgListContext ctx) {
        List<Expression> arguments = new ArrayList<>();
        for (ErnParser.ExpressionContext exprCtx : ctx.expression()) {
            arguments.add((Expression) visit(exprCtx));
        }
        return new ArrayListWrapper<>(arguments);
    }

    @Override
    public AstNode visitExpression(ErnParser.ExpressionContext ctx) {
        Expression expression = (Expression) visit(ctx.assignmentExpression());
        expression.rawContext = ctx;
        return expression;
    }

    @Override
    public AstNode visitAssignmentExpression(ErnParser.AssignmentExpressionContext ctx) {
        if (ctx.ID() != null) {
            String identifier = ctx.ID().getText();
            Expression value = (Expression) visit(ctx.assignmentExpression());
            // TODO: Implement actual variable lookup/creation in symbol table
            // For now, assume it's a new variable of the type of the assigned value
            return new Variable(identifier, value.getType(), ctx);
        } else if (ctx.extractItem() != null) {
            ExtractItemExpression target = (ExtractItemExpression) visit(ctx.extractItem());
            Expression value = (Expression) visit(ctx.assignmentExpression());
            // TODO: Handle assignment to extracted item
            throw new SemanticError("Assignment to extracted item not yet supported", ctx);
        }
        return visit(ctx.castingExpression());
    }

    @Override
    public AstNode visitCastingExpression(ErnParser.CastingExpressionContext ctx) {
        Expression operand = (Expression) visit(ctx.orExpression());
        if (ctx.expressionType() != null) {
            ExpressionType toType = (ExpressionType) visit(ctx.expressionType());
            return new CastingExpression(operand, toType);
        }
        return operand;
    }

    @Override
    public AstNode visitOrExpression(ErnParser.OrExpressionContext ctx) {
        Expression left = (Expression) visit(ctx.andExpression(0));
        for (int i = 1; i < ctx.andExpression().size(); i++) {
            Expression right = (Expression) visit(ctx.andExpression(i));
            left = new OrExpression(left, right);
        }
        return left;
    }

    @Override
    public AstNode visitAndExpression(ErnParser.AndExpressionContext ctx) {
        Expression left = (Expression) visit(ctx.relationalExpression(0));
        for (int i = 1; i < ctx.relationalExpression().size(); i++) {
            Expression right = (Expression) visit(ctx.relationalExpression(i));
            left = new AndExpression(left, right);
        }
        return left;
    }

    @Override
    public AstNode visitRelationalExpression(ErnParser.RelationalExpressionContext ctx) {
        Expression left = (Expression) visit(ctx.additiveExpression(0));
        if (ctx.additiveExpression().size() > 1) {
            String operator = ctx.getChild(1).getText(); // GT, LT, EQ
            Expression right = (Expression) visit(ctx.additiveExpression(1));
            switch (operator) {
                case ">" -> left = new GreaterThanExpression(left, right);
                case "<" -> left = new LessThanExpression(left, right);
                case "==" -> left = new EqualExpression(left, right);
                default -> throw new SemanticError("Unknown relational operator: " + operator, ctx);
            }
        }
        return left;
    }

    @Override
    public AstNode visitAdditiveExpression(ErnParser.AdditiveExpressionContext ctx) {
        Expression left = (Expression) visit(ctx.multiplicativeExpression(0));
        for (int i = 1; i < ctx.multiplicativeExpression().size(); i++) {
            String operator = ctx.getChild(i * 2 - 1).getText(); // PLUS or MINUS
            Expression right = (Expression) visit(ctx.multiplicativeExpression(i));
            if (operator.equals("+")) {
                left = new AddExpression(left, right);
            } else if (operator.equals("-")) {
                left = new MinusExpression(left, right);
            } else {
                throw new SemanticError("Unknown additive operator: " + operator, ctx);
            }
        }
        return left;
    }

    @Override
    public AstNode visitMultiplicativeExpression(ErnParser.MultiplicativeExpressionContext ctx) {
        Expression left = (Expression) visit(ctx.unaryExpression(0));
        for (int i = 1; i < ctx.unaryExpression().size(); i++) {
            String operator = ctx.getChild(i * 2 - 1).getText(); // MUL or DIV
            Expression right = (Expression) visit(ctx.unaryExpression(i));
            if (operator.equals("*")) {
                left = new MultExpression(left, right);
            } else if (operator.equals("/")) {
                left = new DivExpression(left, right);
            } else {
                throw new SemanticError("Unknown multiplicative operator: " + operator, ctx);
            }
        }
        return left;
    }

    @Override
    public AstNode visitUnaryExpression(ErnParser.UnaryExpressionContext ctx) {
        if (ctx.NOT() != null) {
            Expression operand = (Expression) visit(ctx.unaryExpression());
            return new NotExpression(operand);
        } else if (ctx.MINUS() != null) {
            Expression operand = (Expression) visit(ctx.unaryExpression());
            return new NegativeExpression(operand);
        }
        return visit(ctx.primaryExpression());
    }

    @Override
    public AstNode visitPrimaryExpression(ErnParser.PrimaryExpressionContext ctx) {
        if (ctx.literal() != null) {
            return visit(ctx.literal());
        } else if (ctx.ID() != null) {
            // TODO: Lookup variable in symbol table
            throw new SemanticError("Variable '" + ctx.ID().getText() + "' not found.", ctx);
        } else if (ctx.extractItem() != null) {
            return visit(ctx.extractItem());
        } else if (ctx.PIPE() != null) {
            Expression operand = (Expression) visit(ctx.expression());
            return new ModuleExpression(operand);
        } else if (ctx.expression() != null) {
            return visit(ctx.expression());
        }
        throw new SemanticError("Unknown primary expression type", ctx);
    }

    @Override
    public AstNode visitExtractItem(ErnParser.ExtractItemContext ctx) {
        // Assuming ctx.ID() is the operand and ctx.expression() is the item
        // This needs to be refined when symbol table for variables is implemented
        // For now, creating a dummy variable for the ID
        Variable operand = new Variable(ctx.ID().getText(), ExpressionType.ANY, null); // TODO: Resolve actual type and rawContext
        Expression item = (Expression) visit(ctx.expression(0));
        return new ExtractItemExpression(operand, item);
    }

    @Override
    public AstNode visitExpressionType(ErnParser.ExpressionTypeContext ctx) {
        if (ctx.INTEGER_TYPE() != null) {
            return ExpressionType.INTEGER;
        } else if (ctx.STRING_TYPE() != null) {
            return ExpressionType.STRING;
        } else if (ctx.VECTOR_TYPE() != null) {
            return ExpressionType.VECTOR;
        } else if (ctx.MATRIX_TYPE() != null) {
            return ExpressionType.MATRIX;
        } else if (ctx.BOOLEAN_TYPE() != null) {
            return ExpressionType.BOOLEAN;
        }
        throw new SemanticError("Unknown expression type", ctx);
    }

    @Override
    public AstNode visitLiteral(ErnParser.LiteralContext ctx) {
        if (ctx.INTEGER_LITERAL() != null) {
            return new IntegerLiteralExpression(Integer.parseInt(ctx.INTEGER_LITERAL().getText()));
        } else if (ctx.STRING_LITERAL() != null) {
            String text = ctx.STRING_LITERAL().getText();
            // Remove quotes
            return new StringLiteralExpression(text.substring(1, text.length() - 1));
        } else if (ctx.booleanLiteral() != null) {
            return visit(ctx.booleanLiteral());
        } else if (ctx.vectorLiteral() != null) {
            return visit(ctx.vectorLiteral());
        } else if (ctx.matrixLiteral() != null) {
            return visit(ctx.matrixLiteral());
        }
        throw new SemanticError("Unknown literal type", ctx);
    }

    @Override
    public AstNode visitBooleanLiteral(ErnParser.BooleanLiteralContext ctx) {
        return new BooleanLiteralExpression(ctx.TRUE() != null);
    }

    @Override
    public AstNode visitVectorLiteral(ErnParser.VectorLiteralContext ctx) {
        List<Expression> elements = new ArrayList<>();
        if (ctx.argList() != null) {
            ArrayListWrapper<Expression> wrapper = (ArrayListWrapper<Expression>) visit(ctx.argList());
            elements = wrapper.list();
        }
        return new VectorLiteralExpression(elements);
    }

    @Override
    public AstNode visitMatrixLiteral(ErnParser.MatrixLiteralContext ctx) {
        List<VectorLiteralExpression> rows = new ArrayList<>();
        for (ErnParser.VectorLiteralContext vectorCtx : ctx.vectorLiteral()) {
            rows.add((VectorLiteralExpression) visit(vectorCtx));
        }
        return new MatrixLiteralExpression(rows);
    }
}
