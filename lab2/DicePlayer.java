import java.util.Scanner;

public class DicePlayer {
    DiceHand diceHand;
    private boolean hasCheatingDice;

    public DicePlayer() {
        diceHand = new DiceHand(5);
        hasCheatingDice = false;
        int totalSum=0;

    }

    public void rollDices() {
        diceHand.rollAllDices();
    }

    public void selectDicesToHold(int[] indices) {
        diceHand.holdDices(indices);
    }

    public void askForCheatingDice() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Do you want to cheat and use a cheating dice? (y/n) ");
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("y")) {
            hasCheatingDice = true;
        }
    }

    public void changeCheatingDice(int index, int value) {
        if (hasCheatingDice) {
            diceHand.changeDice(index, value);
        }
    }

    public int getTotalSum() {
        return diceHand.getTotalSum();
    }

    public int getDiceCountWithValue(int value) {
        return diceHand.getDiceCountWithValue(value);
    }

    public void setTotalSum(int sum) {
        int totalSum = sum;
    }
}

































// import java.util.Scanner;

// public class DicePlayer {
//   public static final String DiceHand = null;
// private DiceHand diceHand;

//   public DicePlayer() {
//     this.diceHand = new DiceHand(5);
//   }

//   public void rollDices() {
//     Scanner scanner = new Scanner(System.in);

//     System.out.println("Would you like to cheat? (y/n)");
//     String response = scanner.nextLine();

//     if (response.equals("y")) {
//       // ask the user which dice they want to cheat on
//       System.out.println("Which dice do you want to cheat on? (enter a number between 1 and 5)");
//       int diceIndex = scanner.nextInt();
//       diceHand.setCheatingDice(diceIndex - 1);
//     }

//     diceHand.rollAllDices();
//   }

//   public void holdDice(int diceIndex) {
//     diceHand.holdDice(diceIndex - 1);
//   }

//   public void rollHeldDices() {
//     diceHand.rollHeldDices();
//   }

//   public int getTotal() {
//     return diceHand.getTotal();
//   }

//   public int getDiceCountWithValue(int value) {
//     return diceHand.getDiceCountWithValue(value);
// }
// }



