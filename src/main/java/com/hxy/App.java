package com.hxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    private static final Logger logger = LoggerFactory.getLogger("test");

    public static void main(String[] args) {
        logger.debug("main {}","ok");
    }
}
