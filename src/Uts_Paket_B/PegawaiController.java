/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Uts_Paket_B;
import Uts_Paket_B.FormPegawai;
import Uts_Paket_B.*;
import javax.swing.table.DefaultTableModel;
import Uts_Paket_B.Pegawai;
/**
 *
 * @author YOLANDA SEPTIA FITRI
 */
public class PegawaiController {
    private FormPegawai FormPegawai;
    private PegawaiDao pegawaiDao;
    private Pegawai pegawai;
    
    public PegawaiController(FormPegawai FormPegawai){
        this.FormPegawai = FormPegawai;
        pegawaiDao = new PegawaiDaoImpl();
    }
    
    public void bersihForm(){
        FormPegawai.getTxtNip().setText("");
        FormPegawai.getTxtNama().setText("");
        FormPegawai.getTxtAlamat().setText("");
    }
    
    public void savePegawai(){
        pegawai = new Pegawai();
        pegawai.setNip(FormPegawai.getTxtNip().getText());
        pegawai.setNama(FormPegawai.getTxtNama().getText());
        pegawai.setAlamat(FormPegawai.getTxtAlamat().getText());
        pegawaiDao.save(pegawai);
        javax.swing.JOptionPane.showMessageDialog(FormPegawai, this);
    }
    
    public void getPegawai(){
        int index = FormPegawai.getTblPegawai().getSelectedRow();
        pegawai = pegawaiDao.getPegawai(index);
        if(pegawai != null){
            FormPegawai.getTxtNip().setText(pegawai.getNip());
            FormPegawai.getTxtNama().setText(pegawai.getNama());
            FormPegawai.getTxtAlamat().setText(pegawai.getAlamat());
        }
    }
    
    public void updatePegawai(){
        int index = FormPegawai.getTblPegawai().getSelectedRow();
        pegawai.setNip(FormPegawai.getTxtNip().getText());
        pegawai.setNama(FormPegawai.getTxtNama().getText());
        pegawai.setAlamat(FormPegawai.getTxtAlamat().getText());
        pegawaiDao.update(index, pegawai);
        javax.swing.JOptionPane.showMessageDialog(FormPegawai, "update");
    }
    
    public void deletePegawai(){
        int index = FormPegawai.getTblPegawai().getSelectedRow();
        pegawaiDao.delete(index);
        javax.swing.JOptionPane.showMessageDialog(FormPegawai, "Delete");
    }
    
    public void tampilData(){
        DefaultTableModel tabelModel =
              (DefaultTableModel) FormPegawai.getTblPegawai().getModel();
               tabelModel.setRowCount(0);
               java.util.List<Pegawai> list = pegawaiDao.getAll();
               for (Pegawai pegawai : list){
                   Object[] data = {
                       pegawai.getNip(),
                       pegawai.getNama(),
                       pegawai.getAlamat()
               };
               tabelModel.addRow(data);
               }
    }
}