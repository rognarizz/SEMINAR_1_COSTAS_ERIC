import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.err.println("Enter your words separated by space: ");

        String[] input = iScanner.nextLine().split(" ");
        iScanner.close();

        int length = count_LengthStr_BiggerThanYourNumber(input, 3);

        String[] filteredArr = filterString_BiggerThanYourNumber(input, length, 3);

        printArray(filteredArr);
    }

    public static int count_LengthStr_BiggerThanYourNumber(String[] str, int strLength) {
        // *Считывает количество слов длина который превышает 3 */
        int count = 0;
        for (String word : str) {
            if (word.length() > strLength) {
                count++;
            }
        }
        return count;
    }

    public static String[] filterString_BiggerThanYourNumber(String[] str, int ArrSize, int strLength) {
        //*Фильтрует массив, выбирает слова длина которых больше 3*/
        String[] filteredArr = new String[ArrSize];
        int index = 0;

        for (String word : str) {
            if(word.length() > strLength){
                filteredArr[index++] = word;
            }
        }
        return filteredArr;
    }
    
    public static void printArray(String[] arr) {
        // вывод массива
        System.out.print("Words that are longer than 3: [ ");
        for (String word : arr) {
            System.out.print(word + " ");
        }
        System.out.println("]");
    }
}