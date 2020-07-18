package com.example.yogasana;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;

public class Asana extends AppCompatActivity {

    Intent getasana;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asana);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        getasana = getIntent();

        ActionBar actionBar;
        actionBar = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#F9D101"));
        assert actionBar != null;
        actionBar.setBackgroundDrawable(colorDrawable);
    }


    public void paschi(View view) {
        Intent paschi = new Intent(Asana.this,Paschomottanasana.class);
        startActivity(paschi);
    }

    public void tada(View view) {
        Intent tada = new Intent(Asana.this,Tadasana.class);
        startActivity(tada);
    }

    public void worrior2(View view) {
        Intent warrior2 = new Intent(Asana.this,Virbhadrasana_2.class);
        startActivity(warrior2);
    }

    public void worrior1(View view) {
        Intent warrior1 = new Intent(Asana.this,Virbhadrasana_1.class);
        startActivity(warrior1);
    }

    public void adho(View view) {
        Intent adho = new Intent(Asana.this,AdhoMukhoSvanasana.class);
        startActivity(adho);
    }

    public void trikon(View view) {
        Intent trikon = new Intent(Asana.this,Trikonasana.class);
        startActivity(trikon);
    }

    public void vrikas(View view) {
        Intent vrikas = new Intent(Asana.this,Vrikshasana.class);
        startActivity(vrikas);
    }

    public void nauka(View view) {
        Intent nauka = new Intent(Asana.this,Naukasana.class);
        startActivity(nauka);
    }

    public void bhuja(View view) {
        Intent bhuja = new Intent(Asana.this,Bhujangasana.class);
        startActivity(bhuja);
    }

    public void kursi(View view) {
        Intent kursi = new Intent(Asana.this,Kursiasana.class);
        startActivity(kursi);
    }
}