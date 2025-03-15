/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikum11032025;

/**
 *
 * @author user
 */
public class Kendaraan {
    String jenis;
    String merk;
    int tahun;
    String warna;
    
    //contructor
    public Kendaraan(String j, String m, int t, String w){
        this.jenis = j;
        this.merk = m;
        this.tahun = t;
        this.warna = w;
    }       
    
    //method tanpa parameter
    public void InfoKendaraan(){
        System.out.println("\n==DATA KENDARAAN==");
        System.out.println("Jenis kendaran = "+jenis);
        System.out.println("Merk kendaraan = "+merk);
        System.out.println("Warna kendaraan = "+warna);
        System.out.println("Tahun keluaran = "+tahun);
    }
    
    //method dengan parameter
    public void CekHarga(int harga){
        System.out.println("Harga sewa kendaraan Rp "+harga);
    }
    
    
    public void CekKendaraan(int v){
        if(v<20)
            System.out.println("Lebih baik jalan saja");
        else if(v<=40)
            System.out.println("Kendaraan anda Slow");
        else if(v<=60)
            System.out.println("Kecepatan anda Medium");
        else if(v>85)
            System.out.println("p balap");
    }
}
