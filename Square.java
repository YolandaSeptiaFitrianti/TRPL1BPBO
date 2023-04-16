/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yolanda08042023;

/**
 *
 * @author YOLANDA SEPTIA FITRI
 */
public class Square extends Shape{
    private double side;
    
    public Square(double side){
        this.side = side;
    }
    
    public double getArea(){
        return side * side;
    }
    
    public String getName(){
        return "Square";
    }
    
    public double getSide(){
        return side;
    }
}
