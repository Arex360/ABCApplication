package com.example.abcapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.speech.tts.TextToSpeech;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

import java.util.ArrayList;
import java.util.Locale;

public class BOPSeection extends AppCompatActivity {
    public enum mode {
        defaultMode,QuizGame
    }
    //region Data Members
    private CardView A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,rR,S,T,U,V,W,X,Y,Z;
    private Animation animation;
    private TextToSpeech tts = null;
    private Data.Options correctOption;
    private Data.Options choosedOption;
    private ABCSection.mode gameMode;
    private ExtendedFloatingActionButton extendedFloatingActionButton;
    private boolean isDefault;
    private ArrayList<Questions> questions;
    private int questionIndex;
    private boolean firstQuestion;
    //endregion
    private int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
    private void pickQuestion(){
        this.questionIndex = getRandomNumber(0,questions.size()-1);
        Questions question = questions.get(this.questionIndex);
        this.speak(question.question);
        correctOption = question.answer;
        questions.remove(question);
    }
    private void nextQuestion(){
        if(questions.size() > 0){
            if(firstQuestion){
                pickQuestion();
                firstQuestion = false;
            }
        }else{
            this.speak("Good job");
        }
    }
    private void Init(){
        firstQuestion = true;
        isDefault = true;
        questionIndex = 0;
        questions = new ArrayList<Questions>();
        animation = AnimationUtils.loadAnimation(this,R.anim.anim_1);
        gameMode = ABCSection.mode.defaultMode;
        isDefault = true;
        getWindow().setFlags(1024,1024);
        int index = 0;
        for(String str: Data.BOPquestions){
            questions.add(new Questions("Where is "+ str,Data.answers[index]));
            index++;
        }
    }
    @SuppressLint("ResourceAsColor")
    private void ChangeColor(CardView card){
        Drawable background = card.getBackground();
        card.getBackground().setTint(R.color.background_Main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                card.getBackground().setTint(Color.rgb(252, 186, 3));
            }
        },1000);
    }
    private void speak(String s){
        tts.setPitch(Data.pitch);
        tts.setSpeechRate(Data.speed);
        tts.speak(s,TextToSpeech.QUEUE_FLUSH,null);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Init();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b_o_p_seection);
        //region Initialization
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
        //endregion
        extendedFloatingActionButton = findViewById(R.id.f_state);
        Animate();
        tts = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status == TextToSpeech.SUCCESS){
                    tts.setLanguage(Locale.US);
                }
            }
        });
        //region Click Events
        A.setOnClickListener(v -> {
            ChangeColor(A);
            if(gameMode == ABCSection.mode.defaultMode){
                speak("A for Apple");
            }else{
                choosedOption = Data.Options.A;
                if(choosedOption == correctOption){
                    speak("Its correct Answer, Good Job");
                    pickQuestion();
                }else{
                    speak("Wrong answer, its Apple");
                }
            }

        });
        B.setOnClickListener(v -> {
            ChangeColor(B);
            if(gameMode == ABCSection.mode.defaultMode) {
                speak("B for Ball");
            }else{
                choosedOption = Data.Options.B;
                if(choosedOption == correctOption){
                    speak("Its correct Answer, Good Job");
                    pickQuestion();
                }else{
                    speak("Wrong answer, its Ball");
                }
            }
        });
        C.setOnClickListener(v -> {
            ChangeColor(C);
            if(gameMode == ABCSection.mode.defaultMode){
                speak("C for Cat");
            }else{
                choosedOption = Data.Options.C;
                if(choosedOption == correctOption){
                    speak("Its correct Answer, Good Job");
                    pickQuestion();
                }else{
                    speak("Wrong answer, its Cat");
                }
            }

        });
        D.setOnClickListener(v -> {
            ChangeColor(D);
            if(gameMode == ABCSection.mode.defaultMode){
                speak("D for Dog");
            }else{
                choosedOption = Data.Options.D;
                if(choosedOption == correctOption){
                    speak("Its correct Answer, Good Job");
                    pickQuestion();
                }else{
                    speak("Wrong answer, its Dog");
                }
            }
        });
        E.setOnClickListener(v -> {
            ChangeColor(E);
            if(gameMode == ABCSection.mode.defaultMode){
                speak("E for Egg");
            }else{
                choosedOption = Data.Options.E;
                if(choosedOption == correctOption){
                    speak("Its correct Answer, Good Job");
                    pickQuestion();
                }else{
                    speak("Wrong answer, its Egg");
                }
            }
        });

        F.setOnClickListener(v -> {
            ChangeColor(F);
            if(gameMode == ABCSection.mode.defaultMode){
                speak("F for Fan");
            }else{
                choosedOption = Data.Options.F;
                if(choosedOption == correctOption){
                    speak("Its correct Answer, Good Job");
                    pickQuestion();
                }else{
                    speak("Wrong answer, its Fan");
                }
            }

        });
        G.setOnClickListener(v -> {
            ChangeColor(G);
            if(gameMode == ABCSection.mode.defaultMode){
                speak("G for Goose");
            }else{
                choosedOption =Data.Options.G;
                if(choosedOption == correctOption){
                    speak("Its correct Answer, Good Job");
                    pickQuestion();
                }else{
                    speak("Wrong answer, its Goose");
                }
            }

        });
        H.setOnClickListener(v -> {
            ChangeColor(H);
            if(gameMode == ABCSection.mode.defaultMode){
                speak("H for Horse");
            }else{
                choosedOption = Data.Options.H;
                if(choosedOption == correctOption){
                    speak("Its correct Answer, Good Job");
                    pickQuestion();
                }else{
                    speak("Wrong answer, its Horse");
                }
            }
        });
        I.setOnClickListener(v -> {
            ChangeColor(I);
            if(gameMode == ABCSection.mode.defaultMode){
                speak("I for Ice Cream");
            }else{
                choosedOption = Data.Options.I;
                if(choosedOption == correctOption){
                    speak("Its correct Answer, Good Job");
                    pickQuestion();
                }else{
                    speak("Wrong answer, its Ice cream");
                }
            }
        });
        J.setOnClickListener(v -> {
            ChangeColor(J);
            if(gameMode == ABCSection.mode.defaultMode){
                speak("J for juice");
            }else{
                choosedOption = Data.Options.J;
                if(choosedOption == correctOption){
                    speak("Its correct Answer, Good Job");
                    pickQuestion();
                }else{
                    speak("Wrong answer, its Juice");
                }
            }
        });
        K.setOnClickListener(v -> {
            ChangeColor(K);
            if(gameMode == ABCSection.mode.defaultMode){
                speak("K for King");
            }else{
                choosedOption = Data.Options.K;
                if(choosedOption == correctOption){
                    speak("Its correct Answer, Good Job");
                    pickQuestion();
                }else{
                    speak("Wrong answer, its King");
                }
            }
        });
        L.setOnClickListener(v -> {
            ChangeColor(L);
            if(gameMode == ABCSection.mode.defaultMode){
                speak("L for Lion");
            }else{
                choosedOption = Data.Options.L;
                if(choosedOption == correctOption){
                    speak("Its correct Answer, Good Job");
                    pickQuestion();
                }else{
                    speak("Wrong answer, its Lion");
                }
            }
        });
        M.setOnClickListener(v -> {
            ChangeColor(M);
            if(gameMode == ABCSection.mode.defaultMode){
                speak("M for Mango");
            }else{
                choosedOption = Data.Options.M;
                if(choosedOption == correctOption){
                    speak("Its correct Answer, Good Job");
                    pickQuestion();
                }else{
                    speak("Wrong answer, its Mango");
                }
            }

        });
        N.setOnClickListener(v -> {
            ChangeColor(N);
            if(gameMode == ABCSection.mode.defaultMode){
                speak("N for Nest");
            }else{
                choosedOption = Data.Options.N;
                if(choosedOption == correctOption){
                    speak("Its correct Answer, Good Job");
                    pickQuestion();
                }else{
                    speak("Wrong answer, its Nest");
                }
            }
        });
        O.setOnClickListener(v -> {
            ChangeColor(O);
            if(gameMode == ABCSection.mode.defaultMode){
                speak("O for Orange");
            }else{
                choosedOption = Data.Options.O;
                if(choosedOption == correctOption){
                    speak("Its correct Answer, Good Job");
                    pickQuestion();
                }else{
                    speak("Wrong answer, its Orange");
                }
            }
        });
        P.setOnClickListener(v -> {
            ChangeColor(P);
            if(gameMode == ABCSection.mode.defaultMode){
                speak("P for PineApple");
            }else{
                choosedOption = Data.Options.P;
                if(choosedOption == correctOption){
                    speak("Its correct Answer, Good Job");
                    pickQuestion();
                }else{
                    speak("Wrong answer, its PineApple");
                }
            }
        });
        Q.setOnClickListener(v -> {
            ChangeColor(Q);
            if(gameMode == ABCSection.mode.defaultMode){
                speak("Q for Queen");
            }else{
                choosedOption = Data.Options.Q;
                if(choosedOption == correctOption){
                    speak("Its correct Answer, Good Job");
                    pickQuestion();
                }else{
                    speak("Wrong answer, its Queen");
                }
            }
        });
        rR.setOnClickListener(v->{
            ChangeColor(rR);
            if(gameMode == ABCSection.mode.defaultMode){
                speak("R for Rocket");
            }else{
                choosedOption = Data.Options.R;
                if(choosedOption == correctOption){
                    speak("Its correct Answer, Good Job");
                    pickQuestion();
                }else{
                    speak("Wrong answer, its Rocket");
                }
            }
        });
        S.setOnClickListener(v -> {
            ChangeColor(S);
            if(gameMode == ABCSection.mode.defaultMode){
                speak("S for Snake");
            }else{
                choosedOption = Data.Options.S;
                if(choosedOption == correctOption){
                    speak("Its correct Answer, Good Job");
                    pickQuestion();
                }else{
                    speak("Wrong answer, its Snake");
                }
            }
        });
        T.setOnClickListener(v -> {
            ChangeColor(T);
            if(gameMode == ABCSection.mode.defaultMode){
                speak("T for T Shirt");
            }else{
                choosedOption = Data.Options.T;
                if(choosedOption == correctOption){
                    speak("Its correct Answer, Good Job");
                    pickQuestion();
                }else{
                    speak("Wrong answer, its T shirt");
                }
            }
        });
        U.setOnClickListener(v -> {
            ChangeColor(U);
            if(gameMode == ABCSection.mode.defaultMode){
                speak("U for Umbrella");
            }else{
                choosedOption = Data.Options.U;
                if(choosedOption == correctOption){
                    speak("Its correct Answer, Good Job");
                    pickQuestion();
                }else{
                    speak("Wrong answer, its Umbrellla");
                }
            }
        });
        V.setOnClickListener(v -> {
            ChangeColor(V);
            if(gameMode == ABCSection.mode.defaultMode){
                speak("V for violin");
            }else{
                choosedOption = Data.Options.V;
                if(choosedOption == correctOption){
                    speak("Its correct Answer, Good Job");
                    pickQuestion();
                }else{
                    speak("Wrong answer, its violin");
                }
            }
        });
        W.setOnClickListener(v -> {
            ChangeColor(W);
            if(gameMode == ABCSection.mode.defaultMode){
                speak("W for Well");
            }else{
                choosedOption = Data.Options.W;
                if(choosedOption == correctOption){
                    speak("Its correct Answer, Good Job");
                    pickQuestion();
                }else{
                    speak("Wrong answer, its Well");
                }
            }
        });
        X.setOnClickListener(v -> {
            ChangeColor(X);
            if(gameMode == ABCSection.mode.defaultMode){
                speak("X for Xylophone");
            }else{
                choosedOption = Data.Options.X;
                if(choosedOption == correctOption){
                    speak("Its correct Answer, Good Job");
                    pickQuestion();
                }else{
                    speak("Wrong answer, its Xylophone");
                }
            }
        });

        extendedFloatingActionButton.setOnClickListener(v -> {
            isDefault = !isDefault;
            if(isDefault){
                gameMode = ABCSection.mode.QuizGame;
                extendedFloatingActionButton.setText("Quiz mode");
                nextQuestion();
            }else{
                gameMode = ABCSection.mode.defaultMode;
                extendedFloatingActionButton.setText("Default mode");
            }
        });
        //endregion


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