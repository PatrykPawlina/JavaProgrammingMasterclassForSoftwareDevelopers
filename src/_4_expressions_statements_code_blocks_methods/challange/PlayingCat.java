package _4_expressions_statements_code_blocks_methods.challange;

public class PlayingCat {
    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if ((summer == true) && (((temperature >= 25) && (temperature <= 45))))
            return true;
        else return (summer == false) && (((temperature >= 25) && (temperature <= 35)));
    }
}


