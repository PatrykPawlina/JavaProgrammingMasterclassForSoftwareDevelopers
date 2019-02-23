package _4_expressions_statements_code_blocks_methods.challange;

public class MinutesToYearsDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0)
            System.out.println("Invalid Value");
        else
            System.out.println(minutes + " min = " + minutes / 525600 + " y and " + ((minutes / 1440) % 365) + " d");
    }
}
