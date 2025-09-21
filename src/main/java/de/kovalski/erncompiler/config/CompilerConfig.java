package de.kovalski.erncompiler.config;

import de.kovalski.erncompiler.ErnLexer;
import de.kovalski.erncompiler.ErnParser;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

@Configuration
public class CompilerConfig {

    @Bean
    public ErnLexer ernLexer(String filePath) throws IOException {
        String program = Files.readString(Path.of(filePath));
        CharStream input = CharStreams.fromString(program);
        return new ErnLexer(input);
    }

    @Bean
    public ErnParser parser(ErnLexer ernLexer, BaseErrorListener errorListener) {
        CommonTokenStream tokens = new CommonTokenStream(ernLexer);
        ErnParser parser = new ErnParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(errorListener);
        return parser;
    }

    @Bean
    public ParseTree parseTree(ErnParser parser) {
        return parser.program();
    }
}
