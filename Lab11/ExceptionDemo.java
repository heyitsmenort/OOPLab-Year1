/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author denny
 */
public class ExceptionDemo {

    public static void main(String args[]) {
        if (args.length < 3) {
            System.out.println("Please enter 3 numbers as a, b, and c respectively.");
            return;
        }
        try {
            double a = Double.parseDouble(args[0]);
            double b = Double.parseDouble(args[1]);
            double c = Double.parseDouble(args[2]);

            if (a == 0) {
                throw new ArithmeticException("Coefficient 'a' cannot be zero.");
            }

            double in = (b * b) - (4 * a * c);

            double x1 = (-b + Math.sqrt(in)) / (2 * a);
            double x2 = (-b - Math.sqrt(in)) / (2 * a);

            System.out.println("x1: " + x1);
            System.out.println("x2: " + x2);
        } catch (NumberFormatException e) {
            System.out.println("Please input data in number format only.");
        }
    }
}

