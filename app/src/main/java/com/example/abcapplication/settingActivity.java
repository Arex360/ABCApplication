package com.example.abcapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.Locale;

public class settingActivity extends AppCompatActivity {
   private TextToSpeech engine;
    private void Init(){
        getWindow().setFlags(1024,1024);
        engine = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                engine.setLanguage(Locale.US);
            }
        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button btn;
        SeekBar pitchBar;
        SeekBar SpeedRate;
        pitchBar = findViewById(R.id.pitch);
        SpeedRate = findViewById(R.id.speed);

        Init();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        btn = findViewById(R.id.testBtn);
        btn.setOnClickListener(v -> {
            float pitchFloat = (float) pitchBar.getProgress() / 100;
            float speedFloat = (float) SpeedRate.getProgress() / 100;
            Data.pitch = pitchFloat;
            Data.speed = speedFloat;
            engine.setPitch(pitchFloat);
            engine.setSpeechRate(speedFloat);
            engine.speak("this is my new voice",TextToSpeech.QUEUE_FLUSH,null);
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        engine.stop();
        engine.shutdown();
    }
}