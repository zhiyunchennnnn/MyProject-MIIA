package edu.fju.ticket;

public class StudentTicket extends Ticket{
   // float off = 0.1f;
    public StudentTicket(Station start, Station destination){
        super(start,destination);
        //price =price-(int)(price*off)
    }
    @Override
    public int total(){
        return (abs()*9/10);
    }
    @Override
    public void print(){
        System.out.println(start.name+"-"+destination.name+",  Student Ticket, Price: "+total());
    }
}
