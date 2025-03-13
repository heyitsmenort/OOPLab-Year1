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
import java.awt.event.*;
import java.util.Date;
import java.io.*;
public class Poring {
    private static int count;
    private volatile boolean run = true;
    private int location = 1;
    private JLabel slime;
    public Poring(){
        JFrame f = new JFrame();        
        ImageIcon imageIcon = new ImageIcon("C:/Users/Acer/Downloads/poring.png");
        Image image = imageIcon.getImage();
        Image newimg = image.getScaledInstance(200, 200,java.awt.Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(newimg);
        JLabel slime = new JLabel(imageIcon);
        slime.setSize(200, 200);
        
        slime.setText(String.valueOf(count));
        
       // f.setLayout(new FlowLayout());
        f.setSize(275, 275);
        f.setResizable(false);
        f.add(slime);
        
        Thread moving = new Thread(() -> {
        while(run) {
            int x = f.getX()+location*5;
            f.setLocation(x, f.getY());
            
            if (x>=5 || x<= 0) {
                location *= -1;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        
        }
        });
        moving.start();
       
        slime.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                f.dispose();
            }
        });
        
        
        f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        f.getContentPane().add(slime);
        f.setVisible(true);
    }
        
    public static synchronized void incrementCount() {
        count++;
    }
    public static int getCount(){
        return count;
    }
    public void updateLabel() {
        SwingUtilities.invokeLater(() -> slime.setText(String.valueOf(count))); // Update label on the EDT
    }
}

