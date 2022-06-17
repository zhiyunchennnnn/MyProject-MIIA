package edu.fju.score;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ScoringFile {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("Scores");//throws
            BufferedReader reader = new BufferedReader(fileReader);
            String line = reader.readLine();
            while (line!=null){
//                System.out.println(line);
                String[] token=line.split(",");
                String name =token[0];
                int english = Integer.parseInt(token[1]);
                int math = Integer.parseInt(token[2]);
                Students stu = new Students(name,english,math);
                stu.print();
                line=reader.readLine();
            }
//            int data = fileReader.read();
//            while (data!=-1){
//                System.out.print((char) data);
//                data= fileReader.read();

        }catch (FileNotFoundException e ){
            System.out.println("");
        }catch (IOException i){
            System.out.println("");
        }
        System.out.println("Testing");
    }
}
