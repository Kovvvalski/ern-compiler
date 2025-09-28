package de.kovalski.erncompiler.semantics.expression.operator;

import de.kovalski.erncompiler.semantics.expression.Expression;

public class AddExpression extends BinaryOperatorExpression {
    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    protected void calculateType() {

    }

    @Override
    public void validate() {

    }
}
