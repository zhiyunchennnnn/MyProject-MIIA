package practice.Ticket;

public class ReturnTicket extends Ticket{
    public ReturnTicket(Station start, Station destination, int quantity){
        super(start,destination,quantity);
    }
    @Override
    public int price(){
        return (abs()*quantity)*90/100;
    }
    @Override
    public void print(){
        System.out.println(start.name+"-"+destination.name+", Quantity:"+quantity+",  Return Ticket, Price: "+price());
    }
}
