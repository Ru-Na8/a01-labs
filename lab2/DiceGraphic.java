public class DiceGraphic extends Dice {
    String[] graphic = {" ", "⚀-1", "⚁-2", "⚂-3", "⚃-4", "⚄-5", "⚅-6"};
        
    /**
     * Provide a string representation of the object.
     */
    public String toString () {
        return graphic[roll()]; 
    }

}
