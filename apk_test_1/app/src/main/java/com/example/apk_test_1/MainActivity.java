package com.example.apk_test_1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextClock;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;

// public class MainActivity extends AppCompatActivity {
public class MainActivity extends Activity {

    private Button mBtn_home;
    private Button mBtn_music;
    private Button mBtn_hvac;
    private Button mBtn_navi;

    private Button mBtn_icon_phone;
    private Button mBtn_icon_car;
    private Button mBtn_icon_music;
    private Button mBtn_icon_navi;
    private Button mBtn_icon_message;
    private Button mBtn_icon_hvac;
    private Button mBtn_icon_setttings;
    private Button mBtn_icon_more;

    private TextClock mTextClock;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ////          Top area        ////
        // Click "Home"
        mBtn_home = (Button) findViewById(R.id.btn_top_home);
        mBtn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
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
                Intent intent = new Intent(MainActivity.this, hvac.class);
                // Intent intent = getPackageManager().getLaunchIntentForPackage("android.car.dialer");
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


        ////          APP area        ////
        // Click "Phone"
        mBtn_icon_phone = (Button) findViewById(R.id.btn_icon_phone);
        mBtn_icon_phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, phone.class);
                startActivity(intent);
            }
        });

        // Click "Music"
        mBtn_icon_music = (Button) findViewById(R.id.btn_icon_music);
        mBtn_icon_music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getPackageManager().getLaunchIntentForPackage("com.google.android.music");
                startActivity(intent);
            }
        });

        // Click "Navigation"
        mBtn_icon_navi = (Button) findViewById(R.id.btn_icon_map);
        mBtn_icon_navi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getPackageManager().getLaunchIntentForPackage("com.autonavi.amapauto");
                startActivity(intent);
            }
        });

        // Click "Message"
        mBtn_icon_message = (Button) findViewById(R.id.btn_icon_message);
        mBtn_icon_message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getPackageManager().getLaunchIntentForPackage("com.android.car.messenger");
                startActivity(intent);
            }
        });

        // Click "HVAC"
        mBtn_icon_hvac = (Button) findViewById(R.id.btn_icon_hvac);
        mBtn_icon_hvac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, hvac.class);
                // Intent intent = getPackageManager().getLaunchIntentForPackage("android.car.dialer");
                startActivity(intent);
            }
        });

        // Click "Setting"
        mBtn_icon_setttings = (Button) findViewById(R.id.btn_icon_setting);
        mBtn_icon_setttings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getPackageManager().getLaunchIntentForPackage("com.android.car.settings");
                startActivity(intent);
            }
        });


    }
}
