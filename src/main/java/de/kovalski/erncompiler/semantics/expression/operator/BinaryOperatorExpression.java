package de.kovalski.erncompiler.semantics.expression.operator;


import de.kovalski.erncompiler.semantics.expression.Expression;

public abstract class BinaryOperatorExpression extends OperatorExpression {
    private final Expression left;
    private final Expression right;

    public BinaryOperatorExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public Expression getLeft() {
        return left;
    }

    public Expression getRight() {
        return right;
    }
}
