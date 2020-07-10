package org.jeecg.ThreadTest5;

public class MainTest {

    public static void main(String[] args) {
        TicketStation ticketStation =new TicketStation("一号售票站");
        TicketStation ticketStation2 =new TicketStation("二号售票站");
        TicketStation ticketStation3=new TicketStation("三号售票站");
         ticketStation.start();
         ticketStation2.start();
         ticketStation3.start();

    }
}
