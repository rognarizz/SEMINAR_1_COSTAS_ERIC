import java.util.Scanner;

public class task4 {
    public static void main(String[] args){
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите первый номер:");
        int ft = iScanner.nextInt();
        System.out.println("Введите второй номер:");
        int sc = iScanner.nextInt();
        System.out.println("Введите третий номер:");
        int trd = iScanner.nextInt();
        iScanner.close();

        int output = findMaxOfThree(ft, sc, trd);
        System.out.printf("Самое большое значение между %d, %d и %d: %d", ft, sc, trd, output);
    }

    public static int findMaxOfThree(int first, int sec, int third) {
        int maxNum = first > sec ? first : sec;
        int result = maxNum > third ? maxNum : third;
        return result;
    }
}