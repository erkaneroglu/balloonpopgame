package com.erkaneroglu.balloonpop;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashScreen extends AppCompatActivity {
    ImageView ivv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ivv= (ImageView) findViewById(R.id.iv);
        Animation myanim= AnimationUtils.loadAnimation(this,R.anim.mytransition);
        ivv.startAnimation(myanim);
        final Intent i=new Intent(this,StartActivity.class);
        Thread timer=new Thread(){
            public void run(){
                try {
                    sleep(4000);
                }catch (Exception e){
                    e.printStackTrace();
                }
                finally {
                    startActivity(i);
                    finish();
                }
            }
        };
        timer.start();
    }
}
