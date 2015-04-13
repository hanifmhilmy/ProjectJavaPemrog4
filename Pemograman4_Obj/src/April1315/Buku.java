/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package April1315;

/**
 *
 * @author calutak
 */
public class Buku extends Barang {
    public String judul;
    
    public Buku()
    {
        System.out.println("Ini Konstruktor Buku Default");
    }
    
    public Buku(String judul)
    {
        this.judul = judul;
        System.out.println("Ini Konstruktor Buku berparameter");
    }
    
    public void setHarga(double harga)
    {
        System.out.println("Ini override Metode setHarga milik Kelas Buku dari kelas Barang");
        this.harga = harga;
    }
}
