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
class Account {
    public double balance;
    public String name;
    
    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }
    
    public void deposit(double b) {
        if (b >= 1){
            balance += b;
        } else {
            balance = 0;
        }
    }
    
    public double withdraw(double b) {
        if (b >= 0) {
            if (balance - b >= 0) {
                balance -= b;
                return balance;
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }
    
}
public class Teller2GUI {
    private JFrame fr;
    private JLabel l1, l2;
    private JPanel p1, p2;
    private JTextField tf1, tf2;
    private JButton btn1, btn2, btn3;
    private Account acc;
    public Teller2GUI() {
        acc = new Account("a", 6000);
        fr = new JFrame("Teller GUI");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        l1 = new JLabel("Balance");
        l2 = new JLabel("Amount");
        
        p1 = new JPanel();
        p2 = new JPanel();
        
        tf1 = new JTextField(String.valueOf(acc.balance));
        tf1.setEditable(false);
        tf2 = new JTextField();
        
        btn1 = new JButton("Deposit");
        btn2 = new JButton("Withdraw");
        btn3 = new JButton("Exit");
        
        btn1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        String input = tf2.getText().trim();
        if (input.isEmpty()) return;
        try {
            double amount = Double.parseDouble(input);
            acc.deposit(amount);
            tf1.setText(String.valueOf(acc.balance));
        } catch (NumberFormatException ex) { 
        }
    }
});

        btn2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        String input = tf2.getText().trim();
        if (input.isEmpty()) return;

        try {
            double amount = Double.parseDouble(input);
            acc.withdraw(amount);
            tf1.setText(String.valueOf(acc.balance));
        } catch (NumberFormatException ex) {
        }
    }
});
        
        fr.setLayout(new GridLayout(2,1));
        fr.add(p1);
        fr.add(p2);
        p1.setLayout(new GridLayout(2,2));
        p1.add(l1);
        p1.add(tf1);
        p1.add(l2);
        p1.add(tf2);
        p2.setLayout(new FlowLayout());
        p2.add(btn1);
        p2.add(btn2);
        p2.add(btn3);
        fr.pack();
        fr.setVisible(true);
        
    }
    
    

}
