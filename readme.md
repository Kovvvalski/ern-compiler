# ERN Compiler

ERN Compiler is a command-line tool for compiling ERN, a small custom imperative programming language designed primarily for vector and matrix operations. The project is built with Java and uses ANTLR v4 for parsing, Spring Context for dependency management, and Picocli for the command-line interface.

## Project structure

* /src/main/antlr4 - antlr4 (.g4) files are stored which describe the language's grammar
* /src/main/java - java source code
* /src/main/resources - additional info including ERN code example

## Prerequisites

To build and run this project, you'll need:
* Java 17 or later
* Apache Maven 3.6+

## Building

You can build the project using Maven. This will generate a single executable JAR file with all dependencies included. You can rename it and put wherever you want.

1. Clone the repository.
2. Navigate to the project's root directory.
3. Run the following command:
    ```bash
    mvn clean package
    ```
command will create a `fat jar` in tру `target/` directory, named `ern-compiler-1.0-SNAPSHOT.jar`.

## Usage

Run the compiler from the command line using the generated JAR file.

### General Syntax
```bash
java -jar target/ern-compiler-1.0-SNAPSHOT.jar [OPTIONS] <inputFile>
```

### Options and Examples

* **Get Help**

  The `--help` option shows all available commands and their descriptions.
    ```bash
    java -jar target/ern-compiler-1.0-SNAPSHOT.jar --help
    ```   
  
    ```
    Usage: ernc [-htV]- (-o=<outputFile>) <inputFile>
    Compiles ERN source files.
          <inputFile>            The ERN source file to compile.
      -o, --output=<outputFile>   Optional: The output file for the generated code. NOT IMPLEMENTED YET
      -t, --print-tree         Print the syntax tree to the console.
      -h, --help              Show this help message and exit.
      -V, --version             Print version information and exit.
    ```