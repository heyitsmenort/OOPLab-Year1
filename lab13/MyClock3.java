/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab13;

/**
 *
 * @author denny
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyClock3 extends JLabel implements Runnable {
    private int second = 0;
    private boolean run = true;
    
    public MyClock3(){
        setHorizontalAlignment(SwingConstants.CENTER);
        setFont(new java.awt.Font("Sarabun", Font.BOLD, 48));
        
        addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent a){
                run =!run;
            }
        });
    }
    @Override
    public void run() {
       while (true){
           if(run){
               int sec = second % 60;
               int min = (second /60)%60;
               int hour = (second /3600);

               String time = String.format("%02d:%02d:%02d",hour,min,sec);
               setText(time);

               second++;
           }
           
           
           try{
               Thread.sleep(1000);
           } catch (InterruptedException e){
               Thread.currentThread().interrupt();
           }
       }
    }
}

