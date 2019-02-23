package udemy_buchalka_tasks;

public class EvenAndOddDigitSum {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(5));
        System.out.println(getOddDigitSum(5));
    }

    public static int getEvenDigitSum(int number) {
        if (number >= 0) {
            int sum = 0;
            for (int i = 1; i <= number; i++)
                if (i % 2 == 0)
                    sum += i;
            return sum;
        }
        return -1;
    }

    public static int getOddDigitSum(int number) {
        if (number >= 0) {
            int sum = 0;
            for (int i = 1; i <= number; i++)
                if (i % 2 != 0)
                    sum += i;
            return sum;
        }
        return -1;
    }
}



