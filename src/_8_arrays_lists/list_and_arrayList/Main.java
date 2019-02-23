package _8_arrays_lists.list_and_arrayList;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GloceryList gloceryList = new GloceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    gloceryList.printGloceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\t" + "\t" + "Glocery List !!!");
        System.out.println("Press");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of glocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in  the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search an item from the list.");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void addItem() {
        System.out.println("Please enter to glocery item: ");
        gloceryList.addGloceryItem(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.println("Enter item number: ");
        int itemNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter replacement item: ");
        String newItem = scanner.nextLine();
        gloceryList.modifyGloceryItem(itemNumber - 1, newItem);
    }

    public static void removeItem() {
        System.out.println("Enter number item to remove from glocery list: ");
        int itemNumber = scanner.nextInt();
        scanner.nextLine();
        gloceryList.removeGloceryItem(itemNumber - 1);
    }

    public static void searchItem() {
        System.out.println("Item for search for: ");
        String searchItem = scanner.nextLine();
        if (gloceryList.findItem(searchItem) != null) {
            System.out.println("Found " + searchItem + " in  your glocery list.");
        } else {
            System.out.println(searchItem + " is not in the shoping list.");
        }
    }
}
