package tests;

import model.Order;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class OrderTest {
    Order orderTest;
    @Before
    public void setup(){
        orderTest=new Order(100,'C',"zanofa");
    }
    @Test
    public void constructorTest(){
        assertEquals(orderTest.getComboId(),'C');
        assertEquals(orderTest.getName(),"zanofa");
        assertEquals(orderTest.getTicketNumber(),100);
    }
    @Test
    public void settersTest(){
        orderTest.setStatus(true);
        assertEquals(orderTest.getStatus(),"Complete");
    }
    @Test
    public void addInstructionsTest(){
        orderTest.addInstructions("Don't use salt!");
        assertEquals(orderTest.getInstructions(),"Don't use salt!");
    }
    @Test
    public void printTicketToKitchenTest(){
        orderTest.addInstructions("Don't use salt!");
        assertEquals(orderTest.printTicketToKitchen(),"100:'C'-instructions:Don't use salt!");
    }
    @Test
    public void printCustomerReciptTest(){
        assertEquals(orderTest.printCustomerRecipt(),"100,zanofa:'C'-price:300");
        assertEquals(orderTest.getPrice(),300);
    }


}
