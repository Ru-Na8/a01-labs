import java.util.ArrayList;
import java.util.Scanner;

class DiceGame {
    public int round;
    DicePlayer player = new DicePlayer();
    MonkeyPlayer monkeyPlayer = new MonkeyPlayer();
    ComputerPlayer computerPlayer = new ComputerPlayer();
    Scanner in = new Scanner(System.in);


    // constructor to initialize the game
    DiceGame() {
        round = 1;
    }


    // start the game
    void PlayRound() {

        // loop for 3 rounds
        while (round <= 3) {
            System.out.print("Round" + round);
            System.out.print( "player Turn: \n");

            player.rollDices();
            player.displayDices();
            player.selectDices();
            //player.holdDice(in.nextLine());

            //The monkey player
            System.out.print( "Monkey Turn: \n");

            monkeyPlayer.rollAll();

            //The computer player
            System.out.print( "computer Turn: \n");

            computerPlayer.selectDices();
            computerPlayer.rollDices();
            if (round < 3) {
                player.changeDice();
                
            }
            round++;
        }
        player.calculateResult();
        yatzy(player.hand, "you");
        yatzy(monkeyPlayer.hand, "monkey player");
        System.out.println("Monkeys hand is: " + monkeyPlayer.hand + " and the sum is: " + monkeyPlayer.getScore());
        yatzy(computerPlayer.hand, "computer player");
        System.out.println("Computers hand is: " + computerPlayer.hand + " and the sum is: " + computerPlayer.getScore());
    }

    public void yatzy(ArrayList<Dice> lst, String name){
        int antal = 0;
        for(Dice d : lst){
            if(d.getValue() == 1){
                antal++;
            }
            else{
                continue;
            }
        }
        if(antal == 5){
            System.out.println("Yatzy for " + name);
        }
        if(antal == 4){
            System.out.println("Fyrtal for " + name);
        }
        if(antal == 3){
            System.out.println("Triss for " + name);
        }
        if(antal<3){
            System.out.println("Good luck next time! " + name);
        }

    }
    public static void main(String[] args) {
        DiceGame game = new DiceGame();
        game.PlayRound();
    }

}


