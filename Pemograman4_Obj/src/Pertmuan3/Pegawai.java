/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertmuan3;

import java.text.DecimalFormat;

/**
 *
 * @author calutak
 */
public class Pegawai {
    String nama;
    String alamat;
    int umur;
    double gaji;
    
    public String setNamaPg(String nm) {
        nama = nm;
        return nama;
    }
    
    public String setAlamatPg(String almt) {
        alamat = almt;
        return alamat;
    }
    
    public int setUmurPg(int umr) {
        umur = umr;
        return umur;
    }
    
    public double setGajiPg(double gj) {
        gaji = gj;
        return gaji;
    }
    
    public void cetakInfo(){
        this.setNamaPg("Hanif");
        this.setUmurPg(21);
        this.setAlamatPg("Jl. Caringin No. 161");
        this.setGajiPg(2000000);
        
        DecimalFormat dF = new DecimalFormat("0");
        
        System.out.println("Nama   : " + nama);
        System.out.println("Umur   : " + umur);
        System.out.println("Alamat : " + alamat);
        System.out.println("Gaji   : " + dF.format(gaji));
    }
    public static void main(String[] args) {
        Pegawai pg = new Pegawai();
        pg.cetakInfo();
    }
}
