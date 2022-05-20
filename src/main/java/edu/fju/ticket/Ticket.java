package edu.fju.ticket;

public class Ticket {
    Station start;
    Station destination;
    int quantity;
    public Ticket(Station start, Station destination){
        this.start=start;
        this.destination=destination;
        /*int diff = Math.abs(start.id-destination.id);
        System.out.println("diff:"+diff);
        switch (diff){
            case 100:
                price=500;
            case 200:
                price=600;
            case 300:
                price=1100;
        }*/
    }

    public int abs (){
        return (start.id-destination.id)>0? (start.id-destination.id)*quantity:-(start.id-destination.id)*quantity;
        //int diff = Math,abs(100-300)
    }
    public int total(){
        return abs();
    }
    public void print(){
        System.out.println(start.name+"-"+destination.name+", General Ticket,"+abs()+" Quantity"+quantity+" ,Total:"+total());
    }
}
