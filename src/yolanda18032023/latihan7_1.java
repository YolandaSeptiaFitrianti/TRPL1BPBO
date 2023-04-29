/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yolanda18032023;

/**
 *
 * @author LABP1KOMP
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
public class latihan7_1 {
    public static void main(String[] args) {
        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        int i = 0;
        System.out.println("Using while-loop:");
        while (i < daysOfWeek.length) {
            System.out.println(daysOfWeek[i]);
            i++;
        }

        System.out.println("Using do-while loop:");
        i = 0;
        do {
            System.out.println(daysOfWeek[i]);
            i++;
        } while (i < daysOfWeek.length);

        System.out.println("Using for loop:");
        for (int j = 0; j < daysOfWeek.length; j++) {
            System.out.println(daysOfWeek[j]);
        }
    }
}