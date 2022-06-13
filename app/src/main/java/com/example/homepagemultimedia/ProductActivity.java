package com.example.homepagemultimedia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.homepagemultimedia.adaptors.AdaptorsItem;
import com.example.homepagemultimedia.models.Product;

import java.util.ArrayList;

public class ProductActivity extends AppCompatActivity {
//    public static ArrayList<Product> prod = new ArrayList<>();
    RecyclerView recItem;
    RecyclerView.Adapter prodAdapter;
    RecyclerView.LayoutManager layoutManager;

    String[] name = {
            "Yakuza 0",
            "Yakuza Kiwami",
            "Yakuza Kiwami 2",
            "Yakuza 3",
            "Yakuza 4"};
    String[] rating = {
            "5.0/5.0",
            "5.0/5.0",
            "5.0/5.0",
            "5.0/5.0",
            "5.0/5.0"};
    String[] type = {
            "Action games",
            "Action games",
            "Action games",
            "Action games",
            "Action games"
    };
    String[] relDate = {
            "August 1, 2018",
            "February 19, 2019",
            "December 7, 2017",
            "February 26, 2009",
            "March 18, 2010"
    };
    String[] developper = {
            "SEGA",
            "SEGA",
            "SEGA",
            "SEGA",
            "SEGA"
    };
    String[] harga = {
            "Rp 20ribu",
            "Rp 25ribu",
            "Rp 30ribu",
            "Rp 35ribu",
            "Rp 40ribu"
    };
    String[] description = {
            "Mad Dog is Pure Boy!",
            "Depression Version 1",
            "Majima Construction is Best Job!",
            "Okay, Okay Got It. No, There Is No Change In The Plan",
            "Lazy CEO of a Loaning Business is Somehow Bruce Lee"
    };
    int [] images={
            R.drawable.yakuza_zero_pp,
            R.drawable.yk1,
            R.drawable.new_kmw2,
            R.drawable.new_y3,
            R.drawable.new_y4
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);
//        insertDummyData();
        recItem = findViewById(R.id.rItem);
        recItem.setHasFixedSize(true);
        layoutManager=new LinearLayoutManager(this);
        recItem.setLayoutManager(layoutManager);
        prodAdapter = new AdaptorsItem(this,name,rating,type,relDate,developper,harga,description,images);
//        prodAdapter = new AdaptorsItem(this,name,rating,type,relDate,developper,harga,description);
        recItem.setAdapter(prodAdapter);
    }
//    void insertDummyData(){
//        prod.add(new Product("Yakuza 0","5.0/5.0","Actiom games","August 1, 2018",
//                "SEGA","Rp 20ribu","Mad Dog is Pure Boy!"));
//        prod.add(new Product("Yakuza Kiwami","5.0/5.0","Action games","Febuary 19, 2019",
//                "SEGA","Rp 25ribu","Depression Version 1"));
//        prod.add(new Product("Yakuza Kiwami 2","5.0/5.0","Action games","December 7, 2017",
//                "SEGA","Rp 30ribu","Majima Construction is Best Job!"));
//        prod.add(new Product("Yakuza 3","5.0/5.0","Action games","Febuary 26, 2009",
//                "SEGA","Rp 35ribu","Okay, Okay Got It. No, There Is No Change In The Plan"));
//        prod.add(new Product("Yakuza 4","5.0/5.0","Action games","March 18, 2010",
//                "SEGA","Rp 40ribu","Lazy CEO of a Loaning Business is Somehow Bruce Lee"));
//    }
}