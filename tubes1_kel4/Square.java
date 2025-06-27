/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tubes1_kel4;

/**
 *
 * @author laptop
 */
public class Square extends Rectangle {
    public Square() {
        
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() { 
        return getWidth();
    }
    
    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setWidth(double side) {
        setSide(side); 
    }

    @Override
    public void setLength(double side) {
        setSide(side);
    }

    @Override
    public String toString() {
        return String.format("Square[side=%.2f, area=%.2f, perimeter=%.2f, %s]",
                              getSide(), getArea(), getPerimeter(), super.toString());
    }
}
