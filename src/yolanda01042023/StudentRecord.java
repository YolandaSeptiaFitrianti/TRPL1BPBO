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
public class StudentRecord {
    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;
    private char nilaiHuruf;
    
    private static int studentCount; //class variabel
    
    public StudentRecord()
    {
        //area inisialisasi kode; 
        studentCount++;
    } 

    public StudentRecord(String temp)
    { 
        this.name = temp;
        studentCount++;
    } 

    public StudentRecord(String name, String address)
    { 
        this.name = name; 
        this.address = address; 
        studentCount++;
    } 

    public StudentRecord(double mGrade, double eGrade, double sGrade)
    { 
        mathGrade = mGrade; 
        englishGrade = eGrade; 
        scienceGrade = sGrade;
        studentCount++;
    }
    
    public StudentRecord(char nHuruf)
    {
        nilaiHuruf = nHuruf;
    }
    //*************************************************
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    /////////////////////////////////////////////
    public String getAddress(){
        return address;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    /////////////////////////////////////////////
    public int getAge(){
        return age;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    ////////////////////////////////////////////
    public double getmathGrade(){
        return mathGrade;
    }
    
    public void setmathGrade(double mathGrade){
        this.mathGrade = mathGrade;
    }
    ////////////////////////////////////////////
    public double getenglishGrade(){
        return englishGrade;
    }
    
    public void setenglishGrade(double englishGrade){
        this.englishGrade = englishGrade;
    }
    ///////////////////////////////////////////
    public double getscienceGrade(){
        return scienceGrade;
    }
    
    public void setscienceGrade(double scienceGrade){
        this.scienceGrade = scienceGrade;
    }
    ////////////////////////////////////////////
    public double getAverage(){
        average = (mathGrade + englishGrade + scienceGrade) / 3;
        return average;
    }
    ///////////////////////////////////////////
    public char getnilaiHuruf(){
        if(getAverage() >80){
            nilaiHuruf = 'A';
        }
        else if(getAverage() >65){
            nilaiHuruf = 'B';
        }
        else if(getAverage() >55){
            nilaiHuruf = 'C';
        }
        else if(getAverage() >40){
            nilaiHuruf = 'D';
        }
        else{
            nilaiHuruf = 'E';
        }
        return nilaiHuruf;
    }
    //////////////////////////////////////////
    public void setnilaiHuruf(char nilaiHuruf){
        this.nilaiHuruf = nilaiHuruf;
    }
    //////////////////////////////////////////
    public static int getstudentCount(){
        return studentCount;
    }
    //////////////////////////////////////////
    public void print(String temp)
    { 
        System.out.println("Name            :" + name); 
        System.out.println("Address         :" + address); 
        System.out.println("Age             :" + age); 
    } 
    
    public void print(double eGrade, double mGrade, double sGrade)
    {
        System.out.println("Math Grade      :" + mGrade); 
        System.out.println("English Grade   :" + eGrade); 
        System.out.println("Science Grade   :" + sGrade);
    }
    
    public void print(char nHuruf)
    {
        System.out.println("Nilai Huruf     :" + nHuruf);
    }
}