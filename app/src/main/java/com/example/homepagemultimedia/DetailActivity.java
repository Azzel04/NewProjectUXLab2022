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

        confirmation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(qty.getText().toString().length()<=0){
                    qty.setError("Not Enough Quantity!");
                }else{
                    Toast.makeText(DetailActivity.this, "Success!!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}