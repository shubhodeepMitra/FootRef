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


        /**
         * initializing the stack with values of -1
         */
        for(int i=0;i<20;i++)
            mstack[i]=-1;
    }

    //------------------GLOBAL VARIABLES----------------------------------------------------
    /**
     * variable to keep count of the goals of Team A
     */
    private int goalA;
    /**
     * variable to keep the count of the goals of Team B
     */
    private int goalB;
    /**
     * variable to keep track of freekick of A
     */
    private int freeA;
    /**
     * variable to keep track of freekicks of B
     */
    private int freeB;
    /**
     * variable to keep count of corner of A
     */
    private int cornerA;
    /**
     * variable to keep count of corner of B
     */
    private int cornerB;
    /**
     * variable to keep count of penalty of A
     */
    private int penaltyA;
    /**
     * variable to keep count of penalty of B
     */
    private int penaltyB;


    /**
     * to keep track of which button is pressed
     */
    private int mstack[]=new int[20];

    /**
     *to keep track of top
     */
    int top=-1;

    //--------------------------GOAL TRACKER METHOD--------------------------------------------
    /**
     * Method that gets invoked when goal button of Team A is clicked
     */
    public void setgoalA(View view) {
        ++goalA;
        push(0);
        displayGoalA(goalA);
    }
    /**
     * Method that gets invoked when goal button of Team A is clicked
     */
    public void setgoalB(View view) {
        ++goalB;
        push(1);
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
        push(2);
        displayFreeA(freeA);

    }
    /**
     * method invoked when freekick of team B button is clicked
     */
    public void freekickB(View view)
    {
        ++freeB;
        push(3);
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
        push(4);
        displayCornerA(cornerA);

    }
    /**
     * method invoked when corner of team B button is clicked
     */
    public void cornerB(View view)
    {
        ++cornerB;
        push(5);
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
        push(6);
        displayPenaltyA(penaltyA);

    }
    /**
     * method invoked when corner of team B button is clicked
     */
    public void setPenaltyB(View view)
    {
        ++penaltyB;
        push(7);
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


    //-------------------------UNDO BUTTON----------------------

    public void undo(View view)
    {
        int x;
        x=pop();
        /**
         * to check which button was used and then undo the task performed,
         * and also to ensure that that the value never goes less than 0
         */


        switch(x)
        {
            case 0:
               if(goalA>0)
                    --goalA;
                displayGoalA(goalA);
                break;
            case 1:
                if(goalB>0)
                --goalB;
                displayGoalB(goalB);
                break;
            case 2:
                if(freeA>0)
                    --freeA;
                displayFreeA(freeA);
                break;
            case 3:
                if(freeB>0)
                    --freeB;
                displayFreeB(freeB);
                break;
            case 4:
                if(cornerA>0)
                    --cornerA;
                displayCornerA(cornerA);
                break;
            case 5:
                if(cornerB>0)
                    --cornerB;
                displayCornerB(cornerB);
                break;
            case 6:
                if(penaltyA>0)
                    --penaltyA;
                displayPenaltyA(penaltyA);
                break;
            case 7:
                if(penaltyB>0)
                    --penaltyB;
                displayPenaltyB(penaltyB);
                break;

        }

    }

    /**
     * to push elements into the stack
     * @param x
     */
    public void push(int x)
    {
        if(top<19)
            ++top;
        else if(top==19)
            top=0;

        mstack[top]=x;
    }

    /**
     * to pop elements from stack
     */
    public int pop()
    {
        int x;
        /**
         * after performing the pop, the poped valued is replaced by -1
         */
        if(top>=0)
        {
                x=mstack[top];
                mstack[top]=-1;
                --top;
            return x;
        }

        /**
         * acts like a circular queue if the value of top is -1 and the value of the last element is not -1 then
         */
        if(top==-1 && mstack[19]!=-1)
        {
            x=mstack[19];
            mstack[19]=-1;
            top=18;
            return x;
        }
        return -1;


    }





}
