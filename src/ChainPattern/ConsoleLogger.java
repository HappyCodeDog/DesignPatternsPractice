package ChainPattern;

public class ConsoleLogger extends AbstractLogger {
    public ConsoleLogger(AbstractLogger logger) {
        setNextLogger(logger);
        level = DEBUG;
    }

    @Override
    public void logMessage(int logLevel, String msg) {
        super.logMessage(logLevel, msg);
    }

    @Override
    protected void write(String msg) {
        System.out.println("DEBUG: " + msg);
    }
}
