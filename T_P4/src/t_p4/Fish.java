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
public class Fish extends Pet{
    
    public Fish()
    {
        super();
        System.out.println("Fish don't have any legs!");
    }
    
    public void play()
    {
        System.out.println("Your "+ this.getName() + " is fish, and can play!");
    }
    
    public void walk()
    {
        System.out.println("Your "+ this.getName() + " is fish, and can walk!");
    }
    
    public void eat()
    {
        System.out.println("Your "+ this.getName() + " is fish, and can eat!");
    }
    
    public String setName(String name)
    {
        Name = name;
        return Name;
    }
    
    public String getName()
    {
        return Name;
    }
}
