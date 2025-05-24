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
public class sepedaListrik extends sepeda{
    private int kecepatanMaks;
    private int jarakTempuh;
    
    public sepedaListrik(){
        
    }
    
    public sepedaListrik(int kecepatanMaks, int jarakTempuh){
        this.kecepatanMaks = kecepatanMaks;
        this.jarakTempuh = jarakTempuh;
    }
    
    public int getkecepatanMaks(){
        return kecepatanMaks;
    }
    
    public void setkecepatanMaks(int kecepatanMaks){
        this.kecepatanMaks = kecepatanMaks;
    }
    
    public int getjarakTempuh(){
        return jarakTempuh;
    }
    
    public void setjarakTempuh(int jarakTempuh){
        this.jarakTempuh = jarakTempuh;
    }
    
    
}
