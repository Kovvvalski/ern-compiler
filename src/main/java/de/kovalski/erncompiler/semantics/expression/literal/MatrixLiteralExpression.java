package de.kovalski.erncompiler.semantics.expression.literal;

import de.kovalski.erncompiler.semantics.ExpressionType;

import java.util.List;

public class MatrixLiteralExpression extends LiteralExpression {
    private final List<VectorLiteralExpression> rows;

    public MatrixLiteralExpression(List<VectorLiteralExpression> rows) {
        this.rows = rows;
    }

    public List<VectorLiteralExpression> getRows() {
        return rows;
    }

    @Override
    protected void calculateType() {
        this.type = ExpressionType.MATRIX;
    }

    @Override
    public void validate() {
        //
    }
}
