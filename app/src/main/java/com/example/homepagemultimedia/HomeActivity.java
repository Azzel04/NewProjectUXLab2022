package com.example.homepagemultimedia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.FrameLayout;

import com.google.android.material.tabs.TabLayout;

public class HomeActivity extends AppCompatActivity {
    TabLayout tl;
    FrameLayout fr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        fr=findViewById(R.id.frameHome);
        tl=findViewById(R.id.tabMenu);
        tl.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                Fragment frg= null;
                switch(tab.getPosition()){
                    case 0:{
                        frg = new HomeFragment();
                        break;
                    }
                    case 1:{
                        frg = new AboutFragment();
                        break;
                    }
                    case 2:{
                        frg = new LogoutFragment();
                        break;
                    }
                }
                FragmentManager fm=getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.frameHome,frg);
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                ft.commit();
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });
    }
}