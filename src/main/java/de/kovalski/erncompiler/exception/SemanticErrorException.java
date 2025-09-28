package de.kovalski.erncompiler.exception;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;

public class SemanticErrorException extends RuntimeException {

    private final int line;
    private final int charPositionInLine;
    private final String offendingText;

    public SemanticErrorException(String message) {
        super(message);
        this.line = 0;
        this.charPositionInLine = 0;
        this.offendingText = null;
    }

    public SemanticErrorException(String message, ParserRuleContext ctx) {
        this(message, ctx.start);
    }

    public SemanticErrorException(String message, Token offendingToken) {
        super(String.format("Semantic error in line %d, position %d: %s -> %s", offendingToken.getLine(), offendingToken.getCharPositionInLine(), offendingToken.getText(), message));
        this.line = offendingToken.getLine();
        this.charPositionInLine = offendingToken.getCharPositionInLine();
        this.offendingText = offendingToken.getText();
    }

    public int getLine() {
        return line;
    }

    public int getCharPositionInLine() {
        return charPositionInLine;
    }

    public String getOffendingText() {
        return offendingText;
    }
}