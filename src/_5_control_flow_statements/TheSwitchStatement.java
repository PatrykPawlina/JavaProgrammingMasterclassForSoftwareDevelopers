package _5_control_flow_statements;

public class TheSwitchStatement {
    public static void main(String[] args) {
        char myChar = 'A';
        switch (myChar) {
            case 'A':
                System.out.println(myChar + " was found.");
                break;
            case 'B':
                System.out.println(myChar + " was found.");
                break;
            case 'C':
            case 'D':
            case 'E':
                System.out.println(myChar + " was found.");
            default:
                System.out.println("Could not found A, B, C, D or E.");
        }
    }
}
