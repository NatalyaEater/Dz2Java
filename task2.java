// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.


import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class task2 {
    public static void main(String[] args) {
        int[] arr = { 1, 17, 23, 3, 4, 8, 20, 17, 11, 10, 1, 9, 7, 5, 5, 5, 7, 6, 8 };
        Logger logger = Logger.getLogger(task2.class.getName());
        FileHandler fh;
        try {
            fh = new FileHandler("log.txt");
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);
            int n = arr.length;

            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
            logger.info("Sorted array" + Arrays.toString(arr));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}