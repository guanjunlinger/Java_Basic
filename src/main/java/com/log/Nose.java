package com.log;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Nose {
    private static Logger logger = Logger.getLogger(Nose.class.getName());
    public static void main(String argv[]) {
        logger.info("doing stuff");
        try {

        } catch (Exception ex) {
            // Log the exception
            logger.log(Level.WARNING, "trouble sneezing", ex);
        }
        logger.info("done");
    }
}
