/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooptraining1;

import java.util.Scanner;

/**
 *
 * @author Daniel P Suryahadi
 */
public class OOPTraining1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        int[][] arrayDoang = new int[3][];
//        arrayDoang[0] = new int[3];
//        arrayDoang[1] = new int[5];
//        arrayDoang[2] = new int[7];
        Scanner ngscanDoang = new Scanner(System.in);
        
        int[][] arrayDoang = {
            {2,4,6},
            {1,3,5,7,9},
            {0,1,1,2,3,5,8}
        };
        
//        for (int i = 0; i < arrayDoang.length; i++){
////            int j = 0;
////            System.out.print("Masukkan angka : ");
////            int temp = ngscanDoang.nextInt();
////            while (temp != -1){
////                arrayDoang[i][j] = temp;
////                j++;
////                System.out.print("Masukkan angka : ");
////                temp = ngscanDoang.nextInt();
////            }
//            for (int j = 0; j < arrayDoang[i].length; j++){
//                System.out.print("Masukkan angka : ");
//                arrayDoang[i][j] = ngscanDoang.nextInt();
//            }
//        }
        
        for (int i = 0; i < arrayDoang.length; i++){
            for (int j = 0; j < arrayDoang[i].length; j++){
                System.out.format("%d - ",arrayDoang[i][j]);
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        
        System.out.print("Input bilangan 1 : ");
        int bil1 = ngscanDoang.nextInt();
        System.out.print("Input bilangan 2 : ");
        int bil2 = ngscanDoang.nextInt();
        int kpk = 0; 
        int fpb = 0;
        
        for (int i = (bil1 < bil2 ? bil1 : bil2); i > 0; i--){
            if (bil1 % i == 0 && bil2 % i == 0){
                fpb = i;
                break;
            }
        }
        
        int temp = bil1 > bil2 ? bil1 : bil2;
        
        while (true){
            if (temp % bil1 == 0 && temp % bil2 == 0){
                kpk = temp;
                break;
            }
            temp++;
        }
        
//        for (int i = (bil1 > bil2 ? bil1 : bil2); i > 0; i++){
//            if (bil1 % i == 0 && bil2 % i == 0){
//                kpk = i;
//                break;
//            }
//        }
        
//
//        while (temp >= 2){
//            System.out.println(temp);
//            if (bil1 % temp == 0 && bil2 % temp == 0){
//                fpb = temp;
//                System.out.println(fpb+"n");
//                break;
//            } else {
//                temp--;
//            }
//            
//        }
//
        System.out.print(fpb+"\n");
        System.out.print(kpk+"\n");
//        System.out.println();
    }
    
}
