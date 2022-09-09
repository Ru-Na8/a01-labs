package lab1;
import java.util.Random;
import java.util.Scanner;

public class Game {
//     // create Random object
//         // create Random object
//         Random random = new Random();
//         // generate random number from 0 to 100
//         int number = random.nextInt();
//         System.out.println(number);
    
//     }
// }

    
    public static void main(String []args) {
        Random rand = new Random() ;  //// create instance of Random class

        Scanner input = new Scanner (System.in);
        // our range?
        int MIN = 0;
        int MAX = 100;
        int number ; 
        float guess;
        String k = "cheat";
        // count antal gussning
        int atempts;
        // if they will play agin or not  
        String response; 
        boolean playAgain= true;

        while (playAgain)
        {
            atempts= 0 ;
            number= rand.nextInt (MIN, MAX+1);
            guess = 0;
            response= null;

            while (guess != number)
            {
                System.out.println("Guess a number between 1 and 100:");
                guess = input.nextInt();
                System.out.println("Guess: " + guess);

                if (guess < number)
                    System.out.println("My number is greater than " + guess); 

                if (guess==k)
                    System.out.println("Ah, you like cheating? The number is " + number);


                else if (guess > number)
                    System.out.println("My number is less than " + guess);
                    atempts++;

              

            }

            System.out.println("Well done!"+  number + " was my number! You guessed it in " + atempts + " guesses.");

            System.out.println("Do you want to play again? Y/N ");
            

           


            response = input.next();
            if (response.equalsIgnoreCase("y"))
                playAgain = true;
            else
                playAgain = false;

    

        }
        System.out.println("Thanks for playing our game!");


    }
}
















//         Random random = new Random();
//         Scanner input = new Scanner(System.in);
//         int MIN = 1;
//         int MAX = 100;
//         int comp = random.nextInt(MAX - MIN + 1) + MIN;
//         int user;
//         int guesses = 0;
//         do {
//             System.out.print("Guess a number between 1 and 100: ");
//             user = input.nextInt();
//             guesses++;
//             if (user > comp)
//                 System.out.println("My number is less than " + user + ".");
//             else if (user < comp)
//                 System.out.println("My number is greater than " + user + ".");
            
//             else if (user = "cheat")
//                 System.out.println("Ah, you like cheating? The number is " + comp + ".");

//             else
//                 System.out.println("Well done! " + comp + " was my number! You guessed it in " + guesses + " guesses.");
//         } while (user != comp);
//     }
// }

