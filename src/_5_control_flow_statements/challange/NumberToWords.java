package _5_control_flow_statements.challange;

public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(1778);
    }

    public static void numberToWords(int number) {
        if (number < 0)
            System.out.println("Invalid Value");
        int reverseNumber = reverse(number);
        int digitCount = getDigitCount(number);
        String printDigit = " ";
        while (digitCount != 0) {
            int lastDigit = reverseNumber % 10;
            switch (lastDigit) {
                case 1:
                    printDigit = "One";
                    break;
                case 2:
                    printDigit = "Two";
                    break;
                case 3:
                    printDigit = "Three";
                    break;
                case 4:
                    printDigit = "Four";
                    break;
                case 5:
                    printDigit = "Five";
                    break;
                case 6:
                    printDigit = "Six";
                    break;
                case 7:
                    printDigit = "Seven";
                    break;
                case 8:
                    printDigit = "Eight";
                    break;
                case 9:
                    printDigit = "Nine";
                    break;
            }
            System.out.print(printDigit);
            reverseNumber /= 10;
            digitCount--;
        }
    }

    public static int reverse(int number) {
        int reverseNumber = 0;
        while (number != 0) {
            int lastDigit = number % 10;
            reverseNumber = reverseNumber * 10 + lastDigit;
            number /= 10;
        }
        return reverseNumber;
    }

    public static int getDigitCount(int number) {
        if (number < 0)
            return -1;
        int numberDigits = String.valueOf(number).length();
        return numberDigits;
    }
}
