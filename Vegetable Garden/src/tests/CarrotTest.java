package tests;

import model.Carrot;
import org.junit.Before;

public class CarrotTest extends VegetableTest {

        @Before
        public void setup() {
            vegetableTest = new Carrot();
        }
}
