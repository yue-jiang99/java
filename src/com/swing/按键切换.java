package com.swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class 按键切换 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();

        jFrame.setSize(400,500);

        jFrame.setLocation(10,20);

        jFrame.setLayout(null);

        final JLabel label = new JLabel();

        ImageIcon imageIcon = new ImageIcon("C:\\Users\\yue\\Desktop\\shana.png");

        label.setIcon(imageIcon);
        label.setBounds(100,50,imageIcon.getIconWidth(),imageIcon.getIconHeight());

        JButton jButton = new JButton("隐藏");
        jButton.setBounds(150,200,100,30);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jButton.getText().equals("隐藏")){
                    label.setVisible(false);
                    jButton.setText("显示");
                }else{
                    label.setVisible(true);
                    jButton.setText("隐藏");
                }
            }
        });


        jFrame.add(label);
        jFrame.add(jButton);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jFrame.setVisible(true);

    }
}
