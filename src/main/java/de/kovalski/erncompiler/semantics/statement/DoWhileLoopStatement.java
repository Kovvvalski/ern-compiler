package de.kovalski.erncompiler.semantics.statement;

import de.kovalski.erncompiler.semantics.expression.Expression;

public record DoWhileLoopStatement(BlockStatement block, Expression condition) implements Statement {
    @Override
    public void validate() {

    }
}
