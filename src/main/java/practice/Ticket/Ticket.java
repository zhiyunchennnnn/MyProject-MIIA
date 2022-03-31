package practice.Ticket;

public class Ticket {
    Station start;
    Station destination;
    int quantity;
    public Ticket(Station start, Station destination,int quantity){
        this.start=start;
        this.destination=destination;
        this.quantity=quantity;
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
        return abs()*quantity;
    }
    public void print(){
        System.out.println(start.name+"-"+destination.name+", Quantity:"+quantity+", General Ticket,  Price:" +price());
    }
}
