package model;

public class Tomato extends Vegetable {
    public Tomato() {
        super("Tomato", VegType.SEED);
        super.setInstructions("Tomato instructions");
    }

    @Override
    public void feed() {
        System.out.println("feed tomato");

    }

    @Override
    public void water() {
        System.out.println("water tomato");

    }

    @Override
    public void harvest() {
        System.out.println("harvest tomato");

    }
}
