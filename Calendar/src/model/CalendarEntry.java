package model;

import org.hamcrest.core.Is;
import timing.Date;
import timing.Time;

public abstract class CalendarEntry {
    private Date date;
    private Time time;
    private String label;
    private boolean IsRepeated;
    private Time repetitionInterval;
    public CalendarEntry(Date d, Time t,String label){
        date=d;
        time=t;
        this.label=label;
        IsRepeated=false;
    }
    //getters
    public Date getDate(){return date;}
    public Time getTime(){return time;}
    public String getLabel(){return label;}
    public Time getRepetition(){return new Time("2","0"); }
    public boolean IsRepeating(){return IsRepeated;}
    //setters

    public void setRepetition(){
        IsRepeated=true;
        time.setTime("22","0");

    }


}
