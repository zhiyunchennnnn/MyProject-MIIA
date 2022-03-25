package edu.fju.score;

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
        System.out.print(names+" "+math+" "+english+" "+ getAverage());
        if ( getAverage()<60){
            System.out.print("*");
        }
        System.out.println();
    }
    public int getAverage(){
        return (math+english)/2;
    }
}
