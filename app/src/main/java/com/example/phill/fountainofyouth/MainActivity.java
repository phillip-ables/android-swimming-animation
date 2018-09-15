package com.example.phill.fountainofyouth;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button start = findViewById(R.id.animateBtn);
        ImageView man = findViewById(R.id.imageView);
        AnimationDrawable drowning_man = (AnimationDrawable)man.getDrawable();
        drowning_man.start();


        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("click","button has been clicked");
            }
        });

    }
}
