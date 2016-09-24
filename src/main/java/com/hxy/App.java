package com.hxy;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        logger.warn("main {}","ok");
//        System.out.println("hello world");
//        LoggerContext context = (LoggerContext) LoggerFactory.getILoggerFactory();
//        StatusPrinter.print(context);
//        logger.info();
    }
}
