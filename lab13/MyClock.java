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
import java.util.Calendar;
public class MyClock extends JLabel implements Runnable {
    public MyClock(){
        setHorizontalAlignment(SwingConstants.CENTER);
        setFont(new java.awt.Font("Sarabun", Font.BOLD, 48));
    }
    @Override
    public void run() {
       while (true){
           Calendar d = Calendar.getInstance();
           int sec = d.get(Calendar.SECOND);
           int min = d.get(Calendar.MINUTE);
           int hour = d.get(Calendar.HOUR_OF_DAY);
           
           String time = String.format("%02d:%02d:%02d",hour,min,sec);
           setText(time);
           
           try{
               Thread.sleep(1000);
           } catch (InterruptedException e){
               Thread.currentThread().interrupt();
           }
       }
    }

    
}
