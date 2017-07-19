package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

import static android.R.attr.button;
import static android.R.attr.id;
import static android.R.attr.onClick;
import static android.R.attr.x;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView balldisplay = (ImageView)findViewById(R.id.image_eightball);

    int[] ballArray= {R.drawable.ball1,R.drawable.ball2,R.drawable.ball3,
            R.drawable.ball4,R.drawable.ball5};
        Button askbutton;
        askbutton =(Button)findViewById(R.id.askbutton);
        askbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random randomNumberGenerator = new Random();
                int number=randomNumberGenerator.nextInt();
                number=randomNumberGenerator.nextInt();


            }

        });


    }
}
