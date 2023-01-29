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
        

    // change a dice value
    void changeDice() {
        System.out.println("Do you want to change a dice? (y/n)");
        String input = scanner.nextLine();
        if (input.equals("y") && cheatCount < 1) {
            System.out.println("Which dice do you want to change? (1-5)");
            int index = scanner.nextInt() - 1;
            System.out.println("Enter new value for dice (1-6)");
            int value = scanner.nextInt();
            dices[index] = value;
            cheatCount++;
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