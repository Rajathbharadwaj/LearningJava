package com.LearningJava;

import java.util.ArrayList;

/**
 * Created by BIC on 6/25/2017.
 */
public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<String>();
    private String item;


    public void AddGroceryItem(String name) {
//         String item;
        groceryList.add(item);
    }

    public void PrintGroceryList() {

        System.out.println("You have " +groceryList.size() + " items in your  groceryList");
        for ( int i = 0; i <groceryList.size(); i++) {
            System.out.println((i + 1)  + ". " + groceryList.get(i));
        }

    }

    public void ModifyGroceryItem(int position, String newItem) {

        groceryList.set(position, newItem);
        System.out.println("Grocery item " +(position + 1) + " has been modified. ");

    }

    public void removeGroceryItem(int position) {
        groceryList.remove(position - 1);
    }

    public String SearchItem(String searchItem) {

//        boolean exists = groceryList.contains(searchItem);
//        System.out.println();
        int position = groceryList.indexOf(searchItem);
        if (position >=0) {
            return groceryList.get(position);
        }

        return null;
    }


}
