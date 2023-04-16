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
public class StudentRecordExtends  extends StudentRecord3{
     private double Computer; 
     public StudentRecordExtends(String a, String b){
         super(a,b);
     }
     public void setComputer(double Computer){
        this.Computer = Computer;
    } 
     public double getComputer(){
        return Computer;
    }
     public double getAverage(){
        average = (mathGrade + englishGrade + scienceGrade + Computer) /4;
        return average;
    }
}
