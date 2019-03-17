package _10_java_generics;

import java.util.ArrayList;

public class Generics {
    public static void main(String[] args) {
        ArrayList items = new ArrayList();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);

        printDouble(items);

        ArrayList<Integer> genericItem = new ArrayList<>();
        genericItem.add(11);
        genericItem.add(12);
        genericItem.add(13);
        genericItem.add(14);
        genericItem.add(15);

        printGenericDouble(genericItem);
    }

    private static void printDouble(ArrayList n) {
        for (Object i : n) {
            System.out.println((Integer) i * 2);
        }
    }

    private static void printGenericDouble(ArrayList<Integer> z) {
        for (int i : z) {
            System.out.println(i * 2);
        }
    }
}
