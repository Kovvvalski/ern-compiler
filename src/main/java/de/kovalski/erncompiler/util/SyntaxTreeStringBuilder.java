package de.kovalski.erncompiler.util;

import de.kovalski.erncompiler.ErnLexer;
import de.kovalski.erncompiler.ErnParser;
import de.kovalski.erncompiler.ErnParserBaseListener;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.ParserRuleContext;
import org.springframework.stereotype.Component;

import java.util.ArrayDeque;
import java.util.Deque;

@Component
public class SyntaxTreeStringBuilder extends ErnParserBaseListener {

    private final StringBuilder treeBuilder = new StringBuilder();
    private final Deque<String> prefixStack = new ArrayDeque<>();
    private final ParseTree parseTree;

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";

    public SyntaxTreeStringBuilder(ParseTree parseTree) {
        this.parseTree = parseTree;
    }

    public String build() {
        this.treeBuilder.setLength(0);
        this.prefixStack.clear();

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(this, this.parseTree);

        return this.treeBuilder.toString();
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        if (ctx.getChildCount() == 1 && ctx.getChild(0) instanceof ParserRuleContext) {
            return;
        }

        boolean isLast = isLastChild(ctx);
        printNode(ErnParser.ruleNames[ctx.getRuleIndex()], isLast, ANSI_BLUE);
        prefixStack.push(isLast ? "    " : "│   ");
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        if (ctx.getChildCount() == 1 && ctx.getChild(0) instanceof ParserRuleContext) {
            return;
        }
        prefixStack.pop();
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        if (node.getSymbol().getType() == -1) {
            return;
        }

        String tokenName = ErnLexer.VOCABULARY.getSymbolicName(node.getSymbol().getType());
        String text = tokenName + " '" + node.getText().replace("\n", "\\n") + "'";
        printNode(text, isLastChild(node), ANSI_GREEN);
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        String text = "ERROR '" + node.getText() + "'";
        printNode(text, isLastChild(node), ANSI_RED);
    }

    private void printNode(String text, boolean isLast, String color) {
        treeBuilder.append(String.join("", prefixStack));
        treeBuilder.append(isLast ? "└── " : "├── ");
        treeBuilder.append(color).append(text).append(ANSI_RESET);
        treeBuilder.append("\n");
    }

    private boolean isLastChild(ParseTree node) {
        if (node.getParent() == null) {
            return true;
        }
        ParseTree parent = node.getParent();
        for (int i = 0; i < parent.getChildCount(); i++) {
            if (parent.getChild(i) == node) {
                for (int j = i + 1; j < parent.getChildCount(); j++) {
                    if (parent.getChild(j) != null && !parent.getChild(j).getText().isEmpty()) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}