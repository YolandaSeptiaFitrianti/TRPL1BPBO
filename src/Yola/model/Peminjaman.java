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
    private Anggota anggota;
    private Buku buku;
    private String Tglpinjam;
    private String Tglkembali;
    
    public Peminjaman(String b001, String bumi, String tere_Liye, String fajar_Pagi){
    }
    
    public Peminjaman (String kodeanggota, String kodebuku, String kodepeminjaman, String tglpinjam, String tglkembali){
        this.anggota = anggota;
        this.buku = buku;
        this.Tglpinjam = tglpinjam;
        this.Tglkembali = tglkembali;
    }

    public Anggota getAnggota() {
        return anggota;
    }

    public void setAnggota(Anggota anggota) {
        this.anggota = anggota;
    }

    public Buku getBuku() {
        return buku;
    }

    public void setBuku(Buku buku) {
        this.buku = buku;
    }

    public String getTglpinjam() {
        return Tglpinjam;
    }

    public void setTglpinjam(String Tglpinjam) {
        this.Tglpinjam = Tglpinjam;
    }

    public String getTglkembali() {
        return Tglkembali;
    }

    public void setTglkembali(String Tglkembali) {
        this.Tglkembali = Tglkembali;
    }
}