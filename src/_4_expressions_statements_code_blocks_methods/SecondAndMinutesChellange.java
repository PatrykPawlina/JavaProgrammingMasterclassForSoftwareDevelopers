package _4_expressions_statements_code_blocks_methods;

public class SecondAndMinutesChellange {
    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void main(String[] args) {
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(-45));
        System.out.println(getDurationString(64, 9));
    }

    public static String getDurationString(int minutes, int seconds) {
        if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            return INVALID_VALUE_MESSAGE;
        }
        int hour = minutes / 60;
        int remainingMinutes = minutes % 60;

        String hourString = hour + "h";
        if (hour < 10) {
            hourString = "0" + hourString;
        }

        String minutesString = remainingMinutes + "m";
        if (remainingMinutes < 10) {
            minutesString = "0" + minutesString;
        }

        String secondString = seconds + "s";
        if (seconds < 10) {
            secondString = "0" + secondString;
        }
        return hourString + " " + minutesString + " " + secondString + " ";
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        return getDurationString(minutes, remainingSeconds);
    }
}

