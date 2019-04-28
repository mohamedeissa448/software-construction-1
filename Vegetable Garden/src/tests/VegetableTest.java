package tests;

import model.VegType;
import model.Vegetable;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public abstract class VegetableTest {
    Vegetable vegetableTest;
    @Test
    public void allTests() {
        switch (vegetableTest.getType()){
            case LEAF:
                assertEquals(vegetableTest.getName(),"Lettuce") ;
                assertEquals(vegetableTest.getInstructions(), "Lettuce instructions") ;
                vegetableTest.setName("Lettuce new name");
                assertEquals(vegetableTest.getName(),"Lettuce new name") ;
                break;
            case ROOT:
                assertEquals(vegetableTest.getName(),"Carrot") ;
                assertEquals(vegetableTest.getInstructions(), "Carrot instructions") ;
                vegetableTest.setName("Carrot new name");
                assertEquals(vegetableTest.getName(),"Carrot new name") ;
                break;
            case SEED:
                assertEquals(vegetableTest.getName(),"Tomato") ;
                assertEquals(vegetableTest.getInstructions(), "Tomato instructions") ;
                vegetableTest.setName("Tomato new name");
                assertEquals(vegetableTest.getName(),"Tomato new name") ;
                break;
    }
    }
}
