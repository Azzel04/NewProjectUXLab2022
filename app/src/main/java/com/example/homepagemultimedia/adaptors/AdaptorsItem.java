package com.example.homepagemultimedia.adaptors;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.homepagemultimedia.DetailActivity;
import com.example.homepagemultimedia.ProductActivity;
import com.example.homepagemultimedia.R;
import com.example.homepagemultimedia.models.Product;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class AdaptorsItem extends RecyclerView.Adapter<AdaptorsItem.MyViewHolder>{
    private ArrayList<Product> prod;
    public AdaptorsItem(ArrayList<Product> prod){
        this.prod=prod;
    }
    @NonNull
    @NotNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_product, parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull AdaptorsItem.MyViewHolder holder, int position) {
        holder.title.setText(prod.get(position).getTitle());
        holder.developerName.setText(prod.get(position).getDeveloperName());
        holder.price.setText(prod.get(position).getPrice());
        holder.rating.setText(prod.get(position).getRating());
        holder.relDate.setText(prod.get(position).getRelDate());
        holder.type.setText(prod.get(position).getType());
        holder.description.setText(prod.get(position).getDescription());

//        holder.type.set
    }

    @Override
    public int getItemCount() {
        return prod.size();
    }
    //viewholder
    //internal class
    static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView title,rating,type,relDate,developerName,price,description;
        ImageView image;
        public MyViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            title= itemView.findViewById(R.id.gameName);
            rating= itemView.findViewById(R.id.rating);
            type= itemView.findViewById(R.id.gameType);
            relDate= itemView.findViewById(R.id.releaseDate);
            developerName= itemView.findViewById(R.id.Developer);
            price= itemView.findViewById(R.id.price);
            description= itemView.findViewById(R.id.insertDescription);
            image = itemView.findViewById(R.id.ppImage);
        }
    }
}
