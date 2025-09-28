package de.kovalski.erncompiler.semantics.expression.operator;

import de.kovalski.erncompiler.semantics.expression.Expression;

public class NegativeExpression extends UnaryOperatorExpression {
    public NegativeExpression(Expression operand) {
        super(operand);
    }

    @Override
    protected void calculateType() {

    }

    @Override
    public void validate() {

    }
}
