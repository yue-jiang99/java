package com.swing;

import javax.swing.*;
import java.awt.*;
import java.io.*;

public class Test {

    public static Point getPoint(){
        File file = new File("G:\\java\\jiluxy.txt");
        Point point = null;

        try {
            FileInputStream f = new FileInputStream(file);
            DataInputStream di = new DataInputStream(f);
            int x = di.readInt();
            int y =di.readInt();
            point = new Point();
            point.x = x;
            point.y = y;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return point;

    }
    public static void main(String[] args) {

        JFrame jFrame = new JFrame("lol");

        jFrame.setSize(400,300);

        Point point = getPoint();

        if (point!=null){
            jFrame.setLocation(point.x,point.y);
        }else{
            jFrame.setLocation(100,200);
        }

        jFrame.setLayout(null);

        JButton b = new JButton("yigeren");

        b.setBounds(50, 50, 280, 30);

        jFrame.add(b);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jFrame.setVisible(true);

        new jilu(jFrame).start();

    }
}
