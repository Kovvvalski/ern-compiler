package de.kovalski.erncompiler.semantics;

public enum ExpressionType {
    INTEGER {
        @Override
        public boolean isCastableTo(ExpressionType type) {
            return type == STRING || type == INTEGER || type == BOOLEAN;
        }
    },
    STRING {
        @Override
        public boolean isCastableTo(ExpressionType type) {
            return type == STRING || type == INTEGER || type == BOOLEAN;
        }
    },
    VECTOR {
        @Override
        public boolean isCastableTo(ExpressionType type) {
            return type == VECTOR || type == STRING;
        }
    },
    MATRIX {
        @Override
        public boolean isCastableTo(ExpressionType type) {
            return type == MATRIX || type == STRING;
        }
    },
    BOOLEAN {
        @Override
        public boolean isCastableTo(ExpressionType type) {
            return type == BOOLEAN || type == STRING;
        }
    };

    public abstract boolean isCastableTo(ExpressionType type);
}