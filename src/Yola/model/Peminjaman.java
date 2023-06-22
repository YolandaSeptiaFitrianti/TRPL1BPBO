/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Yola.model;

/**
 *
 * @author YOLANDA SEPTIA FITRI
 */
public class Peminjaman {
    private String kodeanggota;
    private String kodebuku;
    private String kodepeminjaman;
    private String tglpinjam;
    private String tglkembali;
    
    public Peminjaman(){
    }
    
    public Peminjaman (String kodeanggota, String kodebuku, String kodepeminjaman, String tglpinjam, String tglkembali){
        this.kodeanggota = kodeanggota;
        this.kodebuku = kodebuku;
        this.kodepeminjaman = kodepeminjaman;
        this.tglpinjam = tglpinjam;
        this.tglkembali = tglkembali;
    }
    
    public String getkodeanggota(){
        return kodeanggota;
    }
    
    public void setkodeanggota(String kodeanggota){
        this.kodeanggota = kodeanggota;
    }
    
    public String getkodepeminjaman(){
        return kodepeminjaman;
    }
    
    public void settglpinjam(String tglpinjam){
        this.tglpinjam = tglpinjam;
    }
    
    public String gettglkembali(){
        return tglkembali;
    }
    
    public void setPengarang(String pengarang){
        this.pengarang = pengarang;
    }
    
    public String getPenerbit(){
        return penerbit;
    }
    
    public void setPenerbit(String penerbit){
        this.penerbit = penerbit;
    }
}