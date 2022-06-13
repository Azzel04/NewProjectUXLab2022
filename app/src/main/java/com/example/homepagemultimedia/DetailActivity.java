package com.example.homepagemultimedia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {
    private static final String TAG = "DetailActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        EditText qty = (EditText) findViewById(R.id.editTextNumber);
        Button confirmation = findViewById(R.id.buttonConfirm);


//        confirmation.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if(qty.getText().toString().length()<0){
//                    qty.setError("Not enough quantity@");
//                }else{
////                    Toast.makeText(DetailActivity.this,DetailActivity.class)
//                }
//            }
//        });
    }
    private void collectIntent(){
        if(getIntent().hasExtra("gameName") && getIntent().hasExtra("gameRating") && getIntent().hasExtra("gameType")
        && getIntent().hasExtra("gameRelDate")&& getIntent().hasExtra("gameDeveloper")&& getIntent().hasExtra("gameHarga")&&
        getIntent().hasExtra("gameDescription") && getIntent().hasExtra("gameImage")){
            String gName = getIntent().getStringExtra("gameName");
            String gRating = getIntent().getStringExtra("gameRating");
            String gType = getIntent().getStringExtra("gameType");
            String gRel = getIntent().getStringExtra("gameRelDate");
            String gDev = getIntent().getStringExtra("gameDeveloper");
            String gHarga = getIntent().getStringExtra("gameHarga");
            String gDes = getIntent().getStringExtra("gameDescription");
            int[] gImg = getIntent().getIntArrayExtra("gameImage");


        }
    }


}