package com.example.homepagemultimedia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class AboutActivity extends AppCompatActivity {
    int [] images = {R.drawable.y0, R.drawable.yk1, R.drawable.yk2, R.drawable.ykrm, R.drawable.y6};


    ViewFlipper vFlipper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        vFlipper = findViewById(R.id.carousel);

        for(int image: images){
            imageCarousel(image);
        }
    }
    public void imageCarousel(int images){
        ImageView imageView = new ImageView(AboutActivity.this);
        imageView.setBackgroundResource(images);
        vFlipper.addView(imageView);
        vFlipper.setFlipInterval(3000);
        vFlipper.setAutoStart(true);

        vFlipper.setInAnimation(AboutActivity.this, android.R.anim.slide_in_left);
        vFlipper.setOutAnimation(AboutActivity.this, android.R.anim.slide_out_right);

    }
}