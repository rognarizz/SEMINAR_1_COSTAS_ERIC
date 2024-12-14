import java.util.Scanner;
import java.util.Arrays;

public class task4 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.err.println("Enter your numbers separated by space: ");

        String[] input = iScanner.nextLine().split(" ");
        iScanner.close();

        int[] arr = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        int MED = getMedian(arr);

        System.out.println("Average value in your array: " + MED);
    }

    public static int getMedian(int[] arr) {
        // *Находит среднее значение среди чисел в массиве */
        int MED;

        Arrays.sort(arr);

        int middle = arr.length / 2;

        if (arr.length % 2 == 0) {
            // если четное количество элементом, MED это целая часть среднего значения двух центральных элементов
            MED = (arr[middle - 1] + arr[middle] / 2);
        } else { // если не четное кол элементов, MED это центральный элемент
            MED = arr[middle];
        }
    
        return MED;
    }
}