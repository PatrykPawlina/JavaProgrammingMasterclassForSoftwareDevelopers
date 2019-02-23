package udemy_buchalka_tasks;

public class FirstAndLastDigit {

    public static void main(String[] args) {
        System.out.println(getFirstDigit(7897));
        System.out.println(getLastDigit(1158));
    }

    public static int getFirstDigit(int number) {
        while (number >= 10)
            number /= 10;
        return number;
    }

    public static int getLastDigit(int number) {
        int lastDigit = number % 10;
        return lastDigit;
    }
}



