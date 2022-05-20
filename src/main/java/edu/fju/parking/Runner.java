package edu.fju.parking;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

public class Runner {
    public static void main(String[] args) {
        String enterTime = "08:00";
        String exitTime = "11:15";
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        Date d = null;
        try {
             d = sdf.parse(enterTime);
        }catch (Exception e ){
            System.out.println("Error");
        }
        System.out.println(d);
        System.out.println(d.getTime());
        //long ms =3*60*60*1000;
        try {
            Date d2 =sdf.parse(exitTime);
            System.out.println(d2);
            System.out.println(d2.getTime());
            int mins = (int)(d2.getTime()- d.getTime())/1000/60;
            System.out.println(mins);
            if (mins%60>=15){
                int fee = 30*(mins/60)+30;
                System.out.println("Fee:"+fee);
            }else if (mins%60<=15){
                int fee = 30*(mins/60);
                System.out.println("Fee:"+fee);
            }
        }catch (Exception e){
            System.out.println("Error");
        }
        //d2.setTime(d.getTime()+ms);
    }
}
