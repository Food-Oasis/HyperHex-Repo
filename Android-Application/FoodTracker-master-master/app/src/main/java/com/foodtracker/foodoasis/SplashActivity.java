package com.foodtracker.foodoasis;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    private ImageView logo;
    private static int splashTimeOut=7000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        logo=(ImageView)findViewById(R.id.Logo);

        new Handler().postDelayed(new Runnable() {
                                      @Override
                                      public void run() {
                                          Intent i = new Intent(SplashActivity.this,MainActivity.class);
                                          startActivity(i);
                                          finish();
                                      }
                                  },splashTimeOut);

                Animation myanim = AnimationUtils.loadAnimation(this, R.anim.mysplashanimation);
        logo.startAnimation(myanim);
    }
}
