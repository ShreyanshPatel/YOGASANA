package com.example.yogasana;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;

public class Kursiasana extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kursiasana);
        getIntent();
        ActionBar actionBar;
        actionBar = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#F9D101"));
        assert actionBar != null;
        actionBar.setBackgroundDrawable(colorDrawable);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }

    public void PoseDetection(View view) {
        try {
            Intent cam = new Intent();
            cam.setAction(MediaStore.ACTION_IMAGE_CAPTURE);
            startActivity(cam);
        }
        catch (Exception e ){
            e.printStackTrace();
        }
    }
}