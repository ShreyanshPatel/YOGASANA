package com.example.yogasana;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;

public class Bhujangasana extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bhujangasana);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        ActionBar actionBar;
        actionBar = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#F9D101"));
        assert actionBar != null;
        actionBar.setBackgroundDrawable(colorDrawable);

        getIntent();
    }

    public void PoseDetection(View view) {

        Intent cam = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivity(cam);
    }
}