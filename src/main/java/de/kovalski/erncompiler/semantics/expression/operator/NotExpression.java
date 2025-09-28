package de.kovalski.erncompiler.semantics.expression.operator;

import de.kovalski.erncompiler.semantics.expression.Expression;

public class NotExpression extends UnaryOperatorExpression{
    public NotExpression(Expression operand) {
        super(operand);
    }

    @Override
    protected void calculateType() {

    }

    @Override
    public void validate() {

    }
}
