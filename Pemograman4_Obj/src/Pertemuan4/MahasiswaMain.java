/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan4;

/**
 *
 * @author calutak
 */
public class MahasiswaMain {
    
    public static void main(String[] args){
        Mahasiswa fajar = new Mahasiswa();
        Mahasiswa rini = new Mahasiswa("Rini");
        
        fajar.setNama("Fajar");
        fajar.getNama();
        System.out.println(fajar.ongkos(1000));
        rini.getNama();
        System.out.println(rini.ongkos());
        
//        System.out.println(fajar.ongkos(3000, 5));
    }
}
