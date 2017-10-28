package com.erkaneroglu.balloonpop;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class LevelSelect extends AppCompatActivity {
    Button easy;
    Button medium;
    Button hard;
    Intent easyIntent;
    Intent mediumIntent;
    Intent hardIntent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_select);
        easy= (Button) findViewById(R.id.easyLevel);
        medium= (Button) findViewById(R.id.mediumLevel);
        hard= (Button) findViewById(R.id.hardLevel);

        easy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                easyIntent=new Intent(getApplication(),Easy.class);
                startActivity(easyIntent);
            }
        });

        medium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediumIntent=new Intent(getApplicationContext(),Medium.class);
                startActivity(mediumIntent);
            }
        });

        hard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hardIntent=new Intent(getApplicationContext(),Hard.class);
                startActivity(hardIntent);
            }
        });
    }
}
