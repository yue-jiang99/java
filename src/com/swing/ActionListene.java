package com.swing;

import javax.swing.*;
import java.awt.event.*;
import java.util.Random;

public class ActionListene {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();

        jFrame.setSize(4000,5000);

        jFrame.setLocation(10,20);

        jFrame.setLayout(null);

        final JLabel label = new JLabel();

        ImageIcon imageIcon = new ImageIcon("C:\\Users\\yue\\Desktop\\截图\\20200616113158.png");

        label.setIcon(imageIcon);
        label.setBounds(100,50,imageIcon.getIconWidth(),imageIcon.getIconHeight());

/*        JButton jButton = new JButton("隐藏");
        jButton.setBounds(150,200,100,30);*/

/*        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setVisible(false);
            }
        });*/
/*          键盘监听
            jFrame.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {


            }

            @Override
            public void keyReleased(KeyEvent e) {
                if (e.getKeyCode()==39){
                    label.setLocation(label.getX()+100,label.getY());
                }
            }
        });*/
        //鼠标监听
        jFrame.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                Random random =new Random();
                int x = random.nextInt(jFrame.getWidth()-label.getWidth());
                int y = random.nextInt(jFrame.getHeight()-label.getHeight());
                label.setLocation(x,y);
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        jFrame.add(label);
/*        jFrame.add(jButton);*/

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jFrame.setVisible(true);

    }
}