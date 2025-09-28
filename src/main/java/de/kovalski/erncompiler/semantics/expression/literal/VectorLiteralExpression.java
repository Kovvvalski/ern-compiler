package de.kovalski.erncompiler.semantics.expression.literal;

import de.kovalski.erncompiler.semantics.ExpressionType;
import de.kovalski.erncompiler.semantics.expression.Expression;

import java.util.List;

public class VectorLiteralExpression extends LiteralExpression {
    private final List<Expression> elements;

    public VectorLiteralExpression(List<Expression> elements) {
        this.elements = elements;
    }

    public List<Expression> getElements() {
        return elements;
    }

    @Override
    protected void calculateType() {
        this.type = ExpressionType.VECTOR;
    }

    @Override
    public void validate() {
        // TODO: maybe validating of expressions of one type
    }
}
