package com.example.phill.fountainofyouth;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
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

        Button either = findViewById(R.id.animateBtn);
        Button or = findViewById(R.id.btnOr);

        either.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView man = findViewById(R.id.imageView);
                man.setImageResource(R.drawable.turtle_swim);
                AnimationDrawable drowning_man = (AnimationDrawable)man.getDrawable();
                //got an error this is the best response on stack overflow
                //Drawable manDraw = man.getResources().getDrawable(R.drawable.drowning_man);
                //AnimationDrawable drowning_man = (AnimationDrawable)manDraw;
                //AnimationDrawable drowning_man = (AnimationDrawable)man.getResources().getDrawable(R.drawable.drowning_man);
                drowning_man.start();
            }
        });

        or.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView man = findViewById(R.id.imageView);
                man.setImageResource(R.drawable.turtle_swim_other);
                AnimationDrawable drowning_man = (AnimationDrawable)man.getDrawable();
                drowning_man.start();
            }
        });
    }
}
