/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Yolanda160323;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class Latihan61b {
  public static void main(String[] args) {
    String input1 = JOptionPane.showInputDialog("Masukkan nilai ujian 1:");
    double ujian1 = Double.parseDouble(input1);

    String input2 = JOptionPane.showInputDialog("Masukkan nilai ujian 2:");
    double ujian2 = Double.parseDouble(input2);

    String input3 = JOptionPane.showInputDialog("Masukkan nilai ujian 3:");
    double ujian3 = Double.parseDouble(input3);

    double rataRata = (ujian1 + ujian2 + ujian3) / 3;

    JOptionPane.showMessageDialog(null, "Rata-rata nilai ujian: " + rataRata + (rataRata >= 60 ? " :)" : " :("));
  }
}