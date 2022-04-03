package com.example.paymentGateway;

public class Order implements IOrder{
    @Override
    public void reserveProducts() {
        System.out.println("Order: Reserve Products");
    }

    @Override
    public void makePayment() {

    }

    @Override
    public String getSummary() {
        System.out.println("Order: Summary Received");
        return null;
    }
}
