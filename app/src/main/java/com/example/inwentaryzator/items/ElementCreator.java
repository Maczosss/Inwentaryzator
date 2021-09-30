package com.example.inwentaryzator.items;

public interface ElementCreator {
    void addQuantity(float value);
    void decreaseQuantity(float value);
    InventoryElement create(String name, TypeOfElement type);
}
