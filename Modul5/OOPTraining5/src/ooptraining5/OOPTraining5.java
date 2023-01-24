/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooptraining5;

import kendaraan.SepedaMotor;
import pabrikan.HandoBaet;
import pabrikan.YahamaMoi;

/**
 *
 * @author Daniel P Suryahadi
 */
public class OOPTraining5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SepedaMotor motor = new SepedaMotor("Kuning");
        motor.jalan();
        motor.isiTangkiFull();
        motor.jalan();
        System.out.print("Sepeda motor akan habis bensin pada "+motor.cekKapanHabis()+"\n");
        
        HandoBaet Beat = new HandoBaet("Biru");
        Beat.jalan();
        Beat.isiTangkiFull();
        Beat.jalan();
        
        YahamaMoi Yamaha = new YahamaMoi("Ungu");
        Yamaha.jalan();
        Yamaha.isiTangkiFull();
        Yamaha.jalan();
    }
    
}
