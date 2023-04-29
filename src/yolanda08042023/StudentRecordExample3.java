/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yolanda08042023;

/**
 *
 * @author LABP1KOMP
 */
public class StudentRecordExample3 {
    public static void main(String[] args) {
        StudentRecord3 yolanda = new StudentRecord3();
        yolanda.NilaiHuruf();
        yolanda.getAverage();
        
        
        System.out.println("Student Record:");
        
        yolanda.setName("yola");
        yolanda.setAge(19);
        yolanda.setMathGrade(90);
        yolanda.setenglishGrade(90);
        yolanda.setscienceGrade(70);
        System.out.println();
        
        //menampilkan data
        System.out.println("Biodata yolanda");
        System.out.println("Nama                :" +yolanda.getName());
        System.out.println("Alamat              :" +yolanda.getAddress());
        System.out.println("Umur                :" +yolanda.getAge());
        System.out.println("Nilai rata-rata     :" +yolanda.getAverage());
        System.out.println("nilai huruf         :" +yolanda.NilaiHuruf());
        
        
        System.out.println();
    }
}