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
import static com.londonappbrewery.magiceightball.R.drawable.ball2;
import static com.londonappbrewery.magiceightball.R.drawable.ball5;
import static com.londonappbrewery.magiceightball.R.id.askButton;
import static com.londonappbrewery.magiceightball.R.id.askButton;
import static com.londonappbrewery.magiceightball.R.id.buttonPanel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageView ballDisplay;


        ballDisplay = (ImageView) findViewById(R.id.image_eightball);

        final int[] ballArray = {R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5};
        Button askButton;
        askButton = (Button) findViewById(R.id.askButton);
        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int randomNumber = new Random().nextInt(5);
                ballDisplay.setImageResource(ballArray[randomNumber]);

            }


        });
    }
}

