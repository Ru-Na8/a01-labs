
import java.util.Scanner;

public class Menu {

  public void MenuLoop() {

        int choice;
        Dice dice = new Dice();
        DiceGraphic graphicDice = new DiceGraphic() {
          public String to_String() {
            return null;
          }
        };
        DiceGraphicCheating cheatingDice = new DiceGraphicCheating() {
          @Override
          public Dice setRoll(int value) {

            return null;
          }
        };
        DiceGame game = new DiceGame();

        Scanner in = new Scanner(System.in);


    while (true) {
      // Show the menu
      System.out.println("Menu:");
      System.out.println("1. Dice and roll it");
      System.out.println("2. Create a DiceGraphic and roll it");
      System.out.println("3. Create a DiceGraphicCheating and roll it");
      System.out.println("4. Play a dice game");
      System.out.println("5. Exit");
      System.out.print("Enter your choice: ");

      choice = in.nextInt();

      switch (choice) {
        case 1 -> {
          Dice mydice = new Dice();
          mydice.roll();
          System.out.println("The value of the dice is: " + mydice.getValue());
        }
        case 2 -> System.out.println("The value of the dice is: " + graphicDice.toString());

        // Show the graphic representation of the dice

        case 3 -> {
          // Cheat by setting the value of the dice
          // Choose any value between 1 and 6
          dice.roll();
          System.out.println("Enter the new value: "+ dice);
          int newValue = in.nextInt();
          System.out.println("After cheating, the value of the dice is: " + cheatingDice.setRoll(newValue));
        }
        case 4 ->
          // Play a dice game
                game.PlayRound();

        case 5 -> {
          // Exit the program
          System.out.println("Exiting the program...");
          return;
        }
        default -> System.out.println("Invalid choice. Please try again.");
      }
    }
  }

}