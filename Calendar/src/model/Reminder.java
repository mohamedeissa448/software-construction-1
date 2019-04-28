package model;

import model.CalendarEntry;
import timing.Date;
import timing.Time;

public class Reminder extends CalendarEntry {
    private String notes;
    public Reminder(Date d, Time t, String label) {
        super(d, t, label);
    }
    //Getters
    public String getNotes(){return notes;}
    //Setters
    public void setNotes(String notes){this.notes=notes;}
}
