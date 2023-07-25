/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Yola.dao;

import Yola.model.Peminjaman;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author YOLANDA SEPTIA FITRI
 */
public interface PeminjamanDao {
    void insert (Peminjaman peminjaman) throws SQLException;
    void update (Peminjaman peminjaman) throws SQLException;
    void delete (Peminjaman peminjaman) throws SQLException;
    Peminjaman getPeminjaman (String nobp, String kodebuku, String tglpinjam) throws SQLException,Exception;
    List <Peminjaman> getAll() throws Exception;
}