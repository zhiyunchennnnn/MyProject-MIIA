package practice.Ticket;

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

        System.out.println("How many general tickets do you need?");
        int number = Integer.parseInt(scanner.next());
        System.out.println("How many student's tickets do you need?");
        int studentnumber = Integer.parseInt(scanner.next());
        System.out.println("How many old man's tickets do you need?");
        int oldmannumber = Integer.parseInt(scanner.next());
        System.out.println("How many return tickets do you need?");
        int returnnumber = Integer.parseInt(scanner.next());

        Ticket ticket = new Ticket(start_Station,destination_Station,number);
        StudentTicket jane = new StudentTicket(start_Station,destination_Station,studentnumber);
        OldPeopleTicket bee = new OldPeopleTicket(start_Station,destination_Station,oldmannumber);
        ReturnTicket jack = new ReturnTicket(start_Station,destination_Station,returnnumber);
        ticket.print();
        jane.print();
        bee.print();
        jack.print();
        int total = ticket.price()+ jane.price()+bee.price()+ jack.price();
        System.out.println("Total: "+total);
    }
}
