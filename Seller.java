/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab06;

/**
 *
 * @author denny
 */
public class Seller extends Employee {
    
    public Seller() {
        super();
    }
    
    public Food sell(Employee e){
        Wallet buy = e.getWallet();
        if (buy.getBalance() >= Food.getPrice()) {
            buy.setBalance(buy.getBalance() - Food.getPrice());
            this.getWallet().setBalance(this.getWallet().getBalance() + Food.getPrice());
            return new Food();
        } else {
            System.out.println("Your money is not enough");
            return null;
        }
    }
}
