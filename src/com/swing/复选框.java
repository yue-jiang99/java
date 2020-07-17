package com.swing;

import javax.swing.*;
import java.awt.*;

public class 复选框 {
    public static void main(String[] args) {

        JFrame f = new JFrame("复选框");
        f.setSize(400, 300);
        f.setLocation(200, 200);
        f.setLayout(null);

        JCheckBox jCheckBox = new JCheckBox("物理英雄");
        JCheckBox jCheckBox1 = new JCheckBox("魔法英雄");
        jCheckBox.setSize(100,50);
        jCheckBox1.setSize(100,50);
        jCheckBox.setLocation(20,20);
        jCheckBox1.setLocation(20,60);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(jCheckBox);
        buttonGroup.add(jCheckBox1);

        f.add(jCheckBox);
        f.add(jCheckBox1);


        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }
}
