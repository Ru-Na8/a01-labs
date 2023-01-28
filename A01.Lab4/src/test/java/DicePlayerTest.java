import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


class DicePlayerTest {
    DicePlayer player = new DicePlayer();

    @Test
    public void testRollDices() {
        player.rollDices();
        for (int i = 0; i < player.dices.length; i++) {
            assertTrue(player.dices[i] >= 1 && player.dices[i] <= 6);
        }
    }





    @Test
    public void testCalculateResult() {
        player.rollDices();
        player.calculateResult();
        assertTrue(player.cheatCount >= 0 && player.cheatCount <= 1);
    }
}