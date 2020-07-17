package com.swing;

import javax.swing.*;
import java.io.*;

public class jilu extends Thread{
    private JFrame jFrame;
    File file = new File("G:\\java\\jiluxy.txt");

    public jilu(JFrame jFrame) {
        this.jFrame = jFrame;
    }

    @Override
    /**
     *
     */
    public void run() {
        while (true){
            int x = jFrame.getX();
            int y = jFrame.getY();
            try {
                FileOutputStream f = new FileOutputStream(file);
                DataOutputStream o = new DataOutputStream(f);
                o.writeInt(x);
                o.writeInt(y);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
