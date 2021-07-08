package deeplay.other_pack;

import deeplay.debug_pack.SimpleClass;
import deeplay.error_pack.SimpleError;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Log4jRun {
    private static final Logger logger = LoggerFactory.getLogger(Log4jRun.class);

    public static void main(String[] args) {


        printNum(100);

        new SimpleClass(666);
        new SimpleError("Not error");

    }

    public static void printNum(final int n){
        for (int i = 0; i < n; i++) {
            logger.debug("this debug {}",i);
            logger.info("this info {}",i);
            logger.warn("this warn {}",i);
            logger.error("this error {}",i);
        }
    }
}
