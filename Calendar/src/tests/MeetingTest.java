package tests;

import model.Event;
import model.Meeting;
import org.junit.Before;
import org.junit.Test;
import timing.Date;
import timing.Time;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MeetingTest extends EntryTest {
    Meeting m;
    List<String>emails;
    @Before
    public void setup() {
        d1 = new Date("28", "4", "2019");
        t1 = new Time("20", "0");
        entry = new Meeting(d1, t1, "my birthday");
        m = new Meeting(d1, t1, "my birthday");
        emails=new ArrayList<>();
    }
    @Test
    public void AddAttendenceEmailTest(){
        m.AddAttendenceEmail("ahmed@yahoo.com");
        m.AddAttendenceEmail("mohamed@yahoo.com");
        emails.add("ahmed@yahoo.com");
        emails.add("mohamed@yahoo.com");
        assertTrue(m.getAttendencesEmail().equals(emails));
        assertEquals(m.getAttendencesEmail().size(),emails.size());
        m.RemoveAttendenceEmail("zanofa@");
        assertTrue(m.getAttendencesEmail().equals(emails));
        assertEquals(m.getAttendencesEmail().size(),emails.size());
        m.RemoveAttendenceEmail("mohamed@yahoo.com");
        emails.remove("mohamed@yahoo.com");
        assertTrue(m.getAttendencesEmail().equals(emails));
        assertEquals(m.getAttendencesEmail().size(),emails.size());
    }

}
