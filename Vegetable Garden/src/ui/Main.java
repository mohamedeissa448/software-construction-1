package ui;

import model.Carrot;
import model.Lettuce;
import model.Tomato;
import model.Vegetable;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vegetable> garden = new ArrayList();
        garden.add(new Carrot());
        garden.add(new Tomato());
        garden.add(new Lettuce());
        garden.get(0).feed();
        garden.get(0).water();
        garden.get(0).harvest();
        garden.get(1).feed();
        garden.get(1).water();
        garden.get(1).harvest();
        garden.get(2).feed();
        garden.get(2).water();
        garden.get(2).harvest();

    }
}
