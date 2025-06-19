/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts2401081016;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in=new Scanner(System.in);
        
        int sepeda, mobil, jenis, jmlRoda, jmlGir, kecepatanMaks, jarakTempuh, kapasitasMesin, muatanMaks, tarifAwal, tarifPerKm;
        
        String warna, jmlSadel, bahanBakar;
        
        char ulang;
        
        
        do{
            System.out.println("Nama    : AULIA FITRAH AMALIA");
            System.out.println("NIM     : 2401081016");
            System.out.println("Kelas   : Teknik Komputer 1B");
            System.out.println("Group   : B");

            System.out.println("============================");
            System.out.println();

            System.out.println("===Kendaraan===");
            System.out.print("Masukkan jumlah roda kendaraan : ");
            jmlRoda=in.nextInt();
            in.nextLine();
            System.out.print("Masukkan warna kendaraan : ");
            warna=in.nextLine();
            kendaraan k1= new kendaraan(jmlRoda, warna);

            System.out.println("---Jenis kendaraan---");
            System.out.println("1. Mobil");
            System.out.println("2. Sepeda");

            System.out.print("Masukkan jenis kendaraan anda : ");
            jenis=in.nextInt();
            in.nextLine();

            switch(jenis){
                case 1:{
                    System.out.println("Kendaraan mobil");
                    System.out.print("Masukkan bahan bakar : ");
                    bahanBakar=in.nextLine();
                    System.out.print("Masukkan kapasitas mesin : ");
                    kapasitasMesin=in.nextInt();
                    mobil m1 = new mobil();
                    m1.setBahanBakar(bahanBakar);
                    m1.setKapasitasMesin(kapasitasMesin);

                    //pilihan rincian mobil truk dan taksi
                    System.out.println("---Jenis Mobil---");
                    System.out.println("1. Truk");
                    System.out.println("2. Taksi");
                    System.out.print("Masukkan jenis mobil anda : ");
                    mobil=in.nextInt();

                    switch(mobil){
                        case 1:{
                            System.out.println("Mobil Truk");
                            System.out.print("Masukkan muatan Maks : ");
                            muatanMaks=in.nextInt();
                            truk t1 =  new truk();
                            t1.setMuatanMaks(muatanMaks);

                            //output
                            System.out.println();
                            System.out.println("===Data Kendaraan===");
                            System.out.println("Kendaraan Mobil Truk");
                            System.out.println("Jumlah Roda kendaraan = "+k1.getJmlRoda()+" roda");
                            System.out.println("Warna Kendaraan = "+k1.getWarna());
                            System.out.println("Bahan Bakar = "+m1.getBahanBakar());
                            System.out.println("Kapasitas Mesin = "+m1.getKapasitasMesin()+(" liter"));
                            System.out.println("Muatan Maks = "+t1.getMuatanMaks()+" KG");
                            break;
                        }
                        case 2:{
                            System.out.println("Mobil Taksi");
                            System.out.print("Masukkan tarif awal : ");
                            tarifAwal=in.nextInt();
                            System.out.print("Masukkan tarik per km : ");
                            tarifPerKm=in.nextInt();
                            taksi ts1 = new taksi();
                            ts1.setTarifAwal(tarifAwal);
                            ts1.setTarifPerKm(tarifPerKm);

                            //output
                            System.out.println();
                            System.out.println("===Data Kendaraan===");
                            System.out.println("Kendaraan Mobil Taksi");
                            System.out.println("Jumlah Roda kendaraan = "+k1.getJmlRoda()+" roda");
                            System.out.println("Warna Kendaraan = "+k1.getWarna());
                            System.out.println("Bahan Bakar = "+m1.getBahanBakar());
                            System.out.println("Kapasitas Mesin = "+m1.getKapasitasMesin()+" liter");
                            System.out.println("Tarif Awal = "+ts1.tarifAwal+" rupiah");
                            System.out.println("Tarif Per KM = "+ts1.tarifPerKm+" rupiah");
                            break;
                        }
                    }
                    break;
                }
                case 2:{
                    System.out.println("Kendaraan Sepeda");
                    System.out.print("Masukkan jumlah Sadel: ");
                    jmlSadel=in.nextLine();
                    System.out.print("Masukkan jumlah gir: ");
                    jmlGir=in.nextInt();
                    sepeda s1 = new sepeda(jmlSadel, jmlGir);

                    //pilihan rincian untuk sepeda
                    System.out.println("---Menu Sepeda---");
                    System.out.println("1. Sepeda Biasa");
                    System.out.println("2. Sepeda Listrik");
                    System.out.print("Masukkan pilihan sepeda anda :");
                    sepeda=in.nextInt();

                    if(sepeda==2){
                        System.out.println("Sepeda Listrik");
                        System.out.print("Masukkan kecepatan maks(km/jam): ");
                        kecepatanMaks=in.nextInt();
                        System.out.print("Masukkan jarak tempuh(km): ");
                        jarakTempuh=in.nextInt();
                        sepedaListrik l1= new sepedaListrik(kecepatanMaks, jarakTempuh);

                        //output
                        System.out.println();
                        System.out.println("===Data Kendaraan===");
                        System.out.println("Kendaraan Sepeda Listrik");
                        System.out.println("Jumlah Roda kendaraan = "+k1.getJmlRoda()+" roda");
                        System.out.println("Warna Kendaraan = "+k1.getWarna());
                        System.out.println("Jumlah Sadel = "+s1.getJmlSadel());
                        System.out.println("Jumlah Gir = "+s1.getJmlGir());
                        System.out.println("Kecepatan Maks = "+l1.getKecepatanMaks()+"km/jam");
                        System.out.println("Jarak Tempuh = "+l1.getJarakTempuh()+"km");
                    }
                    else{

                        System.out.println();
                        System.out.println("===Data Kendaraan===");
                        System.out.println("Kendaraan Sepeda Biasa");
                        System.out.println("Jumlah Roda kendaraan = "+k1.getJmlRoda()+" roda");
                        System.out.println("Warna Kendaraan = "+k1.getWarna());
                        System.out.println("Jumlah Sadel = "+s1.getJmlSadel());
                        System.out.println("Jumlah Gir = "+s1.getJmlGir());
                    }
                    break;
                }
                default:{
                    System.out.println("Pilihan anda salah!");
                    break;
                }
            }
            
        in.nextLine();
        System.out.println("Apakah Anda ingin mengulang? (y/n)");
        ulang = in.nextLine().charAt(0);
        }while(ulang=='y'||ulang=='Y');


            //Mobil m1 = new Mobil(bahanBakar, kapasitasMesin);
            //Truk t1 =  new Truk(muatanMaks);
            //Taksi ts1 = new Taksi(tarifAwal, tarifPerKm);





    }
    
}
