/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yolanda18032023;

/**
 *
 * @author USER
 */

    
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;

public class Latihan7_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] numbers = new int[10];

        for (int i = 0; i < 10; i++) {
            String input = JOptionPane.showInputDialog(null, "Masukkan nomor ke-" + (i+1));
            int number = Integer.parseInt(input);
            numbers[i] = number;
        }

        int largest = numbers[0];

        for (int i = 1; i < 10; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        JOptionPane.showMessageDialog(null, "Nomor terbesar yang dimasukkan adalah " + largest);
    }
}