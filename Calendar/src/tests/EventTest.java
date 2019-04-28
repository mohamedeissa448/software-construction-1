package tests;

import model.Event;
import model.Reminder;
import org.junit.Before;
import org.junit.Test;
import timing.Date;
import timing.Time;

import static org.junit.Assert.assertEquals;

public class EventTest extends EntryTest{
    Reminder reminder;Event event;
    Date d2;
    Time t2;
    //
    @Before
    public void setup(){
        d1=new Date("28","4","2019");
        t1=new Time("20","0");
        entry=new Event(d1,t1,"my birthday");
        event=new Event(d1,t1,"my birthday");
        d2=new Date("27","4","2019");
        t2=new Time("20","0");
        reminder=new Reminder(d2,t2,"my birthday reminder");
    }

    @Test
    public void setReminderTest(){
       assertEquals(event.getReminder(),null);
       event.setReminder(reminder);
       assertEquals(event.getReminder(),reminder);
    }
}
