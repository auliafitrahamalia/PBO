/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tubes2_kel4;

/**
 *
 * @author laptop
 */

public class TestShapes {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.5, "RED", false);  // Upcast Circle to Shape
        System.out.println(s1);                    // Circle's toString()
        System.out.println(s1.getArea());          // Circle's getArea()
        System.out.println(s1.getPerimeter());     // Circle's getPerimeter()
        System.out.println(s1.getColor());         // Shape's getColor()
        System.out.println(s1.isFilled());         // Shape's isFilled()
        // System.out.println(s1.getRadius());     // ERROR! getRadius() tidak ada di Shape

        Circle c1 = (Circle)s1;                    // Downcast back to Circle
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

        // Shape s2 = new Shape();                 // ERROR! Cannot instantiate abstract class

        Shape s3 = new Rectangle(1.0, 2.0, "RED", false);  // Upcast
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        // System.out.println(s3.getLength());     // ERROR! getLength() tidak ada di Shape

        Rectangle r1 = (Rectangle)s3;              // downcast
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());

        Shape s4 = new Square(6.6);                // Upcast
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        // System.out.println(s4.getSide());       // ERROR! getSide() tidak ada di Shape

        Rectangle r2 = (Rectangle)s4;              // downcast to Rectangle
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        // System.out.println(r2.getSide());       // ERROR! getSide() tidak ada di Rectangle
        System.out.println(r2.getLength());        // OK

        Square sq1 = (Square)r2;                   // Downcast Rectangle to Square
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());
    }
}