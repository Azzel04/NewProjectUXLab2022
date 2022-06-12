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
import java.util.zip.Inflater;

public class AdaptorsItem extends RecyclerView.Adapter<AdaptorsItem.MyViewHolder>{
    Context context;
    String[] name ;
    String[] rating ;
    String[] type ;
    String[] relDate;
    String[] developper;
    String[] harga;
    String[] description;
    int [] images;
    //    private  int[] images;
//    private ArrayList<Product> prod;
//    public AdaptorsItem(ArrayList<Product> prod,int[] images){
//        this.prod=prod;
//        this.images=images;
//    }
//
//    public AdaptorsItem(ArrayList<Product> prod) {
//    }
    //viewholder
    //internal class
    public static class MyViewHolder extends RecyclerView.ViewHolder{
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

    public AdaptorsItem(Context context, String[] name, String[] rating, String[] type, String[] relDate, String[] developper, String[] harga, String[] description, int[] images) {
        this.context = context;
        this.name = name;
        this.rating = rating;
        this.type = type;
        this.relDate = relDate;
        this.developper = developper;
        this.harga = harga;
        this.description = description;
        this.images = images;
    }

    @NonNull
    @Override
    public AdaptorsItem.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_product,parent,false);
        MyViewHolder viewHolder = new MyViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull AdaptorsItem.MyViewHolder holder, int position) {
        holder.title.setText(name[position]);
        holder.developerName.setText(developper[position]);
        holder.price.setText(harga[position]);
        holder.rating.setText(rating[position]);
        holder.relDate.setText(relDate[position]);
        holder.type.setText(type[position]);
        holder.description.setText(description[position]);
        holder.image.setImageResource(images[position]);

//        holder.type.set
    }


    @Override
    public int getItemCount() {
        return name.length;
    }
}
