package _5_control_flow_statements;

public class TheWhileAndDoWhileStatement {
    public static void main(String[] args) {
        System.out.println(isEvenNumber(11));
        isEvenNumber(4, 20);
    }

    public static boolean isEvenNumber(int number) {
        while (number % 2 == 0)
            return true;
        return false;
    }

    public static void isEvenNumber(int startNumber, int finishNUmber) {
        int totalEvenNumber = 0;
        if (startNumber % 2 == 0)
            System.out.println(startNumber);
        while (startNumber <= finishNUmber) {
            startNumber++;
            if (startNumber % 2 != 0) {
                continue;
            }
            totalEvenNumber++;
            System.out.println(startNumber);
        }
        System.out.println("Total even number = " + totalEvenNumber);
    }
}

