/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2_bangundatar;

/**
 *
 * @author calutak
 */
public class MainBangunDatar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BangunDatar bD = new BangunDatar();
        //Overloading Constructor
        System.out.println("Overloading Constructor\n");
        BangunDatar bD1 = new BangunDatar(5);
        System.out.println("Luas Persegi : " + bD1.luas());
        bD1.keliling();
        BangunDatar bD2 = new BangunDatar(5,7);
        System.out.println("Luas Persegi Panjang : " + bD2.luas());
        bD2.keliling();
        BangunDatar bD3 = new BangunDatar(10,6,13);
        System.out.println("Luas Segitiga : " + bD3.luas());
        bD3.keliling();
        
        //Overloading Method
        System.out.println("Overloading Method\n");
        System.out.println("\nPersegi");
        System.out.println("Luas Persegi : " + bD.luas(5));
        bD.keliling(5);
        System.out.println("\nPersegi Panjang");
        System.out.println("Luas Persegi Panjang : " + bD.luas(5,10));
        bD.keliling(5,10);
        System.out.println("\nSegitiga");
        System.out.println("Luas Segitiga : " + (0.5 * bD.luas(11,7)));
        bD.keliling(11,7,15);
    }
}
