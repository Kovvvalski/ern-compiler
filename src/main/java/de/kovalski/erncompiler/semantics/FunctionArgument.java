package de.kovalski.erncompiler.semantics;

import de.kovalski.erncompiler.semantics.expression.Expression;

public record FunctionArgument(String identifier, FunctionArgumentType type, Expression argument) implements AstNode {

    @Override
    public void validate() {

    }
}
