public class task2 {
    public static void main(String[] args) {
        printEvenNums();
    }

    public static void printEvenNums(){
        for (int i = 1; i < 101; i++) {
            if (i % 2 == 0){
            System.out.println(i);
            }
        }
    }
}