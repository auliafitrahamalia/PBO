/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikum11032025;

/**
 *
 * @author user
 */
public class AksiMobil {
    public static void main(String[] args){
    //buat object baru
    Mobil mobilku=new Mobil();
    mobilku.merk = "Toyota";
    mobilku.plat = "BA 1234 L";
    mobilku.tahun = 2004;
    mobilku.warna = "Hitam";
    
    System.out.println("---------------------");
    System.out.println("Data Mobil 1 ");
    System.out.println("Merk Mobil = "+ mobilku.merk);
    System.out.println("Plat Mobil = "+ mobilku.plat);
    System.out.println("Tahun keluaran = "+ mobilku.tahun);
    System.out.println("Warna Mobil = "+ mobilku.warna);
    
    Mobil mobilmu=new Mobil();
    mobilmu.merk = "Pajero";
    mobilmu.plat = "BA 5678 L";
    mobilmu.tahun = 2005;
    mobilmu.warna = "Hitam";
    
    System.out.println("---------------------");
    System.out.println("Data Mobil 2 ");
    System.out.println("Merk Mobil = "+ mobilmu.merk);
    System.out.println("Plat Mobil = "+ mobilmu.plat);
    System.out.println("Tahun keluaran = "+ mobilmu.tahun);
    System.out.println("Warna Mobil = "+ mobilmu.warna);
    
    //pemanggilan method
    mobilku.MobilAktif(); //tanpa return
    System.out.println(mobilku.SuaraMobil()); //return
   } 
}
