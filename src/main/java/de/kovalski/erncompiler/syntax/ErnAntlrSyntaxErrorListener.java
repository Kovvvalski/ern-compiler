package de.kovalski.erncompiler.syntax;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ErnAntlrSyntaxErrorListener extends BaseErrorListener implements ErnSyntaxValidator {
    private final List<String> errorMessages;

    public ErnAntlrSyntaxErrorListener() {
        super();
        errorMessages = new ArrayList<>();
    }

    // From BaseErrorListener
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        String errorMessage = String.format("Syntax error in line %d, position %d: %s", line, charPositionInLine, msg);
        errorMessages.add(errorMessage);
    }

    // From ErnSyntaxValidator
    @Override
    public boolean hasErrors() {
        return !errorMessages.isEmpty();
    }

    @Override
    public List<String> getSyntaxErrors() {
        return errorMessages;
    }
}
