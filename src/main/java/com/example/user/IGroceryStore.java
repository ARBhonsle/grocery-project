package com.example.user;

import com.example.inventory.Inventory;

public interface IGroceryStore {
     Inventory createInventory();
     String getPaymentSummary(String paymentID);
     String getOrderSummary(String orderID);

}
