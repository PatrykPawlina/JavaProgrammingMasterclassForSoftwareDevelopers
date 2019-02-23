package _4_expressions_statements_code_blocks_methods;

public class MethodsInJava {
    public static void main(String[] args) {
        System.out.println("----------------Chellange-----------------");

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Thomas", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("James", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Andrew", highScorePosition);
    }

    public static void displayHighScorePosition(String namePlayer, int highScorePosition) {
        System.out.println(namePlayer + " managed to get into position " + highScorePosition + " on the high score table.");
    }

    public static int calculateHighScorePosition(int scorePlayer) {
        if (scorePlayer >= 1000)
            return 1;
        else if (scorePlayer >= 500)
            return 2;
        else if (scorePlayer >= 100)
            return 3;
        return 4;
    }
}
