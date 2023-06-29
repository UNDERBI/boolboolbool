package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;

import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class EmailCode extends AppCompatActivity {

    public int counter = 59;

    public ArrayList<EditText> inputs = null;

    public int currentInput = 0;



    public void new_intent() {
        Intent i = new Intent(this, FixPasswordActivity.class);
        startActivity(i);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email_code);

        TextView tw = (TextView) findViewById(R.id.textViewForTimer);

        new CountDownTimer(590000, 1000) {
            public void onTick(long millisUntilFinished) {
                counter--;
                tw.setText(format(counter));

                if (counter == 0) {
                    counter = 60;
                }
            }

            @Override
            public void onFinish() {
            }
        }.start();

        inputs = new ArrayList();
        inputs.add(findViewById(R.id.w1));
        inputs.add(findViewById(R.id.w2));
        inputs.add(findViewById(R.id.w3));
        inputs.add(findViewById(R.id.w4));

        inputs.get(currentInput).requestFocus();

        for (EditText et : inputs) {
            et.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {
                    if (++currentInput == 4) {
                        new_intent();
                    }
                    else {
                        inputs.get(currentInput).requestFocus();
                    }
                }

                @Override
                public void afterTextChanged(Editable editable) {
                }
            });

        }
    }


    public String format(int sec) {
        return "Отправить код повторно можно будет через "+ sec + " секунд";
    }

    public void onClick2(View view) {
        Intent i = new Intent(this, Welcome1.class);
        startActivity(i);
    }



}