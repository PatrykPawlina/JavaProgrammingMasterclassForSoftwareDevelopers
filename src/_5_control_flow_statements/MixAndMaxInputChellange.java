package _5_control_flow_statements;

import java.util.Scanner;

public class MixAndMaxInputChellange {
    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
//        boolean first = true; // method
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        while (true) {
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                int number = scanner.nextInt();
//                if (first) {
//                    first = false;
//                    min = number;
//                    max = number;
//                }
                if (number < min) {
                    min = number;
                }
                if (number > max) {
                    max = number;
                }
            } else
                break;
        }
        System.out.println("Min = " + min + "\n" + "Max = " + max);
        scanner.close();
    }
}
