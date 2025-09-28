package de.kovalski.erncompiler.semantics.expression;

import de.kovalski.erncompiler.semantics.ExpressionType;

public class Variable extends Expression {
    private final String identifier;

    public Variable(String identifier, ExpressionType type) {
        this.identifier = identifier;
        this.type = type;
    }

    public String getIdentifier() {
        return identifier;
    }

    @Override
    protected void calculateType() {
        // skipping as the type was defined in constructor
    }

    @Override
    public void validate() {

    }
}
