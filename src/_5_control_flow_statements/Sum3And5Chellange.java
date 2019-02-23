package _5_control_flow_statements;

public class Sum3And5Chellange {
    public static void main(String[] args) {
        int count = 0;
        int sum3And5 = 0;
        for (int i = 1; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("Found number = " + i);
                count++;
                sum3And5 += i;
                if (count == 5) {
                    System.out.println("Sum = " + sum3And5);
                    break;
                }
            }
        }
    }
}
