import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class MonkeyPlayerTest {
    @Test
    public void testGetScore() {
        MonkeyPlayer player = new MonkeyPlayer();
        assertTrue(player.getScore() != 0);
    }
}