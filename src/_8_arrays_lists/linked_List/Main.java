package _8_arrays_lists.linked_List;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Patryk", 56.78);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(78.23);
        System.out.println("Balance of customer " + customer.getName() + " is " + customer.getBalance());

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(3);
        intList.add(4);
        for (int x : intList) {
            System.out.println(x);
        }

        for (int i = 0; i < intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));
        }

        intList.add(1, 2);
        for (int i = 0; i < intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));
        }
        System.out.println(Arrays.toString(intList.toArray()));
    }
}
