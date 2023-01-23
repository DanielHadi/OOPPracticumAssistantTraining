/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooptraining2;

/**
 *
 * @author Daniel P Suryahadi
 */
public class Lingkaran {
    String warna;
    double jariJari;
    
    void printWarna(){
        System.out.println("Warna objek lingkaran adalah "+this.warna);
    }
    
    void printKeliling(){
        System.out.println("Keliling objek lingkaran adalah "+(2 * this.jariJari * 22/7 ));
    }
    
    void printLuas(){
        System.out.println("Luas objek lingkaran adalah "+(this.jariJari*this.jariJari*22/7));
    }
}
