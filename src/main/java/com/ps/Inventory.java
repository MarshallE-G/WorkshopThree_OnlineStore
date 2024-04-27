package com.ps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private ArrayList<Product> productInventory;
    private ArrayList<Product> shoppingCart;
    private Map<String, Product> productSearcher; // Key: productId, Value: Product

    public Inventory() {
        productInventory = new ArrayList<>();
        shoppingCart = new ArrayList<>();
        productSearcher = new HashMap<>();
    }

    // This Inventory.java class is expecting an instance of the Product.java class that we will call "product"
    // If this is confusing, we can do Product newProduct instead.
    // I added the basic add and remove elements that an ArrayList can do that should work for the corresponding product.
    // Also added a basic display with sout and for loop to iterate over all products even after being added or removed from the ArrayList inventory.
    // As for the rest of the methods we still need to add:
    /*
    searchByPrice()
    searchByDepartment()
    searchByName()

     */

    // Adds products/items to product inventory ArrayList
    public void addProduct(Product product){
        productInventory.add(product);
    }

    // Displays all products to screen/user
    public void displayAllProducts(){
        for(Product product: productInventory){
            System.out.println(product);
        }
    }

    // Displays all items in user's shopping cart to screen/user
    public void displayShoppingCart(){
        for(Product product: shoppingCart){ // Prints whatever is in the shoppingCart ArrayList
            System.out.println(product);
        }
    }

    // Adds products/items to user's shopping cart
    public void addToShoppingCart(Product product){
        shoppingCart.add(product);
    }

    // Removes items/products from user's shopping cart
    public void removeFromShoppingCart(Product product){
        shoppingCart.remove(product);
    }

    //buffered reader will add values to instances of the above data structures.
    /*methods that print inventory, shopping cart and searching here will be called from
    the main class */


}
