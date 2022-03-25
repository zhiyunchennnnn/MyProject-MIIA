package edu.fju.score;

public class ScoringNG {
    public static void main(String[] args) {
        String []names= {"Apple","Candy","Jane","Been","Cindy"};
        int[]math={90,60,50,65,77};
        int[]english={80,88,45,66,99};
        for (int i = 0; i <5 ; i++) {
            if (i!=3) {
                System.out.println(names[i] + " " + math[i] + " " + english[i] + " " + (math[i] + english[i]) / 2);
            }
        }
    }
}
