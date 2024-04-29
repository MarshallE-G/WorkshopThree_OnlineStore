package com.ps;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


import java.util.Scanner;

public class Main {
    // Had to make this into a global static variable in order to use it in the static methods for the screens.
    private static Inventory myStore = new Inventory();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //INITIALIZES ARRAYLIST AND HASHMAP CLASS

        inputData("", myStore); // The fileName argument is currently unused

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

                    Main.productsMenu();

                    break;
                case "2":

                    break;
                case "3":
                    break;
                default:
                    System.out.println("\nERROR: You must type 1, 2, or 3.\n");
            }

        } while (!menuSelection.equals("3"));

        scanner.close();
    }

    // The fileName parameter is currently unused
    private static void inputData(String fileName, Inventory myStore){
        try (BufferedReader bufReader = new BufferedReader(new FileReader("products.txt"))) {
            String line;
            while ((line = bufReader.readLine()) != null) {
                String[] parts = line.split("\\|");
                String sku = parts[0];
                String productName = parts[1];
                float price = Float.parseFloat(parts[2]);
                String department = parts[3];
                Product product = new Product(sku, productName, price, department);
                myStore.addProduct(product);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Display Products Screen STATIC method
    private static void productsMenu() {
        Scanner scanner = new Scanner(System.in);

        String productsMenuSelection;
        do {
            // Display Products Screen
            System.out.println("Products Menu\n");
            // Display all items in store

            // -----> For-each loop
            myStore.displayAllProducts();

            // Option 1: Search or Filter
            System.out.println("\tEnter 1 to Search for an item"); // Search feature
            // Option 2: Add to cart
            System.out.println("\tEnter 2 to add item to shopping cart");
            // Option 3: Go back
            System.out.println("\tEnter 3 to GO BACK to Home menu\n");
            System.out.println("Enter here:");
            productsMenuSelection = scanner.next(); // May have to change this to ".next()" if whitespace issue occurs.

            switch (productsMenuSelection) {
                case "1": // Search feature
                    String searchSelection;
                    float searchPrice;
                    String searchProductName;
                    String searchDept;

                    System.out.println("\tWould you like to search by... ");
                    System.out.println("\t\tPrice (enter 1)");
                    System.out.println("\t\tDepartment (enter 2)");
                    System.out.println("\t\tProduct name (enter 3)\n");
                    System.out.println("Enter here: ");
                    searchSelection = scanner.next();

                    if (searchSelection.equals("1")) { // Search by price
                        System.out.println("To Search for a product, please enter it's price");
                        searchPrice = scanner.nextFloat();

                        System.out.println();
                        myStore.searchByPrice(searchPrice);
                    } else if (searchSelection.equals("2")) { // Search by department
                        System.out.println("To Search for a product, please enter it's department");
                        searchPrice = scanner.nextFloat();

                        System.out.println();
                        myStore.searchByPrice(searchPrice);
                    } else if (searchSelection.equals("3")) { // Search by product name
                        System.out.println("To Search for a product, please enter it's name");
                        searchPrice = scanner.nextFloat();

                        System.out.println();
                        myStore.searchByPrice(searchPrice);
                    } else {
                        System.out.println("\nERROR: You must type 1, 2, or 3.\n");
                    }



                    break;
                case "2": // Add items to shopping cart



                    break;
                case "3": // Go back
                    break;
                default:
                    System.out.println("\nERROR: You must type 1, 2, or 3.\n");
                    break;
            }

        } while (!productsMenuSelection.equals("3"));
    }

    // Display Cart Screen STATIC method
    private static void cartMenu() {
        Scanner scanner = new Scanner(System.in);

        String cartMenuSelection;
        do {
            // Display Cart Screen
            System.out.println("Shopping Cart Menu\n");
            // Display items in user's cart

            // -----> For-each loop

            // Display total price of items in cart

            // -----> getPrice() of each product in shopping cart and find sum.

            // Option 1: Check Out cart
            System.out.println("\tEnter 1 to check-out shopping cart");
            // Option 2: Remove product from cart
            System.out.println("\tEnter 2 to remove an item from shopping cart");
            // Option 3: Go back
            System.out.println("\tEnter 3 to GO BACK to Home menu\n");
            System.out.println("Enter here:");
            cartMenuSelection = scanner.nextLine(); // May have to change this to ".next()" if whitespace issue occurs.

            switch (cartMenuSelection) {
                case "1": // Check Out cart
                    break;
                case "2": // Remove product
                    // Specify which product to remove

                    break;
                case "3": // Go back
                    break;
                default:
                    System.out.println("\nERROR: You must type 1, 2, or 3.\n");
            }
        } while (!cartMenuSelection.equals("3"));
    }
}