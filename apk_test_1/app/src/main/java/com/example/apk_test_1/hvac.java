package com.example.apk_test_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;

import org.w3c.dom.Text;

public class hvac extends Activity implements View.OnClickListener{

    private Button mBtn_home;
    private Button mBtn_music;
    private Button mBtn_hvac;
    private Button mBtn_navi;

    private Button btn_left_seat_heat;
    private Button btn_left_win_wiper;
    private Button btn_left_win_defrost;

    private Button btn_right_seat_heat;
    private Button btn_right_win_wiper;
    private Button btn_right_win_defrost;

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


        // HVAC Seekbar
        // refer to https://stackoverflow.com/questions/15326290/get-android-seekbar-value-and-display-it-on-screen
        SeekBar seekBar = (SeekBar)findViewById(R.id.seekbar_hvac_hot);
        final TextView seekbarValue = (TextView)findViewById(R.id.seekbar_hvac_hot_value);
        final ProgressBar progressbar_value = (ProgressBar)findViewById(R.id.progressbar_hvac_hot_value);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){

            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser)
            {
                seekbarValue.setText(String.valueOf(progress+"°C"));
                progressbar_value.setProgress(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        // HVAC Seekbar
        // refer to https://stackoverflow.com/questions/15326290/get-android-seekbar-value-and-display-it-on-screen
        SeekBar seekBar_cold = (SeekBar)findViewById(R.id.seekbar_hvac_cold);
        final TextView seekbar_cold_Value = (TextView)findViewById(R.id.seekbar_hvac_cold_value);
        final ProgressBar progressbar_cold_value = (ProgressBar)findViewById(R.id.progressbar_hvac_cold_value);

        seekBar_cold.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){

            public void onProgressChanged(SeekBar seekBar_cold, int progress, boolean fromUser)
            {
                seekbar_cold_Value.setText(String.valueOf(progress+"°C"));
                progressbar_cold_value.setProgress(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar_cold) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar_cold) {

            }
        });

        // Center air for HVAC

        // off
        final Button wind_off = (Button)findViewById(R.id.hvac_btn_wind_off);
        final Button wind_max = (Button)findViewById(R.id.hvac_btn_wind_max);
        final Button wind_1 = (Button)findViewById(R.id.hvac_btn_wind_1);
        final Button wind_2 = (Button)findViewById(R.id.hvac_btn_wind_2);
        final Button wind_3 = (Button)findViewById(R.id.hvac_btn_wind_3);
        final Button wind_4 = (Button)findViewById(R.id.hvac_btn_wind_4);

        // off
        wind_off.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    wind_1.setBackgroundColor(Color.parseColor("#ffffff"));
                    wind_2.setBackgroundColor(Color.parseColor("#ffffff"));
                    wind_3.setBackgroundColor(Color.parseColor("#ffffff"));
                    wind_4.setBackgroundColor(Color.parseColor("#ffffff"));

            }
        });

        // max
        wind_max.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wind_1.setBackgroundColor(Color.parseColor("#31b0d5"));
                wind_2.setBackgroundColor(Color.parseColor("#31b0d5"));
                wind_3.setBackgroundColor(Color.parseColor("#31b0d5"));
                wind_4.setBackgroundColor(Color.parseColor("#31b0d5"));

            }
        });

        // Wind 1
        wind_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentColor = ((ColorDrawable) wind_1.getBackground()).getColor();
                // test_text.setText(String.valueOf(currentColor));

                // wind1: blue
                if (String.valueOf(currentColor).equals("-13520683"))
                {
                    wind_1.setBackgroundColor(Color.parseColor("#ffffff"));
                    wind_2.setBackgroundColor(Color.parseColor("#ffffff"));
                    wind_3.setBackgroundColor(Color.parseColor("#ffffff"));
                    wind_4.setBackgroundColor(Color.parseColor("#ffffff"));
                }
                // wind1: white
                else if (String.valueOf(currentColor).equals("-1"))
                {
                    wind_1.setBackgroundColor(Color.parseColor("#31b0d5"));
                    wind_2.setBackgroundColor(Color.parseColor("#ffffff"));
                    wind_3.setBackgroundColor(Color.parseColor("#ffffff"));
                    wind_4.setBackgroundColor(Color.parseColor("#ffffff"));
                }
            }
            });

        // Wind 2
        wind_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentColor = ((ColorDrawable) wind_2.getBackground()).getColor();
                // test_text.setText(String.valueOf(currentColor));

                // wind2: blue
                if (String.valueOf(currentColor).equals("-13520683"))
                {
                    wind_2.setBackgroundColor(Color.parseColor("#ffffff"));
                    wind_3.setBackgroundColor(Color.parseColor("#ffffff"));
                    wind_4.setBackgroundColor(Color.parseColor("#ffffff"));
                }
                // wind2: white
                else if (String.valueOf(currentColor).equals("-1"))
                {
                    wind_1.setBackgroundColor(Color.parseColor("#31b0d5"));
                    wind_2.setBackgroundColor(Color.parseColor("#31b0d5"));
                    wind_3.setBackgroundColor(Color.parseColor("#ffffff"));
                    wind_4.setBackgroundColor(Color.parseColor("#ffffff"));
                }
            }
        });

        // Wind 3
        wind_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentColor = ((ColorDrawable) wind_3.getBackground()).getColor();
                // test_text.setText(String.valueOf(currentColor));
                if (String.valueOf(currentColor).equals("-13520683"))
                {
                    wind_3.setBackgroundColor(Color.parseColor("#ffffff"));
                    wind_4.setBackgroundColor(Color.parseColor("#ffffff"));
                }
                else if (String.valueOf(currentColor).equals("-1"))
                {
                    wind_1.setBackgroundColor(Color.parseColor("#31b0d5"));
                    wind_2.setBackgroundColor(Color.parseColor("#31b0d5"));
                    wind_3.setBackgroundColor(Color.parseColor("#31b0d5"));
                    wind_4.setBackgroundColor(Color.parseColor("#ffffff"));
                }
            }
        });

        // Wind 4
        wind_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentColor = ((ColorDrawable) wind_4.getBackground()).getColor();
                // test_text.setText(String.valueOf(currentColor));
                if (String.valueOf(currentColor).equals("-13520683"))
                {
                    wind_4.setBackgroundColor(Color.parseColor("#ffffff"));
                }
                else if (String.valueOf(currentColor).equals("-1"))
                {
                    wind_1.setBackgroundColor(Color.parseColor("#31b0d5"));
                    wind_2.setBackgroundColor(Color.parseColor("#31b0d5"));
                    wind_3.setBackgroundColor(Color.parseColor("#31b0d5"));
                    wind_4.setBackgroundColor(Color.parseColor("#31b0d5"));
                }
            }
        });

        // Air flow: Wind upper
        final Button btn_wind_upper = (Button)findViewById(R.id.hvac_btn_wind_upper);
        final Button btn_wind_upper_lower = (Button)findViewById(R.id.hvac_btn_wind_upper_lower);
        final Button btn_wind_lower = (Button)findViewById(R.id.hvac_btn_wind_lower);


        // Button wind: Upper
        btn_wind_upper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (btn_wind_upper.getBackground().getConstantState()
                        .equals(getResources().getDrawable(R.drawable.hvac_air_flow_upper).getConstantState()))
                {
                    btn_wind_upper.setBackgroundResource(R.drawable.hvac_air_flow_upper_clicked);
                    btn_wind_lower.setBackgroundResource(R.drawable.hvac_air_flow_lower);
                    btn_wind_upper_lower.setBackgroundResource(R.drawable.hvac_air_flow_upper_lower);
                }
                else if (btn_wind_upper.getBackground().getConstantState()
                        .equals(getResources().getDrawable(R.drawable.hvac_air_flow_upper_clicked).getConstantState()))
                {
                    btn_wind_upper.setBackgroundResource(R.drawable.hvac_air_flow_upper);
                }
            }
        });

        // Button wind: Lower
        btn_wind_lower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (getResources().getDrawable(R.drawable.hvac_air_flow_lower).getConstantState().
                        equals(btn_wind_lower.getBackground().getConstantState()))
                {
                    btn_wind_upper.setBackgroundResource(R.drawable.hvac_air_flow_upper);
                    btn_wind_lower.setBackgroundResource(R.drawable.hvac_air_flow_lower_clicked);
                    btn_wind_upper_lower.setBackgroundResource(R.drawable.hvac_air_flow_upper_lower);
                }
                else if (getResources().getDrawable(R.drawable.hvac_air_flow_lower_clicked).getConstantState().
                        equals(btn_wind_lower.getBackground().getConstantState()))
                {
                    btn_wind_lower.setBackgroundResource(R.drawable.hvac_air_flow_lower);
                }
            }
        });

        // Button wind: Lower Upper
        btn_wind_upper_lower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (btn_wind_upper_lower.getBackground().getConstantState()
                        .equals(getResources().getDrawable(R.drawable.hvac_air_flow_upper_lower).getConstantState()))
                {
                    btn_wind_upper.setBackgroundResource(R.drawable.hvac_air_flow_upper);
                    btn_wind_lower.setBackgroundResource(R.drawable.hvac_air_flow_lower);
                    btn_wind_upper_lower.setBackgroundResource(R.drawable.hvac_air_flow_upper_lower_clicked);
                }
                else if (btn_wind_upper_lower.getBackground().getConstantState().equals(getResources().getDrawable(R.drawable.hvac_air_flow_upper_lower_clicked).getConstantState()))
                {
                    btn_wind_upper_lower.setBackgroundResource(R.drawable.hvac_air_flow_upper_lower);
                }
            }
        });

        // left/right AC
        final Button btn_hvac_left_AC = (Button)findViewById(R.id.hvac_btn_left_AC);
        final Button btn_hvac_right_AC = (Button)findViewById(R.id.hvac_btn_right_AC);

        btn_hvac_left_AC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btn_hvac_left_AC.getBackground().getConstantState()
                        .equals(getResources().getDrawable(R.drawable.hvac_air_flow_recirculation).getConstantState()))
                {
                    btn_hvac_left_AC.setBackgroundResource(R.drawable.hvac_air_flow_recirculation_clicked);
                }
                else if (btn_hvac_left_AC.getBackground().getConstantState()
                        .equals(getResources().getDrawable(R.drawable.hvac_air_flow_recirculation_clicked).getConstantState()))
                {
                    btn_hvac_left_AC.setBackgroundResource(R.drawable.hvac_air_flow_recirculation);
                }
            }
        });

        // Left/right 6 buttons
        btn_left_seat_heat = (Button)findViewById(R.id.hvac_btn_left_seat_heat);
        btn_left_win_wiper = (Button)findViewById(R.id.hvac_btn_left_windows_wiper);
        btn_left_win_defrost = (Button)findViewById(R.id.hvac_btn_left_window_defrost);

        btn_left_seat_heat.setTag(new Integer(1));
        btn_left_win_wiper.setTag(new Integer(2));
        btn_left_win_defrost.setTag(new Integer(3));

        btn_right_seat_heat = (Button)findViewById(R.id.hvac_btn_right_seat_heat);
        btn_right_win_wiper = (Button)findViewById(R.id.hvac_btn_right_window_wiper);
        btn_right_win_defrost = (Button)findViewById(R.id.hvac_btn_right_window_defrost);

        btn_right_seat_heat.setTag(new Integer(4));
        btn_right_win_wiper.setTag(new Integer(5));
        btn_right_win_defrost.setTag(new Integer(6));

        btn_left_seat_heat.setOnClickListener(this);
        btn_left_win_wiper.setOnClickListener(this);
        btn_left_win_defrost.setOnClickListener(this);
        btn_right_seat_heat.setOnClickListener(this);
        btn_right_win_wiper.setOnClickListener(this);
        btn_right_win_defrost.setOnClickListener(this);


    }

    public void onClick(View v) {
        TextView test_text = (TextView)findViewById(R.id.test_text);
            int tag = (Integer) v.getTag();
            switch (tag){
                case 1:
                    // System.out.println("button1");
                    // test_text.setText("1");
                    //// Left: seat heater
                    if (btn_left_seat_heat.getBackground().getConstantState()
                            .equals(getResources().getDrawable(R.drawable.hvac_seat_heater).getConstantState()))
                    {
                        btn_left_seat_heat.setBackgroundResource(R.drawable.hvac_seat_heater_clicked);
                    }
                    else if (btn_left_seat_heat.getBackground().getConstantState()
                            .equals(getResources().getDrawable(R.drawable.hvac_seat_heater_clicked).getConstantState()))
                    {
                        btn_left_seat_heat.setBackgroundResource(R.drawable.hvac_seat_heater);
                    }
                    break;
                case 2:
                    //// Left: win wiper
                    if (btn_left_win_wiper.getBackground().getConstantState()
                            .equals(getResources().getDrawable(R.drawable.hvac_windows_wiper).getConstantState()))
                    {
                        btn_left_win_wiper.setBackgroundResource(R.drawable.hvac_windows_wiper_clicked);
                    }
                    else if (btn_left_win_wiper.getBackground().getConstantState()
                            .equals(getResources().getDrawable(R.drawable.hvac_windows_wiper_clicked).getConstantState()))
                    {
                        btn_left_win_wiper.setBackgroundResource(R.drawable.hvac_windows_wiper);
                    }
                    break;
                case 3:
                    // Left: win deforst
                    if (btn_left_win_defrost.getBackground().getConstantState()
                            .equals(getResources().getDrawable(R.drawable.hvac_rear_window_defrost).getConstantState()))
                    {
                        btn_left_win_defrost.setBackgroundResource(R.drawable.hvac_rear_window_defrost_clicked);
                    }
                    else if (btn_left_win_defrost.getBackground().getConstantState()
                            .equals(getResources().getDrawable(R.drawable.hvac_rear_window_defrost_clicked).getConstantState()))
                    {
                        btn_left_win_defrost.setBackgroundResource(R.drawable.hvac_rear_window_defrost);
                    }
                    break;
                case 4:
                    // Right: win seat heater
                    if (btn_right_seat_heat.getBackground().getConstantState()
                            .equals(getResources().getDrawable(R.drawable.hvac_seat_heater).getConstantState()))
                    {
                        btn_right_seat_heat.setBackgroundResource(R.drawable.hvac_seat_heater_clicked);
                    }
                    else if (btn_right_seat_heat.getBackground().getConstantState()
                            .equals(getResources().getDrawable(R.drawable.hvac_seat_heater_clicked).getConstantState()))
                    {
                        btn_right_seat_heat.setBackgroundResource(R.drawable.hvac_seat_heater);
                    }
                    break;
                case 5:
                    // Right: win wiper
                    if (btn_right_win_wiper.getBackground().getConstantState()
                            .equals(getResources().getDrawable(R.drawable.hvac_windows_wiper).getConstantState()))
                    {
                        btn_right_win_wiper.setBackgroundResource(R.drawable.hvac_windows_wiper_clicked);
                    }
                    else if (btn_right_win_wiper.getBackground().getConstantState()
                            .equals(getResources().getDrawable(R.drawable.hvac_windows_wiper_clicked).getConstantState()))
                    {
                        btn_right_win_wiper.setBackgroundResource(R.drawable.hvac_windows_wiper);
                    }
                    break;
                case 6:
                    // Right: win deforst
                    if (btn_right_win_defrost.getBackground().getConstantState()
                            .equals(getResources().getDrawable(R.drawable.hvac_rear_window_defrost).getConstantState()))
                    {
                        btn_right_win_defrost.setBackgroundResource(R.drawable.hvac_rear_window_defrost_clicked);
                    }
                    else if (btn_right_win_defrost.getBackground().getConstantState()
                            .equals(getResources().getDrawable(R.drawable.hvac_rear_window_defrost_clicked).getConstantState()))
                    {
                        btn_right_win_defrost.setBackgroundResource(R.drawable.hvac_rear_window_defrost);
                    }
                    break;
        }
    };


}