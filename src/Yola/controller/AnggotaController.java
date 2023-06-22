/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Yola.controller;
import Yola.model.*;
import Yola.dao.*;
import Yola.view.*;
import Yola.db.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author YOLANDA SEPTIA FITRI
 */
public class AnggotaController {
    FormAnggota view;
    Anggota anggota;
    AnggotaDao dao;
    Connection connection;
    
    public AnggotaController(FormAnggota view){
        try {
            this.view = view;
            connection = DbHelper.getConnection();
            dao = new AnggotaDaoImpl(connection);
        } catch (SQLException ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        }
}

public void clearFrom(){
    view.getTxtKode().setText("");
    view.getTxtNama().setText("");
    view.getTxtAlamat().setText("");
    view.getCboJenis().removeAllItems();
    view.getCboJenis().addItem("L");
    view.getCboJenis().addItem("P");
}
 
public void tampil(){
    try {
        DefaultTableModel tabelModel = (DefaultTableModel)
               view.getTblAnggota().getModel();
        tabelModel.setRowCount(0);
        List<Anggota> list = dao.getAll();
        for (Anggota a : list){
            Object[] row = {
                a.getKodeanggota(),
                a.getNamaanggota(),
                a.getAlamat(),
                a.getJeniskelamin()
            };
            tabelModel.addRow(row);
        }
    } catch (Exception ex) {
        Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
    }
}

public void insert(){
    try{
        anggota = new Anggota();
        anggota.setKodeanggota(view.getTxtKode().getText());
        anggota.setNamaanggota(view.getTxtNama().getText());
        anggota.setAlamat(view.getTxtAlamat().getText());
        anggota.setJeniskelamin(view.getCboJenis().getSelectedItem().toString());
        
        dao.insert(anggota);
        JOptionPane.showMessageDialog(view, "Entri Data Ok");
    } catch (Exception ex){
        JOptionPane.showMessageDialog(view, ex.getMessage());
        Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
    }
}

public void delete(){
   try{
       dao.delete(anggota);
       JOptionPane.showMessageDialog(view,"Delete Data Ok");
   } catch (Exception ex){
       Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
   } 
}

public void tabelKlik(){
    try{
    String Kodeanggota = view.getTblAnggota().getValueAt(view.getTblAnggota().getSelectedRow(), 0).toString();
    anggota = dao.getAnggota(Kodeanggota);
    view.getTxtKode().setText(anggota.getKodeanggota());
    view.getTxtNama().setText(anggota.getNamaanggota());
    view.getTxtAlamat().setText(anggota.getAlamat());
    view.getCboJenis().setSelectedItem(anggota.getJeniskelamin());
    } catch (Exception ex){
         Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
    }
}

public void update(){
    try{
        anggota.setKodeanggota(view.getTxtKode().getText());
        anggota.setNamaanggota(view.getTxtNama().getText());
        anggota.setAlamat(view.getTxtAlamat().getText());
        anggota.setJeniskelamin(view.getCboJenis().getSelectedItem().toString());
        dao.update(anggota);
        JOptionPane.showMessageDialog(view, "Update Data Ok");
    } catch (Exception ex){
            JOptionPane.showMessageDialog(view, ex.getMessage());
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
    }
}
}