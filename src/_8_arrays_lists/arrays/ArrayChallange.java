package _8_arrays_lists.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayChallange {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] integersArray = getIntegers(5);
        printIntegersArray(integersArray);
        myDescendingSortIntegers(integersArray);
        int[] ascendingSortedArray = ascendingSortIntegers(integersArray);
        int[] descendingSortedArray_ = descendingSortInteger(integersArray);
        System.out.println("\n" + "Your sorted elements: " + Arrays.toString(descendingSortedArray_));
        System.out.println("Your sorted elements: " + Arrays.toString(ascendingSortedArray));
    }

    public static int[] getIntegers(int number) {
        System.out.println("Give me any element of array integers: ");
        int[] integersArray = new int[number];
        for (int i = 0; i < integersArray.length; i++) {
            integersArray[i] = scanner.nextInt();
        }
        return integersArray;
    }

    public static void printIntegersArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Your " + (i + 1) + " element of array = " + array[i]);
        }
    }

    public static void myDescendingSortIntegers(int[] array) {
        Arrays.sort(array);
        System.out.print("Your sorted elements: ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print("[" + array[i] + "]" + " ");
        }
    }

    public static int[] descendingSortInteger(int[] array) {
//        int[] sortedArray = new int[array.length];
//        for (int i = 0; i < array.length; i++) {
//            sortedArray[i] = array[i];
//        }
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int tepm;
        while (flag) {
            flag = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    tepm = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = tepm;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

    public static int[] ascendingSortIntegers(int[] array) {
        int[] sort = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (sort[i] > sort[i + 1]) {
                    temp = sort[i];
                    sort[i] = sort[i + 1];
                    sort[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sort;
    }
}