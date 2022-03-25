package edu.fju.ticket;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        //Constructor,constant,value
        Ticket ticket = new Ticket(Station.TAIPEI_STATION,Station.TAICHUNG_STATION);
        Scanner scanner = new Scanner(System.in);
        Station_startstation = null;
        int startStation = Integer.getInteger(scanner.next());
        switch (startStation){
            case 1:
                Station_startstaion=Station.TAIPEI_STATION;
                break;
        }
    }
}
