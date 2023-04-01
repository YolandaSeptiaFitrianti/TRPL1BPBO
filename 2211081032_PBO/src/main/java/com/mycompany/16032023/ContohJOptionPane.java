/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yolanda160323;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class ContohJOptionPane {
    public static void main(String[] args){
    String name = "";
    name = JOptionPane.showInputDialog("Please enter your name");
    String mag = "Hello" + name + "!";
    
    JOptionPane.showMessageDialog(null,mag);

    }
}