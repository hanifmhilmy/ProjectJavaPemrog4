/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertmuan3;

/**
 *
 * @author calutak
 */
public class Hewan {
    int umur;
    int jumlahKaki;
    
    public Hewan() {
        
    }
    
    public void setUmur(int umurHewan) {
        umur = umurHewan;
    }
    
    public int getUmur() {
        System.out.println("umur hewan " + umur);
        return umur;
    }
    
    public void setJumlahKaki(int jmlKaki) {
        jumlahKaki = jmlKaki;
    }
    
    public int getJmlKaki() {
        System.out.println("jumlah kaki " + jumlahKaki);
        return jumlahKaki;
    }
    
    public void berjalan() {
        System.out.println("hewan dapat berjalan");
    }
    
    public void berbunyi() {
        System.out.println("hewan dapat berbunyi");
    }
    
    public static void main(String[] args) {
        Hewan kucing = new Hewan();
        kucing.setUmur(3);
        kucing.getUmur();
        kucing.setJumlahKaki(4);
        kucing.getJmlKaki();
        kucing.berbunyi();
        kucing.berjalan();
    }
}
