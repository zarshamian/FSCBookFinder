package com.example.zarshamian.fscbookfinder;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    //welcome screen(splash screen) with app name and a picture
    private static int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        //goes from first activity (splash screen) to second activity (login screen)
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                Intent loginIntent = new Intent(SplashScreen.this, Login.class);
                startActivity(loginIntent);
                finish();
            }
        }, SPLASH_TIME_OUT);

    }
}



