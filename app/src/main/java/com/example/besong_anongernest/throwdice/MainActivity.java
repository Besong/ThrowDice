package com.example.besong_anongernest.throwdice;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


/**
 * Thic activity tracks the number of points gotten by each player in each turn for
 * various throws
 */

public class MainActivity extends AppCompatActivity {

    // Tracks the score for both players
    int score = 0;

    private TextView mSelectedPlayer;
    private TextView mScoreView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Player 1 is selected
    public void playerOneSelected(View view) {
        score = 0;
        mSelectedPlayer = (TextView) findViewById(R.id.selected_player_tv);
        mSelectedPlayer.setText("Player 1 Selected");
        displayScore(score);

    }

    //Player 2 is selected
    public void playerTwoSelected(View view) {
        score = 0;
        mSelectedPlayer = (TextView) findViewById(R.id.selected_player_tv);
        mSelectedPlayer.setText("Player 2 Selected");
        displayScore(score);
    }

    //Display the score for both players
    public void displayScore(int point) {
        mScoreView = (TextView) findViewById(R.id.score_tv);
        mScoreView.setText(String.valueOf(point));
    }

    //Increase the score by 1
    public void incrementByOne(View view) {
        score += 1;
        displayScore(score);
    }

    //Increase the score by 2
    public void incrementByTwo(View view) {
        score += 2;
        displayScore(score);
    }

    //Increase the score by 3
    public void incrementByThree(View view) {
        score += 3;
        displayScore(score);
    }

    //Increase the score by 4
    public void incrementByFour(View view) {
        score += 4;
        displayScore(score);
    }

    //Increase the score by 5
    public void incrementByFive(View view) {
        score += 5;
        displayScore(score);
    }

    //Increase the score by 6
    public void incrementBySix(View view) {
        score += 6;
        displayScore(score);
    }

    //Reset the score for both players
    public void ResetScore(View view) {
        score = 0;
        mSelectedPlayer = (TextView) findViewById(R.id.selected_player_tv);
        mSelectedPlayer.setText("No Player Selected");
        displayScore(score);
    }
}
