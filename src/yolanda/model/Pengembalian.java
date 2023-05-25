/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yolanda.model;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author YOLANDA SEPTIA FITRI
 */
public class Pengembalian {
    private String dikembalikan;
    private int terlambat;
    private double denda;
    private String strterlambat;
    private String strdenda;
    
    public Pengembalian(){}
    
    public Pengembalian(String tglKembali, String dikembalikan){
        this.dikembalikan = dikembalikan;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd//MM//yyyy");
        try{
            LocalDate deadline = LocalDate.parse(tglKembali, formatter);
            LocalDate tanggalKmbl = LocalDate.parse(this.dikembalikan, formatter);
            
            //nyari denda
            denda = (double)terlambat*500;
            strdenda = ""+denda;
        }catch(Exception e){
            strterlambat = "";
            terlambat = -1;
            strdenda = "";
            denda = -1;
        }
    }
    
    public String getDikemblaikan(){
        return dikembalikan;
    }
    
    public String getTerlambat(){
        return strterlambat;
    }
    
    public String getDenda(){
        return strterlambat;
    }
    
    public void setDikembalikan(String dikembalikan){
        this.dikembalikan = dikembalikan;
    }
    
    public void serTerlambat(String tglKembali){
        try{
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd//MM//yyyy");
            LocalDate deadline = LocalDate.parse(tglKembali, formatter);
            LocalDate tanggalKmbl = LocalDate.parse(this.dikembalikan, formatter);
            
            terlambat = 0;
            if (tanggalKmbl.isAfter(deadline)){
                terlambat = tanggalKmbl.compareTo(deadline);
            }
            strterlambat = String.valueOf(terlambat);
        }catch(Exception e){
            terlambat = -1;
            strterlambat = "";
        }
    }
    public void setDenda(){
        if(terlambat != -1){
            denda = (double)terlambat*500;
            strdenda = "" + denda;
        }else{
            denda = -1;
            strdenda = "";
        }
    }
}