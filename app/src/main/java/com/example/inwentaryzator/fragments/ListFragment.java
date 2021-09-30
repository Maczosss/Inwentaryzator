package com.example.inwentaryzator.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.inwentaryzator.activities.CalculationView;
import com.example.inwentaryzator.adapters.ItemListAdapter;
import com.example.inwentaryzator.items.InventoryElement;

public class ListFragment extends Fragment implements ItemListAdapter.onItemListClick {

    @Override
    public void onCreate(@Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onClickListener(InventoryElement element, int position) {
        Intent intent = new Intent(requireActivity().getApplicationContext(), CalculationView.class);
        startActivity(intent);
    }
}
