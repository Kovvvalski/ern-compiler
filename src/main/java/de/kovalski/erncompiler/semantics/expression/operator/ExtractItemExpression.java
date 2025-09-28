package de.kovalski.erncompiler.semantics.expression.operator;

import de.kovalski.erncompiler.exception.ErnCompilationException;
import de.kovalski.erncompiler.semantics.ExpressionType;
import de.kovalski.erncompiler.semantics.expression.Expression;

public class ExtractItemExpression extends UnaryOperatorExpression {
    private final Expression item;

    public ExtractItemExpression(Expression operand, Expression item) {
        super(operand);
        this.item = item;
    }

    public Expression getItem() {
        return item;
    }

    @Override
    protected void calculateType() {

    }

    @Override
    public void validate() {
        if (type != ExpressionType.MATRIX && type != ExpressionType.VECTOR) {
            throw new ErnCompilationException("Cannot extract item from expression of type " + type);
        }

        if (item.getType() != ExpressionType.INTEGER) {
            throw new ErnCompilationException("Cannot extract item as the specified index is not Integer");
        }
    }
}
