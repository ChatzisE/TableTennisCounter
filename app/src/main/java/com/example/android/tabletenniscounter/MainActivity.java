package com.example.android.tabletenniscounter;

import android.view.View;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.name;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;
import static android.os.Build.VERSION_CODES.N;

public class MainActivity extends AppCompatActivity {
    int scorePlayerA =0;
    int scorePlayerB =0;
    int setPlayerA =0;
    int setPlayerB =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayForPlayerA(0);
        displayForPlayerB(0);
        displaySetForPlayerA(0);
        displaySetForPlayerB(0);

    }

    public void onePointA(View view) {

        if (scorePlayerA==12){
            Toast.makeText(this, "You cannot have more than 12 point in a TableTennis Set", Toast.LENGTH_SHORT).show();
            return;
        }
        scorePlayerA =scorePlayerA+1;
        displayForPlayerA(scorePlayerA);
    }
    public void oneSetA(View view) {
        EditText text = (EditText) findViewById(R.id.name_fieldA);
        String name = text.getText().toString();
        String new_name = name;
        if (setPlayerA==4){
            Toast.makeText(this, "You cannot have more than 4 sets in a TableTennis game  " +new_name  +"  is the winner :D", Toast.LENGTH_SHORT).show();
            return;
        }
        setPlayerA =setPlayerA+1;
        displaySetForPlayerA(setPlayerA);

    }

    public void onePointB(View view) {
        if (scorePlayerB==12){
            Toast.makeText(this, "You cannot have more than 12 point in a TableTennis Set", Toast.LENGTH_SHORT).show();
            return;
        }
        scorePlayerB =scorePlayerB+1;
        displayForPlayerB(scorePlayerB);
    }
    public void oneSetB(View view) {
        if (setPlayerB==4){
            EditText text = (EditText) findViewById(R.id.name_fieldB);
            String name = text.getText().toString();
            String new_name = name;
            Toast.makeText(this, "You cannot have more than 4 sets in a TableTennis game  " +new_name +"  is the winner :D", Toast.LENGTH_SHORT).show();
            return;
        }
        setPlayerB =setPlayerB+1;
        displaySetForPlayerB(setPlayerB);

    }

    public void resetScore(View view){
        scorePlayerA =0;
        scorePlayerB =0;
        setPlayerB =0;
        setPlayerA =0;
        displayForPlayerA(scorePlayerA);
        displayForPlayerB(scorePlayerB);
        displaySetForPlayerA(setPlayerA);
        displaySetForPlayerB(setPlayerB);
    }
    /**
     * Displays the given score for Player A.
     */
    public void displayForPlayerA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_a_score);
        scoreView.setText(String.valueOf(score));

    }
    /**
     * Displays the  set  score for Player A.
     */
    public void displaySetForPlayerA(int score) {
        TextView setView =(TextView) findViewById(R.id.set_a);
        setView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Player B.
     */
    public void displayForPlayerB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_b_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the  set  score for Player B.
     */
    public void displaySetForPlayerB(int score) {
        TextView setView =(TextView) findViewById(R.id.set_b);
        setView.setText(String.valueOf(score));
    }

}
