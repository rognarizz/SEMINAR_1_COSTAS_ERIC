import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class task4 {
    private static Logger logger = Logger.getLogger(task4.class.getName());

    public static void main(String[] args) {
        int[] arr = new int[]{9, 4, 8, 3, 1};
        int[] maxNum = max_and_minArray(arr);
        LoggingYourValue(maxNum);
    }

    public static int[] max_and_minArray(int[] arr) {
        int max = Arrays.stream(arr)
                .max()
                .getAsInt();
        int min = Arrays.stream(arr)
                .min()
                .getAsInt();
        int[] max_and_min = new int[]{max, min};
        return max_and_min;
    }

    public static void LoggingYourValue(int[] arr) {
        try {
            FileHandler fileHandler = new FileHandler("log.txt", true);
            fileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(fileHandler);
            logger.setLevel(Level.INFO);

            // Логирование максимального и минимального значений
            logger.info(String.format("Максимальное значение %d и минимальное %d", arr[0], arr[1]));

            // Симуляция ошибки для демонстрации логирования исключений
            try {
                int result = 10 / 0;
            } catch (ArithmeticException e) {
                logger.severe("Произошло арифметическое исключение: " + e.getMessage());
            }

        } catch (SecurityException | IOException e) {
            e.printStackTrace();
        }
    }
}
