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
public class sepeda extends kendaraan {
    private String jmlSadel;
    private int jmlGir;
    
    public sepeda(){
        
    }
    
    public sepeda(String jmlSadel, int jmlGir){
        this.jmlSadel = jmlSadel;
        this.jmlGir = jmlGir;
    }
    
    public String setjmlSadel(String jmlSadel){
        return this.jmlSadel;
    }
    
    public int getjmlGir(){
        return jmlGir;
    }
    
    public void setjmlGir(int jmlGir){
        this.jmlGir = jmlGir;
    }
            
}
