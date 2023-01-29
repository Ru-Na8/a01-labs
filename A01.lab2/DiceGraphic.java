public class DiceGraphic extends Dice {
    // array getGraphic representation of the dice values
    String[] getGraphic = { " ", "⚀-1", "⚁-2", "⚂-3", "⚃-4", "⚄-5", "⚅-6" };

    public String toString() {
        return getGraphic[value];
    }

}
