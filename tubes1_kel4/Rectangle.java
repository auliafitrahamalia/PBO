/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tubes1_kel4;

/**
 *
 * @author laptop
 */
public class Rectangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width; 
    }
    public double getLength() {
        return length; 
    }
    public void setLength(double length) {
        this.length = length; 
    }

    public double getArea() {
        return width * length;
    }
    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return String.format("Rectangle[width=%.2f, length=%.2f, area=%.2f, perimeter=%.2f, %s]",
                              width, length, getArea(), getPerimeter(), super.toString());
    }
}


