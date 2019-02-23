package _4_expressions_statements_code_blocks_methods.challange;

public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println(area(5.0));
        System.out.println(area(-1.0));
        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1.0, 4.0));
        System.out.println(area(1.75, 5.5));
    }

    public static double area(double radius) {
        if (radius < 0)
            return -1;
        else
            return 3.14159 * radius * radius;
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0)
            return -1;
        else
            return x * y;
    }
}
