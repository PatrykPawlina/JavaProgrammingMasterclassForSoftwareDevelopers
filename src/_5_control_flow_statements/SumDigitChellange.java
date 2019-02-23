package _5_control_flow_statements;

public class SumDigitChellange {
    public static void main(String[] args) {
        System.out.println(sumDigit(123));
    }

    public static int sumDigit(int number) {
        if (number < 10) {
            return -1;
        }
        int lastDigit;
        int sum = 0;
        while (number > 0) {
            lastDigit = number % 10;
            sum += lastDigit;
            number /= 10;
        }
        return sum;
    }
}
