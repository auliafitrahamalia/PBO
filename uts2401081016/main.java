/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts2401081016;

import java.util.Scanner;

/**
 *
 * @author user
 */
//Soal grup B
public class main {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        sepedaListrik t = new sepedaListrik();
        t.setjmlRoda(2);
        t.setkecepatanMaks();
        t.setjarakTempuh();
        
        
        System.out.println("Masukkan warna = ");
        t.setWarna(input.nextLine());
        System.out.println("Masukkan jumlah sadel = ");
        t.setjmlSadel(input.nextLine());
        
        System.out.println("==========================");
        System.out.println("UTS AULIA FITRAH AMALIA");
        System.out.println("2401081016");
        System.out.println("Grup B");
        System.out.println("==========================");
        System.out.println("");
                
    }
}
