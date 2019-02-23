package _8_arrays_lists.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElementChallange {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter count: ");
        int count = scanner.nextInt();
        int[] numberArray = readIntegers(count);
        System.out.println(Arrays.toString(numberArray));
        System.out.println(findMin(numberArray));
    }

    public static int[] readIntegers(int count) {
        int[] numberArray = new int[count];
        for (int i = 0; i < numberArray.length; i++) {
            System.out.println("Give me a " + (i + 1) + " number: ");
            int number = scanner.nextInt();
            numberArray[i] = number;
        }
        return numberArray;
    }

    public static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            if (value < min) {
                min = value;
            }
        }
        return min;
    }
}
