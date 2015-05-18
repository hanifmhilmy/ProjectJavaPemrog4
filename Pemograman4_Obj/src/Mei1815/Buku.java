/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mei1815;

/**
 *
 * @author calutak
 */
public class Buku implements iBuku {
    
    private String judul;
    
    public void setJudul(String judul) {
        this.judul = judul;
    }
    
    public String getJudul() {
        return judul;
    }
    
    public static void main(String[] args) {
        Buku bk1 = new Buku();
        bk1.setJudul("Metilda");
        System.out.println("Judul : " + bk1.getJudul());
    }
}
