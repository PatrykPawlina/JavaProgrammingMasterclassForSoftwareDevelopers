package _5_control_flow_statements.challange;

public class DiagonalStar {
    public static void main(String[] args) {
        printStars(5);
    }

    public static void printStars(int number) {
        if (number < 5)
            System.out.println("Invalid Value");
        for (int i = 1; i <= number; i++) {
            System.out.print("*");
            for (int j = 2; j < number; j++) {
                if (i == 1 || i == number || j == i) {
                    System.out.print("*");
                } else if (i == ((number - j) + 1))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
    }
}













