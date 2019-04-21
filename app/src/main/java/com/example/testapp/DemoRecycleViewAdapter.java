package com.example.testapp;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class DemoRecycleViewAdapter extends RecyclerView.Adapter<DemoRecycleViewAdapter.MyViewHolder> {

    private int[] data;

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public CardView cardView;
        public ImageView imageView;

        public MyViewHolder(View view) {
            super(view);
            cardView = view.findViewById(R.id.recycle_view_cv);
            imageView = view.findViewById(R.id.recycle_view_img);
        }
    }

    public DemoRecycleViewAdapter(int[] data) {
        this.data = data;
    }

    @Override
    public DemoRecycleViewAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent,
                                                                  int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycle_view_item, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.imageView.setImageResource(data[position]);

    }

    @Override
    public int getItemCount() {
        return data.length;
    }
}