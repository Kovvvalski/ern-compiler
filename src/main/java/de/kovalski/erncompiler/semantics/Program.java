package de.kovalski.erncompiler.semantics;

import de.kovalski.erncompiler.semantics.statement.Statement;

import java.util.List;

public class Program implements AstNode {

    // main registry of all nodes

    private final List<FunctionDef> functionDefs;
    private final List<Statement> statements;

    public Program(List<FunctionDef> functionDefs, List<Statement> statements) {
        this.functionDefs = functionDefs;
        this.statements = statements;
    }

    @Override
    public void validate() {

    }
}
