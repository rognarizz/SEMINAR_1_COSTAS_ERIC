import java.util.Scanner;

public class task3 {
    public static void main(String[] args){
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Напишите ваш номер: ");
        int num = iScanner.nextInt();
        iScanner.close();

        String str = String.valueOf(num);
        int output = sumDigits(str);
        System.out.println("Сумма цифр: " + output);
    }

    public static int sumDigits(String value){
        /* Метод что выдает сумму цифр в независимости от размера самого числа */
        int sum = 0;
        // Преобразует строку в массив символов для итерации
        for (char digit : value.toCharArray()) {
            if(Character.isDigit(digit))
            {
                sum += Character.getNumericValue(digit); // Преобразует символ цифры в целое число
            }
        }
    return sum;
    }
}