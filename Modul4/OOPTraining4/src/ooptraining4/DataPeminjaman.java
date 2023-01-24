/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooptraining4;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import javafx.util.converter.LocalDateTimeStringConverter;

/**
 *
 * @author Daniel P Suryahadi
 */
public class DataPeminjaman {
    private String namaPeminjam;
    private Buku[] daftarBuku;
    private LocalDateTime tanggalPinjam;

    public DataPeminjaman(String namaPeminjam) {
        this.namaPeminjam = namaPeminjam;
    }

    public void setDaftarBuku(Buku[] listBuku) {
        this.daftarBuku = listBuku;
    }
    
    public void mulaiPinjamBuku(){
        this.tanggalPinjam = LocalDateTime.now();
    }
    
    public String waktuPengembalian(){
        DateTimeFormatter x = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return x.format(this.tanggalPinjam.plusHours(100));
    }
    
    public void tampilkanDaftarBuku(){
        System.out.format(
                "User %s dengan deadline %s\n"
                        + "Harus mengembalikan buku buku berikut ini:\n", this.namaPeminjam, this.waktuPengembalian()
        );
        for (int i = 0; i < daftarBuku.length; i++){
            System.out.format("Judul %s dengan genre %s berjumlah %d\n", daftarBuku[i].getJudul(), daftarBuku[i].getGenre(), daftarBuku[i].getKuantitas());
        }
    }
}
