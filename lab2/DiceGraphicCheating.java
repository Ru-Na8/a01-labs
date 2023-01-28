  import java.awt.Graphics;
import java.util.Random;
import javax.swing.JComponent;

public class DiceGraphicCheating extends JComponent {
    private static Random rand = new Random();
    private int value;

    public DiceGraphicCheating() {
        this.value = value;
    }

    @Override
    public void paintComponent(Graphics g) {
        // draw the dice face with the specified value
        String[] graphic = {" ", "⚀-1", "⚁-2", "⚂-3", "⚃-4", "⚄-5", "⚅-6"};
        // using the Graphics object g
    }

    public int setValue(int value) {
      Dice d = new Dice();
      d.roll();
        d.value = value;
        return value;
      }

    
    public int getValue() {
        return value;
    }
}

