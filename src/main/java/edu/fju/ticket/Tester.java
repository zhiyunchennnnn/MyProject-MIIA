package edu.fju.ticket;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        //Constructor,constant,value
        System.out.println("Your start station?(1:Taipei , 2:Taichung , 3:Kaohsiung)");
        Scanner scanner = new Scanner(System.in);
        int startStation = Integer.parseInt(scanner.next());
        Station start_Station = null;
        switch (startStation){
            case 1:
                start_Station=Station.TAIPEI_STATION;
                break;
            case 2:
                start_Station=Station.TAICHUNG_STATION;
                break;
            case 3:
                start_Station=Station.KAOHSIUNG_STATION;
                break;
            default:
                break;

        }
        System.out.println("Your destination station?(1:Taipei , 2:Taichung , 3:Kaohsiung)");
        int destinationStation = Integer.parseInt(scanner.next());
        Station destination_Station = null;
        switch (destinationStation){
            case 1:
                destination_Station=Station.TAIPEI_STATION;
                break;
            case 2:
                destination_Station=Station.TAICHUNG_STATION;
                break;
            case 3:
                destination_Station=Station.KAOHSIUNG_STATION;
                break;
            default:
                break;

        }
        System.out.println("What kind of ticket do you want? (1:General, 2:Student, 3:Elder, 4:Return)");
        int tickettype = Integer.parseInt(scanner.next());
        Ticket ticket = null;
        switch (tickettype) {
            case 1:
                ticket = new Ticket(start_Station,destination_Station);
                break;
            case 2:
                ticket = new StudentTicket(start_Station,destination_Station);
                break;
            case 3:
                ticket = new ElderTicket(start_Station,destination_Station);
                break;
            case 4:
                ticket = new ReturnTicket(start_Station,destination_Station);
                break;
            default:
                break;
        }
        System.out.println("How much ticket do you need?");
        int  number =Integer.parseInt(scanner.next());
        ticket.quantity=number;


        //System.out.println("How many ticket do you need?");
        //int number = Integer.parseInt(scanner.next());
        ticket.print();
    }
}
