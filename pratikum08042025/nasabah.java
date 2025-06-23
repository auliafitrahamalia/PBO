/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikum08042025;

/**
 *
 * @author user
 */
public class nasabah {
    private String namaAwal;
    private String namaAkhir;
    private tabungan tabungan;

    public nasabah(String namaAwal, String namaAkhir) {
        this.namaAwal = namaAwal;
        this.namaAkhir = namaAkhir;
    }
    
    public String getNamaLengkap(){
        return namaAwal+" "+namaAkhir;
    }

    public void setTabungan(tabungan tabungan) {
        this.tabungan = tabungan;
    }

    public tabungan getTabungan() {
        return tabungan;
    }

    @Override
    public String toString() {
        //return namaAwal + " " + namaAkhir + " - " + (tabungan != null ? 
        //tabungan.toString() : "Tidak ada tabungan");
        if (tabungan != null) {
            return namaAwal + " " + namaAkhir + " - " + tabungan.toString();
        } else {
            return namaAwal + " " + namaAkhir + " - Tidak ada tabungan";
        }
    }
}
