package _5_control_flow_statements.challange;

public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(-111));
    }

    public static boolean isPalindromeAnother(int number) {
        if (number > 0) {
            String intString = String.valueOf(number);
            return intString.equals(new StringBuilder(intString).reverse().toString());
        }
        return true;
    }

    public static boolean isPalindrome(int number) {
        int palindrome = number;
        int reverse = 0;
        while (palindrome != 0) {
            int lastDigit = palindrome % 10;
            reverse = reverse * 10 + lastDigit;
            palindrome = palindrome / 10;
        }

        return number == reverse;
    }
}



