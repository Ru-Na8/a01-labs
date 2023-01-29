import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class DicePlayer {

    private List<Dice> diceList;
    private List<Integer> heldDiceIndex;

    public DicePlayer() {
        diceList = new ArrayList<>();
        heldDiceIndex = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            Dice die = new Dice();
            diceList.add(die);
        }
    }

    // hold the dice using the index of the dice
    public void holdDice(String values) {
        // Split the input string and convert to integers
        String[] vals = values.split(" ");
        for (String val : vals) {
            heldDiceIndex.add(Integer.parseInt(val) - 1);
        }
    }

    // roll all the dices
    public void rollAll() {
        for (int i = 0; i < diceList.size(); i++) {
            diceList.get(i).roll();
        }
    }

    // total value of all the dices
    public int getTotalValue() {
        int sum = 0;
        for (Dice dice : diceList) {
            sum += dice.getValue();
        }
        return sum;
    }

    // cheat on a specific dice by setting its value
    public void cheat() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which dice would you like to cheat on? (1-5)");
        int index = scanner.nextInt() - 1;
        System.out.println("Choose the new dice value: (1-6)");
        int newValue = scanner.nextInt();
        // Set the value of the chosen dice to the new value
        diceList.get(index).setValue(newValue);
        // Add the index of the cheated dice to the heldDiceIndex
        heldDiceIndex.add(index);
    }

}