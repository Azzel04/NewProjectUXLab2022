package com.example.homepagemultimedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class UsernameActivity extends AppCompatActivity {

    TextView nameText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_username);
        nameText = findViewById(R.id.nameText);
        Intent getName = getIntent();

        nameText.setText(getName.getStringExtra("user"));
        Button nextButton = findViewById(R.id.buttonNext);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toHomePage = new Intent(UsernameActivity.this,HomeActivity.class);
                startActivity(toHomePage);
            }
        });


    }
}