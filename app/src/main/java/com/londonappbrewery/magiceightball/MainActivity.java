package com.londonappbrewery.magiceightball;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

import static com.londonappbrewery.magiceightball.R.drawable.*;
import static com.londonappbrewery.magiceightball.R.id.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView ballDisplay = findViewById(magicBall1);

        final int[] ballArray = new int[]{
                ball1,
                ball2,
                ball5,
                ball3,
                ball4
        };

        Button askButton = findViewById(R.id.askButton);
        askButton.setOnClickListener((v) -> {
            int number = new Random().nextInt(5);
            ballDisplay.setImageResource(ballArray[number]);

        });
    }
}
