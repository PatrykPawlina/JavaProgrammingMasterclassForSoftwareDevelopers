package _5_control_flow_statements;

public class DayOfTheWeekChellange {
    public static void main(String[] args) {
        printDayOfTheWeek(2);
        printDayOfTheWeek(4);
        printDayOfTheWeek(-5);
    }

    public static void printDayOfTheWeek(int day) {
//        switch (day) {
//            case 0:
//                System.out.println("Monday");
//                break;
//            case 1:
//                System.out.println("Tuesday");
//                break;
//            case 2:
//                System.out.println("Wednesday");
//                break;
//            case 3:
//                System.out.println("Thursday");
//                break;
//            case 4:
//                System.out.println("Friday");
//                break;
//            case 5:
//                System.out.println("Saturday");
//                break;
//            case 6:
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("Invalid day");
//        }

        if (day == 0)
            System.out.println("Monday");
        else if (day == 1)
            System.out.println("Tuesday");
        else if (day == 2)
            System.out.println("Wednesday");
        else if (day == 3)
            System.out.println("Thursday");
        else if (day == 4)
            System.out.println("Friday");
        else if (day == 5)
            System.out.println("Saturday");
        else if (day == 6)
            System.out.println("Sunday");
        else
            System.out.println("Invalid day");
    }
}

