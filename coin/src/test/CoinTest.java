package test;

import model.Coin;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static junit.framework.TestCase.fail;

public class CoinTest {
    Coin c;
    @Before
    public void setup(){
        c=new Coin();
   }
    @Test
    public void flipTest(){
        String before,after;int suspect=0;
         ArrayList<Integer> mylist= new ArrayList<Integer>();
        for(int i=0;i<100;i++){
           before= c.checkStatus();
            c.flip();
           after= c.checkStatus();
           if (after==before){
               suspect++;
           }
           else {
               suspect = 0;
           }
           if (suspect==6){
               mylist.add(6);
           }
        }
        if(mylist.contains(6)&&mylist.size()>3){
            fail();
        }

    }

}
