import java.util.Scanner;

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

        int AVG_ari = getAVG_ari(arr);

        System.out.println("Average value in your array: " + AVG_ari);
    }

    public static int getAVG_ari(int[] arr) {
        // *Находит среднее значение среди чисел в массиве */
        if ( arr.length == 0) {
            return 0;
        }
        
        int AVG_ari = 0;

        for (int num : arr) {
            AVG_ari += num;
        }

        return (int) Math.round((double) AVG_ari / arr.length);
    }
}