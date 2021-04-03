package com.example.abcapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import java.util.Locale;

public class ABCSection extends AppCompatActivity {

    public enum Options {
        A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z
    }
    public enum mode {
        defaultMode,QuizGame
    }
    private CardView A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,rR,S,T,U,V,W,X,Y,Z;
    private Animation animation;
    private TextToSpeech tts = null;
    private Options correctOption;
    private Options choosedOption;
    private  mode gameMode;
    private void nextQuestion(){

    }

    private void speak(String s){
        tts.setPitch(1);
        tts.setSpeechRate(1);
        tts.speak(s,TextToSpeech.QUEUE_FLUSH,null);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        animation = AnimationUtils.loadAnimation(this,R.anim.anim_1);
        gameMode = mode.defaultMode;

        getWindow().setFlags(1024,1024);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_b_c_section);

        A = findViewById(R.id.c_A);
        B = findViewById(R.id.c_B);
        C = findViewById(R.id.c_C);
        D = findViewById(R.id.c_D);
        E = findViewById(R.id.c_E);
        F = findViewById(R.id.c_F);
        G = findViewById(R.id.c_G);
        H = findViewById(R.id.c_H);
        I = findViewById(R.id.c_I);
        J = findViewById(R.id.c_J);
        K = findViewById(R.id.c_K);
        L = findViewById(R.id.c_L);
        M = findViewById(R.id.c_M);
        N = findViewById(R.id.c_N);
        O = findViewById(R.id.c_O);
        N = findViewById(R.id.c_N);
        O = findViewById(R.id.c_O);
        P = findViewById(R.id.c_P);
        Q = findViewById(R.id.c_Q);
        rR = findViewById(R.id.c_R);
        S = findViewById(R.id.c_S);
        T = findViewById(R.id.c_T);
        U = findViewById(R.id.c_U);
        V = findViewById(R.id.c_V);
        W = findViewById(R.id.c_W);
        X = findViewById(R.id.c_X);
        Y = findViewById(R.id.c_Y);
        Z = findViewById(R.id.c_Z);
        Animate();
        tts = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status == TextToSpeech.SUCCESS){
                    tts.setLanguage(Locale.US);
                }
            }
        });
        A.setOnClickListener(v -> {
            if(gameMode == mode.defaultMode){
                speak("A for Apple");
            }else{
                choosedOption = Options.A;
                if(choosedOption == correctOption){
                    speak("Its correct Answer, Good Job");
                    nextQuestion();
                }else{
                    speak("Wrong answer, its Apple");
                }
            }

        });
        B.setOnClickListener(v -> {
            if(gameMode == mode.defaultMode) {
                speak("B for Ball");
            }else{
                choosedOption = Options.B;
                if(choosedOption == correctOption){
                    speak("Its correct Answer, Good Job");
                    nextQuestion();
                }else{
                    speak("Wrong answer, its Ball");
                }
            }
        });
        C.setOnClickListener(v -> {
            if(gameMode == mode.defaultMode){
                speak("C for Cat");
            }else{
                choosedOption = Options.C;
                if(choosedOption == correctOption){
                    speak("Its correct Answer, Good Job");
                    nextQuestion();
                }else{
                    speak("Wrong answer, its Cat");
                }
            }

        });
        D.setOnClickListener(v -> {
            if(gameMode == mode.defaultMode){
                speak("D for Dog");
            }else{
                choosedOption = Options.D;
                if(choosedOption == correctOption){
                    speak("Its correct Answer, Good Job");
                    nextQuestion();
                }else{
                    speak("Wrong answer, its Dog");
                }
            }
        });
        E.setOnClickListener(v -> {
            if(gameMode == mode.defaultMode){
                speak("E for Egg");
            }else{
                choosedOption = Options.E;
                if(choosedOption == correctOption){
                    speak("Its correct Answer, Good Job");
                    nextQuestion();
                }else{
                    speak("Wrong answer, its Egg");
                }
            }
        });

        F.setOnClickListener(v -> {
            if(gameMode == mode.defaultMode){
                speak("F for Fan");
            }else{
                choosedOption = Options.F;
                if(choosedOption == correctOption){
                    speak("Its correct Answer, Good Job");
                    nextQuestion();
                }else{
                    speak("Wrong answer, its Fan");
                }
            }

        });
        G.setOnClickListener(v -> {
            if(gameMode == mode.defaultMode){
                speak("G for Goose");
            }else{
                choosedOption = Options.A;
                if(choosedOption == correctOption){
                    speak("Its correct Answer, Good Job");
                    nextQuestion();
                }else{
                    speak("Wrong answer, its Goose");
                }
            }

        });
        H.setOnClickListener(v -> {
            if(gameMode == mode.defaultMode){
                speak("H for Horse");
            }else{
                choosedOption = Options.H;
                if(choosedOption == correctOption){
                    speak("Its correct Answer, Good Job");
                    nextQuestion();
                }else{
                    speak("Wrong answer, its Horse");
                }
            }
        });
        I.setOnClickListener(v -> {
            if(gameMode == mode.defaultMode){
                speak("I for Ice Cream");
            }else{
                choosedOption = Options.I;
                if(choosedOption == correctOption){
                    speak("Its correct Answer, Good Job");
                    nextQuestion();
                }else{
                    speak("Wrong answer, its Ice cream");
                }
            }
        });
        J.setOnClickListener(v -> {
            if(gameMode == mode.defaultMode){
                speak("J for juice");
            }else{
                choosedOption = Options.J;
                if(choosedOption == correctOption){
                    speak("Its correct Answer, Good Job");
                    nextQuestion();
                }else{
                    speak("Wrong answer, its Juice");
                }
            }
        });
        K.setOnClickListener(v -> {
            if(gameMode == mode.defaultMode){
                speak("K for King");
            }else{
                choosedOption = Options.K;
                if(choosedOption == correctOption){
                    speak("Its correct Answer, Good Job");
                    nextQuestion();
                }else{
                    speak("Wrong answer, its King");
                }
            }
        });
        L.setOnClickListener(v -> {
            if(gameMode == mode.defaultMode){
                speak("L for Lion");
            }else{
                choosedOption = Options.L;
                if(choosedOption == correctOption){
                    speak("Its correct Answer, Good Job");
                    nextQuestion();
                }else{
                    speak("Wrong answer, its Lion");
                }
            }
        });
        M.setOnClickListener(v -> {
            if(gameMode == mode.defaultMode){
                speak("M for Mango");
            }else{
                choosedOption = Options.M;
                if(choosedOption == correctOption){
                    speak("Its correct Answer, Good Job");
                    nextQuestion();
                }else{
                    speak("Wrong answer, its Mango");
                }
            }

        });
        N.setOnClickListener(v -> {
            if(gameMode == mode.defaultMode){
                speak("N for Nest");
            }else{
                choosedOption = Options.N;
                if(choosedOption == correctOption){
                    speak("Its correct Answer, Good Job");
                    nextQuestion();
                }else{
                    speak("Wrong answer, its Nest");
                }
            }
        });
        O.setOnClickListener(v -> {
            if(gameMode == mode.defaultMode){
                speak("O for Orange");
            }else{
                choosedOption = Options.O;
                if(choosedOption == correctOption){
                    speak("Its correct Answer, Good Job");
                    nextQuestion();
                }else{
                    speak("Wrong answer, its Orange");
                }
            }
        });
        P.setOnClickListener(v -> {
            if(gameMode == mode.defaultMode){
                speak("P for PineApple");
            }else{
                choosedOption = Options.P;
                if(choosedOption == correctOption){
                    speak("Its correct Answer, Good Job");
                    nextQuestion();
                }else{
                    speak("Wrong answer, its PineApple");
                }
            }
        });
        Q.setOnClickListener(v -> {
            if(gameMode == mode.defaultMode){
                speak("Q for Queen");
            }else{
                choosedOption = Options.Q;
                if(choosedOption == correctOption){
                    speak("Its correct Answer, Good Job");
                    nextQuestion();
                }else{
                    speak("Wrong answer, its Queen");
                }
            }
        });
        rR.setOnClickListener(v->{
            if(gameMode == mode.defaultMode){
                speak("R for Rocket");
            }else{
                choosedOption = Options.R;
                if(choosedOption == correctOption){
                    speak("Its correct Answer, Good Job");
                    nextQuestion();
                }else{
                    speak("Wrong answer, its Rocket");
                }
            }
        });
        S.setOnClickListener(v -> {
            if(gameMode == mode.defaultMode){
                speak("S for Snake");
            }else{
                choosedOption = Options.S;
                if(choosedOption == correctOption){
                    speak("Its correct Answer, Good Job");
                    nextQuestion();
                }else{
                    speak("Wrong answer, its Snake");
                }
            }
        });
        T.setOnClickListener(v -> {
            if(gameMode == mode.defaultMode){
                speak("T for T Shirt");
            }else{
                choosedOption = Options.T;
                if(choosedOption == correctOption){
                    speak("Its correct Answer, Good Job");
                    nextQuestion();
                }else{
                    speak("Wrong answer, its T shirt");
                }
            }
        });
        U.setOnClickListener(v -> {
            if(gameMode == mode.defaultMode){
                speak("U for Umbrella");
            }else{
                choosedOption = Options.U;
                if(choosedOption == correctOption){
                    speak("Its correct Answer, Good Job");
                    nextQuestion();
                }else{
                    speak("Wrong answer, its Umbrellla");
                }
            }
        });
        V.setOnClickListener(v -> {
            if(gameMode == mode.defaultMode){
                speak("V for violin");
            }else{
                choosedOption = Options.V;
                if(choosedOption == correctOption){
                    speak("Its correct Answer, Good Job");
                    nextQuestion();
                }else{
                    speak("Wrong answer, its violin");
                }
            }
        });
        W.setOnClickListener(v -> {
            if(gameMode == mode.defaultMode){
                speak("W for Well");
            }else{
                choosedOption = Options.W;
                if(choosedOption == correctOption){
                    speak("Its correct Answer, Good Job");
                    nextQuestion();
                }else{
                    speak("Wrong answer, its Well");
                }
            }
        });
        X.setOnClickListener(v -> {
            if(gameMode == mode.defaultMode){
                speak("X for Xylophone");
            }else{
                choosedOption = Options.X;
                if(choosedOption == correctOption){
                    speak("Its correct Answer, Good Job");
                    nextQuestion();
                }else{
                    speak("Wrong answer, its Xylophone");
                }
            }
        });
        Y.setOnClickListener(v -> {
            if(gameMode == mode.defaultMode){
                speak("Y for Yoyo");
            }else{
                choosedOption = Options.Y;
                if(choosedOption == correctOption){
                    speak("Its correct Answer, Good Job");
                    nextQuestion();
                }else{
                    speak("Wrong answer, its Yoyo");
                }
            }
        });
        Z.setOnClickListener(v -> {
            if(gameMode == mode.defaultMode){
                speak("Z for Zebra");
            }else{
                choosedOption = Options.Z;
                if(choosedOption == correctOption){
                    speak("Its correct Answer, Good Job");
                    nextQuestion();
                }else{
                    speak("Wrong answer, its Zebra");
                }
            }
        });










    }
    private  void Animate(){
        A.setAnimation(animation);
        B.setAnimation(animation);
        C.setAnimation(animation);
        D.setAnimation(animation);
        E.setAnimation(animation);
        F.setAnimation(animation);
        G.setAnimation(animation);
        H.setAnimation(animation);
        I.setAnimation(animation);
        J.setAnimation(animation);
        K.setAnimation(animation);
        L.setAnimation(animation);
        M.setAnimation(animation);
        N.setAnimation(animation);
        O.setAnimation(animation);
        P.setAnimation(animation);
        Q.setAnimation(animation);
        rR.setAnimation(animation);
        S.setAnimation(animation);
        T.setAnimation(animation);
        U.setAnimation(animation);
        V.setAnimation(animation);
        W.setAnimation(animation);
        X.setAnimation(animation);
        Y.setAnimation(animation);
        Z.setAnimation(animation);
    }
    @Override
    protected void onDestroy() {
        if(tts != null){
            tts.stop();
            tts.shutdown();
        }
        super.onDestroy();
    }
}