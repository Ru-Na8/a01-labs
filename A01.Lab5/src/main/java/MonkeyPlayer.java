
import java.util.Random;

class MonkeyPlayer extends DiceHand {

    private Random random;

    public MonkeyPlayer() {
        super(5);
        random = new Random();
    }

     public int getScore() {
         int score = 0;
         for (Dice dice : hand) {
             score += dice.getValue();
         }
         return score;
     }
}