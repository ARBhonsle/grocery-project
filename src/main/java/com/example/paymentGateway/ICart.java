package com.example.paymentGateway;

import com.example.inventory.InventoryActions;

public interface ICart extends InventoryActions {
     void addProduct(String productCode);
     void removeProduct(String productCode);
     void checkout();
     Order process();
}
