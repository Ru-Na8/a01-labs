import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DiceHandTest {
    int num = 5;
    DiceHand diceHand = new DiceHand(num);

        @Test
        public void testDiceHandConstructor() {
            assertEquals(num, diceHand.hand.size());
        }

        @Test
        public void testRollAll() {
            diceHand.rollAll();
            for (Dice die : diceHand.hand) {
                assertTrue(die.getValue() > 0 && die.getValue() <= 6);
            }
        }

        @Test
        public void testToString() {
            diceHand.rollAll();
            assertTrue(" " != diceHand.toString());

        }

}
