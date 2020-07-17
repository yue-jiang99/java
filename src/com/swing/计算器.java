package com.swing;

import javax.swing.*;
import java.awt.*;

public class 计算器 {
    public static void main(String[] args) {

        JFrame f = new JFrame("计算器");
        f.setSize(400, 300);
        f.setLocation(200, 200);

        f.setLayout(new GridLayout(4,5,8,8));

        String[] s ={"7","8","9","/","sq",
                     "4","5","6","*","%",
                     "1","2","3","-","1/x",
                     "0","+/-",".","+","="};
        for (int i = 0; i < s.length; i++) {
            f.add(new JButton(s[i]));
        }

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }
}
