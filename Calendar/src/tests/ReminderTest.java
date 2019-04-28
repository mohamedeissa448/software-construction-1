package tests;

import model.Event;
import model.Reminder;
import org.junit.Before;
import org.junit.Test;
import timing.Date;
import timing.Time;

import static org.junit.Assert.assertEquals;

public class ReminderTest  extends EntryTest{
    Reminder r;
    @Before
    public void setup() {
        d1 = new Date("28", "4", "2019");
        t1 = new Time("20", "0");
        entry = new Reminder(d1, t1, "my birthday");
        r = new Reminder(d1, t1, "my birthday");

    }
    @Test
    public void setNotesTest(){
        r.setNotes("Be happy!");
        assertEquals(r.getNotes(),"Be happy!");
    }
}
