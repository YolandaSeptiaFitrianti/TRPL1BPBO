/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yolanda180323;

/**
 *
 * @author Lab_Jaringan_05
 */

import javax.swing.JOptionPane;

public class Latihan6_1_2 {
  public static void main(String[] args) {
    // Meminta input dari user menggunakan JOptionPane
    String input1 = JOptionPane.showInputDialog("Masukkan nilai ujian pertama:");
    String input2 = JOptionPane.showInputDialog("Masukkan nilai ujian kedua:");
    String input3 = JOptionPane.showInputDialog("Masukkan nilai ujian ketiga:");

    // Mengubah input menjadi bilangan bulat
    int nilai1 = Integer.parseInt(input1);
    int nilai2 = Integer.parseInt(input2);
    int nilai3 = Integer.parseInt(input3);

    // Menghitung rata-rata dari tiga nilai
    double rataRata = (double) (nilai1 + nilai2 + nilai3) / 3;

    // Menampilkan hasil menggunakan JOptionPane
    if (rataRata >= 60) {
      JOptionPane.showMessageDialog(null, "Nilai rata-rata: " + rataRata + " :)");
    } else {
      JOptionPane.showMessageDialog(null, "Nilai rata-rata: " + rataRata + " :(");
    }
  }
}

