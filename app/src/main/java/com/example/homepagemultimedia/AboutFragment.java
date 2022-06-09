package com.example.homepagemultimedia;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class AboutFragment extends Fragment implements View.OnClickListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_about, container, false);
        Button toAbout = (Button) rootView.findViewById(R.id.buttonAbout);

        toAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentAbout = new Intent(getActivity(), AboutActivity.class);
                ((HomeActivity) getActivity()).startActivity(intentAbout);
            }
        });

        return rootView;

    }// end onCreateVi

    @Override
    public void onViewCreated(@NonNull @org.jetbrains.annotations.NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onClick(View view) {

    }
}