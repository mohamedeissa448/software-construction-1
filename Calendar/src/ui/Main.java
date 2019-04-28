package ui;

import model.Calendar;
import model.CalendarEntry;
import model.Event;
import model.Reminder;
import timing.Date;
import timing.Time;

public class Main {
    public static void main(String[] args) {
        Date d1=new Date("28","4","2019");
        Time t1=new Time("20","0");
        CalendarEntry event=new Event(d1,t1,"my birthday");
        Date d2=new Date("28","5","2019");
        Time t2=new Time("21","0");
        CalendarEntry meeting=new Event(d2,t2,"business meeting");
        //
        Date d3=new Date("27","4","2019");
        Time t3=new Time("20","0");
        CalendarEntry reminder1=new Reminder(d3,t3,"My Birthday Reminder");
        //
        Date d4=new Date("27","5","2019");
        Time t4=new Time("21","0");
        CalendarEntry reminder2=new Reminder(d3,t3,"My business meeting Reminder");
        //
        Calendar calendar=new Calendar("hamada@yahoo");
        calendar.addEntry(event);
        calendar.addEntry(meeting);
        calendar.addEntry(reminder1);
        calendar.addEntry(reminder2);
        System.out.println("soonest entry is:"+calendar.getSoonestByname());





    }
}
