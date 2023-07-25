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
import Yola.model.Peminjaman;
import java.sql.SQLException;

/**
 *
 * @author YOLANDA SEPTIA FITRI
 */
public class PeminjamanDaoImpl implements PeminjamanDao{
    private Connection connection;
    
    public PeminjamanDaoImpl(Connection connection){
        this.connection = connection;
    }
    
    public void insert (Peminjaman peminjaman) throws SQLException{
        String sql = "INSERT INTO peminjaman values(?,?,?,?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, peminjaman.getAnggota().getKodeanggota());
        ps.setString(2, peminjaman.getBuku().getKodebuku());
        ps.setString(3, peminjaman.getTglpinjam());
        ps.setString(4, peminjaman.getTglkembali());
        ps.executeUpdate();
    }
    
    public void update(Peminjaman peminjaman) throws SQLException{
        String sql = "UPDATE buku SET kodeanggota = ?, kodebuku = ?, kodepeminjaman = ?, tglpinjam = ?"
                + "WHERE tglkembali = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, peminjaman.getTglkembali());
        ps.setString(2, peminjaman.getAnggota().getKodeanggota());
        ps.setString(3, peminjaman.getBuku().getKodebuku());
        ps.setString(4, peminjaman.getTglpinjam());
        ps.executeUpdate();
    }
    
    public void delete(Peminjaman peminjaman) throws SQLException{
        String sql = "DELETE FROM buku WHERE kodeanggota =?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, peminjaman.getAnggota().getKodeanggota());
        ps.executeUpdate();
        ps.close();
    }
    
    public Peminjaman getPeminjaman(String kodeanggota, String kodebuku, String tglpinjam) throws SQLException, Exception{
        String sql = "Select * FROM peminjaman "
                + "where nobp = ? and kodebuku = ? and tglpinjam = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, kodeanggota);
        ps.setString(2, kodebuku);
        ps.setString(3, tglpinjam);
        ResultSet rs = ps.executeQuery();
        Peminjaman peminjaman = null;
        if(rs.next()){
            peminjaman = new Peminjaman("B001", "Bumi", "Tere Liye", "Fajar Pagi");
            AnggotaDao anggotaDao = new AnggotaDaoImpl(connection);
            Anggota anggota = anggotaDao.getAnggota(kodeanggota);
            peminjaman.setAnggota(anggota);
            BukuDao bukuDao = new BukuDaoImpl(connection);
            
            Buku buku = bukuDao.getBuku(kodebuku);
            peminjaman.setBuku(buku);
            
            peminjaman.setTglpinjam(rs.getString(3));
            peminjaman.setTglkembali(rs.getString(4));
        }
        return peminjaman;
    }
    
    public List<Peminjaman> getAll() throws Exception{
        String sql = "Select * FROM peminjaman";
        PreparedStatement ps = connection.prepareStatement(sql);
        Peminjaman peminjaman;
        ResultSet rs = ps.executeQuery();
        List<Peminjaman> list = new ArrayList<>();
        while(rs.next()){
            peminjaman = new Peminjaman("B001", "Bumi", "Tere Liye", "Fajar Pagi");
            AnggotaDao anggotaDao = new AnggotaDaoImpl(connection);
            Anggota anggota = anggotaDao.getAnggota(rs.getString(1));
            peminjaman.setAnggota(anggota);
            BukuDao bukuDao = new BukuDaoImpl(connection);
            Buku buku = bukuDao.getBuku(rs.getString(2));
            peminjaman.setBuku(buku);
            peminjaman.setTglpinjam(rs.getString(3));
            peminjaman.setTglkembali(rs.getString(4));
            list.add(peminjaman);
        }
        return list;
    }
}