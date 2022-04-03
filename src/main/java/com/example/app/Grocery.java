package com.example.app;

import com.example.inventory.Inventory;
import com.example.inventory.StoreInventory;
import com.example.paymentGateway.Cart;
import com.example.paymentGateway.Order;
import com.example.user.Customer;

public class Grocery {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Inventory storeInventory = new StoreInventory();

        storeInventory.addProduct("productCode1");
        storeInventory.addProduct("productCode2");
        storeInventory.displayProducts();

        Cart cart1 = customer.createCart();
        cart1.addProduct("productCode1");
        cart1.addProduct("productCode2");
        cart1.removeProduct("productCode2");
        cart1.checkout();
        customer.makePayment();
        Order order1 = cart1.process();
        order1.getSummary();
        order1.reserveProducts();
        order1.getSummary();
    }
}
