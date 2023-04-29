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
public interface BukuDao {
    void save(Buku buku);
    void update(int index, Buku buku);
    void delete(int index);
    Buku getBuku(int index);
    List<Buku> getAll();
}
