import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Напишите ваш номер:");
        int a = iScanner.nextInt();
        iScanner.close();

        int output = factorial(a);
        System.out.println("Факториал " + a + " равен " + output);
    }

    public static int factorial(int num) {
        if (num == 0) {
            return 1;
        }

        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}