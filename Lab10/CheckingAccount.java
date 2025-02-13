/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab10;

/**
 *
 * @author denny
 */
public class CheckingAccount extends Account {
    private double credit;
    
    public CheckingAccount() {
        super(0.0,"");
    }
    
    public CheckingAccount(double balance, String name, double credit) {
        super(balance, name);
        this.credit = credit;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit){
        if (credit >= 0) {
            this.credit = credit;
        } else {
            System.out.println("Input number must be a positive integer.");
        } 
    }
    
    @Override
    public void withdraw(double a) {
        double newbl;
        if (a < 0){
            System.out.println("Input number must be a positive integer.");
        } else if (a >= 0) {
            if (a <= balance) {
                balance -= a;
                System.out.println(a + " baht is withdrawn from " + name + " and your credit balance is " + credit+ '.');
            } else if (a <= balance + credit) { 
                newbl = a - balance;
                balance = 0;
                credit -= newbl;
                System.out.println(a + " baht is withdrawn from " + name + " and your credit balance is " + credit + '.');
            } else {
                System.out.println("Not enough money!");
            }
        } else {
            System.out.println("Not enough money!");
        }
    }
    
    public void withdraw(String a) {
        try {
            double str = Double.parseDouble(a);
            withdraw(str);
        } catch (NumberFormatException e) {
        }
    }
 
   @Override
   public String toString() {
        return ("The " + name + " account has " + balance + " baht and " + credit + " credits.");
    }
}

