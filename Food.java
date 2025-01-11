/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab06;

/**
 *
 * @author denny
 */
public class Food {
    private static final int energy = 10;
    private static double price = 50;
    
    public static void setPrice(double price) {
        if (price > price) {        // ถ้าราคาใหม่มากกว่าราคาเดิม
            Food.price = price;    // เซ็ตราคาใหม่ได้เลย
        } else {
            System.out.println("Cannot update the food price");   // ถ้าน้อยกว่า เซ็ตไม่ได้
        }
    }
    
    public static double getPrice() {         // รับ price
        return price;
    }
    
    public static int getEnergy() {     // รับ energy มาได้เลยเพราะ energy เป็น final
        return Food.energy;
    }
}
