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
                assertTrue(dice.getValue() >= 1 && dice.getValue() <= 6);
            }
        }

        @Test
        public void testSelectDices() {
            // set the value of one of the dices to 1
            player.hand.get(0).setValue(1);

            // call the selectDices() method
            player.selectDices();

            // assert that the index of the dice with the value of 1 has been added to the ind ArrayList
            assertTrue(player.ind.contains(0));
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


