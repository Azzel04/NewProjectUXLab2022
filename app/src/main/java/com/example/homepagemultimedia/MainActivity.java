package com.example.homepagemultimedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText username = findViewById(R.id.usernameLogin);
        EditText password = findViewById(R.id.passwordLogin);
        Button loginButton = findViewById(R.id.loginButton);


        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = username.getText().toString();
                String pass = password.getText().toString();
                if(name.length() < 3){
                    username.setError("Nama harus lebih dari 3 karakter");
                }
                if(pass.isEmpty()){
                    password.setError("Kata Sandi harus diisi");
                }
                else{
                    Toast.makeText(MainActivity.this, "Success!!", Toast.LENGTH_SHORT).show();
                    Intent goToPage = new Intent(MainActivity.this, UsernameActivity.class);
                    goToPage.putExtra("user",name);
                    startActivity(goToPage);
                }

            }
        });
    }



}