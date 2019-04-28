package model;

import timing.Date;
import timing.Time;

public class Event extends CalendarEntry {
    private Reminder reminder;
    public Event(Date d, Time t, String label) {
        super(d, t, label);
    }
    //Getters
    public Reminder getReminder(){return reminder;}
    //Setters
    public void setReminder(Reminder r){
        reminder=r;
    }

}
