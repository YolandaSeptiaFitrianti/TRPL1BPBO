/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yolanda180323;

/**
 *
 * @author Lab_Jaringan_05
 */

//ForLoop    

import java.util.Scanner;

public class Latihan6_4_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan angka: ");
        int angka = scanner.nextInt();
        
        System.out.print("Masukkan nilai pangkat: ");
        int pangkat = scanner.nextInt();
        
        int hasil = 1;
        
        for(int i = 1; i <= pangkat; i++){
            hasil *= angka;
        }
        
        System.out.println("Hasil: " + hasil);
    }
}
