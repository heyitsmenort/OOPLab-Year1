/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab06;

/**
 *
 * @author denny
 */
public class Employee {
    private static String nationality = "Thai";
    private String name;
    private Wallet wallet;
    private int energy;
    
    public Employee() {
        this.nationality = nationality;
        this.name = name;
        this.wallet = wallet;
        this.energy = energy;
    }
    
    public boolean equal(Employee e) {
        return (this.name.equals(e.getName()));
    }
    
    @Override
    public String toString() {
        return ("My name is " + getName() + ". \nI have " + getEnergy() + " energy left.\nI have a balance of " + wallet.getBalance() + " baht.");
    }
    
    public boolean buyFood(Seller s) {
        if (s != null) {
            this.eat(s.sell(this));
            return true;
        } else {
            return false;
        }
    }
    
    public void eat(Food f) {
        this.energy += Food.getEnergy();
    }
    
    public void setName (String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setWallet (Wallet wallet) {
        this.wallet = wallet;
    }
    
    public Wallet getWallet() {
        return wallet;
    }
    
    public void setEnergy(int energy) {
        this.energy = energy;
    }
    
    public int getEnergy() {
        return energy;
    }
    
    public static void setNationality(String nationality) {
        Employee.nationality = nationality;
    }
    
    public static String getNationality() {
        return nationality;
    }
    
    

    
}
