/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts2401081016;

/**
 *
 * @author user
 */
//Soal grup B
public class kendaraan {
    private int jmlRoda;
    private String warna;
    
    public kendaraan(){
        
    }
    public kendaraan(int jmlRoda, String warna){
        this.jmlRoda = jmlRoda;
        this.warna = warna;
    }
            
    public  int getjmlRoda(){
        return jmlRoda;
    }
    
    public void setjmlRoda(int jmlRoda){
        this.jmlRoda = jmlRoda;
    }
    
    public String getWarna(){
        return this.warna;
    }
    
    public void setWarna (String warna){
        this.warna = warna;
    }
    
}
