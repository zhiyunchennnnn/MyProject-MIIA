package edu.fju.ticket;

public class Ticket {
    /*public static final int TAIPEI_STATION =100;
    public static final int TAICHUNG_STATION =200;
    public static final int KAOHSIUNG_STATION =300;
    */
    Station start;
    Station destination;
    TicketType ticket;
    int quantity;

    public Ticket(Station start, Station destination, TicketType ticket,int quantity){
        this.start=start;
        this.destination=destination;
        this.quantity=quantity;
        this.ticket=ticket;
    }
    /*public int total() {
        if (start.id == 0) {
            if (destination.id == 600) {
                 price=600;
            }else {
                 price=1500;
            }
        }else if (start.id==600){
            if (destination.id==0){
                 price=600;
            }else {
                 price=900;
            }
        }else if (start.id==900){
            if (destination.id==0){
                 price=1500;
            }else {
                 price=900;
            }
        }
        return price;
    }*/

    public int abs (){
        return (start.id-destination.id)>0? (start.id-destination.id):-(start.id-destination.id);
    }
    public int price(){
        return abs()*quantity*ticket.id;
    }
    public void print(){
        System.out.println(start.name+"-"+destination.name+" "+ticket.name+", Quantity:"+quantity+",  Price:" +price());
    }
}
