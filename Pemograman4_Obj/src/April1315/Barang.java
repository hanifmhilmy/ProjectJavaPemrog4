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
class Barang {
    protected double harga;
    
    public Barang() 
    {
        System.out.println("Ini Konstruktor Barang Default");
    }
    
    public Barang(double harga)
    {
        this.harga = harga;
        System.out.println("Ini konstruktor Barang berparameter");
    }
    
    public void setHarga(double harga)
    {
        System.out.println("ini Metode setHarga milik kelas Barang");
        this.harga = harga;
    }
    
    public double getHarga()
    {
        System.out.println("Ini Metode getHarga milik kelas Barang");
        return harga;
    }
}
