package practice.Ticket;

public class OldPeopleTicket extends Ticket{
    public OldPeopleTicket(Station start, Station destination){
        super(start,destination);
    }
    @Override
    public int price(){
        return (abs()*50/100);
    }
    @Override
    public void print(){
        System.out.println(start.name+"-"+destination.name+",  Old People Ticket, Price: "+price());
    }
}
