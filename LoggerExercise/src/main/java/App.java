import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {

    private static final Logger logger = LogManager.getLogger(App.class);

    public static void main(String[] args) {
        logMeLikeYouDo("☕ ");
    }

    private static void logMeLikeYouDo(String input) {
        // Log4j2 methods work slightly differently
        logger.debug("This is debug : " + input);
        logger.info("This is info : " + input);
        logger.warn("This is warn : " + input);
        logger.error("This is error : " + input);
        logger.fatal("This is fatal : " + input);
    }
}