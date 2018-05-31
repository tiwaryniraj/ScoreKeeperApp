package com.example.niraj.scorekeeperapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView scoreTeamA;
    TextView scoreTeamB;
    TextView wicketOfTeamA;
    TextView wicketOfTeamB;
    Button incFourA;
    Button incSinglesA;
    Button incSixA;
    Button wicketsOfTeamA;
    Button incFourB;
    Button incSinglesB;
    Button incSixB;
    Button wicketsOfTeamB;
    Button reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scoreTeamA = findViewById(R.id.score1);
        scoreTeamB = findViewById(R.id.score2);
        incFourA = findViewById(R.id.fourA);
        incSinglesA = findViewById(R.id.singlesA);
        incFourB = findViewById(R.id.fourB);
        incSinglesB = findViewById(R.id.singlesB);
        incSixA = findViewById(R.id.sixA);
        incSixB = findViewById(R.id.sixB);
        wicketsOfTeamA = findViewById(R.id.wicketA);
        wicketsOfTeamB = findViewById(R.id.wicketB);
        wicketOfTeamA = findViewById(R.id.wickets1);
        wicketOfTeamB = findViewById(R.id.wickets2);
        reset = findViewById(R.id.reset);
    }
    int ScoreOfTeamA = 0;
    int ScoreOfTeamB = 0;
    int NumberWicketsOfTeamA = 0;
    int NumberWicketsOfTeamB = 0;

    public void SingleRunsOfTeamA(View view){
        if(NumberWicketsOfTeamA >= 10){
            Toast.makeText(getApplicationContext(),"Sorry All Out From Team A!",Toast.LENGTH_SHORT).show();
        }
        else {
            ScoreOfTeamA++;
            scoreTeamA.setText(String.valueOf(ScoreOfTeamA));
        }
    }
    public void SingleRunsOfTeamB(View view){
        if(NumberWicketsOfTeamB >= 10){
            Toast.makeText(getApplicationContext(),"Sorry All Out From Team B!",Toast.LENGTH_SHORT).show();
        }
        else {
            ScoreOfTeamB++;
            scoreTeamB.setText(String.valueOf(ScoreOfTeamB));
        }
    }
    public void FourRunsOfTeamA(View view){
        if(NumberWicketsOfTeamA >= 10){
            Toast.makeText(getApplicationContext(),"Sorry All Out From Team A!",Toast.LENGTH_SHORT).show();
        }
        else {
            ScoreOfTeamA+=4;
            scoreTeamA.setText(String.valueOf(ScoreOfTeamA));
        }
    }
    public void FourRunsOfTeamB(View view){
        if(NumberWicketsOfTeamB >= 10){
            Toast.makeText(getApplicationContext(),"Sorry All Out From Team B!",Toast.LENGTH_SHORT).show();
        }
        else {
            ScoreOfTeamB+=4;
            scoreTeamB.setText(String.valueOf(ScoreOfTeamB));
        }
    }
    public void SixRunsOfTeamA(View view){
        if(NumberWicketsOfTeamA >= 10){
            Toast.makeText(getApplicationContext(),"Sorry All Out From Team A!",Toast.LENGTH_SHORT).show();
        }
        else {
            ScoreOfTeamA+=6;
            scoreTeamA.setText(String.valueOf(ScoreOfTeamA));
        }
    }
    public void SixRunsOfTeamB(View view){
        if(NumberWicketsOfTeamB >= 10){
            Toast.makeText(getApplicationContext(),"Sorry All Out From Team B!",Toast.LENGTH_SHORT).show();
        }
        else {
            ScoreOfTeamB+=6;
            scoreTeamB.setText(String.valueOf(ScoreOfTeamB));
        }
    }
    public void WicketDownOfTeamA(View view){
        if(NumberWicketsOfTeamA >= 10){
            Toast.makeText(getApplicationContext(),"Sorry All Out From Team A!",Toast.LENGTH_SHORT).show();
        }
        else {
            NumberWicketsOfTeamA+=1;
            wicketOfTeamA.setText(String.valueOf(NumberWicketsOfTeamA));
        }
    }
    public void WicketDownOfTeamB(View view){
        if(NumberWicketsOfTeamB >= 10){
            Toast.makeText(getApplicationContext(),"Sorry All Out From Team B!",Toast.LENGTH_SHORT).show();
        }
        else {
            NumberWicketsOfTeamB+=1;
            wicketOfTeamB.setText(String.valueOf(NumberWicketsOfTeamB));
        }
    }
    public void ResetScores(View view){
        ScoreOfTeamA = 0;
        ScoreOfTeamB = 0;
        NumberWicketsOfTeamA = 0;
        NumberWicketsOfTeamB = 0;
        scoreTeamA.setText(String.valueOf(ScoreOfTeamA));
        scoreTeamB.setText(String.valueOf(ScoreOfTeamB));
        wicketOfTeamA.setText(String.valueOf(NumberWicketsOfTeamA));
        wicketOfTeamB.setText(String.valueOf(NumberWicketsOfTeamB));
    }
}
