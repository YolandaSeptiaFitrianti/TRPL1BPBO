/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yolanda180323;

/**
 *
 * @author Lab_Jaringan_05
 */

import java.util.Scanner;

public class Latihan6_2_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka antara 1-10: ");
        int number = input.nextInt();

        String word;

        switch (number) {
            case 1:
                word = "satu";
                break;
            case 2:
                word = "dua";
                break;
            case 3:
                word = "tiga";
                break;
            case 4:
                word = "empat";
                break;
            case 5:
                word = "lima";
                break;
            case 6:
                word = "enam";
                break;
            case 7:
                word = "tujuh";
                break;
            case 8:
                word = "delapan";
                break;
            case 9:
                word = "sembilan";
                break;
            case 10:
                word = "sepuluh";
                break;
            default:
                word = "Invalid number";
                break;
        }

        System.out.println(word);
    }
}
