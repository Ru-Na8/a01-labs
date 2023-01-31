import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiceGameTest {
    DiceGame game= new DiceGame();
    @Test
    public void testplayRound(){
       game.PlayRound();
       assertEquals(3,game.round);
    }
}