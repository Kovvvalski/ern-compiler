package de.kovalski.erncompiler.semantics.expression.operator;

import de.kovalski.erncompiler.semantics.expression.Expression;

public abstract class UnaryOperatorExpression extends OperatorExpression {

    private final Expression operand;

    public UnaryOperatorExpression(Expression operand) {
        this.operand = operand;
    }

    public Expression getOperand() {
        return operand;
    }
}
