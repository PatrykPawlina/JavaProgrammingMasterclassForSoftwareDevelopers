package _5_control_flow_statements.challange;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
    }

    public static boolean isPerfectNumber(int number) {
        if (number > 1) {
            int sumDivisior = 0;
            for (int i = 1; i <= number / 2; i++) {
                if (number % i == 0)
                    sumDivisior += i;
            }
            return number == sumDivisior;
        }
        return false;
    }
}

