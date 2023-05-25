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
public interface PengembalianDao {
    void save(Pengembalian pengembalian);
    void update(int idx, Pengembalian pengembalian);
    void delete(int idx);
    Pengembalian getPengembalian(int idx);
    List<Pengembalian> getAll();
}