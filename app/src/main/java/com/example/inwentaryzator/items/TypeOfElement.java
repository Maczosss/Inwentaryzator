package com.example.inwentaryzator.items;

public enum TypeOfElement {
    KG("Kilograms"),
    GRAM("Grams"),
    DAG("Dekagrams"),
    PIECES("Pieces"),
    METERS("Meters"),
    SQUARE_METERS("Square meters"),
    CMETERS("Centymeters"),
    DMETERS("Decymeters"),
    IN("Inches"),
    LB("Pounds");

    String aggregatingType;

    TypeOfElement(String aggregatingType){
        this.aggregatingType = aggregatingType;
    }


}
