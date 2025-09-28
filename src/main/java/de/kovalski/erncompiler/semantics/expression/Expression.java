package de.kovalski.erncompiler.semantics.expression;

import de.kovalski.erncompiler.semantics.AstNode;
import de.kovalski.erncompiler.semantics.ExpressionType;

public abstract class Expression implements AstNode {

    protected ExpressionType type;

    public ExpressionType getType() {
        if (type == null) {
            calculateType();
        }
        return type;
    }

    protected abstract void calculateType();
} 
