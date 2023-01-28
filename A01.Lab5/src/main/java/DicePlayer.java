import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class DicePlayer extends DiceHand{
    int[] dices;         //current roll of dices
    int[] savedDices;
    private int round;
    int cheatCount;
    private Scanner scanner;
    public List<Dice> diceList;
    public List<Integer> heldDiceIndex;

    public DicePlayer() {
        super(5);
        diceList = new ArrayList<>();
        heldDiceIndex = new ArrayList<>();
        dices = new int[5];
        savedDices = new int[5];
        round = 1;
        cheatCount = 0;
        scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            Dice die = new Dice();
            diceList.add(die);
        }
    }

        Scanner in = new Scanner(System.in);

        void rollDices() {
            for (int i = 0; i < dices.length; i++)
                // roll the not saved dice only
                if (savedDices[i] == 0) {
                    dices[i] = (int) (Math.random() * 6) + 1;
                } else {
                    savedDices[i] = dices[i];              // hold the saved dice

                }
        }


        // display the current roll of dices
        void displayDices() {
            System.out.println("Round " + round + ": " + Arrays.toString(dices));
        }

        //select dices to save
        void selectDices() {
            while (true) {
                // prompt the user to select dices to save
                System.out.println("Do you want to save any dice? ");
                String choice = scanner.nextLine();
                if (choice.toLowerCase().equals("no")) {
                    break;
                } else {
                    System.out.println("Select dices to save (e.g. 1 2 3): ");
                    String input = scanner.nextLine();
                    // split the input string to get the selected dice numbers
                    String[] inputArray = input.split(" ");
                    for (int i = 0; i < inputArray.length; i++) {
                        int index = Integer.parseInt(inputArray[i]) - 1;
                        savedDices[index] = dices[index];
                    }
                    break;
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

        void calculateResult() {
            //count of each number rolled on the dice
            int[] count = new int[6];
            for (int i = 0; i < dices.length; i++) {
                count[dices[i] - 1]++;
            }
            int maxCount = 0;
            int maxValue = 0;
            int sum = 0;
            for (int i = 0; i < count.length; i++) {
                if (count[i] > maxCount) {
                    maxCount = count[i];
                    maxValue = i + 1;
                }
                sum += (i + 1) * count[i];
            }
            System.out.println("You have " + maxCount + " dices with the value " + maxValue);
            System.out.println("The sum of your dices is " + sum);

            // Check for different combinations
            if (maxCount == 5) {
                System.out.println("Congratulations! You have Yatzy!");
            } else if (maxCount >= 4) {
                System.out.println("Congratulations! You have a Four of a Kind!");
            } else if (maxCount >= 3) {

                System.out.println("Congratulations! You have a Three of a Kind!");
            } else {
                System.out.println("Sorry, you did not get a good result this round.");
            }
        }

    }



