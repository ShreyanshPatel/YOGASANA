package com.example.yogasana;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;

public class Articales extends AppCompatActivity {

    Intent getarticales;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_articales);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        getarticales = getIntent();

        ActionBar actionBar;
        actionBar = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#F9D101"));
        assert actionBar != null;
        actionBar.setBackgroundDrawable(colorDrawable);

    }

    public void beniyoga(View view) {
        Intent beniyoga = new Intent(Articales.this,Beniyoga.class);
        startActivity(beniyoga);
    }

    public void benipranayam(View view) {
        Intent benipranayam = new Intent(Articales.this,Benipranayam.class);
        startActivity(benipranayam);
    }

    public void beniwater(View view) {
        Intent beniwater = new Intent(Articales.this,Beniwater.class);
        startActivity(beniwater);
    }

    public void life(View view) {
        Intent life = new Intent(Articales.this,Benilifestyle.class);
        startActivity(life);
    }

    public void ayurveda(View view) {
        Intent ayurveda = new Intent(Articales.this,Beniayurveda.class);
        startActivity(ayurveda);
    }
}