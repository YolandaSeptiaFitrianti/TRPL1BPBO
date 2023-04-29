/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yolanda08042023;

/**
 *
 * @author YOLANDA SEPTIA FITRI
 */
public class Person {
    
    protected String name;
    protected String address;
    
    public Person(){
        System.out.println("Inside Person : Constructor");
    }
    
    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }
    
    public String getName(){
        System.out.println("Person: getName");
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
}