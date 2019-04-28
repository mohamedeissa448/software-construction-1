package tests;

import model.CalendarEntry;
import model.Event;
import model.Reminder;
import org.junit.Before;
import org.junit.Test;
import timing.Date;
import timing.Time;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public abstract class EntryTest {
    CalendarEntry entry;Date d1;Time t1;

    @Test
    public void constructorTest(){
        assertEquals(entry.getDate(),d1);
        assertEquals(entry.getLabel(),"my birthday");
        assertEquals(entry.getTime(),t1);

    }
    @Test
    public void setRepetitionTest(){
        entry.setRepetition();
        assertTrue(entry.IsRepeating());
        assertEquals(entry.getRepetition().getTime(),"2:0");
        assertEquals(entry.getTime().getTime(),"22:0");
    }



}
