
import java.util.logging.*;

public class Run {
    private static final Logger logger = Logger.getLogger(Run.class.getSimpleName());

    public static void main(String[] args) {

        // Добавить фильтр для сообщений
        Handler handler = new ConsoleHandler();
        handler.setFilter(new MyFilter());
        handler.setFormatter(new MyFormatter());
        logger.setUseParentHandlers(false);
        logger.addHandler(handler);

        logger.info("Hello, Info");
        logger.fine("Hello, fine");
        logger.warning("Hello, warning");

        logger.info("info myFilter");

    }

    static class MyFilter implements Filter {
        @Override
        public boolean isLoggable(LogRecord record) {
            return record.getMessage().endsWith("myFilter");
        }
    }

    static class MyFormatter extends Formatter {
        @Override
        public String format(LogRecord record) {
            return record.getLevel() + " " + record.getMessage();
        }
    }
}