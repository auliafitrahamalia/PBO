/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikum20052025;

/**
 *
 * @author user
 */
public class smartwatch extends smartphone {
    private int ukuranLayar;
    private boolean tahanAir;
    
    public smartwatch(){
        
    }
    public int ukuranLayar(){
        return ukuranLayar;
    }
    public void setUkuranLayar(int ukuranLayar){
        this.ukuranLayar = ukuranLayar;
    }
    public boolean getUkuranAir(){
        return tahanAir;
    }
    public void setTahanAir(boolean tahanAir){
        this.tahanAir = tahanAir;
    }
    @Override
    public void display(){
        System.out.println("Kelas SmartWatch");
        System.out.println("Merek : "+super.getMerek());
        System.out.println("Tahun produksi : "+super.getTahunProduksi());
        System.out.println("Garansi : "+super.getGaransi()+" tahun");
        System.out.println("Kapasitas Baterai : "+super.getKapasitasBaterai()+" mAh");
        System.out.println("Jumlah Kamera : "+super.getJumlahKamera());
        System.out.println("Ukuran Layar : "+this.ukuranLayar);
        System.out.println("Tahan Air : "+this.tahanAir);
    }
}
