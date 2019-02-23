package udemy_buchalka_tasks;

public class EvenOddSum {

    public static void main(String[] args) {
        System.out.println(getOddDigitSum(1234));
    }

    public static int getOddDigitSum(int number) {
        if (number < 0)
            return -1;
        int oddDigitSum = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            if (lastDigit % 2 != 0)
                oddDigitSum += lastDigit;
            number /= 10;
        }
        return oddDigitSum;
    }
}

