/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Yola.dao;

import Yola.model.Pengembalian;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author YOLANDA SEPTIA FITRI
 */
public interface PengembalianDao {
    void insert (Pengembalian pengembalian) throws SQLException;
    void update (Pengembalian pengembalian) throws SQLException;
    void delete (Pengembalian pengembalian) throws SQLException;
    Pengembalian getPeminjaman (String nobp, String kodebuku, String tglpinjam) throws SQLException,Exception;
    List <Pengembalian> getAll() throws Exception;
}