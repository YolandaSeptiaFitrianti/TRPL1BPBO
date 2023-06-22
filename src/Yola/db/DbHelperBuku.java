/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Yola.db;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Yola.dao.BukuDao;
import Yola.dao.BukuDaoImpl;
import Yola.model.Buku;

/**
 *
 * @author User
 */
public class DbHelperBuku {
    private static Connection connection;
    public static Connection getConnection() throws SQLException {
        if(connection==null){
            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setURL("jdbc:mysql://localhost/db_buku");
            dataSource.setUser("root");
            dataSource.setPassword("");
            connection = dataSource.getConnection();
        }
        return connection;
    }
    
    public static void main(String[] args){
        try {
            connection = DbHelperBuku.getConnection();
            BukuDao dao = new BukuDaoImpl(connection);
            Buku buku = new Buku("B001","Bumi","Tere Liye","Fajar Pagi");
            dao.insert(buku);
            JOptionPane.showMessageDialog(null, "Entri data OK");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
}