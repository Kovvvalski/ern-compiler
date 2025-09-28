package de.kovalski.erncompiler.semantics.expression.operator;

import de.kovalski.erncompiler.semantics.ExpressionType;
import de.kovalski.erncompiler.semantics.expression.Expression;

public class ModuleExpression extends UnaryOperatorExpression {

    public ModuleExpression(Expression operand) {
        super(operand);
     }

    @Override
    protected void calculateType() {

    }

    @Override
    public void validate() {
        if(getOperand().getType() != ExpressionType.MATRIX || getOperand().getType() != ExpressionType.VECTOR) {

        }
    }
}
