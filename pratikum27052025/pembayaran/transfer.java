/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pembayaran;

/**
 *
 * @author user
 */
public class transfer extends metodepembayaran{
    public String bank;
    
    public transfer(String namaPemilik, String bank) {
        super(namaPemilik);
        this.bank = bank;
    }

    @Override
    public void prosesPembayaran(double jumlah) {
        System.out.println("Transfer via " + bank + " oleh " + namaPemilik + " sebesar Rp. " + jumlah);
    }
    
}