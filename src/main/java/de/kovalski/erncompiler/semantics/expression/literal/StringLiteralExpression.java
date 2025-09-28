package de.kovalski.erncompiler.semantics.expression.literal;

import de.kovalski.erncompiler.semantics.ExpressionType;

public class StringLiteralExpression extends LiteralExpression {

    private final String value;

    public StringLiteralExpression(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public void validate() {
        // nothing to validate
    }

    @Override
    protected void calculateType() {
        this.type = ExpressionType.STRING;
    }
}
