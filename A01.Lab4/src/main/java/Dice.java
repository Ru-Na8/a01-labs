import java.util.Random;

public class Dice implements DiceGraphic, DiceGraphicCheating{
    public int value;
    public Random random = new Random();
    public String[] getGraphic = { " ", "⚀-1", "⚁-2", "⚂-3", "⚃-4", "⚄-5", "⚅-6" };
    public Dice dice;



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
    public int getDices(){
        return value;
    }

    // if the new value is between 1 and 6,set the value of the dice
    public void setValue(int newValue) {
        if (newValue >= 1 && newValue <= 6) {
            value = newValue;
        }
    }
    public String toString() {
        return getGraphic[value];
    }
    public Dice setRoll(int value) {
        this.dice.setValue(value);
        return this.dice;
    }
}
