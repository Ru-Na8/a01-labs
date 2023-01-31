import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class DiceTest {

        Dice dice = new Dice();

        @Test
        public void testroll(){
            dice.roll();
            int value= dice.getValue();
            assertTrue(0<value && value<7);
        }

        @Test
        public void testSetValue() {
            dice.setValue(3);
            int value = dice.getValue();
            assertEquals(3, value);
        }

        @Test
        public void testGetDices() {
            dice.roll();
            int value = dice.getDices();
            assertTrue(value >= 1 && value <= 6);
        }
        @Test
        public void testToString() {
            assertEquals("⚂-3", dice.toString());
        }

}
