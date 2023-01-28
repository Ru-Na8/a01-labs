import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
public class ComputerPlayer extends DiceHand{
    int num;
    public Scanner scanner;
    ArrayList<Integer> ind = new ArrayList<>();
    private int[] dices;         //current roll of dices
    private int cheatCount;
    public List<Dice> diceList;



    public ComputerPlayer() {
        super(5);
    }

    public void rollDices() {
        for (int i=0; i<hand.size(); i++) {
            if(ind.contains(i)){
                continue;
            }
            else{
                hand.get(i).roll();
            }
        }
    }
    public void selectDices() {
                // split the input string to get the selected dice numbers
                for(int i =0; i<hand.size(); i++) {
                    if(hand.get(i).getValue()==1){
                        ind.add(i);
                    }
                    else{
                        continue;
                    }
                }
            }

    public int getScore(){
        int score = 0;
        for(Dice dice : hand){
            score += dice.getValue();
        }
        return score ;
        }

    }