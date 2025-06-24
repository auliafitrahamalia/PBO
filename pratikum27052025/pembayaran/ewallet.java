/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pembayaran;

/**
 *
 * @author user
 */
public class ewallet extends metodepembayaran{
    
    private String provider;

    public ewallet(String namaPemilik, String provider) {
        super(namaPemilik);
        this.provider = provider;
    }

    @Override
    public void prosesPembayaran(double jumlah) {
        System.out.println("Pembayaran E-Wallet (" + provider + ") oleh " + namaPemilik + " sebesar Rp. " + jumlah);
    }
    
}
