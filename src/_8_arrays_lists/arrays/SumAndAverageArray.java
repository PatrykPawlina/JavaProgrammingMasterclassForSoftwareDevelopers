package _8_arrays_lists.arrays;

import java.util.Scanner;

public class SumAndAverageArray {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        for (int i = 0; i < myIntegers.length; i++) {
            System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
        }
        int sum = getSumArray(myIntegers);
        System.out.println("Sum of your number = " + sum);
        double average = getAverage(myIntegers);
        System.out.println("Average of your number = " + average);
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static int getSumArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static double getAverage(int[] array) {
        double average = 0;
        for (int i = 0; i < array.length; i++) {
            average = getSumArray(array) / array.length;
        }
        return average;
    }
}

