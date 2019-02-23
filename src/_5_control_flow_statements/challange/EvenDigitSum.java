package _5_control_flow_statements.challange;

public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456));
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0)
            return -1;
        int evenDigitSum = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            if (lastDigit % 2 == 0)
                evenDigitSum += lastDigit;
            number /= 10;
        }
        return evenDigitSum;
    }
}
