/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Yola.dao;

import Yola.model.Anggota;
import Yola.model.Buku;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import Yola.model.Pengembalian;
import java.sql.SQLException;

/**
 *
 * @author YOLANDA SEPTIA FITRI
 */
public class PengembalianDaoImpl implements PengembalianDao{
    private Connection connection;
    
    public PengembalianDaoImpl(Connection connection){
        this.connection = connection;
    }
    
    public void insert (Pengembalian pengembalian) throws SQLException{
        String sql = "INSERT INTO peminjaman values(?,?,?,?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, pengembalian.getKodeanggota());
        ps.setString(2, pengembalian.getKodebuku());
        ps.setString(3, pengembalian.getTglpinjam());
        ps.setString(4, pengembalian.getTglkembali());
        ps.executeUpdate();
    }
    
    public void update(Pengembalian pengembalian) throws SQLException{
        String sql = "UPDATE buku SET kodeanggota = ?, kodebuku = ?, kodepeminjaman = ?, tglpinjam = ?"
                + "WHERE tglkembali = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, pengembalian.getTglkembali());
        ps.setString(2, pengembalian.getKodeanggota());
        ps.setString(3, pengembalian.getKodebuku());
        ps.setString(4, pengembalian.getTglpinjam());
        ps.executeUpdate();
    }
    
    public void delete(Pengembalian pengembalian) throws SQLException{
        String sql = "DELETE FROM buku WHERE kodeanggota =?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, pengembalian.getKodeanggota());
        ps.executeUpdate();
        ps.close();
    }
    
    public Pengembalian getPengembalian(String kodeanggota, String kodebuku, String tglpinjam) throws SQLException, Exception{
        String sql = "Select * FROM peminjaman "
                + "where nobp = ? and kodebuku = ? and tglpinjam = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, kodeanggota);
        ps.setString(2, kodebuku);
        ps.setString(3, tglpinjam);
        ResultSet rs = ps.executeQuery();
        Pengembalian pengembalian = null;
        if(rs.next()){
            pengembalian = new Pengembalian("B001", "Bumi", "Tere Liye", "Fajar Pagi");
            AnggotaDao anggotaDao = new AnggotaDaoImpl(connection);
            Anggota anggota = anggotaDao.getAnggota(kodeanggota);
            pengembalian.setAnggota(anggota);
            BukuDao bukuDao = new BukuDaoImpl(connection);
            
            Buku buku = bukuDao.getBuku(kodebuku);
            pengembalian.setBuku(buku);
            
            pengembalian.setTglpinjam(rs.getString(3));
            pengembalian.setTglkembali(rs.getString(4));
        }
        return pengembalian;
    }
    
    public List<Pengembalian> getAll() throws Exception{
        String sql = "Select * FROM peminjaman";
        PreparedStatement ps = connection.prepareStatement(sql);
        Pengembalian pengembalian;
        ResultSet rs = ps.executeQuery();
        List<Pengembalian> list = new ArrayList<>();
        while(rs.next()){
            pengembalian = new Pengembalian("B001", "Bumi", "Tere Liye", "Fajar Pagi");
            AnggotaDao anggotaDao = new AnggotaDaoImpl(connection);
            Anggota anggota = anggotaDao.getAnggota(rs.getString(1));
            pengembalian.setAnggota(anggota);
            BukuDao bukuDao = new BukuDaoImpl(connection);
            Buku buku = bukuDao.getBuku(rs.getString(2));
            pengembalian.setBuku(buku);
            pengembalian.setTglpinjam(rs.getString(3));
            pengembalian.setTglkembali(rs.getString(4));
            list.add(pengembalian);
        }
        return list;
    }

    @Override
    public Pengembalian getPeminjaman(String nobp, String kodebuku, String tglpinjam) throws SQLException, Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}