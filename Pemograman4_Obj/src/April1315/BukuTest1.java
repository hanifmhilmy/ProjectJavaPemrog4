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
public class BukuTest1 {
    public static void main(String[] args) {
        Buku bk1 = new Buku();
        System.out.println("Judul : " + bk1.judul);
        
        Buku bk2 = new Buku("Mathilda");
        System.out.println("Judul : " + bk2.judul);
        bk2.setHarga(20000);
        System.out.println("Harga : " + bk2.getHarga());
        
        int x=10, y=20;
        System.out.println(++x);//11
        System.out.println(y++);//20
        System.out.println(y);//21
    }
}
