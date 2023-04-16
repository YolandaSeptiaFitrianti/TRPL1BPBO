/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yolanda08042023;

import yolanda01042023.*;

/**
 *
 * @author User
 */
public class StudentRecord3 {
    private String name;
    private String address;
    private int age;
    protected double mathGrade;
    protected double englishGrade;
    protected double scienceGrade;
    protected double average; 
    
    private static int studentCount;//class variable
    private char Nilai;
    private char grade;
    
    public StudentRecord3(){
    //area inisialisasi kode;
        studentCount++;
    }
    public StudentRecord3(String temp){
        this.name = temp;
        studentCount++;
    }
    public StudentRecord3(String name, String address){
        this.name = name;
        this.address = address;
        studentCount++;
    }
    public StudentRecord3(double mGrade, double eGrade, double sGrade){
        mathGrade = mGrade;
        englishGrade = eGrade;
        scienceGrade = sGrade;
        studentCount++;
    } 
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    public String getAddress(){
        return address;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    public int getAge(){
        return age;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    public double getMathGrade(){
        return mathGrade;
    }
    
    public void setMathGrade(double mathGrade){
        this.mathGrade = mathGrade;
    }
    public double getenglishGrade(){
        return englishGrade;
    }
    
    public void setenglishGrade(double englishGrade){
        this.englishGrade = englishGrade;
    }
    public double getscienceGrade(){
        return scienceGrade;
    }
    
    public void setscienceGrade(double scienceGrade){
        this.scienceGrade = scienceGrade;
    }
    public double getAverage(){
        average = (mathGrade + englishGrade + scienceGrade) /3;
        return average;
    }
    
    /*public void setaverage(double average){
        this.average = average;
    }*/
    
    public static int getStudentCount(){
        return studentCount;
    }
    
    public void print( String temp ){
        System.out.println("Name:" + name);
        System.out.println("Address:" + address);
        System.out.println("Age:" + age);
    }
    public void print(double eGrade, double mGrade, double sGrade){
        //System.out.println("Name:" + name);
        System.out.println("Math Grade:" + mGrade);
        System.out.println("English Grade:" + eGrade);
        System.out.println("Science Grade:" + sGrade);
    }    
    public char NilaiHuruf(){
        double RataRata = getAverage();
        if (RataRata > 80) {
            grade = 'A';
        } else if (RataRata > 65) {
            grade = 'B';
        } else if (RataRata > 55) {
            grade = 'C';
        } else if (RataRata > 40) {
            grade = 'D';
        } else {
            grade = 'E';
        }
        return grade;
    }
}
