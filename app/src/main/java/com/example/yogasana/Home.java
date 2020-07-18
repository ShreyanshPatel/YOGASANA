package com.example.yogasana;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;

public class Home extends AppCompatActivity {

    Intent get;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        get = getIntent();


        ActionBar actionBar;
        actionBar = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#F9D101"));
        assert actionBar != null;
        actionBar.setBackgroundDrawable(colorDrawable);
    }

    public void asana(View view){
        Intent asanaintent = new Intent(Home.this,Asana.class);
        startActivity(asanaintent);
    }
    public void pranayam(View view){
        Intent pranyamintent = new Intent(Home.this,Pranayam.class);
        startActivity(pranyamintent);
    }
    public void articales(View view){
        Intent articalesintent = new Intent(Home.this,Articales.class);
        startActivity(articalesintent);
    }
    public void shop(View view){
        Intent shopintent = new Intent(Home.this,Shop.class);
        startActivity(shopintent);
    }
    public void diet(View view){
        Intent dietintent = new Intent(Home.this,Diet.class);
        startActivity(dietintent);
    }
    public void recipe(View view){
        Intent recipeintent = new Intent(Home.this,Recipes.class);
        startActivity(recipeintent);
    }
    public void trikon(View view){
        Intent asanaintent = new Intent(Home.this,Trikonasana.class);
        startActivity(asanaintent);
    }

    public void kursi(View view){
        Intent asanaintent = new Intent(Home.this,Kursiasana.class);
        startActivity(asanaintent);
    }
    public void nauka(View view){
        Intent asanaintent = new Intent(Home.this,Naukasana.class);
        startActivity(asanaintent);
    }

    public void giloy(View view) {
        Intent giloy = new Intent(Home.this,Giloyark.class);
        startActivity(giloy);
    }

    public void tulsi(View view) {
        Intent tulsi = new Intent(Home.this,Tulsiark.class);
        startActivity(tulsi);
    }

    public void ajwain(View view) {
        Intent ajwani = new Intent(Home.this,Ajwainark.class);
        startActivity(ajwani);
    }

    public void gulab(View view) {
        Intent gulab = new Intent(Home.this,Gilabark.class);
        startActivity(gulab);
    }

    public void benipranayam(View view) {
        Intent benipranayam = new Intent(Home.this,Benipranayam.class);
        startActivity(benipranayam);
    }

    public void life(View view) {
        Intent life = new Intent(Home.this,Benilifestyle.class);
        startActivity(life);
    }

    public void vrikas(View view) {
        Intent vrikas = new Intent(Home.this,Vrikshasana.class);
        startActivity(vrikas);
    }
}