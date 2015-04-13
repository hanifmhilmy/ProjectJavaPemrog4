/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan7;

/**
 *
 * @author LECTURE
 */
public class Harimau extends Hewan {
    
    public Harimau() {
        super();
        System.out.println("Harimau");
    }
    
    @Override
    protected void tidur() {
        System.out.println("Harimau tidur");
    }
    
    @Override
    protected void makan() {
        System.out.println("Harimau makan");
    }
}
