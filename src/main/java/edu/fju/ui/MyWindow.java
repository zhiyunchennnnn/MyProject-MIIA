package edu.fju.ui;

import edu.fju.parking.Runner;
import practice.Ticket.Ticket;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow {
    public static void main(String[] args) {
        //swing,SWT,javaFX
        JFrame frame =new JFrame();
        frame.setSize(600,400);
        frame.setLocation(100,100);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //add component
        JButton button = new JButton("ok");
        //Anonymous class
        /*MyActionListener listener=new MyActionListener();
        button.addActionListener(listener);*/
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("hahahaha");
            }
        });
        //layout
        //frame.setLayout(new BorderLayout());
        frame.setLayout(new FlowLayout());
        frame.add(button);

        frame.setVisible(true);
        System.out.println("END?");
    }
}
