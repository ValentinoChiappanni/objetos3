package pepita;

public class Logger {
    private static Logger instance;
    private LogLevel logLevel;

    public enum LogLevel {
        INFO, WARN, ERROR
    }

   
    Logger(LogLevel logLevel) {
        this.logLevel = logLevel;
    }

   
    public static Logger getInstance(LogLevel logLevel) {
        if (instance == null) {
            instance = new Logger(logLevel);
        }
        return instance;
    }

    public void showInfo(String message) {
        if (logLevel == LogLevel.INFO ) {
            System.out.println("INFO: " + message);
        }
    }

    public void showWarn(String message) {
        if (logLevel == LogLevel.WARN ) {
            System.out.println("WARN: " + message);
        }
    }

    public void showError(String message) {
        if (logLevel == LogLevel.ERROR) {
            System.out.println("ERROR: " + message);
        }
    }
}
