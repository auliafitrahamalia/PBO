/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikum20052025;

/**
 *
 * @author user
 */
public class smartphone extends elektronik{
    int kapasitasBaterai;
    private int jumlahKamera;
    
    public smartphone(){
        
    }
    public int getKapasitasBaterai(){
        return kapasitasBaterai;
    }
    public void setKapasitasBaterai(int kapasitasBaterai){
        this.kapasitasBaterai = kapasitasBaterai;
    }
    public int getJumlahKamera(){
        return jumlahKamera;
    }
    public void setJumlahKamera(int jumlahKamera){
        this.jumlahKamera = jumlahKamera;
    }
    @Override
    public void display(){
        System.out.println("Kelas Smartphone");
        System.out.println("Merek : "+super.getMerek());
        System.out.println("Tahun produksi : "+super.getTahunProduksi());
        System.out.println("Garansi : "+super.getGaransi()+" tahun");
        System.out.println("Kapasitas Baterai : "+this.kapasitasBaterai +" mAh");
        System.out.println("Jumlah Kamera : "+this.jumlahKamera);
    }
}
