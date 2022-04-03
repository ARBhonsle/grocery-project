package com.example.user;

import com.example.paymentGateway.Cart;

public class Customer implements ICustomer {
    private String id, name, address;

    @Override
    public void addAddress() {
        // Add address details
        System.out.println("CUSTOMER: Address ADDED");
    }

    @Override
    public void paymentMethod() {
        // Add payment method
    }

    @Override
    public Cart createCart() {
        System.out.println("CUSTOMER: Cart Created");
        return new Cart();
    }

    @Override
    public void makePayment() {
        System.out.println("CUSTOMER:  Payment Made");
    }
}
