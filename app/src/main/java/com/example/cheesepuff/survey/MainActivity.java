package com.example.cheesepuff.survey;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int scoreCount = 0;

    EditText name;
    RadioButton question1a2;
    RadioButton question2a3;
    RadioButton question3a1;
    RadioButton question4a1;
    RadioButton question5a1;
    EditText question6answer;
    CheckBox question7a2;
    CheckBox question7a3;
    RadioButton question8a1;

    boolean question1_rg;
    boolean question2_rg;
    boolean question3_rg;
    boolean question4_rg;
    boolean question5_rg;
    boolean question8_rg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText nameField = findViewById(R.id.name_field);
        String name = nameField.getText().toString();

        //question 1
        question1a2 = (RadioButton) findViewById(R.id.question1a2);

        //question 2
        question2a3 = (RadioButton) findViewById(R.id.question2a3);

        //question 3
        question3a1 = (RadioButton) findViewById(R.id.question3a1);

        //question 4
        question4a1 = (RadioButton) findViewById(R.id.question4a1);

        //question 5
        question5a1 = (RadioButton) findViewById(R.id.question5a1);

        //question 6
        EditText question6answer = (EditText) findViewById(R.id.question6answer);

        //question7
        question7a2 = (CheckBox) findViewById(R.id.question7a2);
        question7a3 = (CheckBox) findViewById(R.id.question7a3);

        //question 8
        question8a1 = (RadioButton) findViewById(R.id.question8a1);

    }

    public void submitAnswers(View view) {

        if(question1a2.isChecked()) {
            scoreCount += 1;
        }
        //add 1 point if answer is correct question 2

        if (question2a3.isChecked()) {
            scoreCount =+ 1;
        }

        //add 1 point if answer is correct question 3

        if (question3a1.isChecked()) {
            scoreCount =+ 1;
        }

        //add 1 point if answer is correct question 4

        if (question4a1.isChecked()) {
            scoreCount =+ 1;
        }

        //add 1 point if answer is correct question 5

        if (question5a1.isChecked()) {
            scoreCount =+ 1;
        }

        // add 1 point if answer is correct question 6

        if (question6answer.equals("kerning")) {
            scoreCount =+ 1;
        }

        // add 1 point if answer is correct question 7

        if (question7a2.isChecked()&&(question7a3.isChecked()))
        {
            scoreCount =+ 1;
        }

        // add 1 point if answer is correct question 8

        if (question8a1.isChecked()) {
            scoreCount =+ 1;
        }

        Toast toast = Toast.makeText(getApplicationContext(), "Good JOb, " + name + " ! Your score is " + scoreCount + " out of 8!", Toast.LENGTH_LONG);
        toast.show();

    }


}