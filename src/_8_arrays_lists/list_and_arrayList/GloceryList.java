package _8_arrays_lists.list_and_arrayList;

import java.util.ArrayList;

public class GloceryList {
    private ArrayList<String> gloceryList = new ArrayList<>();

    public void addGloceryItem(String item) {
        gloceryList.add(item);
    }

    public void printGloceryList() {
        System.out.println("You have " + gloceryList.size() + " item in your glocery list ");
        for (int i = 0; i < gloceryList.size(); i++) {
            System.out.println((i + 1) + ". " + gloceryList.get(i));
        }
    }

    public void modifyGloceryItem(int position, String newItem) {
        gloceryList.set(position, newItem);
        System.out.println("Glocery item " + (position + 1) + " has been modified");
    }

    public void removeGloceryItem(int position) {
        String theItem = gloceryList.get(position);
        gloceryList.remove(position);
    }

    public String findItem(String searchItem) {
//        boolean exists = gloceryList.contains(searchItem);
        int position = gloceryList.indexOf(searchItem);
        if (position >= 0) {
            return gloceryList.get(position);
        }
        return null;
    }
}
