package edu.fju;

public class Students {
    String names;
    int math;
    int english;
    public Students(String names) {
        this.names=names;
    }
    public Students(String names,int math,int english){
        this(names);
        //this.names=names;
        this.math=math;
        this.english=english;
    }
    public Students(){
        this("John",60,50);
    }
    public void print(){
        int average = (math+english)/2;
        System.out.print(names+" "+math+" "+english+" "+average);
        if (average<60){
            System.out.print("*");
        }
        System.out.println();
    }
}
