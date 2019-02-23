package _5_control_flow_statements;

import java.util.Scanner;

public class ReadingUserInputChellange {
    public static void main(String[] args) {
        int counter = 1;
        int sumNumber = 0;
        Scanner scanner = new Scanner(System.in);
        while (counter <= 10) {
            System.out.println("Enter number #" + counter + ":");
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                int number = scanner.nextInt();
                System.out.println("Your number #" + counter + " is: " + number + "\n");
                counter++;
                sumNumber += number;
            } else {
                System.out.println("Invalid value");
                scanner.nextLine();
            }
        }
        System.out.println("Sum = " + sumNumber);
        scanner.close();
    }
}

