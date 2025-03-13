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
import javax.swing.*;
public class MyClock2 extends JLabel implements Runnable {
    private int second = 0;
    public MyClock2(){
        setHorizontalAlignment(SwingConstants.CENTER);
        setFont(new java.awt.Font("Sarabun", Font.BOLD, 48));
    }
    @Override
    public void run() {
       while (true){
           
           int sec = second % 60;
           int min = (second /60)%60;
           int hour = (second /3600);
           
           String time = String.format("%02d:%02d:%02d",hour,min,sec);
           setText(time);
           
           second++;
           
           try{
               Thread.sleep(1000);
           } catch (InterruptedException e){
               Thread.currentThread().interrupt();
           }
       }
    }

    
}
