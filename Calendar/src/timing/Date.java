package timing;

public class Date {
    private String day;
    private String month;
    private String year;
    //REQUIRES:d between 1 and 31.month between 1 and 12.
    public Date(String d,String m,String y){
        day=d;
        month=m;
        year=y;
    }
    public String getShortDate(){
        return month+"/"+day+"/"+year;
    }
    public String getLongerDate(){
        return calculateMonth()+day+","+year;
    }
    private String calculateMonth(){
        switch (month){
            case "1":
                return "January";
            case "2":
                return "February";
            case "3":
                return "March";
            case "4":
                return "April";
            case "5":
                return "May";
            case "6":
                return "June";
            case "7":
                return "July";
            case "8":
                return "August";
            case "9":
                return "September";
            case "10":
                return "October";
            case "11":
                return "November";
            case "12":
                return "December";
            default:
                return "Wrong Entry";
        }

    }

}
