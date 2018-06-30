package com.victor.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public  void input(){

        String answer = "";

        RadioButton three = (RadioButton) findViewById(R.id.three);
        TextView ocean = (TextView) findViewById(R.id.ocean);
        TextView c = (TextView) findViewById(R.id.c);
        RadioButton pup = (RadioButton) findViewById(R.id.pup);
        TextView tru = (TextView) findViewById(R.id.truee);
        TextView intThree = (TextView) findViewById(R.id.three);

        answer = answer + three + "\n";
        answer += ocean + "\n";
        answer += c + "\n";
        answer +=  pup + "\n";
        answer += tru + "\n";
        answer += intThree + "\n";

        TextView answers = (TextView) findViewById(R.id.answers);
        answers.setText(answer);
    }
}
