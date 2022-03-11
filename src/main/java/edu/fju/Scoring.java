package edu.fju;

public class Scoring {
    public static void main(String[] args) {
        Students candy = new Students("Candy",80,50);
        //candy.names="Candy";
        //candy.math=60;
        //candy.english=88;
        Students jack = new Students("Jack",60,85);
        Students s = new Students();
        candy.print();
        jack.print();
        s.print();
    }
}
