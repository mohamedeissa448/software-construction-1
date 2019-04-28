package model;

public class Order {
    private int ticketNumber;
    private char comboId;
    private String name;
    private String status;
    private int price;
    private String instructions;
    public Order(int ticketNumber,char comboId,String name){
        this.ticketNumber=ticketNumber;
        this.comboId=comboId;
        this.name=name;
        status="Incomplete";
        instructions=null;
        setPrice();

    }
    //getters
    public String getStatus(){return status;}
    public int getTicketNumber(){return ticketNumber;}
    public String getName(){return name;}
    public char getComboId(){return comboId;}
    public String getInstructions(){return instructions;}
    public int getPrice(){return price;}

    //setters
    public void setStatus(Boolean status){
        if (status)
            this.status="Complete";
        else
            this.status="Incomplete";
    }
    private void setPrice(){
        switch (comboId){
            case 'A':
                price=100;
                break;
            case 'B':
                price=200;
                break;
            case 'C':
                price=300;
                break;
            case 'D':
                price=400;
                break;
            case 'E':
                price=500;
                break;

        }


    }
    //REQUIRES:instructions shouldnot be null,order not sent to kitchen
    //MODIFIES:this
    //EFFECTS:add instructions to order
   public void addInstructions(String instructions){this.instructions=instructions;}

    //EFFECTS:returns order to kitchen in format "ticketnumber:comboid-instructions:instructions"
    public String printTicketToKitchen(){return ticketNumber+":"+"\'"+comboId+"\'"+"-instructions:"+instructions;}
    //EFFECTS:returns transcript in format"ticketnumber,name:comboid-price:price"
    public String printCustomerRecipt(){return ticketNumber+","+name+":"+"\'"+comboId+"\'"+"-price:"+price;}

}
