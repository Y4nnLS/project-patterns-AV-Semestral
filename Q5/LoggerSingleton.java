package Q5;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LoggerSingleton {

    private static final String LOG_FILE = "application.log";
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    private LoggerSingleton() {
    }

    private static class Holder {
        private static final LoggerSingleton INSTANCE = new LoggerSingleton();
    }

    public static LoggerSingleton getInstance() {
        return Holder.INSTANCE;
    }

    public void log(String level, String message) {
        String timestamp = LocalDateTime.now().format(formatter);
        String line = String.format("%s [%s] %s", timestamp, level.toUpperCase(), message);

        System.out.println(line);

        synchronized (this) {
            try (PrintWriter out = new PrintWriter(new FileWriter(LOG_FILE, true))) {
                out.println(line);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void info(String message) {
        log("INFO", message);
    }

    public void error(String message) {
        log("ERROR", message);
    }

    public void audit(String message) {
        log("AUDIT", message);
    }
}
