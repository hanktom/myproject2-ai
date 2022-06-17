package com.tom.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow {
    public static void main(String[] args) {
        //Graphical User Interace(GUI)
        //swing, JavaFX
        //eXtension
        JFrame frame = new JFrame();
        //Demo
        frame.setSize(400, 300);
        frame.setLocation(200, 200);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JButton button = new JButton("OK");
        //匿名類別 Anonymous class
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hello~~");
            }
        });
        System.out.println("Hello");
//        MyActionListener listener = new MyActionListener();
//        button.addActionListener(listener);
        frame.setLayout(new FlowLayout());
//        frame.setLayout(new BorderLayout());
        frame.add(button);

        //Layout
        frame.setVisible(true);
        System.out.println("END?");

    }
}
