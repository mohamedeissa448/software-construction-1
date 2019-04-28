package tests;

import model.Band;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BandTest {
    Band bandTest;
    List<String>members;
    @Before
    public void setup(){
        bandTest=new Band("Rock");
        members=new ArrayList<>();

    }
    @Test
    public void constructorAndSettersTest(){
        assertEquals("Rock",bandTest.getName());

    }
    @Test
    public void addRemoveMembersTest(){
        assertTrue(members.equals(bandTest.getMembers()));
        bandTest.addMember("James");
        bandTest.addMember("Tom");
        members.add("James");
        members.add("Tom");
        assertTrue(members.equals(bandTest.getMembers()));
        assertEquals(members.size(),bandTest.getMembers().size());
        bandTest.removeMember("ahmed");
        assertEquals(members.size(),bandTest.getMembers().size());
        members.remove("Tom");
        bandTest.removeMember("Tom");
        assertEquals(members.size(),bandTest.getMembers().size());
        assertTrue(members.equals(bandTest.getMembers()));
        bandTest.addMember("James");
        assertTrue(members.equals(bandTest.getMembers()));
        assertEquals(members.size(),bandTest.getMembers().size());
    }
    @Test
    public void playshowTest(){
        bandTest.playShow(1000);
        assertEquals(1,bandTest.getNumOfShows());
        assertEquals(1000,bandTest.getCurrentMoney(),0.01);
        assertEquals(1000,bandTest.getTotalMoney(),0.01);
        bandTest.payMoneyToAssistants();
        assertEquals(900,bandTest.getCurrentMoney(),0.01);
        assertEquals(1000,bandTest.getTotalMoney(),0.01);
        bandTest.payMoneyToMembers(1900);
        assertEquals(900,bandTest.getCurrentMoney(),0.01);
        bandTest.payMoneyToMembers(800);
        assertEquals(100,bandTest.getCurrentMoney(),0.01);
        assertEquals(1000,bandTest.getTotalMoney(),0.01);
        bandTest.playShow(1000);

        assertEquals(1000,bandTest.averageMoneyPerSHOW(),0.01);



    }
}
