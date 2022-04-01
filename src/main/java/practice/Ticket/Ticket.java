package practice.Ticket;

public class Ticket {
    Station start;
    Station destination;
    int quantity;
    public Ticket(Station start, Station destination){
        this.start=start;
        this.destination=destination;
    }

    public int abs (){
        return (start.id-destination.id)>0? (start.id-destination.id):-(start.id-destination.id);
        //int diff = Math,abs(100-300)
    }
    public int price(){
        return abs();
    }
    public void print(){
        System.out.println(start.name+"-"+destination.name+", General Ticket,  Price:" +price());
    }
}
