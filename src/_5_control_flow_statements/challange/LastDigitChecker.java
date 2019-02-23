package _5_control_flow_statements.challange;

public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));
    }

    public static boolean hasSameLastDigit(int firstNumber, int secondNumber, int thirdNumber) {
        if ((firstNumber < 10 || firstNumber > 1000) || (secondNumber < 10
                || secondNumber > 1000) || (thirdNumber < 10 || thirdNumber > 1000))
            return false;
        int lastDigitFromFirstNumber = firstNumber % 10;
        int lastDigitFromSecondNumber = secondNumber % 10;
        int lastDigitFromThirdNumber = thirdNumber % 10;
        return (lastDigitFromFirstNumber == lastDigitFromSecondNumber)
                || (lastDigitFromFirstNumber == lastDigitFromThirdNumber)
                || (lastDigitFromSecondNumber == lastDigitFromThirdNumber);
    }
}


