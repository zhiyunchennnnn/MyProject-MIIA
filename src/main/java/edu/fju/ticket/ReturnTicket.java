package edu.fju.ticket;

public class ReturnTicket extends StudentTicket{
    public ReturnTicket(Station start, Station destination){
        super(start,destination);
    }
    @Override
    public int total(){
        return (abs()*2)*90/100;
    }
    @Override
    public void print(){
        System.out.println(start.name+"-"+destination.name+",  Return Ticket, Price: "+total());
    }
}
