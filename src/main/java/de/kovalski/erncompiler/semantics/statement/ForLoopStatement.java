package de.kovalski.erncompiler.semantics.statement;

import de.kovalski.erncompiler.semantics.expression.Expression;

import java.util.List;

public record ForLoopStatement(List<Expression> init, Expression condition,
                               List<Expression> afterIteration, BlockStatement block) implements Statement {

    @Override
    public void validate() {

    }
}
