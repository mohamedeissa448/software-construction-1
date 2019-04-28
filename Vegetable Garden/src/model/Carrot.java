package model;

public class Carrot extends Vegetable {
    public Carrot() {
        super("Carrot", VegType.ROOT);
        super.setInstructions("Carrot instructions");

    }

    @Override
    public void feed() {
        System.out.println("feed carrot");
    }

    @Override
    public void water() {
        System.out.println("water carrot");

    }

    @Override
    public void harvest() {
        System.out.println("harvest carrot");

    }
}
