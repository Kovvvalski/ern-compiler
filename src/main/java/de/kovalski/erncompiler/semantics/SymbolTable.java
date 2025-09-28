package de.kovalski.erncompiler.semantics;


import de.kovalski.erncompiler.exception.SemanticErrorException;
import org.springframework.stereotype.Component;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;

@Component
class SymbolTable {
    static class Symbol {
        String name;
        SymbolType type;

        public Symbol(String name, SymbolType type) {
            this.name = name;
            this.type = type;
        }

        @Override
        public int hashCode() {
            return name.hashCode() + 31 * type.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            if (! (obj instanceof Symbol)) return false;
            return name.equals(((Symbol) obj).name) && type.equals(((Symbol) obj).type);
        }
    }

    enum SymbolType {
        FUNCTION, VARIABLE
    }

    private final Deque<Set<Symbol>> scopeStack = new ArrayDeque<>();

    public void enterScope() {
        scopeStack.push(new HashSet<>());
    }

    public void exitScope() {
        if (scopeStack.isEmpty()) {
            throw new IllegalStateException("Cannot variable stack is empty.");
        }
        scopeStack.pop();
    }


    public void declare(Symbol symbol) {
        if (scopeStack.isEmpty()) {
            throw new IllegalStateException("Cannot declare a symbol without a scope.");
        }
        Set<Symbol> currentScope = scopeStack.peek();
        if (currentScope.contains(symbol)) {
            throw new SemanticErrorException("Symbol '" + symbol.name + "' is already defined in this scope.");
        }
        currentScope.add(symbol);
    }

    public boolean resolve(Symbol symbol) {
        for (Set<Symbol> scope : scopeStack) {
            if (scope.contains(symbol)) {
                return true;
            }
        }
        return false;
    }
}