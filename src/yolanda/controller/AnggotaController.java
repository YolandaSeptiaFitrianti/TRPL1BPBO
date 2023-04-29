/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yolanda.controller;
import yolanda.view.FormAnggota;
import yolanda.model.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author YOLANDA SEPTIA FITRI
 */
public class AnggotaController {
    private FormAnggota FormAnggota;
    private AnggotaDao anggotaDao;
    private Anggota anggota;
    
    public AnggotaController(FormAnggota FormAnggota){
        this.FormAnggota = FormAnggota;
        anggotaDao = new AnggotaDaoImpl();
    }
    
    public void bersihForm(){
        FormAnggota.getTxtNobp().setText("");
        FormAnggota.getTxtNama().setText("");
        FormAnggota.getTxtAlamat().setText("");
    }
    
    public void saveAnggota(){
        anggota = new Anggota();
        anggota.setNobp(FormAnggota.getTxtNobp().getText());
        anggota.setNama(FormAnggota.getTxtNama().getText());
        anggota.setAlamat(FormAnggota.getTxtAlamat().getText());
        anggotaDao.save(anggota);
        javax.swing.JOptionPane.showMessageDialog(FormAnggota, this);
    }
    
    public void getAnggota(){
        int index = FormAnggota.getTblAnggota().getSelectedRow();
        anggota = anggotaDao.getAnggota(index);
        if(anggota != null){
            FormAnggota.getTxtNobp().setText(anggota.getNobp());
            FormAnggota.getTxtNama().setText(anggota.getNama());
            FormAnggota.getTxtAlamat().setText(anggota.getAlamat());
        }
    }
    
    public void updateAnggota(){
        int index = FormAnggota.getTblAnggota().getSelectedRow();
        anggota.setNobp(FormAnggota.getTxtNobp().getText());
        anggota.setNama(FormAnggota.getTxtNama().getText());
        anggota.setAlamat(FormAnggota.getTxtAlamat().getText());
        anggotaDao.update(index, anggota);
        javax.swing.JOptionPane.showMessageDialog(FormAnggota, "update");
    }
    
    public void deleteAnggota(){
        int index = FormAnggota.getTblAnggota().getSelectedRow();
        anggotaDao.delete(index);
        javax.swing.JOptionPane.showMessageDialog(FormAnggota, "Delete");
    }
    
    public void tampilData(){
        DefaultTableModel tabelModel =
              (DefaultTableModel) FormAnggota.getTblAnggota().getModel();
               tabelModel.setRowCount(0);
               java.util.List<Anggota> list = anggotaDao.getAll();
               for (Anggota anggota : list){
                   Object[] data = {
                       anggota.getNobp(),
                       anggota.getNama(),
                       anggota.getAlamat()
               };
               tabelModel.addRow(data);
               }
    }
}