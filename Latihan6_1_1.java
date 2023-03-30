/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yolanda180323;

/**
 *
 * @author Lab_Jaringan_05
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Latihan6_1_1 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    // Meminta tiga input dari user
    System.out.print("Masukkan nilai ujian pertama: ");
    double nilai1 = Double.parseDouble(br.readLine());
    
    System.out.print("Masukkan nilai ujian kedua: ");
    double nilai2 = Double.parseDouble(br.readLine());
    
    System.out.print("Masukkan nilai ujian ketiga: ");
    double nilai3 = Double.parseDouble(br.readLine());
    
    // Menghitung nilai rata-rata dari tiga ujian
    double rata = (nilai1 + nilai2 + nilai3) / 3;
    
    // Menampilkan nilai rata-rata dan smiley face atau :( sesuai kondisi
    System.out.print("Nilai rata-rata dari tiga ujian adalah " + rata);
    if (rata >= 60) {
      System.out.print(" :)");
    } else {
      System.out.print(" :(");
    }
  }
}

