import java.util.Scanner;

class task1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.err.println("Enter your numbers separated by space: ");

        String[] input = iScanner.nextLine().split(" ");
        int[] arr = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        int length = countPositiveNum(arr);

        int[] filteredArr = filterArr_Positive(arr, length);


        System.out.println("Filtered Array:");
        for (int num : filteredArr) {
            System.out.print(num + " ");
        }
    }

    public static int countPositiveNum(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                count++;
            }
        }
        return count;
    }

    public static int[] filterArr_Positive(int[] unfiltredArr, int length) {

        int[] filtered = new int[length];

        int index = 0;
        for (int i = 0; i < unfiltredArr.length; i++) {
            if (unfiltredArr[i] > 0) {
                filtered[index++] = unfiltredArr[i];
            }
        }
        return filtered;
    }
}
