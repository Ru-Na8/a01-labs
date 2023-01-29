public class DiceGraphicCheating {

    private Dice dice;

    public DiceGraphicCheating() {
        this.dice = new Dice();
    }

    // roll of the dice to a specific value
    public Dice setRoll(int value) {
        this.dice.setValue(value);
        return this.dice;
    }

    // get the graphic representation of the dice value
    public String getGraphicValue(int value) {
        switch (value) {
            case 1:
                return "⚀-1";
            case 2:
                return "⚁-2";
            case 3:
                return "⚂-3";
            case 4:
                return "⚃-4";
            case 5:
                return "⚄-5";
            case 6:
                return "⚅-6";
            default:
                return " ";
        }
    }

    public static void main(String[] args) {
        DiceGraphicCheating graphic = new DiceGraphicCheating();
        Dice dice = graphic.dice;

        dice.roll();
        System.out.println("Rolled Dice value: " + graphic.getGraphicValue(dice.getValue()));

        graphic.setRoll(4);
        System.out.println("Cheated Dice value: " + graphic.getGraphicValue(dice.getValue()));
    }
}
