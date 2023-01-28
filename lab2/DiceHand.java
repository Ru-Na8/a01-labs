import java.util.Random;

public class DiceHand {
    private Dice[] dices;

    public DiceHand(int numDices) {
        dices = new Dice[numDices];
        for (int i = 0; i < numDices; i++) {
            dices[i] = new Dice();
        }
    }

    public void rollAllDices() {
        for (Dice dice : dices) {
            dice.roll();
        }
    }

    public void holdDices(int[] indices) {
        for (int i = 0; i < dices.length; i++) {
            if (contains(indices, i)) {
                dices[i].hold();
            } else {
                dices[i].release();
            }
        }
    }

    public void changeDice(int index, int value) {
        dices[index].setValue(value);
    }

    public Dice getDice(int index) {
        return dices[index];
    }

    public int getTotalSum() {
        int sum = 0;
        for (Dice dice : dices) {
            sum += dice.getValue();
        }
        return sum;
    }

    public int getDiceCountWithValue(int value) {
        int count = 0;
        for (Dice dice : dices) {
            if (dice.getValue() == value) {
                count++;
            }
        }
        return count;
    }

    public void printDices() {
        for (Dice dice : dices) {
            System.out.print(dice.getValue() + " ");
        }
        System.out.println();
    }

    private boolean contains(int[] array, int value) {
        for (int i : array) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }
}






























// public class DiceHand {
//     private int numDices;
//     private int[] dices;
//     private boolean[] held;
//     private int cheatingDice;
  
//     public DiceHand(int numDices) {
//       this.numDices = numDices;
//       this.dices = new int[numDices];
//       this.held = new boolean[numDices];
//       this.cheatingDice = -1;
//     }
  
//     public void setCheatingDice(int diceIndex) {
//       this.cheatingDice = diceIndex;
//     }
  
//     public void rollAllDices() {
//       for (int i = 0; i < numDices; i++) {
//         if (i != cheatingDice) {
//           dices[i] = (int) (Math.random() * 6) + 1;
//         } else {
//           // cheat by setting the value of the cheating dice to 6
//           dices[i] = 6;
//         }
//         held[i] = false;
//       }
//     }
  
//     public void holdDice(int diceIndex) {
//       held[diceIndex] = true;
//     }
  
//     public void rollHeldDices() {
//       for (int i = 0; i < numDices; i++) {
//         if (!held[i]) {
//           dices[i] = (int) (Math.random() * 6) + 1;
//         }
//       }
//     }
  
//     public int getTotal() {
//       int total = 0;
//       for (int i = 0; i < numDices; i++) {
//         total += dices[i];
//       }
//       return total;
//     }

//     public int getDiceCountWithValue(int value) {
//         return 0;
//     }
//   }
  