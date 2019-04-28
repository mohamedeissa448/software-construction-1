package model;

import java.util.Random;

public class Coin {
  private String status;
  public Coin(){
    status="head";
  }
  //MODIFIES:this
  //EFFECTS: sets the coin's state to either heads or tails but returns nothing
  public void flip(){
    Random ran = new Random();
    boolean b=ran.nextBoolean();
    if (b){
      status="head";
    }
    else {
      status="tail";
    }
  }
  //EFFECTS:returns tail if coin status is tail and returns head if coin status is head
  public  String checkStatus(){return status;}
}
