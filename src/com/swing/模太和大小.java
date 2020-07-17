package com.swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class 模太和大小 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setSize(800,600);
        jFrame.setLocation(50,50);
        jFrame.setLayout(null);



        JButton jButton = new JButton("打开一个模糊窗口");
        jButton.setBounds(150,50,150,20);


        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JDialog jDialog = new JDialog(jFrame);
                jDialog.setModal(true);
                jDialog.setSize(400, 400);
                jDialog.setLocation(150, 150);
                jDialog.setLayout(null);
                JButton jButton1 = new JButton("大小不可变");
                jButton1.setBounds(100,100,100,20);
                jButton1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (jButton1.getText().equals("大小不可变")){
                            jFrame.setResizable(false);
                            jButton1.setText("大小可变");
                        }else{
                            jFrame.setResizable(true);
                            jButton1.setText("大小不可变");
                        }

                }
                });
                jDialog.add(jButton1);
                jDialog.setVisible(true);
            }
        });


        jFrame.add(jButton);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}
