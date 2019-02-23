package udemy_buchalka_tasks;

public class Stars {
    public static void main(String[] args) {
        printStart(5);
    }

    public static void printStart(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
