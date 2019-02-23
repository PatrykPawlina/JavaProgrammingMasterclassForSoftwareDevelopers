package _4_expressions_statements_code_blocks_methods;

public class MethodOverloading {
    public static void main(String[] args) {
        calculateScore("Tim", 500);
        calculateScore(75);
        calculateScore(89);
        calculateScore(1);

        System.out.println("\n" + "-------------Chellange---------------");

        calcFeetAndInchesToCentimeters(5, 12);
        calcFeetAndInchesToCentimeters(157);
    }

    public static int calculateScore(String playerName, int score) {
        score *= 1000;
        System.out.println("Player " + playerName + "scored " + score + " points");
        return score;
    }

    public static int calculateScore(int score) {
        score *= 1000;
        System.out.println("Unnamed Player " + "scored " + score + " points");
        return score;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet <= 0 || inches < 0 && inches <= 12) {
            System.out.println("Invalid feet or inches perameters");
            return -1;
        }

        double centimeters = Math.round(((feet * 30.48) + (inches * 2.54)) * 100.0) / 100.0;
        System.out.println(feet + " feet + " + inches + " inches = " + centimeters + " cm");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches <= 0) {
            System.out.println("Invalid inches parameters");
            return -1;
        }
        double feet = (int) (inches / 12);
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches to equal to " + feet + " feet and " + remainingInches + " inches ");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }
}