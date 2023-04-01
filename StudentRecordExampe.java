/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yolanda01042023;

/**
 *
 * @author YOLANDA SEPTIA FITRI
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
        
        cris.setName("Kris");
        cris.setAddress("Bukittinggi");
        cris.setAge(20);
        
        //menampilkan
        System.out.println("Data Objek Anna");
        System.out.println("Nama        :" + anna.getName());
        System.out.println("Alamat      :" + anna.getAddress());
        System.out.println("Umur        :" + anna.getAge());
        
        //memanggil method print
        System.out.println("Data Objek Kris");
        cris.print("");
        cris.print(70, 80, 90);
        
        System.out.println("Data Objek Kris");
        ali.print("");
        
        //menampilkan jumlah siswa
        System.out.println("Count = " +StudentRecord.getstudentCount());
    }
}