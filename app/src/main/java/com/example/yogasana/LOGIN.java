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
import android.view.View;
import android.widget.Button;

public class LOGIN extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_l_o_g_i_n);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        getIntent();
        ActionBar actionBar;
        actionBar = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#F9D101"));
        assert actionBar != null;
        actionBar.setBackgroundDrawable(colorDrawable);
        button = findViewById(R.id.button2);

        if (ContextCompat.checkSelfPermission(LOGIN.this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(LOGIN.this,
                    new String[]{
                            Manifest.permission.CAMERA
                    }, 100);
        }
    }

    public void register(View view){
        Intent intentlogin = new Intent(LOGIN.this,Home.class);
        startActivity(intentlogin);
        finish();
    }
}