package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.TextView;

public class EmailCode extends AppCompatActivity {

    public int counter = 59;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email_code);

        TextView tw = (TextView) findViewById(R.id.textViewForTimer);

        new CountDownTimer(590000, 1000){
            public void onTick(long millisUntilFinished) {
                counter--;
                tw.setText(format(counter));

                if (counter == 0) {
                    counter = 60;
                }
            }

            @Override
            public void onFinish() {}
        }.start();
    }

    public String format(int sec) {
        return "Отправить код повторно можно будет через "+ sec + " секунд";
    }


}