/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooptraining4;

/**
 *
 * @author Daniel P Suryahadi
 */
public class OOPTraining4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DataPeminjaman pinjam = new DataPeminjaman("Daniel");
        Buku[] books = new Buku[2];
        books[0] = new Buku("Ultraman", 7);
        books[0].setKodeBuku("FIC0001");
        books[1] = new Buku("Kamen Rider", 5);
        books[1].setKodeBuku("FIC0002");
        
        pinjam.setDaftarBuku(books);
        pinjam.mulaiPinjamBuku();
        pinjam.tampilkanDaftarBuku();
    }
    
}
