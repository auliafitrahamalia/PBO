/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas3kel;

/**
 *
 * @author laptop
 */
public class Main {
    public static void main(String[] args) {
        GeometricObject circle = new Circle(5.0);
        GeometricObject rectangle = new Rectangle(4.0, 6.0);

        System.out.println(circle.toString());
        System.out.println("Luas Circle = " + circle.getArea());
        System.out.println("Keliling Circle = " + circle.getPerimeter());

        System.out.println();

        System.out.println(rectangle.toString());
        System.out.println("Luas Rectangle = " + rectangle.getArea());
        System.out.println("Keliling Rectangle = " + rectangle.getPerimeter());
    }
}
