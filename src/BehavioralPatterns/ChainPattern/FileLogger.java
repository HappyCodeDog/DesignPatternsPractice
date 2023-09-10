package BehavioralPatterns.ChainPattern;

public class FileLogger extends AbstractLogger {
    public FileLogger(AbstractLogger nextLogger) {
        setNextLogger(nextLogger);
        level = INFO;
    }

    protected void write(String msg) {
        System.out.println("INFO: " + msg);
    }
}
