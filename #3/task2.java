import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class task2 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.err.println("Enter your numbers separated by space: ");

        String[] input = iScanner.nextLine().split(" ");
        iScanner.close();

        int[] output = getUniqueElem(input);

        printArray(output); 
    }

    public static int[] getUniqueElem(String[] arr) {
        /*
         * Работает со строкой, возвращает уникальные элементы,
         * Следуя задачи, нам нужен массив, поэтому программа преобразует Set в int[]
         */
        Set<Integer> uniqueNumbers = new HashSet<>();

        for (String num : arr) {
            uniqueNumbers.add(Integer.parseInt(num));
        }
        int[] array = convertSet_toIntArr(uniqueNumbers);

        return array;
    }

    public static int[] convertSet_toIntArr(Set<Integer> set) {
        // * Преобразует Set в int[] */
        int[] arr = new int[set.size()];
        int index = 0;

        for (int i : set) {
            arr[index++] = i;
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        // вывод массива
        System.out.print("Unique numbers: [ ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("]");
    }
}