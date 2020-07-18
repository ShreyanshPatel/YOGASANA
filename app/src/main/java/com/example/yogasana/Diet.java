package com.example.yogasana;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;

public class Diet extends AppCompatActivity {

    Intent getdiet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        ActionBar actionBar;
        actionBar = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#F9D101"));
        assert actionBar != null;
        actionBar.setBackgroundDrawable(colorDrawable);

        getdiet = getIntent();
    }

    public void sun(View view) {
        Intent sun = new Intent(Diet.this,SunDiet.class);
        startActivity(sun);
    }

    public void sat(View view) {
        Intent sat = new Intent(Diet.this,SatDiet.class);
        startActivity(sat);
    }

    public void fri(View view) {
        Intent fri = new Intent(Diet.this,FriDiet.class);
        startActivity(fri);
    }

    public void tue(View view) {
        Intent tue = new Intent(Diet.this,TuesDiet.class);
        startActivity(tue);
    }

    public void thus(View view) {
        Intent thus = new Intent(Diet.this,ThusDiet.class);
        startActivity(thus);
    }

    public void wed(View view) {
        Intent wed = new Intent(Diet.this,WedDiet.class);
        startActivity(wed);
    }

    public void mon(View view) {
        Intent mon = new Intent(Diet.this,MonDiet.class);
        startActivity(mon);
    }
}