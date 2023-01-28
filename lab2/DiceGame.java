// import java.util.Scanner;

// public class DiceGame extends DicePlayer {

//     public void game(){
//         int round = 0;
//         Scanner user_input = new Scanner(System.in); 
//         DicePlayer player = new DicePlayer();
//         DiceGraphicCheating cheating = new DiceGraphicCheating();
//         boolean cheat = false;
//         while(round < 3){
//             player.roll_all_dices();
//             player.saved.clear();
//             String menu = "Choose dices you want to hold... (EX: 1,2,4) ";

//             if(!cheat){
//                 System.out.println("If you want to cheat, type 'cheat'");
//             }

//             System.out.println(player + menu);

//             String input = user_input.nextLine();

//             if(!cheat && input.equals("cheat")){
//                 System.out.println("Choose die to change:");
//                 int index = user_input.nextInt();
//                 System.out.println("Choose value for die:");
//                 int value = user_input.nextInt();
//                 player.hand.set(index - 1, cheating.setRoll(value));

//                 for (int i = 0; i < player.hand.size(); i++) {
//                     player.hold(i + "");
//                 }

//                 round--;
//                 user_input.nextLine();
//                 cheat = true;
//             }
//             else{
//                 player.hold(input);
//             }

//             round++;
//         }
//         System.out.println(player + "\n" + player.sum());
//         //user_input.close();
//     }
// }

import java.util.Scanner;

public class DiceGame extends Dice {
    private DicePlayer player;

    public DiceGame() {
        player = new DicePlayer();
    }
    public void playRound() {

    //    for (int i = 1; i <= 3; i++) {
        for (int round = 1; round <= 3; round++) {
            player.rollDices();

            int[] values = new int[5];

            System.out.println("Rolling dices for the " + round + " time...");
            player.rollDices();
            player.diceHand.printDices();
            int[] indicesToHold = askForDicesToHold();
            player.selectDicesToHold(indicesToHold);

            for (int j = 0; j < 5; j++) {
                values[j] = player.diceHand.getDice(j).getValue();
            
            }
            if (hasYatzy(values)) {
                System.out.println("You got Yatzy!");
                player.setTotalSum(50);
                break;
            } else if (hasFourOfAKind(values)) {
                System.out.println("You got a four of a kind!");
                player.setTotalSum(40);
                break;
            } else if (hasThreeOfAKind(values)) {
                System.out.println("You got a three of a kind!");
                player.setTotalSum(30);
                break;
            }

        
        for (int j = 0; j < 5; j++) {
            values[j] = player.diceHand.getDice(j).getValue();
        }

        int mostFrequentValue = getMostFrequentValue(values);
        int count = player.getDiceCountWithValue(mostFrequentValue);
        System.out.println("You have " + count + " dices with the value " + mostFrequentValue);
        System.out.println("Total sum: " + player.getTotalSum());
    }

    }
    private int[] askForDicesToHold() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to save any dice?");
        String input = scanner.nextLine().toLowerCase();
        System.out.print("Enter the dice to hold (e.g. 1 2 3): ");
        String holdDiceInput = scanner.nextLine();
        String[] diceToHold = holdDiceInput.split(" ");
        int[] indicesToHold = new int[diceToHold.length];
        for (int i = 0; i < diceToHold.length; i++) {
            indicesToHold[i] = Integer.parseInt(diceToHold[i]);
            if (indicesToHold[i] < 1 || indicesToHold[i] > 5) {
                System.out.println("Invalid input. Dice index should be between 1 and 5");
                return askForDicesToHold();
            }
        }
        return indicesToHold;
    }    
    
    

    private boolean hasYatzy(int[] values) {
        int value = values[0];
        for (int i = 1; i < 5; i++) {
            if (values[i] != value) {
                return false;
            }
        }
        return true;
    }

    private boolean hasFourOfAKind(int[] values) {
        int[] counts = new int[6];
        for (int value : values) {
            counts[value - 1]++;
        }
        for (int count : counts) {
            if (count >= 4) {
                return true;
            }
        }
        return false;
    }

    private boolean hasThreeOfAKind(int[] values) {
        int[] counts = new int[6];
        for (int value : values) {
            counts[value - 1]++;
        }
        for (int count : counts) {
            if (count >= 3) {
                return true;
            }
        }
        return false;
    }

    private int getMostFrequentValue(int[] values) {
        int[] counts = new int[6];
        for (int value : values) {
            counts[value - 1]++;
        }
        int maxCount = 0;
        int maxValue = 0;
        for (int i = 0; i < 6; i++) {
            if (counts[i] > maxCount) {
                maxCount = counts[i];
                maxValue = i + 1;
            }
        }
        return maxValue;
    }
}
