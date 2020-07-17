package com.swing;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class 上下左右 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();

        jFrame.setSize(450,500);

        jFrame.setLocation(40,40);

        jFrame.setLayout(null);

        final JLabel label = new JLabel();

        ImageIcon imageIcon = new ImageIcon("C:\\Users\\yue\\Desktop\\shana.png");

        label.setIcon(imageIcon);
        label.setBounds(100,51,imageIcon.getIconWidth(),imageIcon.getIconHeight());

        jFrame.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                //上 38
                if (e.getKeyCode()==38){
                    label.setLocation(label.getX(),label.getY()-10);
                }
                //下 40
                if (e.getKeyCode()==40){
                    label.setLocation(label.getX(),label.getY()+10);
                }
                //左 37
                if (e.getKeyCode()==37){
                    label.setLocation(label.getX()-10,label.getY());
                }
                //右 39
                if (e.getKeyCode()==39){
                    label.setLocation(label.getX()+10,label.getY());
                }

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
        jFrame.add(label);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jFrame.setVisible(true);
    }
}
