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

    //buffered reader will add values to instances of the above data structures.
    /*methods that print invetory, shopping cart and searching here will be called from
    the main class */


}
