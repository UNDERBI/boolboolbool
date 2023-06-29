package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class FixPasswordActivity extends AppCompatActivity {
    int counter = 0;

    ImageView[] imgs =  new ImageView[4];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password);

        imgs[0] = findViewById(R.id.b1);
        imgs[1] = findViewById(R.id.b2);
        imgs[2] = findViewById(R.id.b3);
        imgs[3] = findViewById(R.id.b4);
    }

    public void clickBtn(View v) {
        if (counter < 4) {
            counter++;

            if (counter == 3) {
                Intent i = new Intent(this, creationcard.class);
                startActivity(i);
            }
        }

        for (int i = 0; i < counter; i++) {
            imgs[i].setImageResource(R.drawable.ellipsefull);
        }
    }
}