package com.ps;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {
        Inventory myStore = new Inventory();
        //INITIALIZES ARRAYLIST AND HASHMAP CLASS

        // Store Home Screen
            // Option 1: Display Products
            // Option 2: Display Cart
            // Option 3: Exit

            // Display Products Screen
                // Display items in store
                // Option 1: Search or Filter
                // Option 2: Add to cart
                // Option 3: Go back

            // Display Cart Screen
                // Display items in user's cart
                // Display total price of items in cart
                // Option 1: Check Out cart
                // Option 2: Remove product from cart
                    // Specify which product to remove
                // Option 3: Go back





    }

    private static void inputData(String fileName, Inventory myStore){
        try(BufferedReader bufReader = new BufferedReader(new FileReader("products.txt"))){

        } catch(IOException e){
            e.printStackTrace();
        }
    }

    // Display Products Screen STATIC method

    // Display Cart Screen STATIC method

}