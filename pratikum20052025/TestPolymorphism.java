/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikum20052025;

/**
 *
 * @author user
 */
public class TestPolymorphism {
    public static void main(String[]args){
        //objek biasa
        elektronik barang1 = new elektronik();
        barang1.setMerek("Samsung");
        barang1.setTahunProduksi(2025);
        barang1.setGaransi(2);
        barang1.display();
        System.out.println("");
        
        smartwatch barang2 = new smartwatch();
        barang2.setMerek("Samsung");
        barang2.setTahunProduksi(2024);
        barang2.setGaransi(2);
        barang2.setKapasitasBaterai(100);
        barang2.setJumlahKamera(1);
        barang2.setUkuranLayar(10);
        barang2.setTahanAir(true);
        barang2.display();
        System.out.println("");
        
        //polymorphism
        elektronik barang3 = new laptop();
        barang3.setMerek("HP");
        barang3.setTahunProduksi(2025);
        barang3.setGaransi(2);
        barang3.setMerek("Samsung");
        ((laptop)barang3).setKapasitasRAM(14);
        ((laptop)barang3).setUkuranLayar(32);
        barang3.display();
        System.out.println("");
        
        smartphone barang4 = new smartwatch();
        barang4.setMerek("Apple");
        barang4.setTahunProduksi(2024);
        barang4.setGaransi(3);
        barang4.setKapasitasBaterai(100);
        barang4.setJumlahKamera(1);
        ((smartwatch)barang4).setUkuranLayar(1500);
        ((smartwatch)barang4).setTahanAir(true);
        barang4.display();
        System.out.println("");
    }
}
