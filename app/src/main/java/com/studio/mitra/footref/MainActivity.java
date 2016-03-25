package com.studio.mitra.footref;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //------------------GLOBAL VARIABLES----------------------------------------------------
    /**
     * variable to keep count of the goals of Team A
     */
    public static int goalA;
    /**
     * variable to keep the count of the goals of Team B
     */
    public static int goalB;
    /**
     * variable to keep track of freekick of A
     */
    public static int freeA;
    /**
     * variable to keep track of freekicks of B
     */
    public static int freeB;
    /**
     * variable to keep count of corner of A
     */
    public static int cornerA;
    /**
     * variable to keep count of corner of B
     */
    public static int cornerB;
    /**
     * variable to keep count of penalty of A
     */
    public static int penaltyA;
    /**
     * variable to keep count of penalty of B
     */
    public static int penaltyB;

    //--------------------------GOAL TRACKER METHOD--------------------------------------------
    /**
     * Method that gets invoked when goal button of Team A is clicked
     */
    public void setgoalA(View view) {
        ++goalA;
        displayGoalA(goalA);
    }
    /**
     * Method that gets invoked when goal button of Team A is clicked
     */
    public void setgoalB(View view) {
        ++goalB;
        displayGoalB(goalB);
    }


    //------------------------DISPLAY GOAL METHODS--------------------------------------
    /**
     * This method displays the score of team A on the teamATextView
     */
    private void displayGoalA(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.teamATextView);
        quantityTextView.setText("" + number);
    }

    /**
     * /**
     * This method displays the score of team B on the teamBTextView
     */
    private void displayGoalB(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.teamBTextView);
        quantityTextView.setText("" + number);
    }

    //------------------------FREE KICK TRACKER METHODS---------------------------------------

    /**
     * method invoked when freekick of team A button is clicked
     */
    public void freekickA(View view)
    {
        ++freeA;
        displayFreeA(freeA);

    }
    /**
     * method invoked when freekick of team B button is clicked
     */
    public void freekickB(View view)
    {
        ++freeB;
        displayFreeB(freeB);

    }


    //-------------------------------FREE KICK DISPLAY METHODS---------------------------

    /**
     * This method displays the freekicks of team A
     */
    private void displayFreeA(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.freeA_TV);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the freekicks of team B
     */
    private void displayFreeB(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.freeB_TV);
        quantityTextView.setText("" + number);
    }

    //----------------------CORNER TRACKER METHOD------------------------------------
    /**
     * method invoked when corner of team A button is clicked
     */
    public void cornerA(View view)
    {
        ++cornerA;
        displayCornerA(cornerA);

    }
    /**
     * method invoked when corner of team B button is clicked
     */
    public void cornerB(View view)
    {
        ++cornerB;
        displayCornerB(cornerB);

    }
    //-------------------------------CORNER DISPLAY METHODS---------------------------

    /**
     * This method displays the corner of team A
     */
    private void displayCornerA(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.cornerA_TV);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the corner of team B
     */
    private void displayCornerB(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.cornerB_TV);
        quantityTextView.setText("" + number);
    }
    //----------------------PENALTY TRACKER METHOD------------------------------------
    /**
     * method invoked when corner of team A button is clicked
     */
    public void setPenaltyA(View view)
    {
        ++penaltyA;
        displayPenaltyA(penaltyA);

    }
    /**
     * method invoked when corner of team B button is clicked
     */
    public void setPenaltyB(View view)
    {
        ++penaltyB;
        displayPenaltyB(penaltyB);

    }
    //-------------------------------PENALTY DISPLAY METHODS---------------------------

    /**
     * This method displays the penalty of team A
     */
    private void displayPenaltyA(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.penaltyA_TV);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the penalty of team B
     */
    private void displayPenaltyB(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.penaltyB_TV);
        quantityTextView.setText("" + number);
    }


    //---------------------RESET and PAUSE BUTTON --------------------------------------
    /**
     * Method called when reset button is clicked
     */
    public void reset(View view)
    {
        goalA=0;
        goalB=0;
        freeA=0;
        freeB=0;
        cornerA=cornerB=0;
        penaltyA=penaltyB=0;
        displayGoalA(goalA);
        displayGoalB(goalB);
        displayFreeA(freeA);
        displayFreeB(freeB);
        displayCornerA(cornerA);
        displayCornerB(cornerB);
        displayPenaltyA(penaltyA);
        displayPenaltyB(penaltyB);
    }







}
