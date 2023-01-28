import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class DiceTest {


        @Test
        public void testSetValue() {
            Dice dice = new Dice();
            dice.setValue(3);
            int value = dice.getValue();
            assertEquals(3, value);

            dice.setValue(0);
            value = dice.getValue();
            assertNotEquals(0, value);

            dice.setValue(7);
            value = dice.getValue();
            assertNotEquals(7, value);
        }

        @Test
        public void testGetDices() {
            Dice dice = new Dice();
            dice.roll();
            int value = dice.getDices();
            assertTrue(value >= 1 && value <= 6);
        }

}