import java.util.Random;

public class Dice {
    public int value;
    private Random random = new Random();


    //rolls the dice
    public Dice() {
        roll();
    }

    //randomly set the value of the dice
    public void roll() {
        value = random.nextInt(6) + 1;
    }
    //get value of the dice
    public int getValue() {
        return value;
    }

    // if the new value is between 1 and 6,set the value of the dice
    public void setValue(int newValue) {
        if (newValue >= 1 && newValue <= 6) {
            value = newValue;
        }
    }
}
