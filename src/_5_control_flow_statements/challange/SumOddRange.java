package _5_control_flow_statements.challange;

public class SumOddRange {
    public static void main(String[] args) {
        System.out.println(isOdd(5));
        System.out.println(isOdd(-45));
        System.out.println(isOdd(15));
        System.out.println(isOdd(-15));
        System.out.println(sumOdd(1, 100));
        System.out.println(sumOdd(-1, 100));
        System.out.println(sumOdd(100, 100));
        System.out.println(sumOdd(100, -100));
        System.out.println(sumOdd(100, 1000));
    }

    public static boolean isOdd(int number) {
        return (number > 0) && (number % 2 != 0);
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        if ((start <= end) && (start > 0) && (end > 0)) {
            for (int i = start; i <= end; i++) {
                if (isOdd(i))
                    sum += i;
            }
            return sum;
        }
        return -1;
    }
}
