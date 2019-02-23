package _5_control_flow_statements.challange;

public class FirstLAndLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(125));
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number >= 0) {
            int lastDigit = number % 10;
            int firstDigit;
            while (number >= 10)
                number /= 10;
            firstDigit = number;
            return firstDigit + lastDigit;
        }
        return -1;
    }
}