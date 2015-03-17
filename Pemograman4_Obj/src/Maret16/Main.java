/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Maret16;

/**
 *
 * @author LECTURE
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mobil mbl = new Mobil();
        mbl.bergerak();
        mbl.mengerem();
        mbl.berjalanMundur();
        
        Pesawat pswt = new Pesawat();
        pswt.mengerem();
        pswt.terbang();
    }
}
