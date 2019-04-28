package model;

import timing.Date;
import timing.Time;

import java.util.ArrayList;
import java.util.List;

public class Meeting extends Event {
    private List<String>emails;
    public Meeting(Date d, Time t, String label) {
        super(d, t, label);
        emails=new ArrayList<>();
    }
    //getters
    public List<String> getAttendencesEmail(){return emails; }
    //REQUIRES:email not null and valid
    //MODIFIES:this
    //EFFECTS:consumes email param and adds it to list of email if not there.if it is already exist,does nothing
    public void AddAttendenceEmail(String email){
        if (!emails.contains(email))
            emails.add(email);
    }
    //MODIFIES:this
    //EFFECTS:consumes email param and removes it to list of email if it is there.if not already exist,does nothing
    public void RemoveAttendenceEmail(String email){
        if (emails.contains(email))
            emails.remove(email);
    }
    //EFFECTS:for each email stored,it prints "inviting ..."
    public void sendInvitations(){
       for (String s:emails){
           System.out.println("Inviting:"+s);
       }
    }
}
