package by.praded;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Kiryl Praded
 * 19.10.2020
 */


public class ConsoleLog {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConsoleLog.class);

    public static void main(String... args) {
        LOGGER.info("To console only");

    }
}