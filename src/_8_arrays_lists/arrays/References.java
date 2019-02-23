package _8_arrays_lists.arrays;

import java.util.Arrays;

public class References {
    public static void main(String[] args) {
        int myIntValues = 10;
        int anotherValue = myIntValues;
        System.out.println(myIntValues);
        System.out.println(anotherValue);
        anotherValue++;
        System.out.println("++");
        System.out.println(myIntValues);
        System.out.println(anotherValue);

        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));
        anotherArray[0] = 1;
        System.out.println("ater change myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after change anotherArray = " + Arrays.toString(anotherArray));

        String[] stringArray = new String[3];
        System.out.println("stringArray = " + Arrays.toString(stringArray));

        anotherArray = new int[]{4, 5, 6, 7, 2, 2, 4};
        modifyArray(myIntArray);
        System.out.println("after modify myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after modify anotherArray = " + Arrays.toString(anotherArray));
    }

    public static void modifyArray(int[] array) {
        array[0] = 2;
    }
}
