/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kendaraan;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Daniel P Suryahadi
 */
public class SepedaMotor {
    private String warnaMotor;
    protected int ukuranTangki;
    private LocalDateTime waktuIsiBensin;

    public SepedaMotor(String warna) {
        this.warnaMotor = warna;
        this.ukuranTangki = 3;
        this.waktuIsiBensin = null;
    }
    
    public void isiTangkiFull(){
        this.waktuIsiBensin = LocalDateTime.now();
    }
    
    public String cekKapanHabis(){
        DateTimeFormatter formater = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        return formater.format(this.waktuIsiBensin.plusHours(this.ukuranTangki*1));
    }
    
    public boolean jalan(){
        if (this.waktuIsiBensin == null){
            System.out.print("Bensin habis, sepeda motor tidak dapat jalan\n");
            return false;
        } else {
            System.out.print("Sepeda motor sedang berjalan\n");
            return true;
        }
    }
}
