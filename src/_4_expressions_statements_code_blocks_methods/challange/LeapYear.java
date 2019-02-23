package _4_expressions_statements_code_blocks_methods.challange;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(0));
    }

    public static boolean isLeapYear(int year) {
        if (year > 0 && year < 9999) {
            return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
        }
        return false;
    }

    public static boolean isLeapYearAnother(int year) {
        if ((year < 1) || (year > 9999))
            return false;
        else return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}
