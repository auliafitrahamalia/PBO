/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikum20052025;

/**
 *
 * @author user
 */
public class laptop extends elektronik{
    private int ukuranLayar;
    private int kapasitasRAM;
    
    public laptop(){
        
    }
    public int getUkuranLayar(){
        return ukuranLayar;
    }
    public void setUkuranLayar(int ukuranLayar){
        this.ukuranLayar = ukuranLayar;
    }
    public int getKapasitasRAM(){
        return kapasitasRAM;
    }
    public void setKapasitasRAM(int kapasitasRAM){
        this.kapasitasRAM = kapasitasRAM;
    }
    @Override
    public void display(){
        System.out.println("Kelas Laptop");
        System.out.println("Merek : "+super.getMerek());
        System.out.println("Tahun produksi : "+super.getTahunProduksi());
        System.out.println("Garansi : "+super.getGaransi());
        System.out.println("Kapasitas RAM : "+this.kapasitasRAM +" gb");
        System.out.println("Ukuran Layar : "+this.ukuranLayar +" inchi"); 
    }
}
