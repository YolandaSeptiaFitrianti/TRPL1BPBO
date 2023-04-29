/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yolanda.controller;

/**
 *
 * @author YOLANDA SEPTIA FITRI
 */
import yolanda.model.*;
import yolanda.view.FormBuku;
import yolanda.model.*;
import javax.swing.table.DefaultTableModel;

public class BukuController {
    private FormBuku formbuku;
    private BukuDao bukuDao;
    private Buku buku;
    
    public BukuController(FormBuku formbuku){
        this.formbuku = formbuku;
        bukuDao = new BukuDaoImpl();
    }
    
    public void bersihForm(){
        formbuku.getTxtKode().setText("");
        formbuku.getTxtJudul().setText("");
        formbuku.getTxtPengarang().setText("");
        formbuku.getTxtPenerbit().setText("");
        formbuku.getTxtTahun().setText("");
    }
    
    public void saveBuku(){
        buku = new Buku();
        buku.setKode(formbuku.getTxtKode().getText());
        buku.setJudul(formbuku.getTxtJudul().getText());
        buku.setPengarang(formbuku.getTxtPengarang().getText());
        buku.setPenerbit(formbuku.getTxtPenerbit().getText());
        buku.setTahun(formbuku.getTxtTahun().getText());
    }
    
    public void getBuku(){
        int index = formbuku.getTblBuku().getSelectedRow();
        buku =bukuDao.getBuku(index);
        if(buku != null){
            formbuku.getTxtKode().setText(buku.getKode());
            formbuku.getTxtJudul().setText(buku.getJudul());
            formbuku.getTxtPengarang().setText(buku.getPengarang());
            formbuku.getTxtPenerbit().setText(buku.getPenerbit());
            formbuku.getTxtTahun().setText(buku.getTahun());
        }
    }
        
        public void updateBuku(){
            int index = formbuku.getTblBuku().getSelectedRow();
            buku.setKode(formbuku.getTxtKode().getText());
            buku.setJudul(formbuku.getTxtJudul().getText()); 
            buku.setPengarang(formbuku.getTxtPengarang().getText());
            buku.setPenerbit(formbuku.getTxtPenerbit().getText());
            buku.setTahun(formbuku.getTxtTahun().getText());
            bukuDao.update(index, buku);
            javax.swing.JOptionPane.showMessageDialog(formbuku, "Delete ok");
        }
        
        public void deteleBuku(){
            int index = formbuku.getTblBuku().getSelectedRow();;
            bukuDao.delete(index);
            javax.swing.JOptionPane.showMessageDialog(formbuku, "delete ok");
        }
        
        public void tampilData(){
            DefaultTableModel tabelModel = (DefaultTableModel) formbuku.getTblBuku().getModel();
            formbuku.getTblBuku().getModel();
            java.util.List<Buku> list = bukuDao.getAll();
            for(Buku buku : list){
                Object[] data = {
                    buku.getKode(),
                    buku.getJudul(),
                    buku.getPengarang(),
                    buku.getPenerbit(),
                    buku.getTahun()
                };
                tabelModel.addRow(data);
                }
            }
}