package lab2;

import java.util.Random;


public class Dice {
    private int NUM_SIDES;
    private int Value;

    public Dice(int numofsides){
        NUM_SIDES= numofsides;

        Random myRandomNumGenerator= new Random();
        Value= myRandomNumGenerator.nextInt(NUM_SIDES) + 1;

        // NUM_SIDES = 6;
        // value=1;

    } // End of constructor

    // This metod will simulate rolling the dice object
    public void rollDice(){
        Random myRandomNumGenerator= new Random();
        Value= myRandomNumGenerator.nextInt(NUM_SIDES) + 1;

    }  // End of method rollDice()


// this method return the current face value of the Dice object
    public int getValue(){
        return Value;
    }


  

}
