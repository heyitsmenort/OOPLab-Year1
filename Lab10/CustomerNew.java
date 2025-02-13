/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab10;

/**
 *
 * @author denny
 */
public class CustomerNew {
    private String firstName;
    private String lastName;
    private Account[] acct;
    private int numOfAccount;
    private CheckingAccount ac;
    
    public CustomerNew() {
        firstName = "";
        lastName = "";
        this.acct = new Account[5];
        this.ac = new CheckingAccount();
    }
    
    public CustomerNew(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.acct = new Account[5];
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
        if (index >= 0 && index < numOfAccount) {
            return acct[index];
        } else {
            return null;
        }
    }
    
    public void addAccount(Account ac) {
        if (numOfAccount < acct.length) {
            acct[numOfAccount] = ac;
            numOfAccount++;
        }
        
        if (acct == null) { 
            acct = new Account[5];
        }
    }
    
    public int getNumOfAccount() {
        return numOfAccount;
    }
    
    @Override
    public String toString() {
        return (this.getFirstName() + " " + this.getLastName());
    }
    
    public boolean equals(Customer c) {
        return this.firstName.equals(c.firstName) && this.lastName.equals(c.lastName);
    }

    
}

