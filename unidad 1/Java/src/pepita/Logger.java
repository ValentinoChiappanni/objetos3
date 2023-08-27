package pepita;

public class Logger {
    private static Logger instance;
    private int logLevel = 0; // Nivel de registro predeterminado: INFO

    private Logger() {
        // Constructor privado para evitar la creación de instancias externas.
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void setLogLevel(int level) {
        this.logLevel = level;
    }

    public static void showInfo(String message) {
        if (instance.logLevel <= 0) {
            System.out.println("INFO: " + message);
        }
    }

    public static void showWarn(String message) {
        if (instance.logLevel <= 1) {
            System.out.println("WARN: " + message);
        }
    }

    public static void showError(String message) {
        if (instance.logLevel <= 2) {
            System.out.println("ERROR: " + message);
        }
    }
}
