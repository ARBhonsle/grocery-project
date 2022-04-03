package com.example.user;

import com.example.paymentGateway.Cart;

public interface ICustomer {
     void addAddress();
     void paymentMethod();
     Cart createCart();
     void makePayment();
}
