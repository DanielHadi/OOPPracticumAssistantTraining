/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pabrikan;

import kendaraan.SepedaMotor;

/**
 *
 * @author Daniel P Suryahadi
 */
public class HandoBaet extends SepedaMotor {

    public HandoBaet(String warna) {
        super(warna);
        super.ukuranTangki = 4;
    }
    
    @Override
    public boolean jalan(){
        if (super.jalan() == false){
            return false;
        } else {
//            System.out.print("Sepeda motor sedang berjalan\n");
            System.out.format("Motor Baet akan habis bensin pada %s\n", super.cekKapanHabis());
            return true;
        }
    }
}
