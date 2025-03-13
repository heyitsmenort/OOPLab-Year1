/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab13;

/**
 *
 * @author denny
 */
import javax.swing.*;
import java.awt.*;
public class MyFrame {
    public static void main(String[] args) {
        JFrame f = new JFrame("My Clock");
        
       
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        MyClock clock = new MyClock();
        f.setLayout(new BorderLayout());
        f.add(clock,BorderLayout.CENTER);
        Thread t = new Thread(clock);
        t.start();
        
        f.setSize(300, 200);
        
        
        f.setVisible(true);
    }
}
