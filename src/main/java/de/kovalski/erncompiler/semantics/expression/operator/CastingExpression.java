package de.kovalski.erncompiler.semantics.expression.operator;

import de.kovalski.erncompiler.exception.ErnCompilationException;
import de.kovalski.erncompiler.semantics.ExpressionType;
import de.kovalski.erncompiler.semantics.expression.Expression;

public class CastingExpression extends UnaryOperatorExpression {

    private final ExpressionType toType;

    public CastingExpression(Expression operand, ExpressionType toType) {
        super(operand);
        this.toType = toType;
    }

    public ExpressionType getToType() {
        return toType;
    }

    @Override
    protected void calculateType() {
        this.type = this.getOperand().getType();
    }

    @Override
    public void validate() {
        calculateType();
        if(!this.type.isCastableTo(toType)){
            throw new ErnCompilationException("The type " + type + " is not castable to " + toType);
        }
    }
}
