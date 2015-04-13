/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author LECTURE
 */
public class Kendaraan {
    
    private int tanggalProduksi;
    
    public Kendaraan() {
        tanggalProduksi = 15022012;
        System.out.println("tanggal produksi : " + tanggalProduksi);
    }
    
    public void bergerak() {
        System.out.println("Kendaraan bergerak");
    }
    
    public void mengerem() {
        System.out.println("Kendaraan mengerem");
    }
}
