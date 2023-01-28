import java.util.Random;

public class Dice {
    private static Random rand = new Random();
    private static boolean held;
    static int value;

    public Dice() {
        held = false;
        value = 0;
    }

    public int roll() {
        if (!held) {
            value = rand.nextInt(6) + 1;
        }
        return value;
    }

    public void hold() {
        held = true;
    }

    public void release() {
        held = false;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
