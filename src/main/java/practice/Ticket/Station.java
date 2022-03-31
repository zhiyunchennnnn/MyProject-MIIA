package practice.Ticket;

public class Station {
    public static final Station TAIPEI_STATION=
            new Station(0,"Taipei");
    public static final Station TAICHUNG_STATION=
            new Station(600,"Taichung");
    public static final Station KAOHSIUNG_STATION=
            new Station(1500,"Kaohsiung");
    int id;
    String name;
    public Station(int id,String name){
        this.id=id;
        this.name=name;
    }
}
