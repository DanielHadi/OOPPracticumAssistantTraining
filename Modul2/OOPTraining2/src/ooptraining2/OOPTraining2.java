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
public class OOPTraining2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lingkaran circle = new Lingkaran();
        
        circle.warna = "Biru";
        circle.jariJari = 3.5;
        
        circle.printWarna();
        circle.printKeliling();
        circle.printLuas();
    }
    
}
