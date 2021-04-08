package com.example.abcapplication;

import android.provider.CalendarContract;

public class Data {
    public static float pitch = (float) 1;
    public static float speed = (float) 0.9;
    public static enum Options {
        A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z
    }
    public static enum Colors  {
            Primary, Secondary
    }
   public static Options[] answers = {
            Options.A,Options.B,Options.C,
           Options.D,Options.E,Options.F,
           Options.G,Options.H,Options.I,
           Options.J,Options.K,Options.L,
           Options.M,Options.N,Options.O,
           Options.P,Options.Q,Options.R,
           Options.S,Options.T,Options.U,
           Options.V,Options.W,Options.X,
           Options.Y,Options.Z
     };
    public static String[] questions = {
            "Apple","Ball","Cat","Dog",
            "Egg","Fan","Goose","Horse",
            "Icecream","Juice","King","Lion",
            "Mango","Nest","Orange","PineApple",
            "Queen","Rocket","Snake","T Shirt",
            "Umbrella","Violen","Well","Xylophone",
            "Yoyo","Zebra"
    };
    public static String[] colors = {
            "#fcba03",
            "#fc6203"
    };

}
