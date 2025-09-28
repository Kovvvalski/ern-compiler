package de.kovalski.erncompiler.semantics.statement;

import de.kovalski.erncompiler.semantics.expression.Expression;

public record ExpressionStatement(Expression expression) implements Statement {
    @Override
    public void validate() {

    }
}
