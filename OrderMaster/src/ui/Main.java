package ui;

import model.Order;

public class Main {
    public static void main(String[] args) {
        Order order1=new Order(1,'A',"Mohamed Eissa");
        Order order2=new Order(2,'B',"Maha Eissa");

        order1.addInstructions("make it spicy!");
        order1.printTicketToKitchen();
        order1.setStatus(true);
        order2.setStatus(false);
        System.out.println(order2.printTicketToKitchen());
        System.out.println(order1.printCustomerRecipt());
    }
}
