package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Welcome1 extends AppCompatActivity {

    String color = "#C9D4FB";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        EditText email = findViewById(R.id.editEmail);
        email.addTextChangedListener(textWatcher);
    }

    TextWatcher textWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            Button button = findViewById(R.id.buttonNext);
            String text = s.toString();
//            String color = "#1A6FEE";

            if (text.equals("") || !text.endsWith("@yandex.ru")) {
                color = "#C9D4FB";
            }
            else {
                color = "#1A6FEE";
            }

            button.setBackgroundColor(Color.parseColor(color));
        }

        @Override
        public void afterTextChanged(Editable editable) {}


    };

    public void onClick(View v) {
        if (color != "#C9D4FB") {
            Intent i = new Intent(this, EmailCode.class);
            startActivity(i);
        }

    }
}