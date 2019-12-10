package com.example.apk_test_1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class phone extends Activity {

    private Button mBtn_home;
    private Button mBtn_music;
    private Button mBtn_hvac;
    private Button mBtn_navi;

    private Button mBtn_phone_1;
    private Button mBtn_phone_2;
    private Button mBtn_phone_3;
    private Button mBtn_phone_4;
    private Button mBtn_phone_5;
    private Button mBtn_phone_6;
    private Button mBtn_phone_7;
    private Button mBtn_phone_8;
    private Button mBtn_phone_9;
    private Button mBtn_phone_10;
    private Button mBtn_phone_11;
    private Button mBtn_phone_12;

    private Button mBtn_phone_call;
    private Button mBtn_phone_del;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone);


        ////          Top area        ////
        // Click "Home"
        mBtn_home = (Button) findViewById(R.id.btn_top_home);
        mBtn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(phone.this, MainActivity.class);
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
                Intent intent = new Intent(phone.this, hvac.class);
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


        ////   Center area ////

        // Input "1"
        mBtn_phone_1 = (Button) findViewById(R.id.phone_num_input_1);
        final TextView Phone_num_input_1 = (TextView)findViewById(R.id.text_phone_number_input);
        mBtn_phone_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Phone_num_input_1.getText().toString().equals("Dial a Number")) {
                    Phone_num_input_1.setText(String.valueOf("1"));}
                else{
                    Phone_num_input_1.setText(String.valueOf(Phone_num_input_1.getText().toString()+"1"));
                }
            }
        });

        // "Input 2"
        mBtn_phone_2 = (Button) findViewById(R.id.phone_num_input_2);
        final TextView Phone_num_input_2 = (TextView)findViewById(R.id.text_phone_number_input);
        mBtn_phone_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Phone_num_input_2.getText().toString().equals("Dial a Number")) {
                    Phone_num_input_2.setText(String.valueOf("2"));}
                else{
                    Phone_num_input_2.setText(String.valueOf(Phone_num_input_2.getText().toString()+"2"));
                }
            }
        });

        // Input "3"
        mBtn_phone_3 = (Button) findViewById(R.id.phone_num_input_3);
        final TextView Phone_num_input_3 = (TextView)findViewById(R.id.text_phone_number_input);
        mBtn_phone_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Phone_num_input_3.getText().toString().equals("Dial a Number")) {
                    Phone_num_input_3.setText(String.valueOf("3"));}
                else{
                    Phone_num_input_3.setText(String.valueOf(Phone_num_input_3.getText().toString()+"3"));
                }
            }
        });

        // Input "4"
        mBtn_phone_4 = (Button) findViewById(R.id.phone_num_input_4);
        final TextView Phone_num_input_4 = (TextView)findViewById(R.id.text_phone_number_input);
        mBtn_phone_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Phone_num_input_4.getText().toString().equals("Dial a Number")) {
                    Phone_num_input_4.setText(String.valueOf("4"));}
                else{
                    Phone_num_input_4.setText(String.valueOf(Phone_num_input_4.getText().toString()+"4"));
                }
            }
        });

        // Input "5"
        mBtn_phone_5 = (Button) findViewById(R.id.phone_num_input_5);
        final TextView Phone_num_input_5 = (TextView)findViewById(R.id.text_phone_number_input);
        mBtn_phone_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Phone_num_input_5.getText().toString().equals("Dial a Number")) {
                    Phone_num_input_5.setText(String.valueOf("5"));}
                else{
                    Phone_num_input_5.setText(String.valueOf(Phone_num_input_5.getText().toString()+"5"));
                }
            }
        });

        // Input "6"
        mBtn_phone_6 = (Button) findViewById(R.id.phone_num_input_6);
        final TextView Phone_num_input_6 = (TextView)findViewById(R.id.text_phone_number_input);
        mBtn_phone_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Phone_num_input_6.getText().toString().equals("Dial a Number")) {
                    Phone_num_input_6.setText(String.valueOf("6"));}
                else{
                    Phone_num_input_6.setText(String.valueOf(Phone_num_input_6.getText().toString()+"6"));
                }
            }
        });

        // Input "7"
        mBtn_phone_7 = (Button) findViewById(R.id.phone_num_input_7);
        final TextView Phone_num_input_7 = (TextView)findViewById(R.id.text_phone_number_input);
        mBtn_phone_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Phone_num_input_7.getText().toString().equals("Dial a Number")) {
                    Phone_num_input_7.setText(String.valueOf("7"));}
                else{
                    Phone_num_input_7.setText(String.valueOf(Phone_num_input_7.getText().toString()+"7"));
                }
            }
        });

        // Input "8"
        mBtn_phone_8 = (Button) findViewById(R.id.phone_num_input_8);
        final TextView Phone_num_input_8 = (TextView)findViewById(R.id.text_phone_number_input);
        mBtn_phone_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Phone_num_input_8.getText().toString().equals("Dial a Number")) {
                    Phone_num_input_8.setText(String.valueOf("8"));}
                else{
                    Phone_num_input_8.setText(String.valueOf(Phone_num_input_8.getText().toString()+"8"));
                }
            }
        });

        // Input "9"
        mBtn_phone_9 = (Button) findViewById(R.id.phone_num_input_9);
        final TextView Phone_num_input_9 = (TextView)findViewById(R.id.text_phone_number_input);
        mBtn_phone_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Phone_num_input_9.getText().toString().equals("Dial a Number")) {
                    Phone_num_input_9.setText(String.valueOf("9"));}
                else{
                    Phone_num_input_9.setText(String.valueOf(Phone_num_input_9.getText().toString()+"9"));
                }
            }
        });


        // Input "*"
        mBtn_phone_10 = (Button) findViewById(R.id.phone_num_input_10);
        final TextView Phone_num_input_10 = (TextView)findViewById(R.id.text_phone_number_input);
        mBtn_phone_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Phone_num_input_10.getText().toString().equals("Dial a Number")) {
                    Phone_num_input_10.setText(String.valueOf("10"));}
                else{
                    Phone_num_input_10.setText(String.valueOf(Phone_num_input_10.getText().toString()+"*"));
                }
            }
        });


        // Input "0"
        mBtn_phone_10 = (Button) findViewById(R.id.phone_num_input_11);
        final TextView Phone_num_input_0 = (TextView)findViewById(R.id.text_phone_number_input);
        mBtn_phone_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Phone_num_input_0.getText().toString().equals("Dial a Number")) {
                    Phone_num_input_0.setText(String.valueOf("0"));}
                else{
                    Phone_num_input_0.setText(String.valueOf(Phone_num_input_0.getText().toString()+"0"));
                }
            }
        });


        // Input "11"
        mBtn_phone_11 = (Button) findViewById(R.id.phone_num_input_12);
        final TextView Phone_num_input_11 = (TextView)findViewById(R.id.text_phone_number_input);
        mBtn_phone_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Phone_num_input_11.getText().toString().equals("Dial a Number")) {
                    Phone_num_input_11.setText(String.valueOf("11"));}
                else{
                    Phone_num_input_11.setText(String.valueOf(Phone_num_input_11.getText().toString()+"#"));
                }
            }
        });

        // "Delete"
        mBtn_phone_del = (Button) findViewById(R.id.btn_phone_delete);
        final TextView Phone_num_input_del = (TextView)findViewById(R.id.text_phone_number_input);
        mBtn_phone_del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!Phone_num_input_del.getText().toString().isEmpty()) {
                    Phone_num_input_del.setText(
                            String.valueOf(Phone_num_input_del.getText().toString().substring(
                                    0, (Phone_num_input_del.getText().toString().length() - 1))));
                }
            }
        });

    }
}
