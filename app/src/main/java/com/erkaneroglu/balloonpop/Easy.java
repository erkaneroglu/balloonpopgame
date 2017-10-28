package com.erkaneroglu.balloonpop;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class Easy extends AppCompatActivity {
    TextView timetext;
    TextView scoretext;
    ImageView ımageView1;
    ImageView ımageView2;
    ImageView ımageView3;
    ImageView ımageView4;
    ImageView ımageView5;
    ImageView ımageView6;
    ImageView ımageView7;
    ImageView ımageView8;
    ImageView ımageView9;
    ImageView ımageView10;
    ImageView ımageView11;
    ImageView ımageView12;
    ImageView ımageView13;
    ImageView ımageView14;
    ImageView ımageView15;
    ImageView ımageView16;
    ImageView ımageView17;
    ImageView ımageView18;
    ImageView ımageView19;
    ImageView ımageView20;
    ImageView ımageView21;
    ImageView ımageView22;
    ImageView ımageView23;
    ImageView ımageView24;
    ImageView ımageView25;
    ImageView ımageView26;
    ImageView ımageView27;
    ImageView ımageView28;
    ImageView ımageView29;
    ImageView ımageView30;
    ImageView ımageView31;
    ImageView ımageView32;
    ImageView ımageView33;
    ImageView ımageView34;
    ImageView ımageView35;
    ImageView skorboard;
    ImageView tekrar;
    private ImageView share;
    TextView sonscore;
    ImageView[] imageArray;
    Handler handler;
    Runnable runnable;
    private int skor=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy);
        skorboard= (ImageView) findViewById(R.id.scorePanel);
        tekrar= (ImageView) findViewById(R.id.tekrar);
        share= (ImageView) findViewById(R.id.paylas);
        sonscore= (TextView) findViewById(R.id.sonSkor);
        timetext= (TextView) findViewById(R.id.timeText);
        scoretext= (TextView) findViewById(R.id.scoreText);
        ımageView1= (ImageView) findViewById(R.id.balon1);
        ımageView2= (ImageView) findViewById(R.id.balon2);
        ımageView3= (ImageView) findViewById(R.id.balon3);
        ımageView4= (ImageView) findViewById(R.id.balon4);
        ımageView5= (ImageView) findViewById(R.id.balon5);
        ımageView6= (ImageView) findViewById(R.id.balon6);
        ımageView7= (ImageView) findViewById(R.id.balon7);
        ımageView8= (ImageView) findViewById(R.id.balon8);
        ımageView9= (ImageView) findViewById(R.id.balon9);
        ımageView10= (ImageView) findViewById(R.id.balon10);
        ımageView11= (ImageView) findViewById(R.id.balon12);
        ımageView12= (ImageView) findViewById(R.id.balon13);
        ımageView13= (ImageView) findViewById(R.id.balon14);
        ımageView14= (ImageView) findViewById(R.id.balon15);
        ımageView15= (ImageView) findViewById(R.id.balon16);
        ımageView16= (ImageView) findViewById(R.id.balon17);
        ımageView17= (ImageView) findViewById(R.id.balon18);
        ımageView18= (ImageView) findViewById(R.id.balon19);
        ımageView19= (ImageView) findViewById(R.id.balon20);
        ımageView20= (ImageView) findViewById(R.id.balon21);
        ımageView21= (ImageView) findViewById(R.id.balon22);
        ımageView22= (ImageView) findViewById(R.id.balon23);
        ımageView23= (ImageView) findViewById(R.id.balon24);
        ımageView24= (ImageView) findViewById(R.id.balon25);
        ımageView25= (ImageView) findViewById(R.id.balon26);
        ımageView26= (ImageView) findViewById(R.id.balon27);
        ımageView27= (ImageView) findViewById(R.id.balon28);
        ımageView28= (ImageView) findViewById(R.id.balon30);
        ımageView29= (ImageView) findViewById(R.id.balon31);
        ımageView30= (ImageView) findViewById(R.id.balon32);
        ımageView31= (ImageView) findViewById(R.id.balon33);
        ımageView32= (ImageView) findViewById(R.id.balon34);
        ımageView33= (ImageView) findViewById(R.id.balon35);
        ımageView34= (ImageView) findViewById(R.id.balon11);
        ımageView35= (ImageView) findViewById(R.id.balon29);
        imageArray=new ImageView[]{ımageView1,ımageView2,ımageView3,ımageView13,ımageView4,
                ımageView5,ımageView6,ımageView7,ımageView8,ımageView9,
                ımageView10,ımageView11,ımageView14,ımageView15,ımageView16,
                ımageView17,ımageView18,ımageView19,ımageView20,ımageView21,
                ımageView22,ımageView23,ımageView24,ımageView25,ımageView26,
                ımageView27,ımageView28,ımageView29,ımageView30,ımageView31,
                ımageView32,ımageView33,ımageView34,ımageView35,ımageView12};
        hideImage();
        zaman();
    }

    public void skorArtir(View view){
        scoretext= (TextView) findViewById(R.id.scoreText);
        skor++;
        scoretext.setText(""+skor);
    }
    public void hideImage() {
        handler = new Handler();
        runnable = new Runnable() {
            @Override
            public void run() {
                for (ImageView image : imageArray) {
                    image.setVisibility(View.INVISIBLE);
                }
                Random r = new Random();
                int i = r.nextInt(35 - 0);
                imageArray[i].setVisibility(View.VISIBLE);
                handler.postDelayed(this, 1200);
            }
        };
        handler.post(runnable);
    }
    public  void zaman(){
        new CountDownTimer(60000,1000){

            @Override
            public void onTick(long l) {
                timetext= (TextView) findViewById(R.id.timeText);
                timetext.setText(""+l/1000);
            }

            @Override
            public void onFinish() {
                timetext= (TextView) findViewById(R.id.timeText);
                timetext.setText("0");
                handler.removeCallbacks(runnable);
                for (ImageView image:imageArray){
                    image.setVisibility(View.INVISIBLE);
                }
                skorboard.setVisibility(View.VISIBLE);
                tekrar.setVisibility(View.VISIBLE);
                share.setVisibility(View.VISIBLE);
                sonscore.setVisibility(View.VISIBLE);
                sonscore.setText(""+skor);
                tekrar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        skor=0;
                        scoretext.setText("0");
                        timetext.setText("60");
                        skorboard.setVisibility(View.INVISIBLE);
                        tekrar.setVisibility(View.INVISIBLE);
                        share.setVisibility(View.INVISIBLE);
                        sonscore.setVisibility(View.INVISIBLE);
                        hideImage();
                        zaman();
                    }
                });
            }
        }.start();
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent=new Intent(Intent.ACTION_SEND);
                myIntent.setType("text/plain");
                String shareBody="Hello! My Balloon Pop Score: "+skor+" \n" +
                        "Do you want to try it?";
                myIntent.putExtra(Intent.EXTRA_TEXT,shareBody);
                startActivity(Intent.createChooser(myIntent,"Choose sharing method!"));
            }
        });
    }


}
