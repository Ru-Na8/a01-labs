
package lab2;
import lab2.Dice;
import lab2.DiceGraphic;


public class TestDice {
    public static void main(String[] args) {
        Dice die= new Dice(6) ;
        var dieGraphic = new DiceGraphic();
        die.rollDice();

        System.out.println("The initial value on our die is:" + die);

        
        dieGraphic.rollDice();

        System.out.println("The value :" + dieGraphic);


    }
}
