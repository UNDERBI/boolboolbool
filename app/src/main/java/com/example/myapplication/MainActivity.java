package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickLayout(View v) {
        Intent i = new Intent(this, MainActivity2.class);
        startActivity(i);
    }

    public void onClickButton(View v) {
        Intent i = new Intent(this, Welcome1.class);
        startActivity(i);
    }
}