package de.kovalski.erncompiler.semantics.statement;

import de.kovalski.erncompiler.semantics.FunctionDef;
import de.kovalski.erncompiler.semantics.expression.Expression;

import java.util.List;

public record FunctionCallStatement(FunctionDef function, List<Expression> arguments) implements Statement {

    @Override
    public void validate() {

    }
}
