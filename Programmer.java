/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab06;

/**
 *
 * @author denny
 */
public class Programmer extends Employee{
    
    public Programmer() {    // อ้างอิง construct จากคลาส employee ที่เป็นคลาสแม่
        super();
    }
    
    
    private int happiness;
    
    public void coding(String str) {
        if (this.getEnergy() >= 30) {
            System.out.println("Your code is " + str);
            setEnergy(this.getEnergy() - 30);
            setHappiness(happiness - 30);
        } else {
            System.out.println("Error Error Error");
            setEnergy(this.getEnergy() - 30);
            setHappiness(happiness - 30);
        }
    }
    
    public void coding(char str) {
        String s = String.valueOf(str);
        coding(s);
        }
    
    public void setHappiness(int happiness) { // กำหนดค่า happiness
        this.happiness = happiness;
    }
    
    public int getHappiness() {   //รับค่า happiness
        return happiness;
    }
    
    
}
