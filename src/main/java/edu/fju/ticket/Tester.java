package edu.fju.ticket;

import java.util.Scanner;
import edu.fju.ticket.Station;

public class Tester {
    public static void main(String[] args) {
        //Constructor,constant,value
        System.out.println("Your start station?(1:Taipei , 2:Taichung , 3:Kaohsiung)");
        Scanner scanner = new Scanner(System.in);
        int startchoice = Integer.parseInt(scanner.next());
        Station start_Station = null;
        switch (startchoice){
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
        int destinationchoice = Integer.parseInt(scanner.next());
        Station destination_Station = null;
        switch (destinationchoice){
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
        TicketType type_Ticket = null;
        switch (tickettype) {
            case 1:
                type_Ticket = TicketType.GENERAL_TICKET;
                break;
            case 2:
                type_Ticket = TicketType.STUDENT_TICKET;
                break;
            case 3:
                type_Ticket = TicketType.ELDER_TICKET;
                break;
            case 4:
                type_Ticket = TicketType.RETURN_TICKET;
                break;
        }
        System.out.println("How many tickets do you need?");
        int number = Integer.parseInt(scanner.next());

        Ticket jane = new Ticket(start_Station,destination_Station,type_Ticket,number);
        Ticket bee = new Ticket(start_Station,destination_Station,type_Ticket,number);
        jane.print();
        bee.print();


    }
}
