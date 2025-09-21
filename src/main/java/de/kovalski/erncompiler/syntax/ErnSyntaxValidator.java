package de.kovalski.erncompiler.syntax;

import java.util.List;

public interface ErnSyntaxValidator {

    boolean hasErrors();

    List<String> getSyntaxErrors();
}
