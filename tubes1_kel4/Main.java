/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tubes1_kel4;

/**
 *
 * @author laptop
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean ulang = true;

        while (ulang) {
            System.out.println("Pilih bentuk yang ingin dihitung:");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Square");
            System.out.print("Pilihan (1-3): ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan radius lingkaran: ");
                    double radius = scanner.nextDouble();
                    Circle circle = new Circle(radius);
                    System.out.println(circle);
                    System.out.println("Luas: " + circle.getArea());
                    System.out.println("Keliling: " + circle.getPerimeter());
                    break;

                case 2:
                    System.out.print("Masukkan panjang: ");
                    double length = scanner.nextDouble();
                    System.out.print("Masukkan lebar: ");
                    double width = scanner.nextDouble();
                    Rectangle rectangle = new Rectangle(width, length);
                    System.out.println(rectangle);
                    System.out.println("Luas: " + rectangle.getArea());
                    System.out.println("Keliling: " + rectangle.getPerimeter());
                    break;

                case 3:
                    System.out.print("Masukkan sisi: ");
                    double side = scanner.nextDouble();
                    Square square = new Square(side);
                    System.out.println(square);
                    System.out.println("Luas: " + square.getArea());
                    System.out.println("Keliling: " + square.getPerimeter());
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

            System.out.print("\nIngin coba lagi? (y/n): ");
            String lagi = scanner.next();
            ulang = lagi.equalsIgnoreCase("y");
            System.out.println();
        }

        scanner.close();
        System.out.println("Program selesai.");
    }
}

