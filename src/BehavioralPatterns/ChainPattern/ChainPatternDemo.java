package BehavioralPatterns.ChainPattern;

public class ChainPatternDemo {
    public static void main(String[] args) {
        AbstractLogger errorLogger = new ErrorLogger(null);
        AbstractLogger fileLogger = new FileLogger(errorLogger);
        AbstractLogger consoleLogger = new ConsoleLogger(fileLogger);

        consoleLogger.logMessage(AbstractLogger.ERROR,
                "The system failed to setup!");
        consoleLogger.logMessage(AbstractLogger.INFO,
                "There's one connection coming in!");
        consoleLogger.logMessage(AbstractLogger.DEBUG,
                "The username is Jake!");
    }
}
