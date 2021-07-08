package deeplay.debug_pack;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleClass {
    private static final Logger logger = LoggerFactory.getLogger(SimpleClass.class);

    private final int number;

    public SimpleClass(int number) {
        this.number = number;

        logger.debug("this debug = {}",number);
        logger.info("this info = {}",number);
        logger.warn("this warn = {}",number);
        logger.error("this error = {}",number);
    }
}
