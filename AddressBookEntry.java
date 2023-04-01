/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yolanda01042023;

/**
 *
 * @author User
 */
public class AddressBookEntry {
    private String name;
    private String address;
    private String phone_number;
    private String email;
    
    public AddressBookEntry(String name, String address, String phone_number, String email) {
        this.name = name;
        this.address = address;
        this.phone_number = phone_number;
        this.email = email;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getPhoneNumber() {
        return this.phone_number;
    }
    
    public void setPhoneNumber(String phone_number) {
        this.phone_number = phone_number;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
}

    

