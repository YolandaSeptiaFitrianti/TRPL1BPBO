/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yolanda16032023;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Latihan64 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan sebuah angka antara 1-10: ");
        int angka = scanner.nextInt();

        String kata;

        switch (angka) {
            case 1:
                kata = "Satu";
                break;
            case 2:
                kata = "Dua";
                break;
            case 3:
                kata = "Tiga";
                break;
            case 4:
                kata = "Empat";
                break;
            case 5:
                kata = "Lima";
                break;
            case 6:
                kata = "Enam";
                break;
            case 7:
                kata = "Tujuh";
                break;
            case 8:
                kata = "Delapan";
                break;
            case 9:
                kata = "Sembilan";
                break;
            case 10:
                kata = "Sepuluh";
                break;
            default:
                kata = "Invalid number";
                break;
        }

        System.out.println(kata);
    }
}
    

