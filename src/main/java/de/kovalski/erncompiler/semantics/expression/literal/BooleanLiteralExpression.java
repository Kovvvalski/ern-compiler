package de.kovalski.erncompiler.semantics.expression.literal;

import de.kovalski.erncompiler.semantics.ExpressionType;

public class BooleanLiteralExpression extends LiteralExpression {
    private final boolean value;

    public BooleanLiteralExpression(boolean value) {
        this.value = value;
    }

    public boolean isValue() {
        return value;
    }

    @Override
    protected void calculateType() {
        // nothing to validate
    }

    @Override
    public void validate() {
        this.type = ExpressionType.BOOLEAN;
    }
}
