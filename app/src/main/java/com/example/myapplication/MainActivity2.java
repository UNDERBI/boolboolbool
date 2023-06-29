package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void onClickLayout(View v) {
        Intent i = new Intent(this, MainActivity3.class);
        startActivity(i);
    }

    public void onClickButton(View v) {
        Intent i = new Intent(this, Welcome1.class);
        startActivity(i);
    }
}