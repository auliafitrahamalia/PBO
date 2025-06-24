/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pembayaran;

/**
 *
 * @author user
 */
public class cash extends metodepembayaran{
    public cash(String namaPemilik){
        super(namaPemilik);
    }
    
    @Override
    public void prosesPembayaran(double jumlah){
        System.out.println("Pembayaran tunai oleh "+namaPemilik+ " sebesar Rp. "+jumlah);
    }
}
