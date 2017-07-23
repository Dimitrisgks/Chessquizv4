package com.example.android.chessquiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    int rightAnswers = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void question1(){
        RadioButton radioButton1 = (RadioButton) findViewById(R.id.two);
        boolean isquestion1Checked = radioButton1.isChecked();
        if (isquestion1Checked){
            rightAnswers += 1;
        }}
    private void question2(){
        RadioButton radioButton2 = (RadioButton) findViewById(R.id.sixth);
        boolean isquestion2Checked = radioButton2.isChecked();
        if (isquestion2Checked){
            rightAnswers += 1;
        }}
    private void question4(){
        RadioButton radioButton4 = (RadioButton) findViewById(R.id.fifteth);
        boolean isquestion4Checked = radioButton4.isChecked();
        if (isquestion4Checked){
            rightAnswers += 1;
        }}

    public void writeChecked() {
        CheckBox tenth = (CheckBox) findViewById(R.id.tenth);
        CheckBox ele = (CheckBox) findViewById(R.id.eleth);
        CheckBox twe = (CheckBox) findViewById(R.id.twelth);
        CheckBox thri = (CheckBox) findViewById(R.id.thrth);
        boolean istenthChecked = tenth.isChecked();
        boolean iseleChecked = ele.isChecked();
        boolean istweChecked = twe.isChecked();
        boolean isthriChecked = thri.isChecked();
        if (!istenthChecked && !iseleChecked && istweChecked && isthriChecked) {
            rightAnswers += 1;
        }
        
    }

    private String getQuestion5() {
        EditText userInputLastName = (EditText) findViewById(R.id.q59);
        String name = userInputLastName.getText().toString();
        return name;
    }

    private void Q5Answer() {
        String name = getQuestion5();
        if (name.trim().equalsIgnoreCase("gxf7")) {
            rightAnswers += 1;
        } else {
            rightAnswers = rightAnswers + 0;
        }

    }
    public void checkEveryAnswer(){
        question1();
        question2();
        question4();
        Q5Answer();
        writeChecked();
    }
    public void reset(){rightAnswers=0;}
    public void chessAnswer(View view) {
        checkEveryAnswer();
        String result = "You answered " + rightAnswers + " out of 5 correct answers!";
        Toast.makeText(this, result, Toast.LENGTH_SHORT).show();
        reset();
    }


}