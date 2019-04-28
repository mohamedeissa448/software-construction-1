package model;

import java.lang.ref.PhantomReference;
import java.util.ArrayList;
import java.util.List;

public class Band {
    private String name;
    private List<String> members;
    private double currentMoney;
    private double totalMoney;
    private int numOfSHOWS;
    public Band(String  name){
        this.name=name;
        currentMoney=0;
        totalMoney=0;
        members=new ArrayList<>();
    }
    //getters
    public String getName(){return name;}
    public List<String> getMembers(){return members;}
    public double getTotalMoney(){return totalMoney;}
    public double getCurrentMoney(){return currentMoney;}
    public int getNumOfShows(){return numOfSHOWS;}
    public void setName(String name){
        this.name=name;
    }
    //MODIFIES:this
    //EFFECTS:add member to member list of band if it is not there.if not,does nothing
    public void addMember(String member){
        if (!members.contains(member))
            members.add(member);
    }
    //MODIFIES:this
    //EFFECTS:remove member from member list of band if it is there.if not,does nothing
    public void removeMember(String member){
        if (members.contains(member))
            members.remove(member);
    }
    //MODIFIES:this
    //EFFECTS:add 1 to number of played shows and add money parameter to total money and  to current money
    public void playShow(double money){
        numOfSHOWS++;
        currentMoney+=money;
        totalMoney+=money;
    }
    //MODIFIES:this
    //EFFECTS:reduce current money by 10%percentage
    public void payMoneyToAssistants(){
        currentMoney=0.9*currentMoney;
    }
    //REQUIRES:donot call it before you call method above
    //MODIFIES:this
    //EFFECTS:reduces current money by the amount of money parameter
    public void payMoneyToMembers(double money){
        if (currentMoney>money){
            currentMoney-=money;
        }
    }
    //Effects:returns averageMoneyPerSHOW
    public double averageMoneyPerSHOW(){return  totalMoney/numOfSHOWS;}
}
