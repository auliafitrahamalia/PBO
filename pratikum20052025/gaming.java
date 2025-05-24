/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikum20052025;

/**
 *
 * @author user
 */
public class gaming extends laptop{
    private String kartuGrafis;
    private int refreshRate;
    
    public gaming(){
        
    }
    public String getKartuGrafis(){
        return kartuGrafis;
    }
    public void setKartuGrafis(String kartuGrafis){
        this.kartuGrafis = kartuGrafis;
    }
    public int getRefreshRate(){
        return refreshRate;
    }
    public void setRefreshRate(int refreshRate){
        this.refreshRate = refreshRate;
    }
    @Override
    public void display(){
        System.out.println("Kelas Laptop");
        System.out.println("Merek : "+super.getMerek());
        System.out.println("Tahun produksi : "+super.getTahunProduksi());
        System.out.println("Garansi : "+super.getGaransi());
        System.out.println("Kapasitas RAM : "+super.getKapasitasRAM());
        System.out.println("Ukuran Layar : "+super.getUkuranLayar());
        System.out.println("Kartu Grafis : "+this.kartuGrafis);
        System.out.println("Refresh Rate : "+this.refreshRate);
    }
}
