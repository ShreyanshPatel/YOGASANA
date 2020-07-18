package com.example.yogasana;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;

public class Recipes extends AppCompatActivity {

    Intent getrecipe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipes);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        getrecipe = getIntent();

        ActionBar actionBar;
        actionBar = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#F9D101"));
        assert actionBar != null;
        actionBar.setBackgroundDrawable(colorDrawable);

    }

    public void balls(View view) {
        Intent balls = new Intent(Recipes.this,Chocolateballs.class);
        startActivity(balls);
    }

    public void latte(View view) {
        Intent latte = new Intent(Recipes.this,GoldenLAtte.class);
        startActivity(latte);
    }

    public void pasta(View view) {
        Intent pasta = new Intent(Recipes.this,Pasta.class);
        startActivity(pasta);
    }

    public void soup(View view) {
        Intent soup = new Intent(Recipes.this,Soup.class);
        startActivity(soup);
    }

    public void beans(View view) {
        Intent beans = new Intent(Recipes.this,WhiteBeans.class);
        startActivity(beans);
    }
}