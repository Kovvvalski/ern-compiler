package de.kovalski.erncompiler.semantics.expression.literal;

import de.kovalski.erncompiler.semantics.ExpressionType;

public class IntegerLiteralExpression extends LiteralExpression {

    private final int value;

    public IntegerLiteralExpression(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public void validate() {
        // nothing to validate
    }

    @Override
    protected void calculateType() {
        this.type = ExpressionType.INTEGER;
    }
}