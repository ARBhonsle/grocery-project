package com.example.paymentGateway;

import java.util.ArrayList;

public class Cart implements ICart {
    private final ArrayList<String> products;

    public Cart(){
        products = new ArrayList<>();
    }

    @Override
    public void addProduct(String productCode) {
        products.add(productCode);
        System.out.println("CART: Product : "+productCode+" ADDED");
    }

    @Override
    public void removeProduct(String productCode) {
        products.remove(productCode);
        System.out.println("CART: Product : "+productCode+" REMOVED");
    }

    @Override
    public void checkout() {
        System.out.println(queryCartProducts(products));
        System.out.println("CART : CHECKOUT");
    }

    @Override
    public Order process() {
        System.out.println("CART: started process execution");
        System.out.println("CART: completed process execution");
        return new Order();
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