package com.ps;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Inventory myStore = new Inventory();
        //INITIALIZES ARRAYLIST AND HASHMAP CLASS

        String menuSelection;
        do {
            // Store Home Screen
            System.out.println("Welcome to THE PRODUCT STORE!\n");
            System.out.println("Please select a Menu option:");
                // Option 1: Display Products
            System.out.println("\tEnter 1 for the Display Products menu");
                // Option 2: Display Cart
            System.out.println("\tEnter 2 for the Display Cart menu");
                // Option 3: Exit
            System.out.println("\tEnter 3 to EXIT\n");
            System.out.println("Enter here:");
            menuSelection = scanner.nextLine(); // May have to change this to ".next()" if whitespace issue occurs.

            switch (menuSelection) {
                case "1":

                    break;
                case "2":

                    break;
                case "3":
                    break;
                default:
                    System.out.println("ERROR: You must type 1, 2, or 3.");
            }

        } while (!menuSelection.equals("3"));

        scanner.close();
    }

    private static void inputData(String fileName, Inventory myStore){
        try(BufferedReader bufReader = new BufferedReader(new FileReader("products.txt"))){

        } catch(IOException e){
            e.printStackTrace();
        }
    }

    // Display Products Screen STATIC method
    public static void productsMenu() {
        Scanner scanner = new Scanner(System.in);

        String productsMenuSelection;
        do {
            // Display Products Screen
            System.out.println("Products Menu");
            // Display all items in store

            // -----> For-each loop

            // Option 1: Search or Filter
            System.out.println("\tEnter 1 to Search for or Filter items");
            // Option 2: Add to cart
            System.out.println("\tEnter 2 to add item to shopping cart");
            // Option 3: Go back
            System.out.println("\tEnter 3 to GO BACK to Home menu\n");
            System.out.println("Enter here:");
            productsMenuSelection = scanner.nextLine(); // May have to change this to ".next()" if whitespace issue occurs.

            switch (productsMenuSelection) {

            }

        } while (!productsMenuSelection.equals("3"));
    }

    // Display Cart Screen STATIC method
    public static void cartMenu() {
        Scanner scanner = new Scanner(System.in);

        String cartMenuSelection;
        do {
            // Display Cart Screen
            System.out.println("Shopping Cart Menu");
            // Display items in user's cart

            // -----> For-each loop

            // Display total price of items in cart

            // -----> getPrice() of each product in shopping cart and find sum.

            // Option 1: Check Out cart
            System.out.println("\tEnter 1 to check-out shopping cart");
            // Option 2: Remove product from cart
            System.out.println("\tEnter 2 to remove an item from shopping cart");
            // Specify which product to remove
            // Option 3: Go back
            System.out.println("\tEnter 3 to GO BACK to Home menu\n");
            System.out.println("Enter here:");
            cartMenuSelection = scanner.nextLine(); // May have to change this to ".next()" if whitespace issue occurs.

            switch (cartMenuSelection) {

            }
        } while (!cartMenuSelection.equals("3"));
    }
}