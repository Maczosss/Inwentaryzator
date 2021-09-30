package com.example.inwentaryzator.activities;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;

import com.example.inwentaryzator.items.TypeOfElement;
import com.example.inwentaryzator.items.InventoryElement;

import java.util.LinkedList;
import java.util.List;

public class MainList extends Activity {
    private Button createElement;
    private Button deleteElement;
    private Button goToItemCalculator;
    private List<InventoryElement> inventoryElementList= new LinkedList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    public void onCreateElementClick(){
        String name ="null";
        TypeOfElement type = null;
        inventoryElementList.add(new InventoryElement(name, type, 0));
    }
}
