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
public class Buku {
    private String judul;
    private String kodeBuku;
    private int kuantitas;

    public Buku(String judul, int kuantitas) {
        this.judul = judul;
        this.kuantitas = kuantitas;
    }

    public void setKodeBuku(String kodeBuku) {
        if (kodeBuku.length() == 7){
            if (kodeBuku.substring(0, 3).equals("FIC") || kodeBuku.substring(0, 3).equals("NFC") || kodeBuku.substring(0, 3).equals("TXT")){
                if (Integer.parseInt(kodeBuku.substring(3,6)) >= 0 || Integer.parseInt(kodeBuku.substring(3,6)) <= 9999){
                    this.kodeBuku = kodeBuku;
                } else {
                    this.kodeBuku = "OTH9999";
                }
            } else {
                this.kodeBuku = "OTH9999";
            }
        }
    }

    public String getJudul() {
        return judul;
    }

    public String getGenre(){
        if (this.kodeBuku.substring(0, 3).equals("FIC")){
            return "Fiksi";
        } else if (this.kodeBuku.substring(0, 3).equals("NFC")){
            return "Nonfiksi";
        } else if (this.kodeBuku.substring(0, 3).equals("TXT")){
            return "Textbook";
        } else {
            return "Tidak tersedia";
        }
    }
    
    public int getKuantitas() {
        return kuantitas;
    }
    
    
}
