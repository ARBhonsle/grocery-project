package com.example.inventory;

import java.util.ArrayList;

public class StoreInventory implements Inventory{
    private String adminID;
    private final ArrayList<String> products;

    public StoreInventory(){
        products = new ArrayList<>();
    }

    @Override
    public void assignAdmin(String adminID) {
        this.adminID = adminID;
    }

    @Override
    public void addProduct(String productCode) {
        products.add(productCode);
        System.out.println("INVENTORY : Product : "+productCode+" ADDED");
    }

    @Override
    public void removeProduct(String productCode) {
        products.remove(productCode);
        System.out.println("INVENTORY : Product : "+productCode+" REMOVED");
    }

    @Override
    public void displayProducts() {
        System.out.println(queryCartProducts(products));
    }

    private String queryCartProducts(ArrayList<String> products) {
        StringBuilder str = new StringBuilder();
        str.append(" Product List: ");
        for (String product : products) {
            str.append(product);
            str.append(" ");
        }
        return str.toString();
    }
}
