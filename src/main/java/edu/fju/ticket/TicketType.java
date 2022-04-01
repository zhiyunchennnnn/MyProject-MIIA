package edu.fju.ticket;

public class TicketType {
    public static final TicketType GENERAL_TICKET=new TicketType(1,"General ticket");
    public static final TicketType STUDENT_TICKET=new TicketType(8/10,"Student ticket");
    public static final TicketType ELDER_TICKET=new TicketType(5/10,"Elder ticket");
    public static final TicketType RETURN_TICKET=new TicketType(9/10,"Return ticket");

    String type;
    int id ;
    public TicketType(int id ,String type){
        this.id = id;
        this.type = type;

    }
}
