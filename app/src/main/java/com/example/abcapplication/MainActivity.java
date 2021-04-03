package com.example.abcapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Debug;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        CardView ABC;
        CardView MainCard;
        CardView Counting;
        CardView POB;
        CardView Settings;
        Animation anim_set1;
        Animation anim_set2;
        getWindow().setFlags(1024,1024);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ABC = findViewById(R.id.section_ABC);
        Counting = findViewById(R.id.section_123);
        POB = findViewById(R.id.section_POB);
        Settings = findViewById(R.id.section_Settings);
        MainCard = findViewById(R.id.mainLayout);
        anim_set1 = AnimationUtils.loadAnimation(this,R.anim.anim_1);
        anim_set2 = AnimationUtils.loadAnimation(this,R.anim.anim_2);
        ABC.setAnimation(anim_set1);
        Counting.setAnimation(anim_set1);
        POB.setAnimation(anim_set1);
        Settings.setAnimation(anim_set1);
        MainCard.setAnimation(anim_set2);
        ABC.setOnClickListener(v -> {
            Intent newScreen = new Intent(getApplicationContext(),ABCSection.class);
            startActivity(newScreen);
        });
    }
}