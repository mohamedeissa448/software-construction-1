package model;

import timing.Time;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Calendar {
    private DateFormat date;
    private String email;
    private List<CalendarEntry> entries;
    public Calendar(String email){
        date = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date1 = new Date();
        date.format(date1);
        this.email=email;
        entries=new ArrayList<>();
    }
    //getters
    public String getEmail(){return email;}
    public DateFormat getDate(){return date;}
   // public List<CalendarEntry> getEntries(){return new Event(new Date(),new Time("12","33"),"");}
    public String getSoonestByname(){return "";}
    //MODIFIES:this
    //EFFECTS:add entry to collection of entries if not there.if there,does nothing.
    public void addEntry(CalendarEntry entry){
        if (!entries.contains(entry))
            entries.add(entry);
    }
    //MODIFIES:this
    //EFFECTS:removes entry from collection of entries if it is there.if not,does nothing.
    public void removeEntry(CalendarEntry entry){
        if (entries.contains(entry))
            entries.remove(entry);
    }
}
