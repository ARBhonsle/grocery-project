package com.example.user;

import com.example.inventory.Inventory;

public class GroceryStore implements IGroceryStore{
    private String id;

    @Override
    public Inventory createInventory() {
        return null;
    }

    @Override
    public String getPaymentSummary(String paymentID) {
        return null;
    }

    @Override
    public String getOrderSummary(String orderID) {
        return null;
    }
}
