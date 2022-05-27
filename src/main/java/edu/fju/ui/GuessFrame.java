package edu.fju.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GuessFrame extends JFrame {

    JButton button = new JButton("Guess");
    JLabel label = new JLabel("");
    JTextField number = new JTextField(8);
    Random r = new Random(10);
    int secret = r.nextInt();

    public GuessFrame(){
        super();
        setSize(600,400);
        setLocation(300,200);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
//                System.out.println("Hello");
//                label.setText("Hello!");
                System.out.println(secret);

                    int num = Integer.parseInt(number.getText());
                System.out.println(number);
                    if (num>secret){
                        label.setText("Smaller");
                    }else if (num<secret){
                        label.setText("Bigger");
                    }else {
                        label.setText("Bingo,the secret is"+secret);

                    }
                }

        });
        setLayout(new FlowLayout());
        add(number);
        add(button);
        add(label);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        GuessFrame guess = new GuessFrame();
//        guess.setSize(600,400);
//        guess.setVisible(true);
    }
}
