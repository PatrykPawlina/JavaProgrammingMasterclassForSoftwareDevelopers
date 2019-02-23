package _5_control_flow_statements.challange;

import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int numberInt = 0;
        while (scanner.hasNextInt()) {
            sum += scanner.nextInt();
            numberInt++;
        }
        System.out.println("SUM = " + sum + " AVG = " + Math.round((double) sum / numberInt));
    }
}
