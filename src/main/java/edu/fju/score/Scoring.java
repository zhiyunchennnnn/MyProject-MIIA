package edu.fju.score;

import java.util.ArrayList;
import java.util.List;

public class Scoring {
    public static void main(String[] args) {
        List<Students> students = new ArrayList<>();
        students.add(new Students("Candy",80,50));
        students.add(new Students("Jack",60,85));
        students.add(new GraduateStudent("Jane",80,50,66));
        //candy.names="Candy";
        //candy.math=60;
        //candy.english=88;
        for (Students s :students) {
            s.print();
        }
    }
}
