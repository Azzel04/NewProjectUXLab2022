package com.example.homepagemultimedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button toHome = (Button)findViewById(R.id.loginButton);
        toHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentAbout = new Intent(:MainActivity, AboutActivity.class);
                ((HomeActivity) getActivity()).startActivity(intentAbout);
            }
        });
    }
    @Override
    public void onClick(View view) {

    }
}