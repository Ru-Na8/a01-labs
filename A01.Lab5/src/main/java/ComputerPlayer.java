import java.util.ArrayList;
public class ComputerPlayer extends DiceHand{
    ArrayList<Integer> ind = new ArrayList<>();

    public ComputerPlayer() {
        super(5);
    }

    public void rollDices() {
        for (int i=0; i<hand.size(); i++) {
            if(ind.contains(i)){
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