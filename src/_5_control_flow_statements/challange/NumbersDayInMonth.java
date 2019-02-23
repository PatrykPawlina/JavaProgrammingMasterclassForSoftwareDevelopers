package _5_control_flow_statements.challange;

public class NumbersDayInMonth {
    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
        System.out.println("--------------My Method--------------");
        System.out.println(isLeapYearAnother(-1600));
        System.out.println(isLeapYearAnother(1600));
        System.out.println(isLeapYearAnother(2017));
        System.out.println(isLeapYearAnother(2000));
        System.out.println("-------------------------------------");
        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(1, -2020));
    }

    public static boolean isLeapYearAnother(int year) {
        if ((year < 1) || (year > 9999))
            return false;
        else return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    public static boolean isLeapYear(int year) {
        if (year > 0 && year < 9999) {
            return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
        }
        return false;
    }

    public static int getDaysInMonth(int month, int year) {
        if ((month < 1) || (month > 12))
            return -1;
        if ((year < 1) || (year > 9999))
            return -1;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 2:
                if (isLeapYear(year))
                    return 29;
                else
                    return 28;
            default:
                return 30;
        }
    }
}





