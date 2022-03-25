package edu.fju.score;

public class GraduateStudent extends Students{
    int thesis;
    /*public GraduateStudent(){
        super("Jane",60,72);
    }*/
    public GraduateStudent(String name, int math,int english,int thesis){
        super(name,math,english);
        this.thesis=thesis;
    }

    @Override
    public void print(){
        System.out.println(names+" "+math+" "+english+" "+ getAverage()+" "+thesis);
    }
}
