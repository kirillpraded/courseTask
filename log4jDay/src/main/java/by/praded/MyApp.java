package by.praded;

/**
 * @author Kiryl Praded
 * 19.10.2020
 */
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class MyApp {


    private static final Logger logger = LogManager.getLogger(MyApp.class);

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