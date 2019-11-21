package com.uam.templatemethod.logger;


import java.time.Instant;

public abstract class AbstractLogger implements Logger {

    private final String className;

    public AbstractLogger(String className) {
        this.className = className;
    }

    @Override
    public void info(String text) {
        String newText = validate(text);
        format(newText);
        log(newText,Level.INFO);
    }

    @Override
    public void error(String text) {
        String newText = validate(text);
        format(newText);
        log(newText,Level.ERROR);
    }

    private String validate(String text) {
        return text.toUpperCase();
    }

    String format(String text) {
        return Instant.now() + " [" + className + "]: " + text;
    }

    public abstract void log(String text, Level level);
}
