package _5_control_flow_statements;

import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your year of birth:");
        boolean hasNextInt = scanner.hasNextInt();
        if (hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); // obsługa nastepnej linii, aby nie była pomijana !!!
            int age = 2019 - yearOfBirth;
            System.out.println("Hello, what your name?");
            String name = scanner.nextLine();
            if ((age >= 0) && (age <= 100)) {
                System.out.println("Your name is " + name + " and you have " + age + " years old.");
            } else
                System.out.println("Invalid year of birth.");
        } else
            System.out.println("Your year birth is valid.");
        scanner.close();
    }
}
