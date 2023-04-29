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
public class Latihan61 {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Masukkan nilai ujian 1: ");
    double ujian1 = Double.parseDouble(reader.readLine());

    System.out.print("Masukkan nilai ujian 2: ");
    double ujian2 = Double.parseDouble(reader.readLine());

    System.out.print("Masukkan nilai ujian 3: ");
    double ujian3 = Double.parseDouble(reader.readLine());

    double rataRata = (ujian1 + ujian2 + ujian3) / 3;

    System.out.println("Rata-rata nilai ujian: " + rataRata + (rataRata >= 60 ? " :)" : " :("));
  }
}