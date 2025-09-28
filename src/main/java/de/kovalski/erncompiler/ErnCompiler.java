package de.kovalski.erncompiler;

import de.kovalski.erncompiler.semantics.AntlrAstBuilder;
import de.kovalski.erncompiler.semantics.AstBuilder;
import de.kovalski.erncompiler.syntax.ErnAntlrSyntaxErrorListener;
import de.kovalski.erncompiler.util.SyntaxTreeStringBuilder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

import java.io.File;
import java.nio.file.Files;
import java.util.concurrent.Callable;

@Command(name = "ernc", mixinStandardHelpOptions = true, version = "ERN Compiler 1.0", description = "Compiles ERN source files.")
public class ErnCompiler implements Callable<Integer> {

    @Parameters(index = "0", description = "The ERN source file to compile.")
    private File inputFile;

    @Option(names = {"-t", "--print-tree"}, description = "Print the syntax tree to the console.")
    private boolean printTree;

    @Option(names = {"-o", "--output"}, description = "Optional: The output file for the generated code.")
    private File outputFile;

    @Override
    public Integer call() throws Exception {

        if (!Files.exists(inputFile.toPath())) {
            System.err.println("Error: Input file not found: " + inputFile.getAbsolutePath());
            return 1;
        }

        try (AnnotationConfigApplicationContext context = new ErnCompilerApplicationContext(
                inputFile.getAbsolutePath())) {

            System.out.println("Compiling: " + inputFile.getAbsolutePath());

            ErnAntlrSyntaxErrorListener errorListener = context.getBean(ErnAntlrSyntaxErrorListener.class);
            if (errorListener.hasErrors()) {
                System.err.println("Compilation failed with syntax errors:");
                errorListener.getSyntaxErrors().forEach(System.err::println);
                return 1;
            }

            System.out.println("Compilation successful.");

            if (printTree) {
                System.out.println("\n--- Syntax Tree ---");
                SyntaxTreeStringBuilder builder = context.getBean(SyntaxTreeStringBuilder.class);
                System.out.println(builder.build());
            }
            AstBuilder astBuilder = context.getBean(AstBuilder.class);
            astBuilder.build();

            if (outputFile != null) {
            }

            return 0;
        }
    }

    public static void main(String[] args) {
        int exitCode = new CommandLine(new ErnCompiler()).execute(args);
        System.exit(exitCode);
    }
}