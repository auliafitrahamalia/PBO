/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikum11032025;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class KendaraanMain {
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        String jenis;
        String merk;
        String warna;
        int thn;
        int harga;
        int v;
        
        System.out.print("Masukkan jenis kendaraan = ");
        jenis= in.nextLine();
        System.out.print("Masukkan merk kendaraan = ");
        merk = in.nextLine();
        System.out.print("Warna kendaraan = ");
        warna = in.nextLine();
        System.out.print("Tahun keluaran = ");
        thn = in.nextInt();
        in.nextLine(); //pembersihan Line untuk String
        System.out.print("Harga sewa kendaraan Rp ");
        harga = in.nextInt();
        System.out.print("Kecepatan / jam = ");
        v = in.nextInt();
        
        //objek baru -- class Kendaraan
        Kendaraan kend = new Kendaraan(jenis, merk, thn, warna);
        kend.InfoKendaraan();
        kend.CekHarga(harga);
        kend.CekKendaraan(v);
        System.out.println();
    }
}
