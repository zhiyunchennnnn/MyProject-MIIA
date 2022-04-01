package practice.Ticket;

public class ReturnTicket extends Ticket{
    public ReturnTicket(Station start, Station destination){
        super(start,destination);
    }
    @Override
    public int price(){
        return (abs()*2)*90/100;
    }
    @Override
    public void print(){
        System.out.println(start.name+"-"+destination.name+",  Return Ticket, Price: "+price());
    }
}
