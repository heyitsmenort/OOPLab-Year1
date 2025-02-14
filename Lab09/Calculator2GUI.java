/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab09;

/**
 *
 * @author denny
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator2GUI implements ActionListener {
    private JFrame fr;
    private JTextField tf;
    private JPanel p;
    private JButton[] btn;
    private String operator = "";
    private double num1, num2, result;
    private String op = "";
    
    public Calculator2GUI() {
        fr = new JFrame();
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tf = new JTextField();
        tf.setEditable(false);
        p = new JPanel();
        btn = new JButton[16];
        String[] labels = { "7", "8", "9", "+", 
                            "4", "5", "6", "-", 
                            "1", "2", "3", "x", 
                            "0", "C", "=", "/" };
        for (int i = 0; i < 16; i++) {
            btn[i] = new JButton(labels[i]);
            btn[i].addActionListener(this);
            p.add(btn[i]);
        }
        fr.setSize(500,500);
        fr.setLayout(new GridLayout(2,1));
        fr.add(tf);
        tf.setSize(500,50);
        fr.add(p);
        p.setLayout(new GridLayout(4,4));
        fr.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        
        if("0123456789".contains(command)) {
            tf.setText(tf.getText() + command);
        } else if ("+-x/".contains(command)) {
            num1 = Double.parseDouble(tf.getText());
            op = command;
            tf.setText("");
        } else if (command.equals("=")) {
            num2 = Double.parseDouble(tf.getText());
            switch (op) {
                case "+": result = num1 + num2; break;
                case "-": result = num1 - num2; break;
                case "x": result = num1 * num2; break;
                case "/": result = num2 != 0 ? num1 / num2 : 0; break;
            }
            tf.setText(String.valueOf(result));
            } else if (command.equals("C")) {
                tf.setText("");
                num1 = num2 = result = 0;
                op = "";
            }
        }
}
