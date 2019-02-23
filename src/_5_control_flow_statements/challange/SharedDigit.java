package _5_control_flow_statements.challange;

public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 28));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
        System.out.println(hasSharedDigit(18, 25));
    }

    public static boolean hasSharedDigit(int first, int second) {
        if ((first < 10) || (first > 99) || (second < 10) || (second > 99))
            return false;
        int lastDigitFromFirst;
        int lastDigitFromSecond;
        int result = second;
        while (first != 0) {
            lastDigitFromFirst = first % 10;
            while (second != 0) {
                lastDigitFromSecond = second % 10;
                second /= 10;
                if (lastDigitFromFirst == lastDigitFromSecond)
                    return true;
            }
            second = result;
            first /= 10;
        }
        return false;
    }
}
