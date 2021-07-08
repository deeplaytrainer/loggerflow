import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalTime;

public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        logger.debug("this debug");
        logger.info("this info");
        logger.warn("this warn");
        logger.error("this error");


        LocalTime lt = LocalTime.now();
        logger.debug("debug time {}  = {}");


    }
}
