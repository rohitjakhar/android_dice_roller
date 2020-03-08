package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView img1;
    private ImageView img2;
    private Random rn1 = new Random();
    private Random rn2 = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img1 = findViewById(R.id.imageView);
        img2 = findViewById(R.id.imageView2);
        Button bt = findViewById(R.id.button);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                diceRoll();
            }
        });
    }

    private void diceRoll(){
        int random1 = rn1.nextInt(6) + 1;
        int random2 = rn2.nextInt(6) + 1;
        switch (random1){
            case 1:
                img1.setImageResource(R.drawable.dice_1);
                break;
            case 2:
                img1.setImageResource(R.drawable.dice_2);
                break;
            case 3:
                img1.setImageResource(R.drawable.dice_3);
                break;
            case 4:
                img1.setImageResource(R.drawable.dice_4);
                break;
            case 5:
                img1.setImageResource(R.drawable.dice_5);
            case 6:
                img1.setImageResource(R.drawable.dice_6);
                break;
        }

        switch (random2){
            case 1:
                img2.setImageResource(R.drawable.dice_1);
                break;
            case 2:
                img2.setImageResource(R.drawable.dice_2);
                break;
            case 3:
                img2.setImageResource(R.drawable.dice_3);
                break;
            case 4:
                img2.setImageResource(R.drawable.dice_4);
                break;
            case 5:
                img2.setImageResource(R.drawable.dice_5);
                break;
            case 6:
                img2.setImageResource(R.drawable.dice_6);
                break;
        }
    }
}
