package ChainPattern;

public class ErrorLogger extends AbstractLogger {
    public ErrorLogger(AbstractLogger nextLogger) {
        setNextLogger(nextLogger);
        level = ERROR;
    }

    protected void write(String msg) {
        System.out.println("ERROR: " + msg);
    }
}

