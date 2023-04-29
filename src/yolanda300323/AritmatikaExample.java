/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yolanda300323;

/**
 *
 * @author LABP1KOMP
 */
public class AritmatikaExample {
    public static void main(String[] args){
        Aritmatika aritmatika = new Aritmatika();
        boolean hasil = aritmatika.cekGanjil(5);
        int c = aritmatika.tambah(10,5);
        System.out.println("C :"+c);
        System.out.println("Ganjil"+aritmatika.tambah(10,5));
        System.out.println(hasil);
        aritmatika.cekGanjil(c=5);
    }
}
