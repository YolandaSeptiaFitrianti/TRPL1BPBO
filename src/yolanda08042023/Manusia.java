/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yolanda08042023;

/**
 *
 * @author YOLANDA SEPTIA FITRI
 */
public class Manusia extends LivingThing {
    
    public void berjalan(){
        System.out.println("Berjalan manusia");
    }
    
    public static void main(String[] args){
        Manusia m = new Manusia();
        m.bernafas();
        m.makan();
        m.berjalan();
    }  
}
