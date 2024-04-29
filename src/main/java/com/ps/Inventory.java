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

    // Searches a product by its price
    public void searchByPrice(float price) {
        for (Product product : productInventory) {
            if (product.getPrice() == price) {
                System.out.println(product);
            }
        }
    }

    // Searches a product by its department
    public void searchByDepartment(String department) {
        for (Product product : productInventory) {
            if (product.getDepartment().equalsIgnoreCase(department)) {
                System.out.println(product);
            }
        }
    }

    // Searches a product by its name
    public void searchByName(String name) {
        for (Product product : productInventory) {
            if (product.getDepartment().equalsIgnoreCase(name)) {
                System.out.println(product);
            }
        }
    }

    // Adds products/items to product inventory ArrayList and HashMap
    public void addProduct(Product product){
        productInventory.add(product);
        productSearcher.put(product.getSku(), product); // SKU is key, product is value.
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
    public void addToShoppingCart(String productSKU){
        shoppingCart.add(productSearcher.get(productSKU));
    }

    // Removes items/products from user's shopping cart
    public void removeFromShoppingCart(Product product){
        shoppingCart.remove(product);
    }

    /*methods that print inventory, shopping cart and searching here will be called from
    the main class */


}
