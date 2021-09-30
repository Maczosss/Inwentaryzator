package com.example.inwentaryzator.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.inwentaryzator.R;
import com.example.inwentaryzator.items.InventoryElement;

public class ItemListAdapter extends RecyclerView.Adapter<ItemListAdapter.ItemViewHolder> {

    //    private File[] allFiles;
    private InventoryElement[] allItems;
    private onItemListClick onItemListClick;

    public ItemListAdapter(InventoryElement[] allFiles, onItemListClick onItemListClick) {
        this.allItems = allFiles;
        this.onItemListClick = onItemListClick;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.element_main_list, parent, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        holder.first_line.setText(allItems[position].getNameOfElement());
        holder.second_line.setText(String.valueOf(allItems[position].getQuantity()));
    }

    @Override
    public int getItemCount() {
        return allItems.length;
    }

    public class ItemViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private ImageView list_image;
        private TextView first_line;
        private TextView second_line;

        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);

            list_image = itemView.findViewById(R.id.icon);
            first_line = itemView.findViewById(R.id.first_line);
            second_line = itemView.findViewById(R.id.second_line);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            onItemListClick.onClickListener(allItems[getAdapterPosition()], getAdapterPosition());
        }
    }

    //    public interface onItemListClick {
//        void onClickListener(File file, int position);
//    }
    public interface onItemListClick {
        void onClickListener(InventoryElement element, int position);
    }
}
