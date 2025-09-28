package de.kovalski.erncompiler.semantics.statement;

import de.kovalski.erncompiler.semantics.expression.Expression;

public record IfElseStatement(Expression expression, Statement thenStatement,
                              Statement elseStatement) implements Statement {

    @Override
    public void validate() {
        // TODO Auto-generated method stub

    }
}
