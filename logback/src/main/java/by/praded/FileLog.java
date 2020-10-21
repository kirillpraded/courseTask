package by.praded;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Kiryl Praded
 * 21.10.2020
 */
public class FileLog {

    private static final Logger LOGGER = LoggerFactory.getLogger(FileLog.class);

    public static void main(String... args) {
        LOGGER.info("To file");

    }
}
