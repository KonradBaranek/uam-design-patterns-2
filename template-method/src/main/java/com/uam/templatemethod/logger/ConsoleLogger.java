package com.uam.templatemethod.logger;

import java.time.Instant;

public class ConsoleLogger extends AbstractLogger {


    public ConsoleLogger(String className) {
        super(className);
    }

    @Override
    public void log(String text, Level level) {
        System.out.println("[" + level + "] " + text);
    }
}
