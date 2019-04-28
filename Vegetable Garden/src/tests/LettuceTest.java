package tests;

import model.Lettuce;
import org.junit.Before;
import org.junit.Test;

public class LettuceTest extends VegetableTest {
    @Before
    public void setup() {
        vegetableTest = new Lettuce();
    }
}
