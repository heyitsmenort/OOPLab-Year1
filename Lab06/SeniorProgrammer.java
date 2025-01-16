/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab06;

/**
 *
 * @author denny
 */
public class SeniorProgrammer extends Programmer {
    
    public SeniorProgrammer() {
        super();
    }
    @Override
    public void coding(String str) {
        System.out.println("I'm coding about " + str);
        if (getEnergy() >= 10) {
            setEnergy(getEnergy() - 5);
            setHappiness(getHappiness() - 5);
        } else {
            System.out.println("ZzZzZz");
            setEnergy(getEnergy() - 5);
            setHappiness(getHappiness() - 5);
        }
    }
    
    public void coding(String str, int num){
        int total = num * 5;
        for (int i = 1; i <= num; i++) {
        System.out.println("I'm coding about " + str);
        }
        if (getEnergy() >= total) {
            setEnergy(getEnergy() - total);
            setHappiness(getHappiness() - total);
        } else {
            System.out.println("ZzZzZz");
            setEnergy(getEnergy() - total);
            setHappiness(getHappiness() - total);
        }
    }
    
    public void compliment(Programmer p) {
        p.setHappiness(p.getHappiness() + 20);
        System.out.println(p.getName() + " in a good mood");
    }
    
    public void blame(Programmer p) {
        p.setHappiness(p.getHappiness() - 20);
        System.out.println(p.getName() + " in a bad mood");
    }
}
