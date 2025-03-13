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
public class PoringConstructor {
    public PoringConstructor(){
        JFrame f = new JFrame();
        JButton a = new JButton("Add");
        a.setPreferredSize(new Dimension(90, 50));
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        panel.add(a);
        
        f.setSize(100,60);
        f.setLayout(new BorderLayout());
        f.add(panel,BorderLayout.CENTER);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        f.setVisible(true);
        
        a.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                Poring.incrementCount();
                Poring poring = new Poring();
                poring.updateLabel();
            }
        });
    }
    
    public static void main(String[] args) {
       SwingUtilities.invokeLater(() -> new PoringConstructor());
    }
}

    