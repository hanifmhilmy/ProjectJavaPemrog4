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
public abstract class Pet extends Animal {
    
    protected String Name;
    
    public Pet() {
        super();
        System.out.println("Do you have any pets ?");
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
    
    public void play()
    {
        System.out.println("Pets can play with you!");
    }
}
