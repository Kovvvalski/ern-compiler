package de.kovalski.erncompiler.semantics.statement;

import de.kovalski.erncompiler.semantics.expression.Expression;

public record WhileLoopStatement(Expression condition, BlockStatement body) implements Statement {
    @Override
    public void validate() {

    }
}
