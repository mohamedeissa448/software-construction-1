package application;

import model.Band;

public class Main {
    public static void main(String[] args) {
        Band band=new Band("HOHO");
        band.addMember("Homosa");
        band.addMember("Ahmed");
        band.addMember("Hooda");
        band.playShow(100);
        band.playShow(200);
        band.playShow(300);
        band.payMoneyToAssistants();
        band.payMoneyToMembers(400);
        System.out.println(band.averageMoneyPerSHOW());
        band.removeMember("Ahmed");


    }
}
