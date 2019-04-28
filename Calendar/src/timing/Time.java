package timing;

public class Time {
    String hour;
    String minute;
    //REQUIRES:time in 24 hours format
    public Time(String h,String m){
        hour=h;
        minute=m;
    }
    public String getTime(){
           return hour+":"+minute;
    }
    public void setTime(String h,String m){
        hour=h;
        minute=m;
    }
}
