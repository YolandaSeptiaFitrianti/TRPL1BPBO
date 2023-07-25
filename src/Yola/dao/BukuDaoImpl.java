/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Yola.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import Yola.model.Buku;

/**
 *
 * @author User
 */
public class BukuDaoImpl implements BukuDao{
    private Connection connection;
    
    public BukuDaoImpl(Connection connection) {
        this.connection = connection;
    }
    
    public void insert (Buku buku) throws Exception{
        String sql = "INSERT INTO buku values(?,?,?,?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, buku.getKodebuku());
        ps.setString(2, buku.getJudulbuku());
        ps.setString(3, buku.getPengarang());
        ps.setString(4, buku.getPenerbit());
        ps.executeUpdate();
        ps.close();
    }
    
    public void update (Buku buku) throws Exception {
        String sql = "UPDATE buku SET judulbuku = ?, pengarang = ?, penerbit = ? "
                + "WHERE kodebuku = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, buku.getJudulbuku());
        ps.setString(2, buku.getPengarang());
        ps.setString(3, buku.getPenerbit());
        ps.setString(4, buku.getKodebuku());
        ps.executeUpdate();
    }
    
    public void delete(Buku buku) throws Exception{
        String sql = "DELETE FROM buku WHERE kodebuku =?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, buku.getKodebuku());
        ps.executeUpdate();
        ps.close();
    }
    
    public Buku getBuku(String kodebuku) throws Exception{
        String sql = "Select * FROM buku WHERE kodebuku =?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, kodebuku);
        ResultSet rs = ps.executeQuery();
        Buku buku = null;
        if(rs.next()){
            buku = new Buku();
            buku.setKodebuku(rs.getString(1));
            buku.setJudulbuku(rs.getString(2));
            buku.setPengarang(rs.getString(3));
            buku.setPenerbit(rs.getString(4));
        }
        return buku;
    }
    
    public List<Buku> getAll() throws Exception{
        String sql = "Select * FROM buku";
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        Buku buku;
        List<Buku> list = new ArrayList<>();
        while(rs.next()){
            buku = new Buku();
            buku.setKodebuku(rs.getString(1));
            buku.setJudulbuku(rs.getString(2));
            buku.setPengarang(rs.getString(3));
            buku.setPenerbit(rs.getString(4));
            list.add(buku);
        }
        return list;
    }
}