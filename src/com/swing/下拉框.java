package com.swing;

import javax.swing.*;

public class 下拉框 {
    public static void main(String[] args) {

        JFrame f = new JFrame("下拉框");
        f.setSize(400, 300);
        f.setLocation(200, 200);
        f.setLayout(null);

        String[] heors = new String[]{"a" ,"b","c"};
        JComboBox jCheckBox = new JComboBox(heors);
        jCheckBox.setBounds(50,50,50,50);
        f.add(jCheckBox);


        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }
}
