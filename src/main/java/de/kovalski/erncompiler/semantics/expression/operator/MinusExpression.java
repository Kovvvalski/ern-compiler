package de.kovalski.erncompiler.semantics.expression.operator;

import de.kovalski.erncompiler.semantics.expression.Expression;

public class MinusExpression extends BinaryOperatorExpression {
    public MinusExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    protected void calculateType() {

    }

    @Override
    public void validate() {

    }
}
