package com.example.inventory;

import java.util.List;

public interface IProduct {
     void updateName(String name);
     void updateDescription(String description);
     void updatePrice(String price);
     void updateAttributes(List<String> attributes);
     String getSummary();
}
