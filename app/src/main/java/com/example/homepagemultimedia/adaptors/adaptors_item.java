package com.example.homepagemultimedia.adaptors;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

public class adaptors_item extends RecyclerView.Adapter<adaptors_item.MyViewHolder>{

    @NonNull
    @NotNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull adaptors_item.MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
    //viewholder
    //internal class
    static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView title,rating,type,relDate,developerName,price;
        public MyViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);

        }
    }
}
