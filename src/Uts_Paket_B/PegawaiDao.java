/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Uts_Paket_B;
import java.util.List;

/**
 *
 * @author YOLANDA SEPTIA FITRI
 */
public interface PegawaiDao {
    void save(Pegawai pegawai);
    void update(int index, Pegawai pegawai);
    void delete(int index);
    Pegawai getPegawai(int index);
    List<Pegawai> getAll();
}