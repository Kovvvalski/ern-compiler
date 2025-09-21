package de.kovalski.erncompiler;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class ErnCompilerApplicationContext extends AnnotationConfigApplicationContext {

    private static final String PACKAGE_TO_SCAN = "de.kovalski.erncompiler";
    private static final String FILE_PATH_BEAN_NAME = "filePath";

    public ErnCompilerApplicationContext(String filePath) throws IOException {
        super();
        registerBean(FILE_PATH_BEAN_NAME, String.class, filePath);
        scan(PACKAGE_TO_SCAN);
        refresh();
    }
}
