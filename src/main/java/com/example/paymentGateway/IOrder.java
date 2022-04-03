package com.example.paymentGateway;

public interface IOrder {
     void reserveProducts();
     void makePayment();
     String getSummary();
}
