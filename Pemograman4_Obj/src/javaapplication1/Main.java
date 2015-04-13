/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

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
        Hewan hw1 = new Hewan();
        hw1.tidur();
        hw1.makan();
        
        Kucing kcg1 = new Kucing();
        kcg1.tidur();
        kcg1.makan();
        kcg1.bermain();
        
        Harimau hrm1 = new Harimau();
        hrm1.tidur();
        hrm1.makan();
    }
}
