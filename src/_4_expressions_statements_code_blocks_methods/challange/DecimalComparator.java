package _4_expressions_statements_code_blocks_methods.challange;

public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.174, 3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3, 3));
    }

    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {
        return (int) (a * 1000) == (int) (b * 1000);
    }
}
