/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pembayaran;

/**
 *
 * @author user
 */
public abstract class metodepembayaran {
    protected String namaPemilik;

    public metodepembayaran(String namaPemilik) {
        this.namaPemilik = namaPemilik;
    }

    public abstract void prosesPembayaran(double jumlah);
}
