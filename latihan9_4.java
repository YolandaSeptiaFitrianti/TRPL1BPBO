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
public class latihan9_4 {
 public static void main(String[] arguments){
     String str1, str2;
     str1 = "Free the bound periodicals.";
     str2 = str1;
     System.out.println("String1: "+str1);
     System.out.println("String:"+str2);
     System.out.println("Same object? " + (str1 == str2));
     
     str2 = new String(str1);
     
     System.out.println("String1: " + str1);
     System.out.println("String: " + str2);
     System.out.println("Same object? " + (str1 == str2));
     System.out.println("Same4 value? " + str1.equals(str2));
 }   
}
