package com.example.inventory;

import java.util.List;

public class Product implements IProduct{
    private String code, name, description, price;
    private List<String> attributes;

    @Override
    public void updateName(String name) {
        this.name = name;
    }

    @Override
    public void updateDescription(String description) {
        this.description = description;
    }

    @Override
    public void updatePrice(String price) {
        this.price = price;
    }

    @Override
    public void updateAttributes(List<String> attributes) {
        this.attributes = attributes;
    }

    @Override
    public String getSummary() {
        return "Product Summary:\n" + "Code: " + this.code +
                "\nName: " + this.name + "/nPrice: " + this.price;
    }
}
