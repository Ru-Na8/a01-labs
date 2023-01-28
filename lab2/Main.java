import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    DiceGame game = new DiceGame();

    Scanner scanner = new Scanner(System.in);

    while (true) {
      // Show the menu
      System.out.println("Menu:");
      System.out.println("1. Create a Dice and roll it");
      System.out.println("2. Create a DiceGraphic and roll it");
      System.out.println("3. Create a DiceGraphicCheating and roll it");
      System.out.println("4. Play a dice game");
      System.out.println("5. Exit");
      System.out.print("Enter your choice: ");

      int choice = scanner.nextInt();

      switch (choice) {
        case 1:
          // Create a Dice and roll it
          Dice mydice = new Dice();
          mydice.roll();
          System.out.println("The value of the dice is: " + mydice.getValue());
          break;
        case 2:

          // Create a DiceGraphic and roll it
          DiceGraphic graphicDice = new DiceGraphic();
          graphicDice.roll();
          System.out.println("The value of the dice is: " + graphicDice.toString());
          // Show the graphic representation of the dice
          break;
        case 3:
          // Create a DiceGraphicCheating and roll it
          DiceGraphicCheating cheatingDice = new DiceGraphicCheating();
          // cheatingDice.rollDice();
          // Cheat by setting the value of the dice
          // Choose any value between 1 and 6
          Scanner in = new Scanner(System.in);
          System.out.println("Enter the new value: ");
          int newValue= in.nextInt();
        //   Dice num= cheatingDice.setRoll(newValue);
          System.out.println("After cheating, the value of the dice is: " + cheatingDice.setValue(newValue) );
          break;
        case 4:
          // Play a dice game
        //   DiceGame game = new DiceGame();
          game.playRound();

        //   reset();

          break;
        case 5:
          // Exit the program
          System.out.println("Exiting the program...");
          return;
        default:
          System.out.println("Invalid choice. Please try again.");
      }
    }
  }

}