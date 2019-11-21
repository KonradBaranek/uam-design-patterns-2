package com.uam.templatemethod;


import com.uam.templatemethod.logger.ConsoleLogger;
import com.uam.templatemethod.logger.FileLogger;
import com.uam.templatemethod.logger.Logger;

public class Runner {

    public static void main(String[] args) {
        Logger logger = new ConsoleLogger("Test");
        logger.info("First text to log as info");
        logger.info("Second text to log as info");
        logger.error("First text to log as error");

        Logger logger2 = new FileLogger("Test");
        logger2.info("First text to log as info");
        logger2.info("Second text to log as info");
        logger2.error("First text to log as error");
    }
}
