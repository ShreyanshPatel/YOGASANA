package com.example.yogasana;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;

public class Shop extends AppCompatActivity {

    Intent getshop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);
        getshop = getIntent();

        ActionBar actionBar;
        actionBar = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#F9D101"));
        assert actionBar != null;
        actionBar.setBackgroundDrawable(colorDrawable);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }

    public void ajwain(View view) {
        Intent ajwani = new Intent(Shop.this,Ajwainark.class);
        startActivity(ajwani);
    }

    public void giloy(View view) {
        Intent giloy = new Intent(Shop.this,Giloyark.class);
        startActivity(giloy);
    }

    public void gujban(View view) {
        Intent gujban = new Intent(Shop.this,Gajbanark.class);
        startActivity(gujban);
    }

    public void gulab(View view) {
        Intent gulab = new Intent(Shop.this,Gilabark.class);
        startActivity(gulab);
    }

    public void badam(View view) {
        Intent badam = new Intent(Shop.this,BadamRogan.class);
        startActivity(badam);
    }

    public void tulsi(View view) {
        Intent tulsi = new Intent(Shop.this,Tulsiark.class);
        startActivity(tulsi);
    }

    public void suanf(View view) {
        Intent suanf = new Intent(Shop.this,Saunfark.class);
        startActivity(suanf);
    }

    public void makoi(View view) {
        Intent makoi = new Intent(Shop.this,Makoiark.class);
        startActivity(makoi);
    }

    public void mat(View view) {
        Intent mat = new Intent(Shop.this,YogaMat.class);
        startActivity(mat);
    }

    public void lotta(View view) {
        Intent lotta = new Intent(Shop.this,JalaLotta.class);
        startActivity(lotta);
    }
}