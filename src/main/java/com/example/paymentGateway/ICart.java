package com.example.paymentGateway;

public interface ICart {
     void addProduct(String productCode);
     void removeProduct(String productCode);
     void checkout();
     Order process();
}
