package model;

public abstract class Vegetable implements Growable{
    private String name;
    private String instructions;
    private VegType type;
    //a constructor that takes two parameters: String name, VegType type
    public Vegetable(String nm,VegType type){
        name=nm;
        this.type=type;
        instructions=null;
    }
    public String getName(){return name;}
    public void setName(String name){this.name=name;}
    public String getInstructions() {return instructions;}
    protected void setInstructions(String instructions){this.instructions=instructions;}
    public VegType getType(){return type;}


}
