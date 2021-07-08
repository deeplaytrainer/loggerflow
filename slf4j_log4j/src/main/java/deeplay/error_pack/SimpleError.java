package deeplay.error_pack;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleError {
    private static final Logger logger = LoggerFactory.getLogger(SimpleError.class);

    private final String message;

    public SimpleError(String message) {
        this.message = message;
        logger.debug("create error debug",new Exception(message));
        logger.info("create error info",new Exception(message));
        logger.warn("create error warn",new Exception(message));
        logger.error("create error error",new Exception(message));
    }
}
