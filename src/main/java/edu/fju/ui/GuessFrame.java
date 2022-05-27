package edu.fju.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessFrame extends JFrame {

    JButton button = new JButton("Hi");
    JLabel label = new JLabel("Zzzzz...");

    public GuessFrame(){

        super();
        setSize(600,400);
        setLocation(300,200);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Hello");
                label.setText("Hello!");
            }
        });

        setLayout(new FlowLayout());
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
