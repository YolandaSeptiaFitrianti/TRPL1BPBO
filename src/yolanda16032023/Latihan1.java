/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yolanda16032023;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


/**
 *
 * @author ACER
 */
public class Latihan1 {
    public static void main(String[] args){
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        int nilai1;
        int nilai2;
        boolean d;
        
        try{
            System.out.print("Entri Nilai A :");
            nilai1 = Integer.parseInt(dataIn.readLine());
            System.out.print("Entri Nilai B :");
            nilai2 = Integer.parseInt(dataIn.readLine());
            System.out.print("Entri Nilai D :");
            d = Boolean.parseBoolean(dataIn.readLine());
            
            int nilai3 = nilai1 + nilai2;
            System.out.println("Entri Nilai C :" + nilai3);
            System.out.println("Entri Nilai D :" + d);
            }catch (IOException ex){
        }
        
    }
    
}