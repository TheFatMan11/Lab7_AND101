package com.thuydev.lab7;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class login extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        Button btnRun = findViewById(R.id.btn_on);
        Button btnMin = findViewById(R.id.btn_min);
        Button btnMedium = findViewById(R.id.btn_medium);
        Button btnMax = findViewById(R.id.btn_max);
        Button btnOff = findViewById(R.id.btn_off);
        ImageView fan = findViewById(R.id.im_fan);

        Animation animation = AnimationUtils.loadAnimation(this,R.anim.animationfan);

        btnRun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                animation.setDuration(1000);
                fan.startAnimation(animation);
            }
        });

        btnMin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animation.setDuration(1500);
                fan.startAnimation(animation);
            }
        });

        btnMedium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animation.setDuration(500);
                fan.startAnimation(animation);
            }
        });
        btnMax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animation.setDuration(100);
                fan.startAnimation(animation);
            }
        });
        btnOff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animation.setDuration(0);
                fan.startAnimation(animation);

            }
        });


    }
}
