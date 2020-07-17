package com.swing;

import javax.swing.*;

public class 对话框 {
    public static void main(String[] args) {

        JFrame f = new JFrame("对话框");
        f.setSize(400, 300);
        f.setLocation(200, 200);
        f.setLayout(null);

        int jOptionPane = JOptionPane.showConfirmDialog(f,"是否  使用外挂  ?");
        if (JOptionPane.OK_OPTION== jOptionPane){
            String answer = JOptionPane.showInputDialog(f,"请输入YES,表示后果自负");
            if("YES".equals(answer)){
                JOptionPane.showConfirmDialog(f,"你被抓了");
            }
        }
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
