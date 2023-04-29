/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yolanda.model;
import java.util.List;
/**
 *
 * @author YOLANDA SEPTIA FITRI
 */
public interface PeminjamanDao {
    void save(Peminjaman Peminjaman);
    void update(int index, Peminjaman peminjaman);
    void delete(int index);
    Peminjaman getPeminjaman(int index);
    List<Peminjaman> getAll();
}