/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yolanda01042023;

/**
 *
 * @author User
 */
public class StudentRecordExampe {
    public static void main(String[] args){
        StudentRecord anna = new StudentRecord();
        StudentRecord cris = new StudentRecord();
        StudentRecord ali = new StudentRecord("ali");
        
        //isi data
        anna.setName("Anna");
        anna.setAddress("Padang");
        anna.setAge(18);
        anna.setmathGrade(80);
        anna.setenglishGrade(98);
        anna.setscienceGrade(78);
        
        cris.setName("Kris");
        cris.setAddress("Bukittinggi");
        cris.setAge(20);
        
        ali.setName("Ali");
        ali.setAddress("Bandung");
        ali.setAge(22);
        
        //menampilkan
        System.out.println("Data Objek Anna");
        System.out.println("Nama            :" + anna.getName());
        System.out.println("Alamat          :" + anna.getAddress());
        System.out.println("Umur            :" + anna.getAge());
        System.out.println("Math Grade      :" + anna.getmathGrade());
        System.out.println("English Grade   :" + anna.getenglishGrade());
        System.out.println("Science Grade   :" + anna.getscienceGrade());
        System.out.println("Rata-rata       :" + anna.getAverage());
        System.out.println("Nilai Huruf     :" + anna.getnilaiHuruf());
        
        System.out.println("");
        
        //memanggil method print
        System.out.println("Data Objek Kris");
        cris.print("");
        cris.print(70, 80, 90);
        
        System.out.println("");
        System.out.println("Data Objek Ali");
        ali.print("");
        
        //menampilkan jumlah siswa
        System.out.println("");
        System.out.println("Count = " +StudentRecord.getstudentCount());
    }
}