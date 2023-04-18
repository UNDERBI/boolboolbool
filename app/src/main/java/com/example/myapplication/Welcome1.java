package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

public class Welcome1 extends AppCompatActivity {


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
            String color = "#1A6FEE";

            if (text.equals("")) {
                color = "#C9D4FB";
            }

            button.setBackgroundColor(Color.parseColor(color));
//            button.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(color)));
        }

        @Override
        public void afterTextChanged(Editable editable) {}


    };

    
}