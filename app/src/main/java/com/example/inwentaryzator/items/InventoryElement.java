package com.example.inwentaryzator.items;

public class InventoryElement implements ElementCreator {

    private String nameOfElement;
    private TypeOfElement type;
    private float quantity;

    public InventoryElement(String name, TypeOfElement type, float quantity) {
        this.nameOfElement = name;
        this.type = type;
        this.quantity = quantity;
    }

    public TypeOfElement getType() {
        return type;
    }

    public float getQuantity() {
        return quantity;
    }

    public String getNameOfElement() {
        return nameOfElement;
    }

    @Override
    public String toString() {
        return "InventoryElement{" +
                "nameOfElement='" + nameOfElement + '\'' +
                ", type=" + type +
                ", quantity=" + quantity +
                '}';
    }

    @Override
    public void addQuantity(float value) {
        this.quantity += value;
    }

    @Override
    public void decreaseQuantity(float value) {
        this.quantity -=value;
    }

    @Override
    public InventoryElement create(String name, TypeOfElement type) {
        return new InventoryElement(name, type, 0);
    }
}
