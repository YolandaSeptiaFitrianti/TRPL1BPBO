/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yolanda27042023;

/**
 *
 * @author YOLANDA SEPTIA FITRI
 */
public class Peminjaman {
    private String nobp;
    private String kodebuku;
    private String tglpinjam;
    private String tglkembali;
    
    public Peminjaman(){
    }
    
    public Peminjaman (String nobp, String kodebuku, String tglpinjam, String tglkembali){
        this.nobp = nobp;
        this.kodebuku = kodebuku;
        this.tglpinjam = tglpinjam;
        this.tglkembali = tglkembali;
    }
    
    public String getNobp(){
        return nobp;
        }
    public void setNobp(String nobp){
        this.nobp = nobp;
    }
    
    public String getKodebuku(){
        return kodebuku;
    }
    
    public void setKodebuku(String kodebuku){
        this.kodebuku = kodebuku;
    }
    
    public String getTglpinjam(){
        return tglpinjam;
    }
    
    public void setTglpinjam(String tglpinjam){
        this.tglpinjam = tglpinjam;
    }
    
    public String getTglkembali(){
        return tglkembali;
    }
    
    public void setTglkembali(String tglkembali){
        this.tglkembali = tglkembali;
    }
}
