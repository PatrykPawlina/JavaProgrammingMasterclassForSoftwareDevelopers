package _5_control_flow_statements.challange;

public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime_(21));
        System.out.println(getLargestPrime(36));
        System.out.println(getLargestPrime_(36));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime_(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime_(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime_(45));
        System.out.println(getLargestPrime(-1));
        System.out.println(getLargestPrime_(-1));
    }

    public static int getLargestPrime(int number) {
        if (number < 2)
            return -1;
        int i;
        for (i = 2; i <= number; i++) {
            if (number % i == 0) {
                number /= i;
                i--;
            }
        }
        return i;
    }

    public static int getLargestPrime_(int number) {
        int largestPrime = 0;
        if (number < 2) {
            largestPrime = -1;
        }
        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                number /= i;
            }
            largestPrime = i;
        }
        return largestPrime;
    }
}