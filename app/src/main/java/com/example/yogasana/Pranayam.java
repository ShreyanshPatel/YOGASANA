package com.example.yogasana;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;

public class Pranayam extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pranayam);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        ActionBar actionBar;
        actionBar = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#F9D101"));
        assert actionBar != null;
        actionBar.setBackgroundDrawable(colorDrawable);

    }

    public void nadi(View view) {
        Intent nadi = new Intent(Pranayam.this,NadiShodhana.class);
        startActivity(nadi);
    }

    public void kapal(View view) {
        Intent kapal = new Intent(Pranayam.this,Kapalbharti.class);
        startActivity(kapal);
    }

    public void bellow(View view) {
        Intent bellow = new Intent(Pranayam.this,Bhastrika.class);
        startActivity(bellow);
    }

    public void bee(View view) {
        Intent bee = new Intent(Pranayam.this,Bhramari.class);
        startActivity(bee);
    }
}