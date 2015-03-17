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
public class Mahasiswa {
    private String nama;
    
    //Constructor default
    public Mahasiswa()
    {
        System.out.println("Mahasiswa");
    }
    //Constructor ke-2 dengan parameter String
    public Mahasiswa(String nm){
        this.setNama(nm);
    }
    //Method setNama
    public String setNama(String nm){
        nama = nm;
        return nama;
    }
    //Method getNama
    public void getNama(){
        System.out.print(nama + " : ");
    }
    //Method ongkos ke-1 mengembalikan nilai default
    public int ongkos(){
        return 5000;
    }
    //Method ongkos ke-2 mengembalikan nilai setelah dikalikan 2
    public int ongkos(int ongkos){
        int hasil = ongkos * 2;
        return hasil;
    }
    //Method ongkos ke-3 mengembalikan nilai setelah dikalikan dengan nilai yang diset user
    public int ongkos(int onk, int onk2) {
        int hasil = onk * onk2;
        return hasil;
    }
}
