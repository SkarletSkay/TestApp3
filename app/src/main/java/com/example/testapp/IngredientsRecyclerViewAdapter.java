package com.example.testapp;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class IngredientsRecyclerViewAdapter extends RecyclerView.Adapter<IngredientsRecyclerViewAdapter.MyViewHolder> {

    private int[] dataNames;
    private int[] dataQuantity;

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView nameTextView, quantityTextView;

        public MyViewHolder(View view) {
            super(view);
            nameTextView = view.findViewById(R.id.ingr_name_text_view);
            quantityTextView = view.findViewById(R.id.ingr_quantity_text_view);
        }
    }

    public IngredientsRecyclerViewAdapter(int[][] data) {
        this.dataNames = data[0];
        this.dataQuantity = data[1];
    }

    @Override
    public IngredientsRecyclerViewAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent,
                                                                  int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.ingr_recycler_view_item, parent, false);

        return new IngredientsRecyclerViewAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(IngredientsRecyclerViewAdapter.MyViewHolder holder, int position) {
        holder.nameTextView.setText(dataNames[position]);
        holder.quantityTextView.setText(dataQuantity[position]);
    }

    @Override
    public int getItemCount() {
        return dataNames.length;
    }

}
