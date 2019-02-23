package _5_control_flow_statements;

public class ForStatement {
    public static void main(String[] args) {
//        for (int i = 2; i <= 8; i++) {
//            System.out.println("10.000 at " + i + "% interest = " + (int) calculateInterest(10000, i));
//            System.out.println("10.000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000, i)));
//            System.out.println("10.000 at " + i + "% interest = " + Math.round(calculateInterest(10000, i) * 10.0) / 10.0 + "\n");
//        }

        for (int i = 8; i >= 2; i--) {
            System.out.println("10.000 at " + i + "% interest = " + (int) calculateInterest(10000, i));
            System.out.println("10.000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000, i)));
            System.out.println("10.000 at " + i + "% interest = " + Math.round(calculateInterest(10000, i) * 10.0) / 10.0 + "\n");
        }

        int count = 0;
        for (int i = 10; i <= 50; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is Prime number. ");
            }
            if (count == 5) {
                System.out.println("Exiting for loop.");
                break;
            }
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return amount * (interestRate / 100);
    }

    public static boolean isPrime(int number) {
        if (number == 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

