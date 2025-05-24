/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikum20052025;
/**
 *
 * @author user
 */
public class elektronik {
    private String merek;
    private int tahunProduksi;
    private int garansi;
    
    public elektronik(){
        
    }
    public elektronik(String merek, int tahunProduksi, int garansi){
        this.merek = merek;
        this.tahunProduksi = tahunProduksi;
        this.garansi = garansi;
    }
    public String getMerek(){
        return merek;
    }
    public void setMerek(String merek){
        this.merek = merek;
    }
    public int getTahunProduksi(){
        return tahunProduksi;
    }
    public void setTahunProduksi(int tahunProduksi){
        this.tahunProduksi = tahunProduksi;
    }
    public int getGaransi(){
        return garansi;
    }
    public void setGaransi(int garansi){
        this.garansi = garansi;
    }

    public void display() {
        System.out.println("Kelas Elektronik");
        System.out.println("Merek : "+this.merek);
        System.out.println("Tahun Produksi : "+this.tahunProduksi);
        System.out.println("Garansi : "+this.garansi);
    }
}
