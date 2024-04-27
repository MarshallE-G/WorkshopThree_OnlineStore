package com.ps;

public class Product {
    private String sku;
    private String product_name;
    private float price;
    private String department;
    private static int total_num_products;

    public Product(String sku, String product_name, float price, String department){
        this.sku = sku;
        this.product_name = product_name;
        this.price = price;
        this.department = department;
        total_num_products ++;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public static int getTotal_num_products(){
        return total_num_products;
    }

}
