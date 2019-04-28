package model;

public class Lettuce extends Vegetable {

    public Lettuce() {
        super("Lettuce", VegType.LEAF);
        super.setInstructions("Lettuce instructions");

    }

    @Override
    public void feed() {
        System.out.println("feed lettuce");

    }

    @Override
    public void water() {
        System.out.println("water lettuce");

    }

    @Override
    public void harvest() {
        System.out.println("harvest lettuce");

    }
}
