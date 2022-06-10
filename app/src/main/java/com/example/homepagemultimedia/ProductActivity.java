package com.example.homepagemultimedia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.homepagemultimedia.adaptors.AdaptorsItem;
import com.example.homepagemultimedia.models.Product;

import java.util.ArrayList;

public class ProductActivity extends AppCompatActivity {
    public static ArrayList<Product> prod = new ArrayList<>();
    private RecyclerView recItem;
    private AdaptorsItem adaptor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);
        insertDummyData();
        recItem = findViewById(R.id.rItem);

        recItem.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        adaptor = new AdaptorsItem(prod);
        recItem.setAdapter(adaptor);
    }

    void insertDummyData(){
        prod.add(new Product("Yakuza 0","5.0/5.0","Action games","August 1, 2018",
                "SEGA","Rp 20ribu"));
        prod.add(new Product("Yakuza Kiwami","5.0/5.0","Action games","Febuary 19, 2019",
                "SEGA","Rp 25ribu"));
        prod.add(new Product("Yakuza Kiwami 2","5.0/5.0","Action games","December 7, 2017",
                "SEGA","Rp 30ribu"));
        prod.add(new Product("Yakuza 3","5.0/5.0","Action games","Febuary 26, 2009",
                "SEGA","Rp 35ribu"));
        prod.add(new Product("Yakuza 4","5.0/5.0","Action games","March 18, 2010",
                "SEGA","Rp 40ribu"));
    }
}