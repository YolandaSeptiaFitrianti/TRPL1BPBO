/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yolanda.model;

/**
 *
 * @author YOLANDA SEPTIA FITRI
 */
import java.util.ArrayList;
import java.util.List;

public class BukuDaoImpl implements BukuDao{
    List<Buku> data = new ArrayList<>();
    
    public BukuDaoImpl(){
        data.add(new Buku("001", "Harry Potter and the Philosopher's Stone", "J.K. Rowling", "Bloomsbury Publishing", "1997"));
        data.add(new Buku("002", "The Lord of the Rings", "J.R.R. Tolkien", "George Allen & Unwin", "1954"));
        data.add(new Buku("003", "To Kill a Mockingbird", "Harper Lee", "J. B. Lippincott & Co.", "1960"));
    }
    
    public void save(Buku buku){
        data.add(buku);
    }
    
    public void update(int index, Buku buku){
        data.set(index, buku);
    }
    
    public void delete(int index){
        data.remove(index);
    }
    
    public Buku getBuku(int index){
        return data.get(index);
    }
    
    public List<Buku> getAll(){
        return data;
    }
}
