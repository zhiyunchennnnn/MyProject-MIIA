package practice.Ticket;

public class OldPeopleTicket extends Ticket{
    public OldPeopleTicket(Station start, Station destination, int quantity){
        super(start,destination,quantity);
    }
    @Override
    public int price(){
        return (abs()*50/100)*quantity;
    }
    @Override
    public void print(){
        System.out.println(start.name+"-"+destination.name+", Quantity:"+quantity+",  Old People Ticket, Price: "+price());
    }
}
