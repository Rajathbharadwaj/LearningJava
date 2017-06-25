package com.LearningJava;

//0import com.sun.java.util.jar.pack.Instruction;

import java.util.Scanner;

public class Main {

    private static Scanner s = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();


    public static void main(String[] args) {
	// write your code here

        boolean quit = false;
        int Choice = 0;
        printInstructions();
        while ((!quit)) {
            System.out.println("Enter your Choice: ");
            Choice = s.nextInt();

           switch(Choice) {

               case 0:
                   printInstructions();
                   break;

               case 1:
                   groceryList.PrintGroceryList();
                   break;

               case 2:
                   addItem();
                   break;

               case 3:
                   ModifyItemGrocery();
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
            System.out.println("\nPress ");
            System.out.println("\t 0 - To print choice options.");
            System.out.println("\t 1 - To print the list of grocery items.");
            System.out.println("\t 2 - To add an item to the list.");
            System.out.println("\t 3 - To modify an item in the list.");
            System.out.println("\t 4 - To remove an item from the list.");
            System.out.println("\t 5 - To search for an item in the list.");
            System.out.println("\t 6 - To quit the application.");
        }


        public static void addItem() {
            System.out.print("Please enter the Grocery Item: ");
            groceryList.AddGroceryItem(s.nextLine());

        }


        public static void ModifyItemGrocery() {
            System.out.print("Enter item number: ");
            int ItemNo = s.nextInt();
            s.nextLine();
            System.out.print("Enter replacement item: ");
            String newItem = s.nextLine();
            groceryList.ModifyGroceryItem(ItemNo-1, newItem);


        }

        public static void removeItem() {
            System.out.print("Enter item number: ");
            int ItemNo = s.nextInt();
            s.nextLine();
            groceryList.removeGroceryItem(ItemNo-1);

        }

        public static void searchItem() {
            System.out.print("Enter the item to search for: ");
            String searchItem = s.nextLine();
            if (groceryList.SearchItem(searchItem) != null) {
                System.out.println("Found" + searchItem + " in our Grocery List");
            }else {
                System.out.println(searchItem + " is not in the Shopping List");

            }
        }


}
