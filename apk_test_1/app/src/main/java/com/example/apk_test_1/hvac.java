package com.example.apk_test_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class hvac extends AppCompatActivity {

    private Button mBtn_home;
    private Button mBtn_music;
    private Button mBtn_hvac;
    private Button mBtn_navi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hvac);

        // Click Home
        mBtn_home = (Button) findViewById(R.id.btn_top_home);
        mBtn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hvac.this, MainActivity.class);
                startActivity(intent);
            }
        });

        // Click "Music"
        mBtn_music = (Button) findViewById(R.id.btn_top_music);
        mBtn_music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getPackageManager().getLaunchIntentForPackage("com.google.android.music");
                startActivity(intent);
            }
        });

        // Click "HVAC"
        mBtn_hvac = (Button) findViewById(R.id.btn_top_HVAC);
        mBtn_hvac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hvac.this, hvac.class);
                startActivity(intent);
            }
        });

        // Click "NAVI"
        mBtn_navi = (Button) findViewById(R.id.btn_top_NAVI);
        mBtn_navi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getPackageManager().getLaunchIntentForPackage("com.autonavi.amapauto");
                startActivity(intent);
            }
        });

    }
}
