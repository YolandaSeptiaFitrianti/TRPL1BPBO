/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yolanda27042023;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author YOLANDA SEPTIA FITRI
 */
public class PeminjamanDaoImpl implements PeminjamanDao {
  List<Peminjaman> daftarPeminjaman = new ArrayList<>();
  
  public PeminjamanDaoImpl(){
    daftarPeminjaman.add(new Peminjaman("2211081032","002","27-04-2023","10-05-2023"));
  }
  
  public void save(Peminjaman peminjaman){
    daftarPeminjaman.add(peminjaman);
  }
  
  public void update(int index, Peminjaman peminjaman){
    daftarPeminjaman.set(index, peminjaman);
  }
  public void delete(int index){
    daftarPeminjaman.remove(index);
  }
  public Peminjaman getPeminjaman(int index){
      return daftarPeminjaman.get(index);
  }
  
  public List<Peminjaman>getAll(){
      return daftarPeminjaman;
  }
}