package com.example.android.quizzapp;

import android.app.Activity;
import android.graphics.Color;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int score = 0;

    // Question 1 is built with radioGroups, so this code is ensure the user can only choose one answer.
    public void pressAnswer1(View view) {
        RadioButton getAnswer1 = findViewById(R.id.ans1);
        getAnswer1.setChecked(true);
        RadioGroup rg2 = findViewById(R.id.radioGroup2);
        boolean ans1State = getAnswer1.isChecked();
        if (ans1State) {
            rg2.clearCheck();

        }
    }

    public void pressAnswer2(View view) {
        RadioButton getAnswer2 = findViewById(R.id.ans2);
        getAnswer2.setChecked(true);
        RadioGroup rg2 = findViewById(R.id.radioGroup2);
        boolean ans2State = getAnswer2.isChecked();
        if (ans2State) {
            rg2.clearCheck();
        }
    }


    public void pressAnswer3(View view) {
        RadioButton getAnswer3 = findViewById(R.id.ans3);
        getAnswer3.setChecked(true);
        RadioGroup rg1 = findViewById(R.id.radioGroup1);
        boolean ans2State = getAnswer3.isChecked();
        if (ans2State) {
            rg1.clearCheck();
        }
    }

    public void pressAnswer4(View view) {
        RadioButton getAnswer4 = findViewById(R.id.ans4);
        getAnswer4.setChecked(true);
        RadioGroup rg1 = findViewById(R.id.radioGroup1);
        boolean ans2State = getAnswer4.isChecked();
        if (ans2State) {
            rg1.clearCheck();
        }
    }

    // check the score for the whole quizz and display at the end
    public void checkScore(View view) {
        RadioButton getAnswer1 = findViewById(R.id.ans1);
        RadioButton getAnswer2 = findViewById(R.id.question2CorrectAnswer);
        boolean question2Answer = getAnswer2.isChecked();
        EditText getAnswer3 = findViewById(R.id.text_question3);
        String question3Text = getAnswer3.getText().toString().trim();
        RadioButton getAnswer4 = findViewById(R.id.question4CorrectAnswer);
        boolean question4Answer = getAnswer4.isChecked();
        CheckBox ans1Question5 = findViewById(R.id.question5Ans1);
        boolean question5Ans1 = ans1Question5.isChecked();
        CheckBox ans2Question5 = findViewById(R.id.question5Ans2);
        boolean question5Ans2 = ans2Question5.isChecked();
        CheckBox ans3Question5 = findViewById(R.id.question5Ans3);
        boolean question5Ans3 = ans3Question5.isChecked();
        CheckBox ans4Question5 = findViewById(R.id.question5Ans4);
        boolean question5Ans4 = ans4Question5.isChecked();
        CheckBox ans5Question5 = findViewById(R.id.question5Ans5);
        boolean question5Ans5 = ans5Question5.isChecked();
        CheckBox ans6Question5 = findViewById(R.id.question5Ans6);
        boolean question5Ans6 = ans6Question5.isChecked();
        if (getAnswer1.isChecked()) {
            score += 2;
        }
        if (question2Answer) {
            score += 2;
        }
        if (question3Text.equalsIgnoreCase("snoop dogg")) {
            score += 2;
        }

        if (question4Answer) {
            score += 2;
        }
        if (question5Ans1 && !question5Ans2 && question5Ans3 && question5Ans4 && !question5Ans5 && !question5Ans6) {
            score += 2;
        }
        displayScore();
        score = 0;
    }

    //code to display the score at the bottom
    private void displayScore() {
        if (score == 0){
            new Toast(getApplicationContext());
            Toast.makeText(getApplicationContext(), "Your score is 0 , You can do better!", Toast.LENGTH_SHORT).show();
        }
        else {
            new Toast(getApplicationContext());
            Toast.makeText(getApplicationContext(), "Your score is " +score, Toast.LENGTH_LONG).show();

        }
    }

}









