/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab10;

/**
 *
 * @author denny
 */
import java.util.*;
public class CustomerLast {
    private String firstName;
    private String lastName;
    private ArrayList<Account> acct;
    private int numOfAccount;
    private CheckingAccount ac;
    
    public CustomerLast() {
        firstName = "";
        lastName = "";
        acct = new ArrayList();
        this.ac = new CheckingAccount();
    }
    
    public CustomerLast(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        acct = new ArrayList();
        this.ac = new CheckingAccount();
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Account getAccount(int index) {
        if (index >= 0 && index < acct.size()) {
            return acct.get(index);
        } else {
            return null;
        }
    }
    
    public void addAccount(Account ac) {
        acct.add(ac);
    }
    
    public int getNumOfAccount() {
        return acct.size();
    }
    
    @Override
    public String toString() {
        return (this.getFirstName() + " " + this.getLastName());
    }
    
    public boolean equals(Customer c) {
        return this.firstName.equals(c.firstName) && this.lastName.equals(c.lastName);
    }

    
}

