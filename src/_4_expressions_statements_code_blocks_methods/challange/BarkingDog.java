package _4_expressions_statements_code_blocks_methods.challange;

public class BarkingDog {
    public static void main(String[] args) {
        System.out.println(bark(true, 1));
        System.out.println(bark(false, 2));
        System.out.println(bark(true, 8));
        System.out.println(bark(true, -1));
        System.out.println(bark(true, 0));
    }

    public static boolean bark(boolean barking, int hourOfDay) {
        while ((barking == true) && (hourOfDay < 8 && hourOfDay >= 0) || (hourOfDay > 22 && hourOfDay < 24))
            return true;
        return false;
    }
}
