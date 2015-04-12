/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t_p4;

/**
 *
 * @author calutak
 */
public class Animal {
    
    protected int legs;
    
    protected Animal()
    {
        System.out.println("\nAnimal ? yeah!");
    }
    protected Animal(int legs) 
    {
        this.legs = legs;
        System.out.println("\nAnimal have " + legs + " legs");
    }
    
    public void walk()
    {
        System.out.println("Animal can walk");
    }
    
    public void eat()
    {
        System.out.println("Animal can eat");
    }
}
