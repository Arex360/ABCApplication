package com.example.abcapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class settingActivity extends AppCompatActivity {

    private float pitchFloat,speedFloat;
    private TextToSpeech tts;
    private void Init(){
        getWindow().setFlags(1024,1024);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button btn,setBtn;
        SeekBar pitchBar;
        SeekBar SpeedRate;
        Init();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        pitchBar = findViewById(R.id.pitch);
        SpeedRate = findViewById(R.id.speed);
        btn = findViewById(R.id.testBtn);
        setBtn = findViewById(R.id.setBtn);
        btn.setOnClickListener(v -> {

        });
        setBtn.setOnClickListener(v -> {
            pitchFloat = Float.valueOf(pitchBar.getProgress());
            speedFloat = Float.valueOf(SpeedRate.getProgress());
            pitchFloat /= 100f;
            speedFloat /= 100f;
            Data.pitch = pitchFloat;
            Data.speed = speedFloat;
            Toast.makeText(getApplicationContext(),pitchFloat+"",Toast.LENGTH_LONG).show();
            Intent intent = new Intent(getApplicationContext(),MainActivity.class);
            startActivity(intent);
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

    }
}