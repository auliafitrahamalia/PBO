/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pembayaran;

/**
 *
 * @author user
 */
public class kartukredit extends metodepembayaran {

    private String nomorKartu;

    public kartukredit(String namaPemilik, String nomorKartu) {
        super(namaPemilik);
        this.nomorKartu = nomorKartu;
    }

    @Override
    public void prosesPembayaran(double jumlah) {
        System.out.println("Pembayaran dengan kartu kredit (" + nomorKartu + ") oleh " + namaPemilik + " sebesar Rp. " + jumlah);
    }

}
