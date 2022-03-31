package practice.Ticket;

public class StudentTicket extends Ticket{
    public StudentTicket(Station start, Station destination, int quantity){
        super(start,destination,quantity);
    }

    @Override
    public int price(){
        return (abs()*80/100)*quantity;
    }
    @Override
    public void print(){
        System.out.println(start.name+"-"+destination.name+", Quantity:"+quantity+",  Student Ticket, Price: "+price());
    }
}
