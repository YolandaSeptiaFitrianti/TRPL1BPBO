/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Yola.controller;


import Yola.dao.*;
import Yola.db.DbHelper;
import Yola.model.*;
import Yola.view.FormPengembalian;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP-PC
 */
public class PengembalianController {
    FormPengembalian form;
    Pengembalian kembali;
    PengembalianDao kembaliDao;
    AnggotaDao agtDao;
    BukuDao bkDao;
    private FormPengembalian formPengembalian;
    
    public PengembalianController(FormPengembalian formPengembalian){
        try {
            this.formPengembalian = formPengembalian;
            kembaliDao = new PengembalianDaoImpl(DbHelper.getConnection());
            agtDao = new AnggotaDaoImpl(DbHelper.getConnection());
            bkDao = new BukuDaoImpl(DbHelper.getConnection());
        } catch (SQLException ex) {
            Logger.getLogger(PengembalianController.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
    
    public void bersihform(){
        form.getTxtTglkembali().setText(" ");
        form.getTxtTgpinjam().setText(" ");
    }
    
    public void isiComboAnggota(){
        try {
            form.getCboAnggota().removeAllItems();
            List<Anggota> list = agtDao.getAll();
            for(Anggota agt:list){
                form.getCboAnggota().addItem(agt.getKodeanggota()+"-"+agt.getNamaanggota());
            }
        } catch (Exception ex) {
            Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void isiComboBuku(){
        try {
            form.getCboBuku().removeAllItems();
            List<Buku> list = bkDao.getAll();
            for(Buku bk: list){
                form.getCboBuku().addItem(bk.getKodeBuku()+"-"+bk.getJudulBuku());
            }
        } catch (Exception ex) {
            Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void insert(){
        try {
            kembali = new Pengembalian("B001", "Bumi", "Tere Liye", "Fajar Pagi");
            Anggota agt = agtDao.getAnggota(form.getCboAnggota().getSelectedItem().toString().split("-")[0]);
            kembali.setAnggota(agt);
            Buku bk = bkDao.getBuku(form.getCboBuku().getSelectedItem().toString().split("-")[0]);
            kembali.setBuku(bk);
            kembali.setTglpinjam(form.getTxtTgpinjam().getText());
            kembali.setTglkembali(form.getTxtTglkembali().getText());
            kembaliDao.insert(kembali);
            JOptionPane.showMessageDialog(form, "Entri data OK");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(form, "Entri data OK");
            Logger.getLogger(PengembalianController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void update(){
        try {
            Anggota agt = agtDao.getAnggota(form.getCboAnggota().getSelectedItem().toString().split("-")[0]);
            kembali.setAnggota(agt);
            Buku bk = bkDao.getBuku(form.getCboBuku().getSelectedItem().toString().split("-")[0]);
            kembali.setBuku(bk);
            kembali.setTglpinjam(form.getTxtTgpinjam().getText());
            kembali.setTglkembali(form.getTxtTglkembali().getText());
            kembaliDao.insert(kembali);
            JOptionPane.showMessageDialog(form, "Update data OK");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(form, "Update data OK");
            Logger.getLogger(PengembalianController.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }
    
    public void delete(){
        try {
            kembaliDao.delete(kembali);
            JOptionPane.showMessageDialog(form, "Delete OK");
        } catch (Exception ex) {
            Logger.getLogger(PengembalianController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void getPeminjaman(){
        try {
            String kodeanggota = form.getTblPengembalian()
                    .getValueAt(form.getTblPengembalian().getSelectedRow(), 0).toString();
            String kodebuku = form.getTblPengembalian()
                    .getValueAt(form.getTblPengembalian().getSelectedRow(), 2).toString();
            String tglpinjam = form.getTblPengembalian()
                    .getValueAt(form.getTblPengembalian().getSelectedRow(), 4).toString();
            
            kembali = kembaliDao.getPengembalian(kodeanggota, kodebuku, tglpinjam);
            Anggota agt= agtDao.getAnggota(kembali.getAnggota().getKodeanggota());
            form.getCboAnggota().setSelectedItem(agt.getKodeanggota()+"-"+agt.getNamaanggota());
            Buku bk= bkDao.getBuku(kembali.getBuku().getKodeBuku());
            form.getCboBuku().setSelectedItem(bk.getKodeBuku()+"-"+bk.getJudulBuku());
            form.getTxtTgpinjam().setText(kembali.getTglpinjam());
            form.getTxtTglkembali().setText(kembali.getTglkembali());
        } catch (Exception ex) {
            Logger.getLogger(PengembalianController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void tampil(){
        try {
            DefaultTableModel tableModel =(DefaultTableModel) form.getTblPengembalian().getModel();
            tableModel.setRowCount(0);
            List<Pengembalian> list = kembaliDao.getAll();
            for(Pengembalian kembali: list){
                Anggota agt= agtDao.getAnggota(kembali.getAnggota().getKodeanggota());
                Buku bk = bkDao.getBuku(kembali.getBuku().getKodeBuku());
                Object[] row = {
                    agt.getKodeanggota(),
                    agt.getNamaanggota(),
                    bk.getKodeBuku(),
                    bk.getJudulBuku(),
                    kembali.getTglpinjam(),
                    kembali.getTglkembali()
                        
                        
                };
                tableModel.addRow(row);
            }
        } catch (Exception ex) {
            Logger.getLogger(PengembalianController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void clearForm() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
