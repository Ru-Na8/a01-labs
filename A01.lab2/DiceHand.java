import java.util.ArrayList;

public class DiceHand {
    ArrayList<Dice> hand = new ArrayList<Dice>();
    
    // constructor that creates a number of Dice objects equal to the input 'num'
    public DiceHand(int num) {
        for (int i = 0; i < num; i++) {
            Dice die = new Dice();
            hand.add(die);
        }
    }


    // roll all the Dice in the hand
    public void rollAll() {
        for (Dice die : hand) {
            die.roll();
        }
    }
    
    //return a string representation of the DiceHand
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < hand.size(); i++) {
            result.append("[").append(i + 1).append("] ").append(hand.get(i).getValue()).append(" ");
        }
        return result.toString();
    }
}