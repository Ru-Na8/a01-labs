import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class ComputerPlayerTest {

    // create a new instance of the ComputerPlayer class
    ComputerPlayer player = new ComputerPlayer();
        @Test
        public void testRollDices() {
            // call the rollDices() method
            player.rollDices();

            // assert that the value of each dice in the hand is between 1 and 6
            for (Dice dice : player.hand) {
                int value= dice.getValue();

                assertTrue(value>= 1 && value<= 6);
            }
        }

        @Test
        public void testSelectDices() {
            player.rollDices();

            // call the selectDices() method
            player.selectDices();

            // set the value of one of the dices to 1
            player.hand.get(0).setValue(1);

            assertTrue(0<=player.hand.size()||player.hand.size()<=5);
        }

        @Test
        public void testGetScore() {
            // set the values of the dices to [1, 2, 3, 4, 5]
            for (int i = 0; i < player.hand.size(); i++) {
                player.hand.get(i).setValue(i + 1);
            }

            // call the getScore() method
            int score = player.getScore();

            // assert that the score is equal to 15
            assertEquals(15, score);
        }
    }


