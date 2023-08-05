package ChainPattern;

public abstract class AbstractLogger {
    public final static int DEBUG = 0;
    public final static int INFO = 1;
    public final static int ERROR = 2;
    public int level;
    public AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int logLevel, String msg) {
        if (logLevel >= level) {
            write(msg);
        }
        if (nextLogger != null) {
            nextLogger.logMessage(logLevel, msg);
        }
    }

    protected abstract void write(String msg);
}
