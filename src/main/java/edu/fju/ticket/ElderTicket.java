package edu.fju.ticket;

public class ElderTicket extends StudentTicket{
    public ElderTicket(Station start, Station destination){
        super(start,destination);
    }
    @Override
    public int total(){
        return (abs()*50/100);
    }
    @Override
    public void print(){
        System.out.println(start.name+"-"+destination.name+",  Old People Ticket, Price: "+total());
    }
}
