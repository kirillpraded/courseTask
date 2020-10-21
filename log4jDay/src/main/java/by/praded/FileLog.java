package by.praded;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Kiryl Praded
 * 21.10.2020
 */
public class FileLog {
    private static final Logger logger = LogManager.getLogger(FileLog.class);

    public static void main(String... args) {

        logger.trace("Entering application.");
        logger.trace("Exiting application.");
        logger.debug("Testing debug.");
        logger.error("Testing error.");
        logger.info("Testing info.");
        logger.fatal("Testing fatal.");
        logger.warn("Testing warn.");

    }
}
