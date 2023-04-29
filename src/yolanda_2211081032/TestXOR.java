/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yolanda_2211081032;

/**
 *
 * @author LABSIKOMP03
 */
public class TestXOR {
    public static void main(String[] args){
        boolean vel1 = true;
        boolean vel2 = true;
        System.out.println(vel1 ^ vel2);
        
        vel1 = false;
        vel2 = true;
        System.out.println(vel1 ^ vel2);
        
        vel1 = false;
        vel2 = false;
        System.out.println(vel1 ^ vel2);
        
        vel1 = true;
        vel2 = false;
        System.out.println(vel1 ^ vel2);
    }
}
