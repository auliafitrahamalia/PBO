/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPraktikum25032025;
/**Nama : AULIA FITRAH AMALIA
   Nim : 2401081016*/
/**
 *
 * @author aulia
 */
public class TestBank {
     public static void main(String[] args) {
        // TODO code application logic here
        Nasabah nasabah1 = new Nasabah("Aulia", "Fitrah");
        Tabungan tabungan1 = new Tabungan(6000);
        nasabah1.setTabungan(tabungan1);

        Nasabah nasabah2 = new Nasabah("Armen", "Siregar");
        Tabungan tabungan2 = new Tabungan(3000);
        nasabah2.setTabungan(tabungan2);

        System.out.println("Informasi nasabah dan saldonya");
        System.out.println("===============================");
        System.out.println(nasabah1);
        System.out.println(nasabah2);
        System.out.println();
        
        System.out.println("Riwayat menabung seorang nasabah");
        tabungan1.simpanUang(4000);
        System.out.println("Setelah Aulia menabung di bank 4000: " + tabungan1.getSaldo());

        tabungan2.simpanUang(7000);
        System.out.println("Setelah Armen menabung di bank 7000: " + tabungan2.getSaldo());

        System.out.println("\nRiwayat penarikan nasabah");

        tabungan1.ambilUang(5000);
        System.out.println("Setelah Aulia mengambil uang di bank 5000: " + tabungan1.getSaldo());

        tabungan2.ambilUang(6000);
        System.out.println("Setelah Armen mengambil uang di bank 6000: " + tabungan2.getSaldo());

        tabungan2.transfer(tabungan1, 1000);
        System.out.println("\nSetelah Aulia transfer sejumlah 1000 ke Armen : ");
        System.out.println("Saldo Aulia: " + tabungan1.getSaldo());
        System.out.println("Saldo Armen: " + tabungan2.getSaldo());
        
    }
}
