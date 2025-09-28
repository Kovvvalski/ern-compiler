package de.kovalski.erncompiler.semantics.statement;

import java.util.List;

public record BlockStatement(List<Statement> content) implements Statement {

    @Override
    public void validate() {

    }
}
