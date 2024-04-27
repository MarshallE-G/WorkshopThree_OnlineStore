package com.ps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private ArrayList<Product> inventory;
    private ArrayList<Product> shoppingCart;
    private Map<String, Product> searcher; // Key: productId, Value: Product

    public Inventory() {
        inventory = new ArrayList<>();
        shoppingCart = new ArrayList<>();
        searcher = new HashMap<>();
    }

    // This Inventory.java class is expecting an instance of the Product.java class that we will call "product"
    // If this is confusing, we can do Product newProduct instead.
    // I added the basic add and remove elements that an ArrayList can do that should work for the corresponding product.
    // Also added a basic display with sout and for loop to iterate over all products even after being added or removed from the ArrayList inventory.
    //As for the rest of the methods we still need to add:
    /*
    searchByPrice()
    searchByDepartment()
    searchByName()

     */

    public void addProduct(Product product){
       inventory.add(product);
    }

    public void displayAllProducts(){
        for(Product product: inventory){
            System.out.println(product);
        }
    }

    public void displayShoppingCart(){
        for(Product product: shoppingCart){ // Prints whatever is in the shoppingCart ArrayList
            System.out.println(product);
        }
    }

    public void addToShoppingCart(Product product){
        shoppingCart.add(product);
    }

    public void removeFromShoppingCart(Product product){
        shoppingCart.remove(product);
    }

    //buffered reader will add values to instances of the above data structures.
    /*methods that print invetory, shopping cart and searching here will be called from
    the main class */


}
