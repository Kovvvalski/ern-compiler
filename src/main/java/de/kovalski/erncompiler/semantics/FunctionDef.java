package de.kovalski.erncompiler.semantics;

import de.kovalski.erncompiler.semantics.statement.BlockStatement;

import java.util.List;

public record FunctionDef(String identifier, List<FunctionArgument> arguments, BlockStatement body) implements AstNode {

    @Override
    public void validate() {

    }
}
